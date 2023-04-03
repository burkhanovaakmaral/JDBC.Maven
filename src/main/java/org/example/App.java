package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {


//        addPresidents("Sadyr","Japarov",54,"Kyrgyzstan",6);
//        addPresidents("Aleksand","Lukashenko",68,"Belaruss",1);
//        addPresidents("Ilham","Aliev",62,"Azerbayjan",4);
//        addPresidents("Joko","Widodo",54,"Indonesia",7);
//        addPresidents("Yun","Sok Yol",54,"South Korea",13);
//        for (Presidents presidents: getPresidentsList()){
//            System.out.println(presidents);
//        }


//        addCountry("Kyrgyzstan","KG",7000,"Kyrgyz","+996");
//        addCountry("Pakistan","PAK",221180890,"Urdu","+92");
//        addCountry("Singapore","SGP",5866139,"English","+65");
//        addCountry("Turkey","TUR",84680273,"Turkish","+90");
//        addCountry("Egipet","EGY",106646200,"Arabia","+20");


//        addCities(01,"Bishkek","1 million");
//        addCities(02,"Osh","270347");
//        addCities(03,"Batken","18263");
//        addCities(04,"Jalal-Abad","109189");
//        addCities(05,"Naaryn","40065");
//        addCities(06,"Talas","38700");
//        addCities(07,"Balykchy","48622");
//        getCityById(2);

    }

    public static void creatTable() {
        String SQL = "CREATE TABLE IF NOT EXISTS cities(" +
                "id SERIAL PRIMARY KEY," +
                "code INTEGER," +
                "cityName VARCHAR(50) NOT NULL," +
                "cityPopulation VARCHAR(100) NOT NULL);";

        try (Connection connection = Homework.connection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(SQL);
            System.out.println("Successfully created table cities");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addCities(int code, String cityName, String cityPopulation) {
        String SQL = "INSERT INTO cities(code,cityName,cityPopulation)" +
                "VALUES(?,?,?)";
        try (Connection con = Homework.connection();
             PreparedStatement statement = con.prepareStatement(SQL)) {
            statement.setInt(1, code);
            statement.setString(2, cityName);
            statement.setString(3, cityPopulation);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getCityById(int id) {
        String SQL = "SELECT * FROM cities WHERE id = ?";
        try (Connection con = Homework.connection();
             PreparedStatement statement = con.prepareStatement(SQL)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            System.out.println(" id: " + resultSet.getInt("id"));
            System.out.println(" code: " + resultSet.getInt("code"));
            System.out.println(" cityName: " + resultSet.getString("name"));
            System.out.println(" cityPopulation: " + resultSet.getString("cityPopulation"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Cities> getList() {
        String SQL = "SELECT * FROM cities";
        List<Cities> citiesList = new ArrayList<>();
        try (Connection con = Homework.connection();
             Statement statement = con.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                Cities cities = new Cities();
                cities.setCode(resultSet.getInt("code"));
                cities.setCityName(resultSet.getString("cityName"));
                cities.setCityPopulations(resultSet.getString("cityPopulation"));
                cities.add(cities);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return citiesList;
    }

    public static void creatTableCountry() {

        String SQL = "CREATE TABLE countries(" +
                "id SERIAL PRIMARY KEY," +
                "countryName VARCHAR(50) NOT NULL," +
                "abbreviation VARCHAR(10) NOT NULL," +
                "population INTEGER," +
                "countryLanguage VARCHAR(20) NOT NULL," +
                "phoneCode VARCHAR(10) NOT NULL );";
        try (Connection connection = Homework.connection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(SQL);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addCountry(String countryName, String abbreviation, int population, String countryLanguage, String phoneCode) {
        String SQL = "INSERT INTO countries(countryName,abbreviation,population,countryLanguage,phoneCode)" +
                "VALUES(?,?,?,?,?)";
        try (Connection conCountry = Homework.connection();
             PreparedStatement statement = conCountry.prepareStatement(SQL)) {
            statement.setString(1, countryName);
            statement.setString(2, abbreviation);
            statement.setInt(3, population);
            statement.setString(4, countryLanguage);
            statement.setString(5, phoneCode);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static List<Countries> getCountriesList() {
        String SQL = "SELECT * FROM countries";
        List<Countries> countriesList = new ArrayList<>();
        try (Connection conCountry = Homework.connection();
             Statement statement = conCountry.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                Countries countries = new Countries();
                countries.setCountryName(resultSet.getString("code"));
                countries.setAbbreviation(resultSet.getString("city name"));
                countries.setPopulation(resultSet.getInt("population"));
                countries.setCountryLanguage(resultSet.getString("country language"));
                countries.setPhoneCode(resultSet.getString("country phone code"));
                countries.add(countries);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return countriesList;
    }

    public static void creatTablePresidents() {

        String SQL = "CREATE TABLE presidents(" +
                "id SERIAL PRIMARY KEY," +
                "name VARCHAR(50) NOT NULL," +
                "lastName VARCHAR(50) NOT NULL," +
                "age INTEGER," +
                "presidentOfWhichCountry VARCHAR(50) NOT NULL," +
                "accountOfPresident INTEGER );";
        try (Connection connection = Homework.connection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(SQL);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addPresidents(String name, String lastName, int age, String presidentOfWhichCountry, int accountOfPresident) {
        String SQL = "INSERT INTO presidents(name,lastName,age,presidentOfWhichCountry,accountOfPresident)" +
                "VALUES(?,?,?,?,?)";
        try (Connection conPresident = Homework.connection();
             PreparedStatement statement = conPresident.prepareStatement(SQL)) {
            statement.setString(1, name);
            statement.setString(2, lastName);
            statement.setInt(3, age);
            statement.setString(4, presidentOfWhichCountry);
            statement.setInt(5, accountOfPresident);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static List<Presidents> getPresidentsList() {
        String SQL = "SELECT * FROM presidents";
        List<Presidents> presidentsList = new ArrayList<>();
        try (Connection conPresident = Homework.connection();
             Statement statement = conPresident.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                Presidents presidents = new Presidents();
                presidents.setName(resultSet.getString("name"));
                presidents.setLastName(resultSet.getString("lastname"));
                presidents.setAge(resultSet.getInt("age"));
                presidents.setPresidentOfWhichCountry(resultSet.getString("presidentOfWhichCountry"));
                presidents.setAccountOfPresident(resultSet.getInt("accountOfPresident"));
                presidents.add(presidents);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return presidentsList;
    }
}



