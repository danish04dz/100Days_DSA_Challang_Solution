public class solution {

    public int removeDuplicates(int[] nums) {
        // check if the array size is zero means array is empty the return 0 
    if(nums.length==0){
        return 0;
    }
    // take intigr variabe chek the dublicate value and remove from array
    int i=0;
    // crete loop from 0 to length of array to check th duplicate value and remmove 
    for (int j = 1; j < nums.length; j++) {
        // here two pointer i and j where i increse sloly and j increse faster to track the array
        //  check conditon is the duplcate value found or not
        if(nums[j]!=nums[i]){  
            //taking one examle 
            //  0 1  2 3   indexces     
            // [1,2, 2,3]

            //in first iteration nums[1](2)!=nums[0] (1) #condition true i=1 and  resulting nums[1,2,2,3] value of i=1
            // in second iteration nums[2](2)!=nums[1](2) #  skip condition beacause both are eqal i remains same as fir iteration
            // in third iteration nums[3](3)!=nums[1](2) #  conditon true the are diffrent  resulting nums[1,2,3,3] i=2
            // now the unique value stored in i length so 
            // i start from 0 the n add 1 i+1 to find final length of the unique array.
            // then final array is nums[i](2)=[1,2,3] index 0 to 2 length is 3.
            i++;  // increse value of i after conditon true
            nums[i]=nums[j]; // add unique vale to nums array  
        }

        
    }
    return i+1; // findex array size after removing dublicate value

    }
}