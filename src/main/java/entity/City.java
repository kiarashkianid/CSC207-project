package entity;

public class City {
    public String name;
    private WeatherData weatherData;
    private double longitutde;
    private double latitude;
    private WeatherScore weatherScore;

    public City(String name, WeatherData weatherData, double longitutde, double latitude){
        this.name = name;
        this.weatherData = weatherData;
        this.longitutde = longitutde;
        this.latitude = latitude;
        this.weatherScore=null;
    }


}
