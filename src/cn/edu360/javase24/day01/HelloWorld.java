package cn.edu360.javase24.day01;

import java.util.Scanner;

public class HelloWorld {

	/**
	 * @Title: HelloWorld
	 * @Description: HelloWorld���캯��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in );
		String name = sc.nextLine();
		String n = sc.nextLine();
		String res = name + "����,"+name + "�û�,"+name + "�����˼��˰�";
		System.out.println(res);
		System.out.println(n);
	}

}
