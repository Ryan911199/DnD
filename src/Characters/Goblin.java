package Characters;


public class Goblin extends playerCharacter{
    public Goblin(){
        isEnemy = true;
    }


    @Override
    public String toString() {
        return "I am a Goblin";
    }
}
