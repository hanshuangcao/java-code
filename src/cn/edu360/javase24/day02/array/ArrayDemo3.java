package cn.edu360.javase24.day02.array;

public class ArrayDemo3 {

	/**
	 * @Title: ArrayDemo3
	 * @Description: ArrayDemo3构造函数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 25;
		arr[3] = 30;
		arr[4] = 18;
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>tmp) {
				tmp = arr[i];
			}
		}
		System.out.println("最大值为："+tmp);
		tmp =arr[ 0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<tmp) {
				tmp = arr[i];
			}
		}
		System.out.println("最小值为："+tmp);
		
	}

}
