import java.util.Random;

public class Dice {
    private Random rand = new Random();

    public int rollDice (int dice, int sides){
        int result = 0;
        for(int x = 0; x < dice; x++){
            result = result + rand.nextInt(sides) + 1;
        }
        return result;
    }
}
