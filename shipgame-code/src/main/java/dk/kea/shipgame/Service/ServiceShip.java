package dk.kea.shipgame.Service;

import dk.kea.shipgame.Model.Ship;
import dk.kea.shipgame.Model.ShipsSingleton;
import dk.kea.shipgame.Repository.RepoShipsSingleton;
import dk.kea.shipgame.Repository.ShipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceShip {
    @Autowired
    ShipRepo shipRepo;
    @Autowired
    RepoShipsSingleton repoShipsSingleton;

    public List<Ship> fetchAllShips(){
        return shipRepo.fetchAllShips();
    }

    public Ship findShipById(int shipId){
        return shipRepo.findShipById(shipId);
    }
    git
    public void createAllShips(){
        ShipsSingleton shipsSingleton = ShipsSingleton.getInstance();
        List<Ship> ships = repoShipsSingleton.getShips();
        for(Ship ship : ships){
            shipsSingleton.createShip(ship);
        }
    }

}
