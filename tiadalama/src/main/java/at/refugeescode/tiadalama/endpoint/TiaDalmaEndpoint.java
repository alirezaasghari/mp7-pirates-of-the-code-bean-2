package at.refugeescode.tiadalama.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TiaDalmaEndpoint {

    @Value("${dutchman.url}")
    private String dutchManUrl;

    @GetMapping("/dutchman")
    String findDutchMan() {
        return dutchManUrl;
    }
}
