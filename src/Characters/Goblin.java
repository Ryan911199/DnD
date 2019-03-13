package Characters;


public class Goblin extends playerCharacter{
    public Goblin(){
        isEnemy = true;
    }

    public String BattleGrid(){
        return "[ E ]";
    }
    @Override
    public String toString() {
        return "I am a Goblin";
    }
}
