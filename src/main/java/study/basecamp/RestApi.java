package study.basecamp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.basecamp.Service.Service;

@RestController
public class RestApi {

    @ResponseBody
    @GetMapping("/{number}")
    public ResponseEntity play(@PathVariable int number) {
        Service s = new Service();
        return ResponseEntity.ok().body(s.doYouGuess(number));
    }
}