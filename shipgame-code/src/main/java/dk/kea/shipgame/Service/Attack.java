package dk.kea.shipgame.Service;

import dk.kea.shipgame.Model.Order;
import dk.kea.shipgame.Model.Ship;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Attack implements IAttack{

    @Override
    public void resolveAttackOwn(List<Ship> ships, List<Order> orders) {

        for(Ship ship : ships){
            int shipid = ship.getShipId();

            for(Order order : orders){
                if(shipid == order.getShipId()){

                    //Attack


                }
            }

        }
    }

    @Override
    public void evaluateVictoryConditions(List<Ship> ships, List<Order> orders) {

    }
}
