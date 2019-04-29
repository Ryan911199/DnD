package Game.BattleEngine;

import Characters.playerCharacter;
import Game.Helpers.Menu;

public class BattleGrid {
    private Menu menu = new Menu();
    private playerCharacter Player;
    private playerCharacter Enemy;
    private Space[][] BattleGrid = new Space[5][5];
    private int[] enemyPosition = {0,2};
    private int[] playerPosition = {4,2};

    public BattleGrid(playerCharacter player){
        Player = player;
    }

    public void Setup(playerCharacter enemy){
        setEnemy(enemy);
        makeGrid();
        enemyPosition[0] = 0;
        enemyPosition[1] = 2;
        playerPosition[0] = 4;
        playerPosition[1] = 2;
        BattleGrid[enemyPosition[0]][enemyPosition[1]].setOccupant(Enemy);
        BattleGrid[playerPosition[0]][playerPosition[1]].setOccupant(Player);
    }

    private void makeGrid(){
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 5; y++){
                BattleGrid[x][y] = new Space();
            }
        }
    }

    public void setEnemy(playerCharacter enemy) {
        Enemy = enemy;
    }

    public void printGrid(){
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 5; y++){
                System.out.print(BattleGrid[x][y]);
            }
            System.out.println();
            System.out.println();
        }
    }

    public boolean playerMove(){
        String[] Direction = {"Up", "Down", "Left", "Right", "Don't Move"};
        while (true){
            System.out.println("    Move");
            switch (menu.menu(Direction)){
                case 1:
                    if(enemyPosition[0] != (playerPosition[0] - 1) || enemyPosition[1] != playerPosition[1]){
                        BattleGrid[playerPosition[0]][playerPosition[1]].setOccupant(null);
                        playerPosition[0] = playerPosition[0] - 1;
                        BattleGrid[playerPosition[0]][playerPosition[1]].setOccupant(Player);
                        return true;
                    }
                    else if(enemyPosition[0] == playerPosition[0] + 1  && enemyPosition[1] == playerPosition[1]){
                        System.out.println("You can not move on top of the enemy please pick again");
                        //return false;
                    }
                    else {movethere();}
                    break;
                case 2:
                    if(enemyPosition[0] != (playerPosition[0] + 1) || enemyPosition[1] != playerPosition[1]){
                        BattleGrid[playerPosition[0]][playerPosition[1]].setOccupant(null);
                        playerPosition[0] = playerPosition[0] + 1;
                        BattleGrid[playerPosition[0]][playerPosition[1]].setOccupant(Player);
                        return true;
                    }
                    else if(enemyPosition[0] == (playerPosition[0] - 1) && enemyPosition[1] == playerPosition[1]){
                        System.out.println("You can not move on top of the enemy please pick again");
                        //return false;
                    }
                    else {movethere();}
                    break;
                case 3:
                    if(enemyPosition[0] != playerPosition[0] || enemyPosition[1] != (playerPosition[1]-1)){
                        BattleGrid[playerPosition[0]][playerPosition[1]].setOccupant(null);
                        playerPosition[1] = playerPosition[1] - 1;
                        BattleGrid[playerPosition[0]][playerPosition[1]].setOccupant(Player);
                        return true;
                    }
                    else if(enemyPosition[0] == playerPosition[0] && enemyPosition[1] == playerPosition[1] - 1){
                        System.out.println("You can not move on top of the enemy please pick again");
                        //return false;
                    }
                    else {movethere();}
                    break;
                case 4:
                    if(enemyPosition[0] != playerPosition[0] || enemyPosition[1] != (playerPosition[1]+1)){
                        BattleGrid[playerPosition[0]][playerPosition[1]].setOccupant(null);
                        playerPosition[1] = playerPosition[1] + 1;
                        BattleGrid[playerPosition[0]][playerPosition[1]].setOccupant(Player);
                        return true;
                    }
                    else if(enemyPosition[0] == playerPosition[0] && enemyPosition[1] == playerPosition[1] + 1){
                        System.out.println("You can not move on top of the enemy please pick again");
                        //return false;
                    }
                    else {movethere();}
                    break;
                case 5:
                    return false;
                default:
                    System.out.println("There was a problem in BattleGrid.playerMove");
                    System.exit(1);
            }
        }
    }

    public int distance(){
        return -1;
    }

    public boolean canMeelee(){
        if (enemyPosition[0] == playerPosition[0] && enemyPosition[1] == (playerPosition[1]+1) || enemyPosition[1] == (playerPosition[1]-1)) {
            return true;
        }
        if (enemyPosition[1] == (playerPosition[1]) && enemyPosition[0] == (playerPosition[0] + 1) || enemyPosition[1] == (playerPosition[1]) && enemyPosition[0] == (playerPosition[0] - 1)) {
            return true;
        }
        return false;
    }

    private boolean movethere(){
        System.out.println("You tried to move outside the battle field. Please pick again");
        return false;
    }
    public Boolean enemyMove(){
        int temp = enemyPosition[0];
        try{
            if (playerPosition[0] != enemyPosition[0]){
                if (playerPosition[0] - enemyPosition[0] > 0){
                    enemyPosition[0] = enemyPosition[0] + 1;
                }
                else {
                    enemyPosition[0] = enemyPosition[0] - 1;
                }
                BattleGrid[enemyPosition[0]][enemyPosition[1]].setOccupant(Enemy);
                BattleGrid[temp][enemyPosition[1]].setOccupant(null);
                return true;
            }
        }
        catch (IndexOutOfBoundsException e){
            enemyPosition[0] = temp;
        }
        temp = enemyPosition[1];
        try{
            if (playerPosition[1] != enemyPosition[1]){
                if (playerPosition[1] - enemyPosition[1] > 0){
                    enemyPosition[1] = enemyPosition[1] + 1;
                }else {
                    enemyPosition[1] = enemyPosition[1] - 1;
                }
                BattleGrid[enemyPosition[0]][enemyPosition[1]].setOccupant(Enemy);
                BattleGrid[enemyPosition[0]][temp].setOccupant(null);
                return true;
            }
        }
        catch (IndexOutOfBoundsException e){
            enemyPosition[0] = temp;
        }
        return false;
    }
}
