package cn.edu360.javase24.day02.student;

public class StudentManage {

	/**
	 * @Title: StudentManage
	 * @Description: StudentManage���캯��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��һЩ���ݣ���װ��һ��Student������
		Student stu1 = new Student();
		stu1.name = "������";
		stu1.age = 200;
		stu1.nbr = "1";
		stu1.score = 99;
		stu1.addr = "�䵱ɽ";
		
		Student stu2 = new Student();
		stu2.name= "ŷ����";
		stu2.age = 180;
		stu2.nbr = "2";
		stu2.addr = "����ɽ";
		stu2.score = 80;
		
		Student stu3 = new Student();
		stu3.name= "��ҩʦ";
		stu3.age = 120;
		stu3.nbr = "3";
		stu3.addr = "�һ���";
		stu3.score = 82;
		
		System.out.println(stu1.name);
	}

}
