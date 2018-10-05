package logos_oop;

public class Parent {

	private String uniq;

	public Parent() {
		// TODO Auto-generated constructor stub
	}

	public Parent(String uniq) {
		super();
		this.uniq = uniq;
	}

	public String getUniq() {
		return uniq;
	}

	public void setUniq(String uniq) {
		this.uniq = uniq;
	}

	@Override
	public String toString() {
		return "Parent [uniq=" + uniq + "]";
	}

	public void met() {
		System.out.println("Parent");
	}
}
