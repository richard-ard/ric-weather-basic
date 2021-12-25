
package com.weather.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@JsonInclude(JsonInclude.Include.ALWAYS)
public class Main {

    @JsonProperty("feels_like")
    private Double FeelsLike;
    @JsonProperty("humidity")
    private Long Humidity;
    @JsonProperty("pressure")
    private Long Pressure;
    @JsonProperty("temp")
    private Double Temp;
    @JsonProperty("temp_max")
    private Double TempMax;
    @JsonProperty("temp_min")
    private Double TempMin;

}
