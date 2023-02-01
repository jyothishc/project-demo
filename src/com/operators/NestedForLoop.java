package com.operators;

public class NestedForLoop {
	
      public static void main(String args[]) {
    	  
    	  //instance variables
    	  int x =5;
    	  int y = 4;
    	  NestedForLoop nestedForLoop = new NestedForLoop();
    	  //non static method
    	  nestedForLoop.showNestedForLoop (x,y);
    	  
      }
      private void showNestedForLoop(int x, int y) {
    	  
    	  System.out.println("X :: "+x);
    	  System.out.println("Y :: "+y);
    	  /**
    	   * syntax
    	   *         for(initialization;condition;increment/decrement){
    	   *         */
    	  for(int i =1; i<=x; i++) {
    		  for(int s=2; s<=y;s++) {
    			  System.out.println(i+", "+s);
    		  }
    	  }
      }

}
