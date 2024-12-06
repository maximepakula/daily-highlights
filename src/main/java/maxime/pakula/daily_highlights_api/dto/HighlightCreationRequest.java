package maxime.pakula.daily_highlights_api.dto;

import java.time.LocalDate;

public record HighlightCreationRequest(LocalDate date, String text) {
}
