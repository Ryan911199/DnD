package Characters;


public class Goblin extends playerCharacter{
    public Goblin(String name){
        isEnemy = true;
        name = name;
    }

    public String BattleGrid(){
        return "[ E ]";
    }
    @Override
    public String toString() {
        return "I am a Goblin";
    }
}
