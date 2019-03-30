package Game.BattleEngine.BattleEvents;

import Items.*;

public class UseItem extends BattleEvent {
    private Consumable Item;
    public UseItem(Consumable itmeInput){
        Item = itmeInput;
    }
    @Override
    public void doEvent() {
        Owner.hitPoints = Owner.hitPoints + Item.consume();
    }
}
