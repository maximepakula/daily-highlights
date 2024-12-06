package maxime.pakula.daily_highlights_api.models;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Highlight {

    @Id
    private String id;
    private LocalDate date;
    private String text;

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }


    public static final class HighlightBuilder {
        private String id;
        private LocalDate date;
        private String text;

        private HighlightBuilder() {
        }

        public static HighlightBuilder Highlight() {
            return new HighlightBuilder();
        }

        public HighlightBuilder id(String id) {
            this.id = id;
            return this;
        }

        public HighlightBuilder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public HighlightBuilder text(String text) {
            this.text = text;
            return this;
        }

        public Highlight build() {
            Highlight highlight = new Highlight();
            highlight.setId(id);
            highlight.setDate(date);
            highlight.setText(text);
            return highlight;
        }
    }
}
