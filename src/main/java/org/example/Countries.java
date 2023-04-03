package org.example;



public class Countries {
    private String countryName;
    private String abbreviation;
    private int population;
    private String countryLanguage;
    private String phoneCode;

    public void add(Countries countries) {

    }


    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountryLanguage() {
        return countryLanguage;
    }

    public void setCountryLanguage(String countryLanguage) {
        this.countryLanguage = countryLanguage;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    @Override
    public String toString() {
        return "Countries " +
                "countryName " + countryName +
                ", abbreviation " + abbreviation +
                ", population " + population +
                ", countryLanguage " + countryLanguage +
                ", phoneCode " + phoneCode;
    }
}
