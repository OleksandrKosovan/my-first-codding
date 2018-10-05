package logos_library;

public class Book {

	private String booksName;
	private int yearPublic;
	private int countrOfPages;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String booksName, int yearPublic, int countrOfPages) {
		super();
		this.booksName = booksName;
		this.yearPublic = yearPublic;
		this.countrOfPages = countrOfPages;
	}

	public String getBooksName() {
		return booksName;
	}

	public void setBooksName(String booksName) {
		this.booksName = booksName;
	}

	public int getYearPublic() {
		return yearPublic;
	}

	public void setYearPublic(int yearPublic) {
		this.yearPublic = yearPublic;
	}

	public int getCountrOfPages() {
		return countrOfPages;
	}

	public void setCountrOfPages(int countrOfPages) {
		this.countrOfPages = countrOfPages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((booksName == null) ? 0 : booksName.hashCode());
		result = prime * result + countrOfPages;
		result = prime * result + yearPublic;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (booksName == null) {
			if (other.booksName != null)
				return false;
		} else if (!booksName.equals(other.booksName))
			return false;
		if (countrOfPages != other.countrOfPages)
			return false;
		if (yearPublic != other.yearPublic)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [booksName=" + booksName + ", yearPublic=" + yearPublic + ", countrOfPages=" + countrOfPages + "]";
	}

}
