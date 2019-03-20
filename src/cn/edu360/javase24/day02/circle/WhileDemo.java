package cn.edu360.javase24.day02.circle;

public class WhileDemo {

	/**
	 * @Title: WhileDemo
	 * @Description: WhileDemo¹¹Ôìº¯Êý
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
//		while(i<101) {
//			System.out.println(i);
//			i = i+1;
//		}
		
		while(true) {
//			 i = i+1;
//			 i += 1;
			 i++;  
			if(i >100) {
				break;
			}else {
				System.out.println(i);
			}
		}
	}

}
