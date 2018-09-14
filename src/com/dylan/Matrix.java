package com.dylan;

public class Matrix{
enum Chess{
	BLACK ,
	WHITE 
}
private int Matri[][] = null;
private int black[] = null;
private int white[] = null;
	public Matrix() {
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
				Matri[i][j] = 0;
			}
		}
	}
	public Matrix(Matrix mat, int[] black, int[] white) {
		Matri = mat.getMatri().clone();
		  // -1 OR 1
		this.black = black;
		this.white = white;
	}
	
	public void putChess(int x, int y, Chess side) {
		if(side == Chess.BLACK){
			Matri[x][y] = -1;	// BLACK
		}else {
			Matri[x][y] = 1;		// WHITE
		}
			
	}
	
	public boolean checkWin(Chess side) {
		boolean bl = false;
		if(side == Chess.BLACK) {
			
		}else {
			
		}
		return bl;
	}
	
	public int[][] getMatri(){
		return Matri;
	}
	
	public boolean checkWin(int side) {
		boolean bl = false;
		return bl;
	}
}
