import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;

public class Hero {
    private Position position = new Position(1,1);
    public Hero(int m, int n) {
        position.setX(m);
        position.setY(n);
    }
    public void draw(Screen screen){
        screen.setCharacter(position.getX(), position.getY(), TextCharacter.fromCharacter('X')[0]);
    }
    public Position getPosition(){
        return position;
    }
    public void setPosition(Position position){
        this.position = position;
    }
    public Position moveUp(){
        return new Position(position.getX(), position.getY()-1);
    }
    public Position moveDown() {
        return new Position(position.getX(), position.getY()+1);
    }
    public Position moveLeft(){
        return new Position(position.getX()-1,position.getY());
    }
    public Position moveRight(){
        return new Position(position.getX()+1,position.getY());
    }
}
