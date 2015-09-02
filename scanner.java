package edu.wbqa.basic;

public class scanner {

	public static void main(String[] args) {
		int x, y, temp;
	      System.out.println("Enter x and y");
	      scanner in = new scanner();
	 
	      x = in.nextInt();
	      y = in.nextInt();
	 
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	 
	      temp = x;
	      x = y;
	      y = temp;
	 
	      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	   }

	private int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}


