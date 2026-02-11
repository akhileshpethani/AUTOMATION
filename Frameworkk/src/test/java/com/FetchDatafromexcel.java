package com;

public class FetchDatafromexcel {
	
	public static void main(String[] args) {
		ExcellReader e = new ExcellReader("C:\\Users\\jagruti\\Desktop\\Water management.xlsx", "Test");

		int rows = e.rowCount();
		System.out.println("rows : " + rows);
		
		int cols = e.colCount();
		System.out.println("columns : " + cols);

		String data = e.getData(2,1);
		System.out.println(data);

		for (int r = 1; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				String text = e.getData(r, c);
				System.out.println(text);
			}
		}
	}

}
