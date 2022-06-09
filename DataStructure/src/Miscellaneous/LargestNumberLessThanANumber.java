package Miscellaneous;

import java.util.Arrays;

public class LargestNumberLessThanANumber {
    public static void main(String[] args) {
        Integer input = 145;
        Integer digit = 4;
        Integer res = findLargetNumber(input, digit);
        if(res == -1) {
            System.out.println("No such number");
        } else {
            System.out.println(res + " is the largest number");
        }
    }

    public static Integer findLargetNumber(Integer input, Integer digit) {
        if (input < 0 || digit < 0) {
            return -1;
        }
        for (int i = input - 1; i >= 0; i--) {
            if(containsDigit(i, digit)) {
                continue;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static boolean containsDigit(Integer input, Integer digit) {
        int extractedDigit = 0;
        while (input != 0) {
            extractedDigit = input % 10;
            if (extractedDigit == digit) {
                return true;
            }
            input = input/10;
        }
        return false;
    }
}
