using System;
using System.Collections.Generic;
using System.Text;

namespace programmingproblems
{
    public static class ShortestUnsortedContiniousSubarray
    {
        public static void Run()
        {
            Console.WriteLine("Hello World!");

            var ss = FindSubArray(new int[] { 2, 3, 3, 2, 4 });
           //var s01 = FindSubArray(new int []{ 1,3,2,2,2});
           // var s00 = FindSubArray(new int[] { 3, 2, 1 });
           // var s0 = FindSubArray(new int[] { 1,2,3,3,3});
           // var s = FindSubArray(new int[] { 2, 6, 4, 8, 10, 9, 15 });
           // var s2 = FindSubArray(new int[] { });

            Console.ReadLine();
        }

        private static int FindSubArray(int[] input)
        {

            if (input == null || input.Length <= 1)
                return 0;
            int result = 0;
            int leftMax = input[0];
            int leftMaxIndex = 0;
            int firstColl = -1;
            for (int i = 0; i < input.Length - 1; i++)
            {
                if (input[i] != input[i + 1])
                {
                    leftMaxIndex = i;

                }

                if (input[i] > input[i + 1])
                {
                    leftMax = input[i];
                    firstColl = i;
                    break;
                }


            }
            
            
            if (firstColl != -1)
            {
                
                int lastColl = input.Length - 1;

                for (int i = input.Length - 1; i >= firstColl; i--)
                {
                    
                    if (input[i] < input[i - 1] )
                    {
                        lastColl = i;
                        break;
                    }
                    if (leftMax > input[i])
                    {
                        firstColl = leftMaxIndex;
                        lastColl = i;
                    }
                }

                result = lastColl - firstColl + 1;
                var sb = new StringBuilder();
                foreach (var item in input)
                {
                    sb.Append(item + ",");
                }
                Console.WriteLine($"for {sb.ToString()} result {result}");
            }

            return result;
        }
    }
}
