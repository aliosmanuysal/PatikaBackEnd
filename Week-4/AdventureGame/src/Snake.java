import java.util.Random;

public class Snake extends Obstacle {

    private Random random = new Random();


    public Snake() {
        super("Yılan", 12, new Random().nextInt(4) + 3, 0, 12);
    }


}