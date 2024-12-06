package maxime.pakula.daily_highlights_api.service;

import maxime.pakula.daily_highlights_api.dao.HighlightDao;
import maxime.pakula.daily_highlights_api.dto.HighlightCreationRequest;
import maxime.pakula.daily_highlights_api.dto.HighlightCreationResponse;
import maxime.pakula.daily_highlights_api.mapper.HighlightMapper;
import maxime.pakula.daily_highlights_api.models.Highlight;
import org.springframework.stereotype.Service;

@Service
public class HighlightServiceImpl implements HighlightService {

    private HighlightDao highlightDao;

    public HighlightServiceImpl(HighlightDao highlightDao) {
        this.highlightDao = highlightDao;
    }

    @Override
    public HighlightCreationResponse create(HighlightCreationRequest highlightCreationRequest) {
        Highlight highlight = HighlightMapper.fromCreationRequest(highlightCreationRequest);
        highlight = highlightDao.save(highlight);
        return HighlightMapper.toCreationResponse(highlight);
    }
}
