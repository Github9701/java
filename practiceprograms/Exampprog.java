package practiceprograms;

import java.util.ArrayList;

public class Exampprog {
	    public static void main(String[] args) {
	        ArrayList<Integer> arrList1  = new ArrayList<>();

	        arrList1.add(34);
	        arrList1.add(45);
	        arrList1.add(19);
	        arrList1.add(21);

	        ArrayList<Integer> arrList2 = arrList1;
	        
	        System.out.println("array list 2 : " + arrList2);

	        arrList2 = new ArrayList<>();

	        System.out.println(arrList1);
	        System.out.println("array list 2 : " + arrList2);
	    }
	}

	