package com.weather.controller;


import com.weather.model.WeatherCustom;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;

@RestController()
@Slf4j
public class WeatherController {

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/weather")
    public ResponseEntity<WeatherCustom> getWeatherWithLanguage(
            @RequestParam("q") String city,
            @RequestParam("lang") String language
    ){
        //HttpHeaders httpHeaders = new HttpHeaders();
       // httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        String urlTemplate = UriComponentsBuilder.fromHttpUrl(WeatherUtils.rootUrl)
                .queryParam("q",city)
                .queryParam("appid",apiKey)
                .queryParam("lang", language).toUriString();

        log.debug(urlTemplate);

        return restTemplate.getForEntity(urlTemplate,WeatherCustom.class);

    }

    @GetMapping("/weather/zip")
    public ResponseEntity<WeatherCustom> getWeatherByZipWithLanguage(
            @RequestParam("zip") String zip,
            @RequestParam("lang") String language
    ){
        String zipAndCity = zip + ","+language;

        String urlTemplate = UriComponentsBuilder.fromHttpUrl(WeatherUtils.rootUrl)
                .queryParam("zip",zipAndCity)
                .queryParam("appid",apiKey).toUriString();

        log.info(urlTemplate);

        return restTemplate.getForEntity(urlTemplate,WeatherCustom.class);

    }

}
