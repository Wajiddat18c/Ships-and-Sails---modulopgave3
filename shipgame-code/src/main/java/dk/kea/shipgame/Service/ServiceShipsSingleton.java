package dk.kea.shipgame.Service;

import dk.kea.shipgame.Model.Ship;
import dk.kea.shipgame.Model.ShipsSingleton;
import dk.kea.shipgame.Repository.RepoShipsSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceShipsSingleton {

    @Autowired
    RepoShipsSingleton repoShipsSingleton;

    public void createAllShips(){
        ShipsSingleton shipsSingleton = ShipsSingleton.getInstance();
        List<Ship> ships = repoShipsSingleton.getShips();
        for(Ship ship : ships){
            shipsSingleton.createShip(ship);
        }
    }
}
