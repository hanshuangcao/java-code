package cn.edu360.javase24.day02.array;

public class ArrayDemo2 {

	/**
	 * @Title: ArrayDemo2
	 * @Description: ArrayDemo2¹¹Ôìº¯Êý
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [21];
		for (int i = 0; i < arr.length; i++) {
			arr [i] = i;
		}
		for (int i = arr.length-1; i >= 0; i--) {
		System.out.println(arr[i]);
		}
		int i=0;
		while(i<arr.length) {
			System.out.println(arr[i]);
			i++;
		}
		 
		i=9;
		while(i>-1) {
			System.out.println(arr[i]);
			i--;
		}
	}

}
