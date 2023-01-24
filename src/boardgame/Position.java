package boardgame;

public class Position {
  private int column, row;

  public Position(int column, int row) 
  {
    this.column = column;
    this.row = row;
  }

  public int getRow() 
  {
    return row;
  }

  public int getColumn()
  {
    return column;
  }

  public void setRow(int row)
  {
    this.row = row;
  }

  public void setColumn(int column)
  {
    this.column = column;
  }

  @Override
  public String toString()
  {
    return row + ", " + column;
  }
}