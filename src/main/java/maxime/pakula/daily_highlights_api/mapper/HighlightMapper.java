package maxime.pakula.daily_highlights_api.mapper;

import maxime.pakula.daily_highlights_api.dto.HighlightCreationRequest;
import maxime.pakula.daily_highlights_api.dto.HighlightCreationResponse;
import maxime.pakula.daily_highlights_api.models.Highlight;

public class HighlightMapper {

    public static Highlight fromCreationRequest(HighlightCreationRequest highlightCreationRequest) {
        return Highlight.HighlightBuilder.Highlight()
                .date(highlightCreationRequest.date())
                .text(highlightCreationRequest.text())
                .build();
    }

    public static HighlightCreationResponse toCreationResponse(Highlight highlight) {
        return new HighlightCreationResponse(highlight.getId(), highlight.getDate(), highlight.getText());
    }

}
