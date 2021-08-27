package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		List<Integer> list=new ArrayList<Integer>();
		for(Integer arr1:data)
		{
			list.add(arr1);
		}
		System.out.println("Sorted ArrayList:" + list);
		
		int large=list.get(list.size()-2);
		System.out.println("SecondLargest:" + large);
	}

	

}