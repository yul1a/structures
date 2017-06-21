package com.company;

import java.util.Scanner;


public class BirthdayChocolate {

    public static void main() {
        Scanner in = new Scanner(System.in);
        int n = 5;//in.nextInt();
        int[] squares = new int[n];
        for(int squares_i=0; squares_i < n; squares_i++){
            //squares[squares_i] = in.nextInt();
        }
        squares[0] = 1;
        squares[1] = 2;
        squares[2] = 1;
        squares[3] = 3;
        squares[4] = 2;
        int d = 3;//in.nextInt();
        int m = 2;//in.nextInt();

        int count =0;

        for (int startPosition = 0; startPosition <= squares.length - m; startPosition++) {
                if (isSumOk(squares, startPosition, d, m)) {
                    count++;
                }
                ;
        }
        
        System.out.println(count);


    }

    private static boolean isSumOk(int[] squares,  int start, int d, int m) {
        int total = 0;
        int i = start;
        int steps = 0;
        while (total < d && steps < m){
            steps ++;
            total = squares[i] + total;
            i++;
        }
        return total == d && steps == m;
    }
}
