package dk.kea.shipgame.Controller;

import dk.kea.shipgame.Service.ServiceScenario;
import dk.kea.shipgame.Service.ServiceShip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InitializeController {

    @Autowired
    ServiceShip serviceShip;

    @Autowired
    ServiceScenario serviceScenario;


    @GetMapping("/initialized")
    public String initialized(){

        serviceShip.createAllShips();
        serviceScenario.createScenario();

        return "initialized";
    }



}
