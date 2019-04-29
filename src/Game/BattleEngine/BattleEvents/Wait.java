package Game.BattleEngine.BattleEvents;

public class Wait extends BattleEvent {
    private String reason = null;

    public Wait() {
    }
    public Wait(String Reason) {
        reason = Reason;
    }

    @Override
    public void doEvent() {
        if (reason != null) {
            System.out.println(reason);
            scan.nextLine();
        }
    }
}