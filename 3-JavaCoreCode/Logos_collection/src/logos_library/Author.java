package logos_library;

public class Author extends Human {

	private String name;
	private String Lastname;

	public Author(double height, double weight, int age, String name, String lastname) {
		super(height, weight, age);
		this.name = name;
		Lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Lastname == null) ? 0 : Lastname.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (Lastname == null) {
			if (other.Lastname != null)
				return false;
		} else if (!Lastname.equals(other.Lastname))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", Lastname=" + Lastname + "]";
	}

}
