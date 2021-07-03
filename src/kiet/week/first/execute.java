package kiet.week.first;

import java.util.Scanner;

public class execute {
    public static void main(String[] args) {
        int[]arr=new int[2];
        Solution solution=new Solution();
        arr=solution.twoSum(new int[]{3,3},6);
//        arr=obj.twoSum(new int[]{-1,-2,-3,-4,-5},-8);
        System.out.println(arr[0]+" "+arr[1]);
    }
}