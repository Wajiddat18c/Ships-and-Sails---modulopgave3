package dk.kea.shipgame.Controller;

import dk.kea.shipgame.Model.ScenarioSingleton;
import dk.kea.shipgame.Service.ServiceScenario;
import dk.kea.shipgame.Service.ServiceShipsSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InitializeController {

    @Autowired
    ServiceShipsSingleton serviceShipsSingleton;

    @Autowired
    ServiceScenario serviceScenario;


    @GetMapping("/initialized")
    public String initialized(){

        serviceShipsSingleton.createAllShips();
        serviceScenario.createScenario();

        return "initialized";
    }



}
