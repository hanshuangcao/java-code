package cn.edu360.javase24.day01;

import java.util.Scanner;

public class LogicProcess2 {

	/**
	 * @Title: LogicProcess1
	 * @Description: LogicProcess1构造函数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String name =  scn.nextLine();
		
		// 如果name是tom，则输出“欢迎您，tom”
		if("tom".equals(name)) {
			System.out.println("欢迎您，" + name);
		}else {
			System.out.println("我勒个去，你是谁啊");
			
		}
		
		
		if("jim".equals(name)) {
			// 如果name是jim，则输出“你好，jim”
			System.out.println("你好" + name);
		}else{
			// 否则，则输出"xxx滚蛋"
			System.out.println(name+"滚蛋!!!");
			
		}
	}

}
