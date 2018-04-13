package at.refugeescode.dutchman.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DutchmanEndpoint {

    private String chest = "I found the Dead Man’s Chest!";

    @GetMapping("/deadmanschest")
    String getChest() {
        return chest;
    }
}
