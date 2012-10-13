/**
 * 
 */
package com.spectrum.nm;

/**
 * @author mruiz
 *
 */
public class Square {
	
	private boolean blackSquare = true;
	private char x_pos = 'a';
	private int y_pos = '1';
	private boolean currentlyOccupied = true;
	private boolean occupyingPieceWhite = true;
	
	Square(){
		
	}
	
	Square(boolean blkSquare, char x, int y, boolean occupied, boolean pieceWhite){
		blackSquare = blkSquare;
		if (x>='a' && x<='h'){
			x_pos = x;
		}
		
		if (y>=1 && y<=8){
			y_pos = y;
		}
		
		currentlyOccupied = occupied;
		
		occupyingPieceWhite = pieceWhite;
	}
	
	public boolean isSquareBlack(){
		
		return blackSquare;
	}
	
	public boolean isSquareWhite(){
		
		return !blackSquare;
	}
	
	public boolean isCurrentlyOccupied(){
		
		return currentlyOccupied;
	}
	
	public boolean isOccupyingPieceWhite(){
		
		return occupyingPieceWhite;
	}
	
	public boolean isOccupyingPieceBlack(){
		
		return !occupyingPieceWhite;
		
	}
	
	

}
