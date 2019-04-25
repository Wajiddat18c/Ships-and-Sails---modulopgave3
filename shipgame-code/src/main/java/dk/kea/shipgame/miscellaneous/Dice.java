package dk.kea.shipgame.miscellaneous;

public class Dice {

    private int dice;

    public Dice()
    {
       roll();
    }

    public void roll(){
        dice = (int)(Math.random()*3) + 1;
    }

}
