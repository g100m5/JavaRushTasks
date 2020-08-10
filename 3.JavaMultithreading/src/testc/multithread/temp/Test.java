package testc.multithread.temp;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        int [] nuts = { 3, 3};
        int [] result = twoSum(nuts, 6);

        System.out.println(result[0] + " " + result[1]);
    }


    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int x = 0; x < nums.length; x++) {

            for (int y = x + 1; y < nums.length; y++) {


                if (nums[x] + nums[y] == target) {
                    result[0] = x;
                    result[1] = y;
                    break;
                }

            }

        }

        return result;
    }



    void test() {

        List<Integer> numbers = new LinkedList<>();


    }



}

