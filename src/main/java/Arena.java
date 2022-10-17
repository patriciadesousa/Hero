import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

import javax.swing.text.Position;

public class Arena {
    private int width;
    private int height;

    private  Hero hero;

    public Arena(int m, int n) {
        width = m;
        this.height = n;
        hero = new Hero(m/2, n/2);
    }

    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void processKey(KeyStroke key){
        if (key.getKeyType() == KeyType.ArrowUp){
            moveHero((Position) hero.moveUp());
        }
        if (key.getKeyType() == KeyType.ArrowDown){
            moveHero((Position) hero.moveDown());
        }
        if (key.getKeyType() == KeyType.ArrowRight){
            moveHero((Position) hero.moveRight());
        }
        if (key.getKeyType() == KeyType.ArrowLeft){
            moveHero((Position) hero.moveLeft());
        }
    }

    public void draw(Screen screen){
        hero.draw(screen);
    }
    public void moveHero(Position position){
        if(canHeroMove(position))
            hero.setPosition(position);
    }

    private boolean canHeroMove(Position position) {
        if(position.getX()<0) return false;
        if(position.getY()<0) return false;
        if (position.getX()>width-1) return false;
        if(position.getY()>height-1) return false;
        return true;
    }
}
