package IBMOnlineAssessmentLearn;

public class ReverseAString {

	public static void main(String[] args) {

			String str ="salas";
			char ch[] =str.toCharArray();
			int left=0;
			int right=str.length()-1;
			
			while(left<right)
			{
				if(ch[left]!=ch[right])
					System.out.println("noooppeee");
				++left;
				--right;
				
			}
			System.out.println("yeesss");
			
			

	}

}
