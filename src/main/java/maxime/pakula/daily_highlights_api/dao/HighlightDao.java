package maxime.pakula.daily_highlights_api.dao;

import maxime.pakula.daily_highlights_api.models.Highlight;
import org.springframework.data.repository.CrudRepository;

public interface HighlightDao extends CrudRepository<Highlight, String> {
}
