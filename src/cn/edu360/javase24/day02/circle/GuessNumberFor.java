package cn.edu360.javase24.day02.circle;

import java.util.Scanner;

public class GuessNumberFor {

	/**
	 * @Title: GuessNumberFor
	 * @Description: GuessNumberFor构造函数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;
		for (int i = 0; i < 100; i++) {
			System.out.println("请输入一个数字：");
			Scanner sc = new Scanner(System.in );
			String xx = sc.nextLine();
			//解析字符串成为数字
			int userguess = Integer.parseInt(xx);
			if (userguess>9) {
				System.out.println("您猜的数字太大了！");
			} else if (userguess<9){
				System.out.println("您猜的数字太小了！");
			}else {
				System.out.println("恭喜您，猜对了！");
				break;
			}
		}
		System.out.println("您已猜对，游戏结束！");
	}

}
