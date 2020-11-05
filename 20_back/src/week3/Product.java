package week3;

public class Product implements Comparable<Product> {
	private String pcode;
	private String pname;
	private int qty;//상품 갯수
	
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
		//Product 클래스로부터 만들어진 객체의 대소를 비교하려면? --> 기준값 가지는 핋드 선택해서 비교
		return pname.compareTo(o.getPname());
	}
}
