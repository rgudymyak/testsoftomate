package softomate.task.com.testapp.service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WatsonResponse {

    @SerializedName("languages")
    @Expose
    private List<Language> languages = null;

    public List<Language> getLanguages() {
        return languages;
    }

    public class Language {
        @SerializedName("language")
        @Expose
        private String language;
        @SerializedName("confidence")
        @Expose
        private Double confidence;

        public String getLanguage() {
            return language;
        }

        public Double getConfidence() {
            return confidence;
        }
        }
}