using System;
namespace programmingproblems
{
    public static class LongestCommonPrefix
    {
        public static void Run()
        {
            Console.WriteLine(longestCommonPrefixBinary(new []{ "flower", "flow", "flight", "flodd", "flord"}));
            //Console.WriteLine(longestCommonPrefixDivideAndConquere(new[] { "leetcode", "leet", "lee", "le" }));
        }


        
        public static String longestCommonPrefixBinary(String[] strs)
        {
            if (strs == null || strs.Length == 0)
                return "";
            int minLen = int.MaxValue;
            foreach (var str in strs)
                minLen = Math.Min(minLen, str.Length);
            int low = 1;
            int high = minLen;
            while (low <= high)
            {
                int middle = (low + high) / 2;
                if (isCommonPrefix(strs, middle))
                    low = middle + 1;
                else
                    high = middle - 1;
            }
            return strs[0].Substring(0, (low + high) / 2);
        }

        private static bool isCommonPrefix(String[] strs, int len)
        {
            String str1 = strs[0].Substring(0, len);
            for (int i = 1; i < strs.Length; i++)
                if (!strs[i].StartsWith(str1))
                    return false;
            return true;
        }


        public static String longestCommonPrefixDivideAndConquere(String[] strs)
        {
            if (strs == null || strs.Length == 0) return "";
            return longestCommonPrefix(strs, 0, strs.Length - 1);
        }

        private static String longestCommonPrefix(String[] strs, int l, int r)
        {
            if (l == r)
            {
                return strs[l];
            }
            else
            {
                int mid = (l + r) / 2;
                String lcpLeft = longestCommonPrefix(strs, l, mid);
                String lcpRight = longestCommonPrefix(strs, mid + 1, r);
                Console.WriteLine($"lcpleft {lcpLeft}, lcpright {lcpRight}");
                return commonPrefix(lcpLeft, lcpRight);
            }
        }

        static String commonPrefix(String left, String right)
        {
            int min = Math.Min(left.Length, right.Length);
            for (int i = 0; i < min; i++)
            {
                if (left[i] != right[i])
                    return left.Substring(0, i);
            }
            return left.Substring(0, min);
        }
    }
}
