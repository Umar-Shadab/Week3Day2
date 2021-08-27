package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnCollectionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"Aspire systems", "cts", "wipro", "Hcl"};
		List<String> list=new ArrayList<String>(Arrays.asList(str));
		//length of String
		int listsize=list.size();
		System.out.println("Length of String:" + listsize);
		//sort the Array
		Collections.sort(list);
		System.out.println("Sorted Array:" + list);
		//Reverse Order
		Collections.reverse(list);
		System.out.println("Reversed Order:" + list);
		

	}

}