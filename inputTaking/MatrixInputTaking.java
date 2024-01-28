package com.inputtacking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixInputTaking {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] dimentions = bf.readLine().split(" ");
		int row = Integer.parseInt(dimentions[0]);
		int column = Integer.parseInt(dimentions[1]);
		
		int[][] matrix = new int[row][column];
		
		for(int i = 0;i<row;i++) {
			String[] rowElements = bf.readLine().split(" ");
			 for (int j = 0; j < column; j++) {
	                matrix[i][j] = Integer.parseInt(rowElements[j]);
	            }
		}
	}
}
