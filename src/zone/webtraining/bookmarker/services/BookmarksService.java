package zone.webtraining.bookmarker.services;

import zone.webtraining.bookmarker.models.Bookmark;

import java.util.Collection;

public interface BookmarksService {
    Collection<Bookmark> getAll();

    Bookmark get(Long id);

    Bookmark update(Bookmark bookmark);

    Bookmark create(Bookmark bookmark);

    Bookmark delete(Bookmark bookmark);
}
