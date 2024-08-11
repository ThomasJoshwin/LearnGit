package IBMOnlineAssessmentLearn;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNumberInAnArray {

	public static void main(String[] args) {
		
		
int[] arr = {1, 6, 7, 3, 5, 7};
        
       int max=arr[0];
       for(int i=0;i<arr.length;++i)
       {
    	   if(max<arr[i])
    		   max=arr[i];
       }
       System.out.println(max);
	}

}
