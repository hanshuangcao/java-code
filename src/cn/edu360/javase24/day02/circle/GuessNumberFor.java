package cn.edu360.javase24.day02.circle;

import java.util.Scanner;

public class GuessNumberFor {

	/**
	 * @Title: GuessNumberFor
	 * @Description: GuessNumberFor���캯��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;
		for (int i = 0; i < 100; i++) {
			System.out.println("������һ�����֣�");
			Scanner sc = new Scanner(System.in );
			String xx = sc.nextLine();
			//�����ַ�����Ϊ����
			int userguess = Integer.parseInt(xx);
			if (userguess>9) {
				System.out.println("���µ�����̫���ˣ�");
			} else if (userguess<9){
				System.out.println("���µ�����̫С�ˣ�");
			}else {
				System.out.println("��ϲ�����¶��ˣ�");
				break;
			}
		}
		System.out.println("���Ѳ¶ԣ���Ϸ������");
	}

}
