import static dit948.SimpleIO.*;


/**
 *  Class TTT implements the necessary machinery to play one
 *  game of tic-tac-toe between two players, for the
 *  second assignment in DIT948, 2014 edition. //addedcomment
 */

//	Responsible: Ivo Vryashkov

public class TTT {
    /**
     *  A two-element array for the players.
     */
    private Player[] players = new Player[2];
    /**
     *  An instance of the TTTBoard class.
     */
    private TTTBoard board = new TTTBoard();

    /**
     *  Constructs a new game with the two players.
     */
    public TTT(Player player1, Player player2) {
    	
    	// assign players to array
    	
    	for (int i=0; i<players.length; i++) {
    		players[0] = player1;
    		players[1] = player2;
    	} // end for loop
    	
    } // end public TTT

    /**
     *  Prints the index (0 or 1) of the player who has
     *  the first move (result of a random decision).
     *  Then prints the board.
     *  Then enters a loop in which the two players take
     *  turns; after each move the board is printed.
     *  The loop is exited when the game is over.
     */
    public void play() {
    	
    	// random integer for which player to move first
    	int player = randomInt(2);
    	
    	// print which player is to move
    	println(" Player " + player + " to move.");
    	
    	// print board (initially empty)
    	println(board.toString());
    	
    	   	
    	// do..while loop for the game (we want to run it at least one)
    	// ends if game is over
    	
    	do{
    		
    		// integer for switching players
    		int currentPlayer = player;
    		
    		// if condition for right player to move based on random number above
    		if (currentPlayer == 0) {
    			players[0].move();
    		} else {
    			players[1].move();
    		} // end if condition
    		
    		// if condition to change players	
    		if (currentPlayer == 0) {
    			currentPlayer = 1;
    		} else {
    			currentPlayer = 0;
    		} // end if condition
    		
    		// print who is next to move
    		println("Player " + currentPlayer + " to move.");
    		
    		// print the board
    		println(board.toString());
    		
    		
    	}while (!gameOver);	// end do...while loop
    	
    }	//	end play()

    /**
     *  This is the main function which will be used
     *  to test your program; do not change it.
     */
    public static void main(String[] args) {
        Player player1 = new RandomPlayer();
        Player player2 = new HumanPlayer();
        TTT ttt = new TTT(player1, player2);
        ttt.play();
    }
}

        
