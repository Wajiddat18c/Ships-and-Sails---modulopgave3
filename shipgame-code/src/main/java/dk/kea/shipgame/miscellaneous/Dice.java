package dk.kea.shipgame.miscellaneous;

public class Dice {

    private static int dice;

    public Dice()
    {
    }

    public static int rollGun(){
        dice = (int)(Math.random()*3) + 1;
        return dice;
    }

}
