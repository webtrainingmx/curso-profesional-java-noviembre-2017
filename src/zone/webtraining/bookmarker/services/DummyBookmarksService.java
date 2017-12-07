package zone.webtraining.bookmarker.services;

import org.springframework.stereotype.Service;
import zone.webtraining.bookmarker.models.Bookmark;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
public class DummyBookmarksService implements BookmarksService {
    private List<Bookmark> bookmarks = new ArrayList<Bookmark>();

    public DummyBookmarksService() {
        for (int i = 0; i < 100; i++) {
            Bookmark bookmark = new Bookmark((long) 1, (long) 1, "Title " + i,
                    "Desc", "http://webtraining.zone", "2017-12-05",
                    "2017-12-05");
            this.bookmarks.add(bookmark);
        }
    }

    public Collection<Bookmark> getAll() {
        return this.bookmarks;
    }

    public Bookmark get(Long id) {
        return this.bookmarks.get(id.intValue());
    }

    public Bookmark update(Bookmark bookmark) {
        this.bookmarks.set(bookmark.getId().intValue(), bookmark);
        return bookmark;
    }

    public Bookmark create(Bookmark bookmark) {
        return null;
    }

    public Bookmark delete(Bookmark bookmark) {
        this.bookmarks.remove(bookmark);
        return bookmark;
    }
}
