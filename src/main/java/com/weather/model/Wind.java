
package com.weather.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@JsonInclude(JsonInclude.Include.ALWAYS)
public class Wind {

    @JsonProperty("deg")
    private Long Deg;

    @JsonProperty("speed")
    private Double Speed;


}
