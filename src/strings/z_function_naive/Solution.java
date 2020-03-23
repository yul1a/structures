package strings.z_function_naive;

public class Solution {
    public int[] FindZFunction(String a) {
        int n = a.length();
        int[] z = new int[n];
        z[0] = 0;
        //System.out.print(0);

        for (int i = 1; i < n; i++) {
            int count = 0;

            for (int j = 0; count + i <  n; j ++) {
                if (a.charAt(count + i) != a.charAt(j)) {
                    break;
                }
                else
                    count++;
            }
            z[i] = count;
            //System.out.print(z[i]);
        }

      return z;
    }

}
