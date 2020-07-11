package com.day3;

public class TwoDimensionalDemo {
	public static void main(String[] args) {
		String a[]=new String[5];//no of columns - 1 row 5 columns
		String attendance[][]=new String[4][5];//4 rows and 5 columns - a matrix
		for(int i=0;i<attendance.length;i++) {
			for(int j=0;j<attendance[i].length;j++) {
				System.out.print(attendance[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}
}
