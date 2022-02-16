package com.example.weatherscore.model.entity.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class WeatherInfo {

    private String baseTime;

    private String fcstTime;

    private String category;
    // 날씨
    private int fcstValue;
}
