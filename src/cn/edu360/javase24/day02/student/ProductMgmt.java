package cn.edu360.javase24.day02.student;

public class ProductMgmt {

	/**
	 * @Title: ProductMgmt
	 * @Description: ProductMgmt构造函数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product xx = new Product();
		xx.id = "1";
		xx.name = "手铐";
		xx.category = "监管";
		xx.price = 28.8f;
		
		Product yy = new Product();
		yy.id = "2";
		yy.name = "蜡烛";
		yy.category = "照明";
		yy.price = 2;
		
		Product zz = new Product();
		zz.id = "3";
		zz.name = "皮鞭";
		zz.category = "打人";
		zz.price = 100;
		
		Product pp = new Product();
		pp.id = "4";
		pp.name = "水";
		pp.category = "饮品";
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
