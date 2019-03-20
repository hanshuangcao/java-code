package cn.edu360.javase24.day01;

import java.util.Scanner;

public class LogicProcess {

	/**
	 * @Title: LogicProcess
	 * @Description: LogicProcess构造函数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System .in );
		String name = sc.nextLine();
		if("tom".equals(name)) {
			System.out.println("欢迎您，" + name);
		}else if("jim".equals(name)) {
			// 如果name是jim，则输出“你好，jim”
			System.out.println("你好" + name);
		}else {
			// 否则，则输出"xxx滚蛋"
			System.out.println(name+"滚蛋!!!");
			
		}
	}

}
