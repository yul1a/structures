package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by a1 on 26.03.17.
 */
public class MergeSort {

    public static void main() throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("/Users/a1/input.txt"), Charset.defaultCharset());
        List<Integer> numbers = getIntegers(lines);

        PairClass p = count(numbers);

        System.out.println(p.count);
        for (Integer c : p.sorted) {
            System.out.println(c);
        }
    }

    private static PairClass count(List<Integer> numbers) {

        if (numbers.size() == 1){
            PairClass p =  new PairClass();
            p.count = 0;
            p.sorted = numbers;
            return p;
        }


        PairClass numbersLeft = count(numbers.subList(0, numbers.size() / 2));
        PairClass numbersRight = count(numbers.subList(numbers.size() / 2, numbers.size()));

        PairClass merge = merge(numbersLeft, numbersRight);
        merge.count+=numbersLeft.count + numbersRight.count;
        return merge;
    }

    private static PairClass merge(PairClass leftPair, PairClass rightPair) {

        PairClass p =  new PairClass();

        List<Integer> left = leftPair.sorted;
        List<Integer> right = rightPair.sorted;

        int l = 0;
        int r = 0;

        List<Integer> result = new ArrayList<Integer>();
        while (left.size() > l  && right.size() > r) {
            if (left.get(l) <= right.get(r)) {
                result.add(left.get(l));
                l++;
            } else {
                //4 // 1 2 3
                // 5 // 1 2 3
                p.count+= left.size() - (l);
                result.add(right.get(r));
                r++;
            }
        }

        for (; l < left.size(); l++) {
            result.add(left.get(l));
        }

        for (; r < right.size(); r++) {
            result.add(right.get(r));
        }

        p.sorted = result;
        return p;
    }

    private static List<Integer> getIntegers(List<String> lines) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < lines.size(); i++) {
            numbers.add(Integer.valueOf(lines.get(i)));
        }
        return numbers;
    }
}
