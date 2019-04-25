package dk.kea.shipgame.miscellaneous;

public class Dice {

    private int sides;

    public Dice(int sides)
    {
        this.sides = sides;
    }

    public int rollDice()
    {
        return (int) (Math.random() * sides ) + 1;
    }

}
