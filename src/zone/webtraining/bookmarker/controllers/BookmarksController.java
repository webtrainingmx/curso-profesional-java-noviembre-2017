package zone.webtraining.bookmarker.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookmarks")
public class BookmarksController {

    @GetMapping
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<String>("Hola enfermera de Spring", HttpStatus.OK);
    }
}
