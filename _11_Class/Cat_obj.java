package _11_Class;

public class Cat_obj {
	private String catName=null;
	private int catAge=0;
	
	public void prt() {
		System.out.println("-----고양이 정보-----");
		System.out.println(this.catName);
		System.out.println(this.catAge);
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public int getCatAge() {
		return catAge;
	}

	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
	
	
}
