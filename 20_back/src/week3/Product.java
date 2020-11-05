package week3;

public class Product implements Comparable<Product> {
	private String pcode;
	private String pname;
	private int qty;//��ǰ ����
	
	public Product(String pcode, String pname, int qty) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.qty = qty;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public int compareTo(Product o) {
		//Product Ŭ�����κ��� ������� ��ü�� ��Ҹ� ���Ϸ���? --> ���ذ� ������ ���� �����ؼ� ��
		return pname.compareTo(o.getPname());
	}
}
