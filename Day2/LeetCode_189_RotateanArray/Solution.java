public class Solution {

    public static void rotate(int[] nums, int k){
        // temp array
        int temp []= new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i+k)%nums.length]=nums[i];
          
            
        }
        // copy array
        for (int i = 0; i < temp.length; i++) {
            nums[i]=temp[i];
            
        }
    }
public static void main(String[] args) {

    // test case exmaple 
    int nums[]={1,2,3,4,5,6,7};
    int k=3;

    rotate(nums, k);

    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
    }


    
}
    
}