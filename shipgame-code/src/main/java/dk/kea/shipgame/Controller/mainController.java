package dk.kea.shipgame.Controller;

import dk.kea.shipgame.Model.MyImage;
import dk.kea.shipgame.Service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class mainController {

    @Autowired
    ShipService shipService;

    @GetMapping("/shipdata")
    public String shipData(Model model) {
        model.addAttribute("ships", shipService.fetchAllShips());

        return "shipdata";
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
        model.addAttribute("ships", shipService.fetchAllShips());
        return "Ship-placement";
    }
}
