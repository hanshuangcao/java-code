package cn.edu360.javase24.day01;

import java.util.Scanner;

public class LogicProcess {

	/**
	 * @Title: LogicProcess
	 * @Description: LogicProcess���캯��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System .in );
		String name = sc.nextLine();
		if("tom".equals(name)) {
			System.out.println("��ӭ����" + name);
		}else if("jim".equals(name)) {
			// ���name��jim�����������ã�jim��
			System.out.println("���" + name);
		}else {
			// ���������"xxx����"
			System.out.println(name+"����!!!");
			
		}
	}

}
