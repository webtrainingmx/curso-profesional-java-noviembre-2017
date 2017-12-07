package zone.webtraining.bookmarker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zone.webtraining.bookmarker.models.Bookmark;
import zone.webtraining.bookmarker.services.BookmarksService;

import java.awt.print.Book;
import java.util.Collection;

@Controller
@RequestMapping("/bookmarks")
public class BookmarksController {

    @Autowired
    private BookmarksService bookmarksService;

    @GetMapping
    public ResponseEntity<Collection<Bookmark>> getAll() {
        Collection<Bookmark> bookmarks = this.bookmarksService.getAll();
        return new ResponseEntity<Collection<Bookmark>>(bookmarks, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bookmark> getSingle(@PathVariable Long id) {
        Bookmark bookmark = this.bookmarksService.get(id);
        return new ResponseEntity<Bookmark>(bookmark, HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Bookmark> delete(@PathVariable Long id) {
        Bookmark deletedBookmark = this.bookmarksService.delete(
                this.bookmarksService.get(id));
        return new ResponseEntity<Bookmark>(deletedBookmark, HttpStatus.OK);
    }


    @PutMapping(path = "/{id}", consumes = "application/json")
    public ResponseEntity<Bookmark> update(@PathVariable Long id,
                                           @RequestBody Bookmark bookmark) {
        Bookmark updatedBookmark = this.bookmarksService.update(bookmark);
        return new ResponseEntity<Bookmark>(updatedBookmark, HttpStatus.OK);
    }


}
