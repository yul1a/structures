using System;
using System.Text;
namespace programmingproblems
{
    public static class PalindromeString
    {
        

        public static void Run()
        {
            var str = "amanaplanacanalpanama";
            Console.WriteLine($"{str} is {isPalindrome(str)}  ");

            str = "raceacar";
            Console.WriteLine($"{str} is {isPalindrome(str)}  ");


            str = "A man, a plan, a canal: Panama";
            Console.WriteLine($"{str} is {isPalindrome(str)}  ");

            str = "race a car";
            Console.WriteLine($"{str} is {isPalindrome(str)}  ");

            str = "\"";
            Console.WriteLine($"{str} is {isPalindrome(str)}  ");

            str = "a";
            Console.WriteLine($"{str} is {isPalindrome(str)}  ");

            str = "abbc";
            Console.WriteLine($"{str} is {isPalindrome(str)}  ");

            str = "1a2";
            Console.WriteLine($"{str} is {isPalindrome(str)}  ");
        }

        public static int isPalindrome(string A)
        {
            if (A == "\"")
            {
                return 1;
            }
            var b = A.ToLower();
            var sb = new StringBuilder();

            int startSmall = 'a';
            int endSmall = 'z';

            int zero = '0';
            int nine = '9';

            for (int i = 0; i < b.Length; i++)
            {
                int current = b[i];

                if (!(current >= startSmall && current <= endSmall) &&
                    !(current >= zero && current <= nine))
                {
                    continue;
                }
                sb.Append(b[i]);
            }

            int result = 0;
            b = sb.ToString();
            if (b.Length % 2 > 0)
                result = odd(b) ? 1 : 0;
            else
            {
                result = even(b) ? 1 : 0;
            }

            //Console.WriteLine($"{A} is {result}  ");
            return result;
        }

        private static bool odd(string str)
        {
            int indMiddle = str.Length / 2;
            int leftBorder = indMiddle - 1, rightBorder = indMiddle + 1;
            while (leftBorder >= 0 && rightBorder < str.Length && str[leftBorder] == str[rightBorder])
            {
                --leftBorder;
                ++rightBorder;
            }
            return leftBorder == -1;
        }

        private static bool even(string str)
        {
            int indMiddle = str.Length / 2;
            //int leftBorder = indMiddle, rightBorder = indMiddle + 1;
            int leftBorder = indMiddle - 1, rightBorder = indMiddle;
            while (leftBorder >= 0 && rightBorder < str.Length && str[leftBorder] == str[rightBorder])
            {
                --leftBorder;
                ++rightBorder;
            }
            return leftBorder == -1;
        }
    }
}
