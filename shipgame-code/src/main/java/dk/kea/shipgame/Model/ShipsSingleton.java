package dk.kea.shipgame.Model;

import java.util.List;

//klassen bruges istedet for db.
public class ShipsSingleton {

    private static ShipsSingleton instance;

    private static List<Ship> ships;

    private ShipsSingleton(){
    }

    public static ShipsSingleton getInstance(){
        if(instance == null){
            instance = new ShipsSingleton();
        }
        return instance;
    }

    public static void updateShip(int index, Ship ship) {
        ships.set(index, ship);
    }

    public static void createShip(Ship ship){
        ships.add(ship);
    }
}
