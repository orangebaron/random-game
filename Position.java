public class Position {
  public final float x,y;
  public Position(float x,float y) { this.x=x; this.y=y; }
  public Position() { this(0,0); }
  public Position(Position p) { this(p.x,p.y); }

  Position add(Position p) { return new Position(x+p.x,y+p.y); }
  Position sub(Position p) { return new Position(x-p.x,y-p.y); }
  Position mul(Position p) { return new Position(x*p.x,y*p.y); }
  Position div(Position p) { return new Position(x/p.x,y/p.y); }
  Position mul(float m)      { return mul( new Position(m,m) ); }
  Position div(float m)      { return div( new Position(m,m) ); }
  boolean  equ(Position p) { return x==p.x&&y==p.y; }
}
