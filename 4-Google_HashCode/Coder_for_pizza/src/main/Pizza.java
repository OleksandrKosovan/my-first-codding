package main;

public class Pizza {

	private int rowsNumber;
	private int columnsNumber;
	private int rCoordinates;
	private int cCoordinates;
	private int number_L;
	private int number_H;
	
	
	
	
	
	public Pizza(String rowsNumber, String columnsNumber,
			String number_L, String number_H) {
		super();
		this.rowsNumber = Integer.parseInt(rowsNumber);
		this.columnsNumber = Integer.parseInt(columnsNumber);
		this.number_L = Integer.parseInt(number_L);
		this.number_H = Integer.parseInt(number_H);
	}

	public Pizza() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Pizza [rowsNumber=" + rowsNumber + ", columnsNumber=" + columnsNumber + ", number_L=" + number_L
				+ ", number_H=" + number_H + "]";
	}
	
	
	
	
	
}
