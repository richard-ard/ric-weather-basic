
package com.weather.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@JsonInclude(JsonInclude.Include.ALWAYS)
public class Sys {

    @JsonProperty("country")
    private String Country;
    @JsonProperty("id")
    private Long Id;
    @JsonProperty("message")
    private Double Message;
    @JsonProperty("sunrise")
    private Long Sunrise;
    @JsonProperty("sunset")
    private Long Sunset;
    @JsonProperty("type")
    private Long Type;



}
