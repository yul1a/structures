package strings.z_function_naive;

public class Main {
    public static void main(String[] args) {
        Check("abacaba", new int[]{0, 0, 1, 0, 3, 0, 1});
        Check("aaaaaaaa", new int[]{0, 7, 6, 5, 4, 3, 2, 1});
        Check("abababab", new int[]{0, 0, 6, 0, 4, 0, 2, 0});
    }

    private static void Check(String str, int[] output){

        Solution s = new Solution();
        int[] realoutput = s.FindZFunction(str);
        if (realoutput.length != output.length) {
            System.out.println("error length for " + str);
        } else {
            for (int j = 0; j < realoutput.length; j++) {
                if (realoutput[j] != output[j]) {
                    System.out.println("error for " + str);
                    continue;
                }

            }
            System.out.println("passed  for " + str);
        }
    }
}
