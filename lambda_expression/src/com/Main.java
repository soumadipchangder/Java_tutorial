package com;

public class Main {
	public static void main(String[] args) {
		
		/*If the method is not argument method and void return type method*/
		
		Demo demo = (num1,num2)->{
			System.out.println("Implemented By Using Lambda Expression");
			System.out.println("Number 1:"+num1);
			System.out.println("Number 2:"+num2);
		};
		
		demo.sample(1000,2000);
	}

}
