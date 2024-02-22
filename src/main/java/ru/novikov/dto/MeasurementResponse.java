package ru.novikov.dto;

import java.util.List;

public class MeasurementResponse {
    List<MeasurementDTO> measurement;

    public List<MeasurementDTO> getMeasurement() {
        return measurement;
    }

    public void setMeasurement(List<MeasurementDTO> measurement) {
        this.measurement = measurement;
    }
}
