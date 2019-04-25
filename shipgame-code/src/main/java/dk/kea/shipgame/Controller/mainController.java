package dk.kea.shipgame.Controller;

import dk.kea.shipgame.Model.MyImage;
import dk.kea.shipgame.Service.ServiceScenario;
import dk.kea.shipgame.Service.ServiceShip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class mainController {

    @Autowired
    ServiceShip serviceShip;

    @GetMapping("/shipdata")
    public String shipData(Model model) {
        model.addAttribute("ships", serviceShip.fetchAllShips());

        return "shipdata";
    }

    @GetMapping("shipsLoaded")
    public String shipsLoaded(Model model){
        model.addAttribute("shipsloaded", serviceShip.createAllShips());
    }


    @Autowired
    ServiceScenario serviceScenario;
    @GetMapping("/scenarioLoaded")
    public String scenarioLoaded(Model model){
        model.addAttribute("scenarioLoaded", serviceScenario.createScenario());
        return "scenarioLoaded";
    }





    @GetMapping("/")
    public String index(Model model){
        List<MyImage> images = new ArrayList<>();
        images.add(new MyImage(1, "Brig", 90, 90));
        images.add(new MyImage(2, "shipOfLine", 305, 407));
        images.add(new MyImage(3, "ManOfWar", 198, 248));
        images.add(new MyImage(4, "Brig", 105, 407));
        images.add(new MyImage(5, "shipOfLine", 290, 90));
        images.add(new MyImage(6, "ManOfWar", 380, 190));
        model.addAttribute("images", images);
        model.addAttribute("ships", serviceShip.fetchAllShips());
        return "Ship-placement";
    }
}
