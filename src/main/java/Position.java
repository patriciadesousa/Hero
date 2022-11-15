public class Position {
    private int x;
    private int y;

    public Position(int m, int n){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY (int y){
        this.y = y;
    }

    public boolean equals(Object o) {
        if(o == null || o.getClass() != this.getClass()) return false;

        return (this == o) ||
                (this.x == ((Position) o).x && this.y == ((Position) o).y);
    }

    public int getY() {
        return 0;
    }
}
