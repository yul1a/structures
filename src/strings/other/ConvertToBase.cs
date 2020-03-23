using System;
using System.Text;

namespace programmingproblems
{
    public static class ConvertToBase
    {
        static string characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        public static void Run()
        {
            Convert(16, "FF", 2);
            Convert(2, "11111111", 16);
            Convert(2, "11111111", 16);
            Convert(16, "FF", 2);
            Convert(4, "3333", 2);
        }

        public static string Convert(int fromBase, string value, int toBase)
        {
            StringBuilder resultBuilder = new StringBuilder();
            if (fromBase < toBase)
            {
                //find how many symbols convert to one symbols in destination system
                int counter = 1;
                int power = fromBase;
                while (toBase != power)
                {
                    power = power * 2;
                    counter++;
                }

                //add Zeros 
                StringBuilder valueBuilder = new StringBuilder();
                int remainder = (toBase % counter); // "10001" -> "00010001"
                if (remainder > 0)
                {
                    for (int j = 0; j < remainder; j++)
                    {
                        valueBuilder.Insert(0, "0");
                    }

                    value = valueBuilder.ToString();
                }

                int i = 0;
                while (i < value.Length)
                {
                    resultBuilder.Append(ConvertOneSymbol(fromBase, value.Substring(i, counter), toBase));
                    i = i + counter;
                }
            }
            else
            {
                int i = 0;
                while (i < value.Length)
                {
                    resultBuilder.Append(ConvertOneSymbol(fromBase, value.Substring(i, 1), toBase));
                    i++;
                }
            }
            Console.WriteLine($"resultBuilder.ToString(){resultBuilder.ToString()}");
            return resultBuilder.ToString();
        }

        private static string ConvertOneSymbol(int fromBase, string value, int toBase)
        {
            int power = 0;
            int resultIn10 = 0;

            for (int i = value.Length - 1; i >= 0; i--)
            {
                int index = Array.IndexOf(characters.ToCharArray(), value[i]);

                resultIn10 += index * (int)Math.Pow(fromBase, power);

                power++;
            }


            StringBuilder builder = new StringBuilder();
            while (resultIn10 > 0)
            {
                int remainder = (resultIn10 % toBase);
                //Console.WriteLine($"value{value} %toBase{toBase}  = {remainder}");


                builder.Insert(0, characters[remainder]);

                resultIn10 = resultIn10 / toBase;
            }

            //Console.WriteLine($"sourceSystem: {fromBase}, sourceValue: {value}, destinationSystem: {toBase}, destinationValue: {builder.ToString()}");
            return builder.ToString();

        }

        private static string From10(int value, int toBase)
        {
            StringBuilder builder = new StringBuilder();

            while (value > 0)
            {
                int remainder = (value % toBase);
                //Console.WriteLine($"value{value} %toBase{toBase}  = {remainder}");

                builder.Insert(0, characters[remainder]);

                value = value / toBase;
            }

            return builder.ToString();
        }
    }
}
