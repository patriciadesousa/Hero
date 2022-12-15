import java.awt.*;
import java.io.IOException;
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hero extends  Element{

    public Hero(int m, int n) {
        super(m, n);
    };
    public void draw(TextGraphics screen){
        screen.setForegroundColor(TextColor.Factory.fromString("#FFFF33"));
        screen.enableModifiers(SGR.BOLD);
        screen.putString(new TerminalPosition(getPosition().getX(), getPosition().getY()), "X");
    }

    public Position moveUp() {
        return new Position(hero.getPosition().getX(), hero.getPosition().getY() - 1);
    }

    public Position moveDown() {
        return new Position(hero.getPosition().getX(), hero.getPosition().getY() + 1);
    }

    public Position moveLeft() {
        return new Position(hero.getPosition().getX()-1, hero.getPosition().getY());
    }

    public Position moveRight() {
        return new Position(hero.getPosition().getX()+1, hero.getPosition().getY());
    }

}

//REFAZER