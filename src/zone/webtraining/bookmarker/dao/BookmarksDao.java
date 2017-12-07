package zone.webtraining.bookmarker.dao;

import zone.webtraining.bookmarker.models.Bookmark;

import java.util.Collection;

public interface BookmarksDao {
    Collection<Bookmark> getAll();

    Bookmark get(Long id);

    Bookmark update(Bookmark bookmark);

    Bookmark create(Bookmark bookmark);

    Bookmark delete(Bookmark bookmark);
}
