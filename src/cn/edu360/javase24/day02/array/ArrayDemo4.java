package cn.edu360.javase24.day02.array;

public class ArrayDemo4 {

	/**
	 * @Title: ArrayDemo4
	 * @Description: ArrayDemo4¹¹Ôìº¯Êý
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 30;
		arr[1] = 60;
		arr[2] = 40;
		arr[3] = 50;
		arr[4] = 20;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
