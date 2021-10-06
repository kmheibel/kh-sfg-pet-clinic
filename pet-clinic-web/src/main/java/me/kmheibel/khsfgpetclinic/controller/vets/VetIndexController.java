package me.kmheibel.khsfgpetclinic.controller.vets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetIndexController {

    @RequestMapping({"/vets","/vets/", "/vets/index", "/vets/index.html"})
    public String listVets() {
        return "vets/index";
    }


}
