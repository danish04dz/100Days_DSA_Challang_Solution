public class LargestNumber {
    public static int solution(int arr[]){
        int largest=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;


    
    }
    public static void main(String[] args) {

        int arr[]={1, 8, 7, 56, 90};
        int largest =solution(arr);
        System.out.println("largest nubeer i  " + largest);
        
    }
    
}
