package dk.kea.shipgame.miscellaneous;                                                                                            
                                                                                                                                  
                                                                                                                                  
                                                                                                                                  
public class Gun {                                                                                                                
                                                                                                                                  
                                                                                                                                  
   public void CritHit(int dice, int hull_health, int currentAmmunitionType, int sailors, int speed, int sail_health){            
        if (dice == 1 && currentAmmunitionType == 0){                                                                             
            hull_health = hull_health/0;                                                                                          
            System.out.println("Your ship has exploded!");                                                                        
                                                                                                                                  
        }                                                                                                                         
        else if (dice == 2 && currentAmmunitionType == 0) {                                                                       
            hull_health = hull_health/2;                                                                                          
                                                                                                                                  
                                                                                                                                  
        } else if (dice == 2 && currentAmmunitionType == 0) {                                                                     
            hull_health = hull_health/2;                                                                                          
            System.out.println("It is not possible to turn anymore");                                                             
                                                                                                                                  
        }                                                                                                                         
                                                                                                                                  
        else if (dice == 3 && currentAmmunitionType == 0){                                                                        
            hull_health = hull_health/3;                                                                                          
        }                                                                                                                         
                                                                                                                                  
        if (dice == 1 && currentAmmunitionType == 1){                                                                             
            speed = 0;                                                                                                            
                                                                                                                                  
       }                                                                                                                          
                                                                                                                                  
       else if (dice == 2 && currentAmmunitionType == 1){                                                                         
           sail_health = sail_health/3;                                                                                           
                                                                                                                                  
       }                                                                                                                          
                                                                                                                                  
        if (dice == 1 && currentAmmunitionType == 2){                                                                             
                                                                                                                                  
         sailors = sailors/2;                                                                                                     
       }                                                                                                                          
                                                                                                                                  
       else if(dice == 2 && currentAmmunitionType == 2){                                                                          
           sailors = sailors /                                                                                                    
                                                                                                                                  
                                                                                                                                  
       }                                                                                                                          
                                                                                                                                  
   }                                                                                                                              
                                                                                                                                  
}                                                                                                                                 
