package cn.edu360.javase24.day02.array;

import java.util.Scanner;

public class ArrayDemo1 {

	/**
	 * @Title: ArrayDemo1
	 * @Description: ArrayDemo1���캯��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		float[] scoreArr = new float[5];
		for(int i=0;i<5;i++) {
			System.out.println("������ɼ���");
			String line = sc.nextLine();
			// ��һ������װ��������ָ���ĸ��ӣ��ڼ�������λ�ã�
			scoreArr[i] = Float.parseFloat(line);	
		}
		float sum = 0;
		for (int i = 0; i < scoreArr.length; i++) {
			sum += scoreArr[i];
		}
		System.out.println("�ܳɼ�Ϊ��" + sum);
		System.out.println("ƽ���ɼ�Ϊ��" + sum/5);
	}

}
