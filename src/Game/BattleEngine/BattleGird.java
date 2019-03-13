package Game.BattleEngine;

import Characters.Blank;
import Characters.playerCharacter;

public class BattleGird {
    private playerCharacter Player;
    private playerCharacter Enemy;
    private playerCharacter[][] BattleGrid = new playerCharacter[5][5];
    private int[] enemyPosition = {0,2};
    private int[] playerPosition = {4,2};

    public BattleGird(playerCharacter player, playerCharacter enemy){
        Player = player;
        Enemy = enemy;
        makeGrid();
        BattleGrid[0][2] = Enemy;
        BattleGrid[4][2] = Player;
    }
    private void makeGrid(){
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 5; y++){
                BattleGrid[x][y] = new Blank();
            }
        }
    }

    public void printGrid(){
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 5; y++){
                System.out.print(BattleGrid[x][y].BattleGrid());
            }
            System.out.println();
            System.out.println();
        }
    }

    public boolean inLine(){
        if (enemyPosition[1] == playerPosition[1]){
            return true;
        }else {
            return false;
        }
    }
}
