package Items;

import Game.Core.BalancingSheet;

public abstract class item
{
    public int weight;
    public int value;
    public abstract String toString();
    public BalancingSheet Set = new BalancingSheet();
}
