package Game.BattleEngine.BattleEvents;

import Characters.playerCharacter;
import Items.*;

public class UseItem extends BattleEvent {
    private Consumable Item;
    private playerCharacter Owner;
    public UseItem(Consumable itemInput, playerCharacter owner){
        Item = itemInput;
        Owner = owner;
    }
    @Override
    public void doEvent() {
        System.out.println(Owner.name + " ate " + Item + " which healed them " + Item.health() + "(E)");
        scan.nextLine();
        Owner.hitPoints = (Owner.hitPoints + Item.health());
		Owner.Inventory.remove((item) Item);
    }
}
