package Game.Story;

import Characters.Enemys.Demogorgon;
import Characters.Enemys.Enemy;
import Characters.Enemys.Goblin;
import Characters.Race;
import Characters.playerCharacter;
import Items.Food.Bread;
import Items.Weapons.Sword;

public class BattleoftheDemogorgon extends StoryNode {
    public BattleoftheDemogorgon(StoryList story) {
        super(story);
    }

    @Override
    public void Story(playerCharacter Player) {
        System.out.println("As the keeper has fallen, the doors to the Demogorgon lair opens");
        System.out.println("\t\t\t   _________________________________________________________\n" +
                " /|     -_-                                             _-  |\\\n" +
                "/ |_-_- _                                         -_- _-   -| \\   \n" +
                "  |                            _-  _--                      | \n" +
                "  |                            ,                            |\n" +
                "  |      .-'````````'.        '(`        .-'```````'-.      |\n" +
                "  |    .` |           `.      `)'      .` |           `.    |          \n" +
                "  |   /   |   ()        \\      U      /   |    ()       \\   |\n" +
                "  |  |    |    ;         | o   T   o |    |    ;         |  |\n" +
                "  |  |    |     ;        |  .  |  .  |    |    ;         |  |\n" +
                "  |  |    |     ;        |   . | .   |    |    ;         |  |\n" +
                "  |  |    |     ;        |    .|.    |    |    ;         |  |\n" +
                "  |  |    |____;_________|     |     |    |____;_________|  |  \n" +
                "  |  |   /  __ ;   -     |     !     |   /     `'() _ -  |  |\n" +
                "  |  |  / __  ()        -|        -  |  /  __--      -   |  |\n" +
                "  |  | /        __-- _   |   _- _ -  | /        __--_    |  |\n" +
                "  |__|/__________________|___________|/__________________|__|\n" +
                " /                                             _ -           \\\n" +
                "/   -_- _ -             _- _---                       -_-  -_ \\");
        System.out.println("The roar of the Demogorgon erupted out of the lair and filled every chamber of the cave system .");
        System.out.println("You trudged past the doors and enter the lair and witness the Demogorgons face for the first time");
        System.out.println("X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X\n" +
                "|                           ,,'``````````````',,                            |\n" +
                "X                        ,'`                   `',                          X\n" +
                "|                      ,'                         ',                        |\n" +
                "X                    ,'          ;       ;          ',                      X\n" +
                "|       (           ;             ;     ;             ;     (               |\n" +
                "X        )         ;              ;     ;              ;     )              X\n" +
                "|       (         ;                ;   ;                ;   (               |\n" +
                "X        )    ;   ;    ,,'```',,,   ; ;   ,,,'```',,    ;   ;               X\n" +
                "|       (    ; ',;   '`          `',   ,'`          `'   ;,' ;              |\n" +
                "X        )  ; ;`,`',  _--~~~~--__   ' '   __--~~~~--_  ,'`,'; ;     )       X\n" +
                "|       (    ; `,' ; :  /       \\~~-___-~~/       \\  : ; ',' ;     (        |\n" +
                "X  )     )   )',  ;   -_\\  o    /  '   '  \\    o  /_-   ;  ,'       )   (   X\n" +
                "| (     (   (   `;      ~-____--~'       '~--____-~      ;'  )     (     )  |\n" +
                "X  )     )   )   ;            ,`;,,,   ,,,;',            ;  (       )   (   X\n" +
                "| (     (   (  .  ;        ,'`  (__ '_' __)  `',        ;  . )     (     )  |\n" +
                "X  )     \\/ ,\".). ';    ,'`        ~~ ~~        `',    ;  .(.\", \\/  )   (   X\n" +
                "| (   , ,'|// / (/ ,;  '        _--~~-~~--_        '  ;, \\)    \\|', ,    )  |\n" +
                "X ,)  , \\/ \\|  \\\\,/  ;;       ,; |_| | |_| ;,       ;;  \\,//  |/ \\/ ,   ,   X\n" +
                "|\",   .| \\_ |\\/ |#\\_/;       ;_| : `~'~' : |_;       ;\\_/#| \\/| _/ |.   ,\"  |\n" +
                "X#(,'  )  \\\\\\#\\ \\##/)#;     :  `\\/       \\/   :     ;#(\\##/ /#///  (  ',)# ,X\n" +
                "|| ) | \\ |/ /#/ |#( \\; ;     :               ;     ; ;/ )#| \\#\\ \\| / | ( |) |\n" +
                "X\\ |.\\\\ |\\_/#| /#),,`   ;     ;./\\_     _/\\.;     ;   `,,(#\\ |#\\_/| //.| / ,X\n" +
                "| \\\\_/# |#\\##/,,'`       ;     ~~--|~|~|--~~     ;       `',,\\##/#| #\\_// \\/|\n" +
                "X  ##/#  #,,'`            ;        ~~~~~        ;            `',,#  #\\##  //X\n" +
                "|####@,,'`                 `',               ,'`                 `',,@####| |\n" +
                "X#,,'`                        `',         ,'`                        `',,###X\n" +
                "|'  spb                          ~~-----~~                               `' |\n" +
                "X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X");
        Story.add(new End(Story));
    }

    void giveItems(playerCharacter Player) {

    }

    public boolean hasEnemy() {
        return true;
    }

    public boolean mustFight() {
        return true;
    }

    public boolean fightNow() {
        return true;
    }

    public Enemy getEnemy() {

        Enemy enemy = new Demogorgon();
        enemy.Setup("Demogorgon", 4000, 21,
                21, 21, 21, 21, 21, Race.halfelf);
        return enemy;
    }
}
