import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Game game = new Game();
        game.run();
        try{
            game.run();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
