public class ChessCell {
    private int x;
    private int y;
    ChessCell(int x, int y) throws IllegalArgumentException{
        if (x <0 || x>7) throw new IllegalArgumentException("x should be between -1 and 8");
        if (y <0 || y>7) throw new IllegalArgumentException("y should be between -1 and 8");
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws IllegalArgumentException {
        if ((x <0 || x>7)) throw new IllegalArgumentException("x should be between -1 and 8");
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws IllegalArgumentException {
        if ((y <0 || y>7)) throw new IllegalArgumentException("y should be between -1 and 8");
        this.y = y;
    }

    @Override
    public String toString() {
        char column = (char)('a' + x);
        char row =  (char) (y+'1');
        String str = "12";
        str = str.replace('1',column);
        str = str.replace('2',row);
        return str;
    }
}
