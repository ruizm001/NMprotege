/**
 * 
 */
package com.spectrum.nm;

/**
 * @author mruiz
 * 
 * Position a1 is a black and h1 is white
 * 
 *                            White Side
 *   x->            a	b	c	d	e	f	g	h
 *   y            1	QR QN  QB   Q	K  KB  KN  KR	1
 *   |            2	P	P	P	P	P	P	P	P	2
 *                3									3
 *                4									4	
 *                5									5	
 *                6									6
 *                7	P	P	P	P	P	P	P	P	7
 *                8	QR QN  QB   Q	K  KB  KN  KR	8
 *                   a	b	c	d	e	f	g	h
 *                             Black Side
 *
 */
public class ChessBoard {
	
	private ChessPiece[][] squares = new ChessPiece[7][7]; // y
	
	ChessBoard(){
		for (int i=0;i<7;i++){
			for (int j=0; j<7; j++){
				
			}
		}
		
	}
	
	

}
