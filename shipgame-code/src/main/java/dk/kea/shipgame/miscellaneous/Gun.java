package dk.kea.shipgame.miscellaneous;



public class Gun {


<<<<<<< HEAD
   public void CritHit(int dice, int hull_health, int currentAmmunitionType, int sailors, int speed){
        if (dice == 1 && currentAmmunitionType == 0){
            hull_health = hull_health/0;
            System.out.println("Your ship has exploded!");

        }
        else if (dice == 2 && currentAmmunitionType == 0) {
            hull_health = hull_health/2;
=======
    public static int CritHit(int dice, int hull_health, int currentAmmunitionType) {
        if (dice == 1 && currentAmmunitionType == 0) {
            hull_health = hull_health / 0;
            System.out.println("Your ship has exploded");
            return hull_health;


        } else if (dice == 2 && currentAmmunitionType == 0) {
            hull_health = hull_health / 2;
>>>>>>> 6d404d933a0d1c0b760cf4eca69dcba6db03f64a
            System.out.println("It is not possible to turn anymore");
            return hull_health;

<<<<<<< HEAD
        }

        else if (dice == 3 && currentAmmunitionType == 0){
            hull_health = hull_health/3;
        }

        if (dice == 1 && currentAmmunitionType == 1){
            speed = 0;


       }


       }

   }


=======
        } else if (dice == 3 && currentAmmunitionType == 0) {
            hull_health = hull_health / 3;
            return hull_health;
        }

        return 0;
    }
}
>>>>>>> 6d404d933a0d1c0b760cf4eca69dcba6db03f64a
