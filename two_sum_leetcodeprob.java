import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //?declaration section start
        int ptr_a, ptr_b, sum;
        int[] cpy_arr;
        //?declaration section end
        //*initialization section start
        // to the pointer: here I take two pointers
        ptr_a = 0;
        ptr_b = numbers.length - 1;
        cpy_arr = new int[numbers.length];
        System.arraycopy(numbers,0,cpy_arr,0,numbers.length);
        //*initialization section end

        //?main logic starts
        Arrays.sort(cpy_arr); //sorting by using quicksort:time complexity n*log(n)
        while (ptr_a < ptr_b) {
            sum = cpy_arr[ptr_a] + cpy_arr[ptr_b];
            if (sum > target) {
                ptr_b--;
            } else if (sum < target) {
                ptr_a++;
            } else {
                return findIndexInArray(numbers, cpy_arr[ptr_a], cpy_arr[ptr_b]);
            }
        }
        return new int[]{ptr_a, ptr_b};
        //?main logic ends
    }

    public int[] findIndexInArray(int[] numbers, int num1, int num2) {
        int pos1, pos2;

        //?positions of index
        pos1 = getPosition(numbers, num1,0);
        pos2 = getPosition(numbers, num2,0);
        //?position of index

        //?handles the output index
        if(pos1>pos2)
            return new int[]{pos2, pos1};
        else if(pos1<pos2)
            return new int[]{pos1, pos2};
        else{
            pos2=getPosition(numbers,num2,pos1+1);
            return new int[]{pos1, pos2};
        }
        //?handles the output index
    }

    //    *search position of element into given array
    //    ?time complexity is O(n) that's comes under linear time
    public int getPosition(int[] numbers, int num,int searchIndexSource) {
        for (int i =searchIndexSource; i < numbers.length; i++) {
            if (num == numbers[i]) {
                return i;
            }
        }
        return -1;
    }
}
