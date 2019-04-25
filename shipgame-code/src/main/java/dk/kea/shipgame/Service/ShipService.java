package dk.kea.shipgame.Service;

import dk.kea.shipgame.Model.Ship;
import dk.kea.shipgame.Repository.ShipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipService {
    @Autowired
    ShipRepo shipRepo;

    public List<Ship> fetchAllShips(){
        return shipRepo.fetchAllShips();
    }

    public Ship findShipById(int shipId){
        return shipRepo.findShipById(shipId);
    }

}
