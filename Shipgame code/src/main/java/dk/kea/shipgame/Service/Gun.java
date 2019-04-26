package dk.kea.shipgame.Service;



public class Gun {

    public void CritHit() {
    }
                                                                                                                                  
   public int CalculateHullDamage(int dice, int CurrentHull, int currentAmmunitionType){
        if (dice == 1 && currentAmmunitionType == 0){
            CurrentHull = CurrentHull -  CurrentHull;
            System.out.println("Your ship has exploded!");
            return CurrentHull;

        }                                                                                                                         
        else if (dice == 2 && currentAmmunitionType == 0) {

        }
                                                                                                                                  
        else if (dice == 3 && currentAmmunitionType == 0){
            CurrentHull = CurrentHull;
            return CurrentHull;
        }

        return CalculateSailHealth(dice, CurrentHull, currentAmmunitionType);

   }

    public int CalculateSailHealth(int dice, int CurrentSail, int currentAmmunitionType){
        if(dice == 1 && currentAmmunitionType == 1){

            CurrentSail = CurrentSail - (50 / 100 * CurrentSail);
            System.out.print("Your ship is broke wait 1 round");
            return CurrentSail;

        }

        else if(dice == 2 && currentAmmunitionType == 1){
            CurrentSail = CurrentSail - (33 / 100 * CurrentSail);
            return CurrentSail;
        }

        else if (dice == 3 && currentAmmunitionType == 1) {



        }
        return CalculateSailHealth(dice, CurrentSail, currentAmmunitionType);
    }

    public int CalculateSailors(int dice, int CurrentSailors, int currentAmmunitionType){
        if(dice == 1 && currentAmmunitionType == 2 ){
        CurrentSailors = CurrentSailors - (50 / 100 * CurrentSailors);
        return CurrentSailors;

        }

        else if(dice == 1 && currentAmmunitionType == 2){
            CurrentSailors = CurrentSailors - (25 / 100 * CurrentSailors);
            return CurrentSailors;
        }
        return CalculateSailors(dice, CurrentSailors, currentAmmunitionType);

    }




}








