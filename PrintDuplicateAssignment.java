package Week3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> arr1=new LinkedHashSet<Integer>();
		for(Integer arr2:arr)
		{
			if(!arr1.add(arr2))
			{
				System.out.println(arr2);
			}
		}

	}

}
