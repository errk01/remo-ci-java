package com.tts.MapsAPI.model;

import lombok.Data;

import java.util.List;

@Data
public class GeocodingResponse {
    private List<Geocoding> results;
}
