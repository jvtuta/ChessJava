package boardgame;

public class Board {
  private Piece[][] pieces;
  private int rows, columns;

  public Board(int rows, int columns) {
    this.rows = rows;
    this.columns = columns;
    pieces = new Piece[rows][columns];
  }

  public int getRows()
  {
    return rows;
  }

  public int getColumns()
  {
    return columns;
  }


}
