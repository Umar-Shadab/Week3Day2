package Week3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";	
		String[] s1=text.split(" ");
		Set<String> S2=new LinkedHashSet<String>();
		for(String s3:s1)
		{
			S2.add(s3);
		}
		for(String s4:S2)
		{
			System.out.print(s4+ " ");
		}
	}

}