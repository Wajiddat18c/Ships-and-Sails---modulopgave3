package dk.kea.shipgame.Service;

import dk.kea.shipgame.Model.Ship;
import dk.kea.shipgame.Model.ShipsSingleton;
import dk.kea.shipgame.Repository.RepoShip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceShip {
    @Autowired
    RepoShip repoShip;

    public List<Ship> fetchAllShips(){
        return repoShip.fetchAllShips();
    }

    public Ship findShipById(int shipId){
        return repoShip.findShipById(shipId);
    }

    public void createAllShips(){
        List<Ship> ships = fetchAllShips();
        ShipsSingleton shipsSingleton = ShipsSingleton.getInstance();

        for(Ship ship : ships){
            shipsSingleton.createShip(ship);
        }

    }

}
