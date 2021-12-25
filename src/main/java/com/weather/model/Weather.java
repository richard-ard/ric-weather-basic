package com.weather.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.ALWAYS)
public class Weather {
    @JsonProperty
    public int id;
    @JsonProperty
    public String main;
    @JsonProperty
    public String description;
    @JsonProperty
    public String icon;
}
