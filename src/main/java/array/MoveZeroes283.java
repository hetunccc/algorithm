package array;
/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.*/
public class MoveZeroes283 {
    public void moveZero(int[] input){
        int s =0;
        int l = 0;
        while (l < input.length){
            if (input[s] != 0){
                input[s+1] = input[l];
                s++;
            }
            l++;
        }
    }
}
