
package com.weather.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude
public class WeatherCustom {

    @JsonProperty
    public Coord coord;
    @JsonProperty
    public List<Weather> weather;
    @JsonProperty
    public String base;
    @JsonProperty
    public Main main;
    @JsonProperty
    public int visibility;
    @JsonProperty
    public Wind wind;
    @JsonProperty
    public Clouds clouds;
    @JsonProperty
    public int dt;
    @JsonProperty
    public Sys sys;
    @JsonProperty
    public int timezone;
    @JsonProperty
    public int id;
    @JsonProperty
    public String name;
    @JsonProperty
    public int cod;



}
