package cn.edu360.javase24.day02.student;

public class ProductMgmt {

	/**
	 * @Title: ProductMgmt
	 * @Description: ProductMgmt���캯��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product xx = new Product();
		xx.id = "1";
		xx.name = "����";
		xx.category = "���";
		xx.price = 28.8f;
		
		Product yy = new Product();
		yy.id = "2";
		yy.name = "����";
		yy.category = "����";
		yy.price = 2;
		
		Product zz = new Product();
		zz.id = "3";
		zz.name = "Ƥ��";
		zz.category = "����";
		zz.price = 100;
		
		Product pp = new Product();
		pp.id = "4";
		pp.name = "ˮ";
		pp.category = "��Ʒ";
		pp.price = 10;
		
		Product[] pdts = new Product[4];
		pdts[0] = xx;
		pdts[1] = yy;
		pdts[2] = zz;
		pdts[3] = pp;
		
		Product tmp = pdts[0];
		for (int i = 0; i < pdts.length; i++) {
			if(pdts[i].price > tmp.price) {
				tmp = pdts[i];
			}
		}
		System.out.println(tmp.id + "," + tmp.name +"," +tmp.category +","+ tmp.price);
	}

}
