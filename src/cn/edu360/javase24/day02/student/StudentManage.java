package cn.edu360.javase24.day02.student;

public class StudentManage {

	/**
	 * @Title: StudentManage
	 * @Description: StudentManage构造函数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 造一些数据，封装到一个Student对象中
		Student stu1 = new Student();
		stu1.name = "张三丰";
		stu1.age = 200;
		stu1.nbr = "1";
		stu1.score = 99;
		stu1.addr = "武当山";
		
		Student stu2 = new Student();
		stu2.name= "欧阳锋";
		stu2.age = 180;
		stu2.nbr = "2";
		stu2.addr = "白驼山";
		stu2.score = 80;
		
		Student stu3 = new Student();
		stu3.name= "黄药师";
		stu3.age = 120;
		stu3.nbr = "3";
		stu3.addr = "桃花岛";
		stu3.score = 82;
		
		System.out.println(stu1.name);
	}

}
