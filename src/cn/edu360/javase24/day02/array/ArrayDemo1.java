package cn.edu360.javase24.day02.array;

import java.util.Scanner;

public class ArrayDemo1 {

	/**
	 * @Title: ArrayDemo1
	 * @Description: ArrayDemo1构造函数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		float[] scoreArr = new float[5];
		for(int i=0;i<5;i++) {
			System.out.println("请输入成绩：");
			String line = sc.nextLine();
			// 将一个数据装入数组中指定的格子（第几个索引位置）
			scoreArr[i] = Float.parseFloat(line);	
		}
		float sum = 0;
		for (int i = 0; i < scoreArr.length; i++) {
			sum += scoreArr[i];
		}
		System.out.println("总成绩为：" + sum);
		System.out.println("平均成绩为：" + sum/5);
	}

}
