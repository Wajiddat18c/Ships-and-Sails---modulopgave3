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
        images.add(new MyImage(1, "camel", 90, 90));
        images.add(new MyImage(2, "terminator", 305, 407));
        images.add(new MyImage(3, "camel", 105, 407));
        images.add(new MyImage(4, "terminator", 290, 90));
        model.addAttribute("images", images);
        model.addAttribute("ships", shipService.fetchAllShips());
        return "Ship-placement";
    }
}
