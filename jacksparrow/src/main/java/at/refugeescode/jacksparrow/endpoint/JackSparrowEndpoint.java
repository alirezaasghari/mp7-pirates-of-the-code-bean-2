package at.refugeescode.jacksparrow.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class JackSparrowEndpoint {

    private RestTemplate restTemplate;

    @Value("${tiadalma.url}")
    private String tiaDalmaUrl;

    public JackSparrowEndpoint(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    String getChestMessage() {
        String dutchManUrl = restTemplate.getForObject(tiaDalmaUrl, String.class);
        return restTemplate.getForObject(dutchManUrl, String.class);
    }
}
