package cn.edu360.javase24.day01;

import java.util.Scanner;

public class NumberSuan {

	/**
	 * @Title: NumberSuan
	 * @Description: NumberSuan���캯��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ȣ�������һ�����ڻ�ȡ�ն�����Ĺ���Scanner
				Scanner snn = new Scanner(System.in);
				
				// ����취��ȡ�û�����ĵ�һ������
				String number1 = snn.nextLine();
				// ������һ�����ߣ��������������ַ��� ת����ѧ�����ϵ�����
				int nb1 = Integer.parseInt(number1);
				
				
				
				// �ٻ�ȡ�û�����ĵڶ�������
				String number2 = snn.nextLine();
				int nb2 = Integer.parseInt(number2);

				// ������������ӵõ���
				int res = nb1  +  nb2;
				int jian = nb1 - nb2;
				int cheng = nb1 * nb2;
				float chu = (float)nb1 / (float)nb2;   // float�������Ϳ��Ա�ʾС�������ȱ�����Ҫ��
				
				
				// �����������ն���
				System.out.println("������ӵĽ����" + res);
				System.out.println("��������Ľ����" + jian);
				System.out.println("������˵Ľ����" + cheng);
				System.out.println("��������Ľ����" + chu);
				
				float a = (float)1/3;
				System.out.println(a);
				
				
				double b = (double)1/3;
				System.out.println(b);
	}

}
