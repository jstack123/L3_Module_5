package unit_tests;

import java.util.ArrayList;

public class LearningArrayLists {
	
	public static ArrayList<String> createArrayList() {
		// TODO Auto-generated method stub
		ArrayList<String> testList = new ArrayList<String>();
		return testList;
	}
	
	public static int addToArrayList(ArrayList testList, String s) {
		testList.add(s);
		return testList.size();
	}
	
	public static int getNumberOfItems(ArrayList testList) {
		return testList.size();
	}
	
	public static Object getItem(ArrayList testList, int n) {
		return testList.get(n);
	}

	public static String iterateOver(ArrayList testList) {
		// TODO Auto-generated method stub
		String s = "";
		for (int i = 0; i < testList.size(); i++) {
			s += testList.get(i);
		}
		return s;
	}
	
	

}

	