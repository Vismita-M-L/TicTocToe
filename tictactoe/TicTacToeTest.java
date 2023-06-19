package com.techlabs.tictactoe;

import java.util.Scanner;

public class TicTacToeTest {

	
	
	    private Board board;

	    public void TicTacToeMain() {
	        board = new Board();
	    }

	    public void playGame() {
	        int currentPlayer = 1;
	        Scanner scanner = new Scanner(System.in);

	        String player1, player2;
	        System.out.println("Enter the name of player 1:");
	        player1 = scanner.next();
	        System.out.println("Enter the name of player 2:");
	        player2 = scanner.next();
	        System.out.println();
	        board.displayBoard();

	        while (!board.isBoardFull()) {
	            if (currentPlayer == 1)
	                System.out.print(player1 + "(X) Turn, enter cell number (1-9): ");
	            else if (currentPlayer == 2)
	                System.out.print(player2 + "(O) Turn, enter cell number (1-9): ");

	            int cellNumber;
	            while (true) {
	                cellNumber = scanner.nextInt();
	                if (cellNumber < 1 || cellNumber > 9)
	                    System.out.println("Enter a number between 1 to 9");
	                else
	                    break;
	            }
	            cellNumber = cellNumber - 1;

	            try {
	                board.setCellMark(cellNumber, currentPlayer == 1 ? MarkType.X : MarkType.O);
	            } catch (CellAlreadyMarkedException e) {
	                System.out.println("That cell is already marked. Please try again...");
	                System.out.println();
	                continue;
	            }

	            board.displayBoard();

	            if (board.hasWon(currentPlayer == 1 ? MarkType.X : MarkType.O)) {
	                if (currentPlayer == 1)
	                    System.out.println(player1 + " wins!");
	                else
	                    System.out.println(player2 + " wins!");
	                break;
	            }

	            currentPlayer = currentPlayer == 1 ? 2 : 1;
	        }

	        if (board.isBoardFull() && !board.hasWon(MarkType.X) && !board.hasWon(MarkType.O)) {
	            System.out.println("It's a tie!");
	        }

	        scanner.close();
	    }

	    public static void main(String[] args) {
	        TicTacToeTest game = new TicTacToeTest();
	        game.TicTacToeMain();
	        game.playGame();
	    }
	}

	
		
		      
		

	
		
		   
		

	
		    
		      
	


