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
    private Arena arena = new Arena(80,20);
    public Game() throws IOException {
        hero = new Hero(10, 10);
        try {
            createTerminal();
            this.screen = new TerminalScreen(terminal);
            this.screen.setCursorPosition(null); //we don't need a cursor
            this.screen.starscreen(); // screen must be started
            this.screen.doResizeIfNecessary(); //resize the screen if necessary
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        public void run() throws IOException {
            while (true) {
                draw();
                KeyStroke key = screen.readInput();
                if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'q'){
                    screen.close();
                }
                if (key.getKeyType() == KeyType.EOF) {
                    break;
                }
                arena.processKey(key);
            }
        }
        private Screen screen;
        private void draw() throws IOException{
            screen.clear();
            arena.draw(screen);
            screen.refresh();
        }

    }
    private void moveHero(Position position){
            hero.setPosition(position);
    }
}
