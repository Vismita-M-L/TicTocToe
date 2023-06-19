package com.techlabs.tictactoe;

public class Cell {
	private MarkType mark;

	public Cell() {
	
		mark = MarkType.EMPTY;
	}
	 public boolean isEmpty() {
	 return mark == MarkType.EMPTY;
}
	 public MarkType getMark() {
		 return mark;
	 }
	 public void setMark(MarkType mark) throws CellAlreadyMarkedException {
		    if (isEmpty()) {
		        this.mark = mark;
		    } else {
		        throw new CellAlreadyMarkedException("Cell is already marked.");
		    }
		}

	 
	 public String toString() {
	        return mark.toString();
	    }
}
	
