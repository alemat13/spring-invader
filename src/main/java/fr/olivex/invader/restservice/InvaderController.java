package fr.olivex.invader.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvaderController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/invader")
    public Invader invader(@RequestParam(value = "location", defaultValue = "Paris") String location) {
        Invader i = new Invader("PA_0001");
        i.setId(counter.incrementAndGet());
        i.setLocation(location);
        i.setPoints((byte)50);
        i.setStatus((byte)5);
        return i;
    }
}
