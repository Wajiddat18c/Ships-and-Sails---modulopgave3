package dk.kea.shipgame.Service;

import dk.kea.shipgame.Model.Order;
import dk.kea.shipgame.Model.Ship;
import dk.kea.shipgame.miscellaneous.Gun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static dk.kea.shipgame.miscellaneous.Dice.rollGun;

public class Attack implements IAttack{

    @Override
    public void resolveAttackOwn(List<Ship> ships, List<Order> orders) {
                
        for(int i = 0; i < ships.size(); i ++){
            
            int dice = rollGun();

            int shipId = ships.get(i).getShipId();

            for(Order order : orders){

                if(shipId == order.getShipId()){

                    int currentSailors = ships.get(i).getSailors();
                    int currentHull = ships.get(i).getHull_health();
                    int currentSail = ships.get(i).getSail_health();
                    boolean fire = order.isFire();
                    int currentAmmonitiontype = ships.get(i).getCurrentAmmunitionType();

                    Gun gun = new Gun();
                    int newHull = gun.CalculateHullDamage(dice, currentHull, currentAmmonitiontype);
                    int newSailors = gun.CalculateSailors(dice, currentSailors, currentAmmonitiontype);
                    int newSailHealth = gun.CalculateSailHealth(dice, currentSail, currentAmmonitiontype);
                    
                    ships.get(i).setHull_health(newHull);
                    ships.get(i).setSailors(newSailors);
                    ships.get(i).setSail_health(newSailHealth);
                    


                }

            }


        }
    }

    @Override
    public void evaluateVictoryConditions(List<Ship> ships, List<Order> orders) {

    }
}
