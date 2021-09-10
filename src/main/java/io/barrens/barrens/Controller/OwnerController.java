package io.barrens.barrens.Controller;

import io.barrens.barrens.Model.Owner;
import io.barrens.barrens.Service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/owners")
public class OwnerController {

    @Autowired
    OwnerService ownerService;

    @GetMapping("all")
    public List<Owner> getOverviewOwners(Model model)
    {
//        model.addAttribute("owners",ownerService.getAllOwners());
//        return "overview-owners";
        return ownerService.getAllOwners();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Full Stack Java with Spring Boot & VueJS!";
    }


}
