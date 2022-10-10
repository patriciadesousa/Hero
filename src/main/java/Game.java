import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import javax.swing.*;
import java.io.IOException;

public class Game {
    Screen screen;
    private int x=10;
    private int y=10;
    private Hero hero;
    public Game () throws IOException {
        hero = new Hero(10,10);
       Terminal terminal = new
               DefaultTerminalFactory().createTerminal();
       this.screen = new TerminalScreen(terminal);
       this.screen.setCursorPosition(null); //we don't need a cursor
       this.screen.starscreen(); // screen must be started
        this.screen.doResizeIfNecessary(); //resize the screen if necessary
    }  catch(IOException) {
        e.printStackTrace();
    }

        private void draw() throws IOException {
            screen.clear();
            screen.setCharacter(x, y, TextCharacter.fromCharacter('X')[0]);
            screen.refresh();
        }

        public void run() throws IOException {
            draw();
            while (true) {
                draw();
                KeyStroke key = screen.readInput();
                if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'q'){
                    screen.close();
                }
                if (key.getKeyType() == KeyType.EOF) {
                    break;
                }
                processKey(key);
            }
        }
        private Screen screen;
        private void darw() throws IOException{
            screen.clear();
            //screen.setCharacter(10,10, TextCharacter.fromCharacter ('X'[0]));
            screen.setCharacter(x,y,TextCharacter.fromCharacter('X')[0]);
            hero.draw(screen);
            screen.refresh();
        }

    private void processKey(KeyStroke key) throws IOException {
            //System.out.println(key);
            if (ket.getKeyType()==KeyType.ArrowUp){
                //y = y-1;
                hero.setY(hero.getY()-1);
            }
            if (key.getKeyType()==KeyTyPE.ArrowDown){
                //y = y+1
                hero.setY(hero.getY()+1);
            }
            if (key.getKeyType()==KeyType.ArrowRight){
                //x = x+1
                hero.setX(hero.getX()+1);
            }
            if (key.getKeyType()==KeyType.ArrowLet){
                //x = x-1
                hero.setX(hero.getX()-1);
            }
    }
}
