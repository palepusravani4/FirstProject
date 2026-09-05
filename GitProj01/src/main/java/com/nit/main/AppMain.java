package com.nit.main;

/**
 * Hello world!
 */
public class AppMain {
	public int sum(int x,int y) {
		return x+y;
	}
    public static void main(String[] args) {
    	AppMain app=new AppMain();
        System.out.println("Sum is :: "+app.sum(20, 30));
    }
}
