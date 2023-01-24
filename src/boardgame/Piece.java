package boardgame;

public class Piece {
  Position position;
  Board board;
  
  public Piece(Board board)
  {
    // initialy position will be null because piece will be not in the board
    this.position = null;
    this.board = board;
  }

  protected Board getbBoard()
  {
    return board;
  }

  protected Position getPosition()
  {
    return position;
  }

  protected void setPosition(Position position)
  {
    this.position = position;
  }

}
