package cn.edu360.javase24.day01;

import java.util.Scanner;

public class HelloWorld {

	/**
	 * @Title: HelloWorld
	 * @Description: HelloWorld构造函数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in );
		String name = sc.nextLine();
		String n = sc.nextLine();
		String res = name + "好美,"+name + "好坏,"+name + "真是人见人爱";
		System.out.println(res);
		System.out.println(n);
	}

}
