package Characters;

public class Blank extends playerCharacter {
    @Override
    public String toString() {
        return "blank";
    }
    public String BattleGrid(){
        return "[   ]";
    }
}
