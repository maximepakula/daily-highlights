package maxime.pakula.daily_highlights_api.dto;

import java.time.LocalDate;

public record HighlightCreationResponse(String id, LocalDate date, String text) {
}
