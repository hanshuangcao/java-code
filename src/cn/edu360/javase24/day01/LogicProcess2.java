package cn.edu360.javase24.day01;

import java.util.Scanner;

public class LogicProcess2 {

	/**
	 * @Title: LogicProcess1
	 * @Description: LogicProcess1���캯��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String name =  scn.nextLine();
		
		// ���name��tom�����������ӭ����tom��
		if("tom".equals(name)) {
			System.out.println("��ӭ����" + name);
		}else {
			System.out.println("���ո�ȥ������˭��");
			
		}
		
		
		if("jim".equals(name)) {
			// ���name��jim�����������ã�jim��
			System.out.println("���" + name);
		}else{
			// ���������"xxx����"
			System.out.println(name+"����!!!");
			
		}
	}

}
