public class QueenBoard{
  private int[][]board;

  public QueenBoard(int size){
    int[][] board = new int[size][size];
  }

  private boolean addQueen(int r, int c){
    return true;
  }

  private boolean removeQueen(int r, int c){
    return true;
  }


  public String toString(){
    return "";
  }


   /**
   *@return false when the board is not solveable and leaves the board filled with zeros;
   *        true when the board is solveable, and leaves the board in a solved state
   *@throws IllegalStateException when the board starts with any non-zero value
   */
   public boolean solve(){
     return true;
   }

   /**
   *@return the number of solutions found, and leaves the board filled with only 0's
   *@throws IllegalStateException when the board starts with any non-zero value
   */
   public int countSolutions(){
     return 0;
   }



}
