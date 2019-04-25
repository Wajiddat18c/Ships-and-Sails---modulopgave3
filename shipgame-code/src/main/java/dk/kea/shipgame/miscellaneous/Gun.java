package dk.kea.shipgame.miscellaneous;



public class Gun {



   public static int CritHit(int dice, int hull_health, int currentAmmunitionType){
        if (dice == 1 && currentAmmunitionType == 0){
            hull_health = hull_health/0;
            return hull_health;
            System.out.println("Your ship has exploded");


        }
        else if (dice == 2 && currentAmmunitionType == 0) {
            hull_health = hull_health / 2;
            return hull_health;
            System.out.println("It is not possible to turn anymore");

        }

        else if (dice == 3 && currentAmmunitionType == 0){
            hull_health = hull_health/3;
            return hull_health;
        }







        }
}

