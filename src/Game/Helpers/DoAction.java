package Game.Helpers;
import Characters.playerCharacter;
import Game.BattleEngine.BattleEvent;
import Game.Inventory;

public class DoAction {
    private String[] BasicActions = {"Attack", "Use Item", "List Inventory"};
    private Menu menu = new Menu();
    // private playerCharacter Character;

    public BattleEvent getAction(playerCharacter Character){
        if (Character.isEnemy){

        }else {
            getPlayerAction(Character);
        }
        return null;
    }

    public BattleEvent getPlayerAction(playerCharacter Player){
        System.out.println("What would you like to do?");

        switch (menu.menu(BasicActions)) {
            case 1:
                System.out.println(Player.Inventory.getWeapon());
                System.exit(1);
                break;
            case 2:
                //TODO implement battle
                break;
            case 3:
                Player.Inventory.getItem();
                break;
            case 4:
                Player.Inventory.print();
                break;
            default:
                System.out.println("There was a problem");
                System.exit(1);
        }
        return null;
    }
}
