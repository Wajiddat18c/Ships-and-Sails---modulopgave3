package dk.kea.shipgame.Model;

import dk.kea.shipgame.Service.ServiceShip;

import java.util.List;

public class ShipsSingleton {

    private static ShipsSingleton instance;
    List<Ship> ships;

    private ShipsSingleton(){}

    public static ShipsSingleton getInstance(){
        if(instance == null){
            instance = new ShipsSingleton();
        }
        return instance;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;

        //update ships to DB.
        ServiceShip serviceShip = new ServiceShip();
        serviceShip.updateShipsInDB(ships);
    }
}