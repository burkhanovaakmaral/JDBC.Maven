package org.example;

public class Cities {
    private int code;
    private String cityName;
    private String cityPopulations;

    public void add(Cities cities) {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityPopulations() {
        return cityPopulations;
    }

    public void setCityPopulations(String cityPopulations) {
        this.cityPopulations = cityPopulations;
    }

    @Override
    public String toString() {
        return "Cities " +
                "code " + code +
                ", cityName " + cityName +
                ", cityPopulations " + cityPopulations;
    }
}
