package IBMOnlineAssessmentLearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class BinarySearch {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5};
		List<Integer> numSeq = new ArrayList<Integer>();
		numSeq=Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
		
		int first=0,second=0;
		for(int i=0;i<numSeq.size();i++)
		{
			if(i%2==0) {
				int val = numSeq.get(i);
				second = second+val;
				numSeq.remove(Integer.valueOf(val));
				if(val%2==0)
					Collections.reverse(numSeq);
			}else {

				int val = numSeq.get(i);
				first = first+val;
				numSeq.remove(Integer.valueOf(val));
				if(val%2==0)
					Collections.reverse(numSeq);
			
			}
		}
	
		System.out.println(first-second);
	}

}
