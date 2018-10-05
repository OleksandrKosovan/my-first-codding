package ua.google.hashcode.pizza;

public class Pizza {

	private int rowsNumber;
	private int columnsNumber;
	private int rCoordinates;
	private int cCoordinates;
	private int number_L;
	private int number_H;

	public Pizza(String rowsNumber, String columnsNumber, String number_L, String number_H) {
		super();
		this.rowsNumber = Integer.parseInt(rowsNumber);
		this.columnsNumber = Integer.parseInt(columnsNumber);
		this.number_L = Integer.parseInt(number_L);
		this.number_H = Integer.parseInt(number_H);
	}

	public Pizza() {
	}

	public int getRowsNumber() {
		return rowsNumber;
	}

	public void setRowsNumber(int rowsNumber) {
		this.rowsNumber = rowsNumber;
	}

	public int getColumnsNumber() {
		return columnsNumber;
	}

	public void setColumnsNumber(int columnsNumber) {
		this.columnsNumber = columnsNumber;
	}

	public int getrCoordinates() {
		return rCoordinates;
	}

	public void setrCoordinates(int rCoordinates) {
		this.rCoordinates = rCoordinates;
	}

	public int getcCoordinates() {
		return cCoordinates;
	}

	public void setcCoordinates(int cCoordinates) {
		this.cCoordinates = cCoordinates;
	}

	public int getNumber_L() {
		return number_L;
	}

	public void setNumber_L(int number_L) {
		this.number_L = number_L;
	}

	public int getNumber_H() {
		return number_H;
	}

	public void setNumber_H(int number_H) {
		this.number_H = number_H;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cCoordinates;
		result = prime * result + columnsNumber;
		result = prime * result + number_H;
		result = prime * result + number_L;
		result = prime * result + rCoordinates;
		result = prime * result + rowsNumber;
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
		Pizza other = (Pizza) obj;
		if (cCoordinates != other.cCoordinates)
			return false;
		if (columnsNumber != other.columnsNumber)
			return false;
		if (number_H != other.number_H)
			return false;
		if (number_L != other.number_L)
			return false;
		if (rCoordinates != other.rCoordinates)
			return false;
		if (rowsNumber != other.rowsNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pizza [rowsNumber=" + rowsNumber + ", columnsNumber=" + columnsNumber + ", rCoordinates=" + rCoordinates
				+ ", cCoordinates=" + cCoordinates + ", number_L=" + number_L + ", number_H=" + number_H + "]";
	}

}
