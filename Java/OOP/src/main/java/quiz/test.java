package quiz;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        String s = "1 2 3 4 5 6 7 8 9";
//        s.trim();
        String[] nums = s.split(" ");

        int counter = s.length();
        int count = 0;

        int[] num = new int[10000000];

        for(int i = 0; i < counter; i++){
            if(nums[i] != " "){
                num[count] = Integer.parseInt(nums[i]);
                count++;
            }
        }
//        for(String val: )

        System.out.println(count);

        for (String value : nums) {
            System.out.println(value);
        }
    }
}
