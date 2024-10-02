public class ReverseArray {
   
        public static void reverseArray(int arr[]) {
            int F=0;
            int L=arr.length-1;
            while(F<L){
                int temp=arr[L];
                arr[L]=arr[F];
                arr[F]=temp;
                
                F++;
                L--;
                
            }
        }
        public static void main(String[] args) {

            // test case exmaple 
            int nums[]={1,2,3,4,5,6,7};
            reverseArray(nums);
        
            
        
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        
        
            
        }
    
}
