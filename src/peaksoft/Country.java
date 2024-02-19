package peaksoft;

public class Country {
    private String countryName;
    private String population;
    private double area;
    private String language;

  Country(){}
    Country(String countryName,String  population,double area,String language){
        this.countryName = countryName;
        this.population = population;
        this.area = area;
        this.language = language;

    }
    public String getCountryName(){
      return countryName;
    }
    public void setCountryName(String countryName){
      this.countryName = countryName;
    }
    public String  getPopulation(){
      return population;
    }
    public void setPopulation(String  population){
      this.population = population;
    }

    public double getArea() {

        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", language='" + language + '\'' +
                '}';
    }

    public static void getAreaMax(Country[] countries){
      Country country = countries[0];
        for (int i = 0; i < countries.length ; i++) {
            if(countries[i].area>country.area){
                country = countries[i];
            }
        }
        System.out.println(country);
    }
}
