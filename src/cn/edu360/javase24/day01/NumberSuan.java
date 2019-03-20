package cn.edu360.javase24.day01;

import java.util.Scanner;

public class NumberSuan {

	/**
	 * @Title: NumberSuan
	 * @Description: NumberSuan构造函数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 首先，创建出一个用于获取终端输入的工具Scanner
				Scanner snn = new Scanner(System.in);
				
				// 先想办法获取用户输入的第一个数字
				String number1 = snn.nextLine();
				// 利用另一个工具，将阿拉伯数字字符串 转成数学意义上的整数
				int nb1 = Integer.parseInt(number1);
				
				
				
				// 再获取用户输入的第二个数字
				String number2 = snn.nextLine();
				int nb2 = Integer.parseInt(number2);

				// 将两个数字相加得到和
				int res = nb1  +  nb2;
				int jian = nb1 - nb2;
				int cheng = nb1 * nb2;
				float chu = (float)nb1 / (float)nb2;   // float这种类型可以表示小数，精度比整数要高
				
				
				// 将结果输出到终端上
				System.out.println("两数相加的结果：" + res);
				System.out.println("两数相减的结果：" + jian);
				System.out.println("两数相乘的结果：" + cheng);
				System.out.println("两数相除的结果：" + chu);
				
				float a = (float)1/3;
				System.out.println(a);
				
				
				double b = (double)1/3;
				System.out.println(b);
	}

}
