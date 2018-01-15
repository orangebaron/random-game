public class Position {
  public final int x,y;
  public Position(int x,int y) { this.x=x; this.y=y; }
  public Position() { this(0,0); }
  public Position(Position p) { this(p.x,p.y); }

  Position add(Position p) { return new Position(x+p.x,y+p.y); }
  Position sub(Position p) { return new Position(x-p.x,y-p.y); }
  Position mul(Position p) { return new Position(x*p.x,y*p.y); }
  Position div(Position p) { return new Position(x/p.x,y/p.y); }
  Position mul(int m)      { return mul( new Position(m,m) ); }
  Position div(int m)      { return div( new Position(m,m) ); }
  boolean  equ(Position p) { return x==p.x&&y==p.y; }
}
