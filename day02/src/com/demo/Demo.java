package com.demo;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//自动转换
		//把long型转为int型，因为int型范围比long范围小，所以会报错
//		long a = 18;
//		int b = a;
//		System.out.println(b);
		
		//强制转换
		int c = 999;
		byte d = (byte)c;//强制类型转换为byte
		System.out.println(d);
		
		int a1 = (int)23.7;//自动转换，浮点数类型
		System.out.println(a1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
