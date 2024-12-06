package maxime.pakula.daily_highlights_api.controller;

import maxime.pakula.daily_highlights_api.dto.HighlightCreationRequest;
import maxime.pakula.daily_highlights_api.dto.HighlightCreationResponse;
import maxime.pakula.daily_highlights_api.service.HighlightService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("highlight")
public class HighlightController {

    private HighlightService highlightService;

    public HighlightController(HighlightService highlightService) {
        this.highlightService = highlightService;
    }

    @PostMapping
    public HighlightCreationResponse createHighlight(HighlightCreationRequest highlightCreationRequest) {
        return highlightService.create(highlightCreationRequest);
    }

}
