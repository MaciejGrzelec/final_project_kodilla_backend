package com.translation.demo.domain.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "title",
        "author",
        "lines",
        "linecount"
})
public class FullPoemDto {

    @JsonProperty("title")
    private String title;
    @JsonProperty("author")
    private String author;
    @JsonProperty("lines")
    private List<String> lines = null;
    @JsonProperty("linecount")
    private String linecount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("lines")
    public List<String> getLines() {
        return lines;
    }

    @JsonProperty("lines")
    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    @JsonProperty("linecount")
    public String getLinecount() {
        return linecount;
    }

    @JsonProperty("linecount")
    public void setLinecount(String linecount) {
        this.linecount = linecount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}