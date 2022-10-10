import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

public class Hero {
    private int x;
    private int y;

    public Hero(int m, int n) {
        x = m;
        this.y = n;
    }
    public void draw(Screen screen){
        screen.setCharacter(x,y, TextCharacter.fromCharacter('X')[0]);
    }
    public int getX() {
        return x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
