package logos_oop;

public class Person extends Parent {

	private static int count = 0;
	private int id;

	public Person(String uniq) {

		super(uniq);
		count++;
		this.id = count;

	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + "]" + super.getUniq();
	}

	@Override
	public void met() {
		// TODO Auto-generated method stub
		super.met();
	}

}
