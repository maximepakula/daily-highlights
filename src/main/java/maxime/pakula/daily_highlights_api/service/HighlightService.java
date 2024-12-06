package maxime.pakula.daily_highlights_api.service;

import maxime.pakula.daily_highlights_api.dto.HighlightCreationRequest;
import maxime.pakula.daily_highlights_api.dto.HighlightCreationResponse;

public interface HighlightService {

    HighlightCreationResponse create(HighlightCreationRequest highlightCreationRequest);
}
