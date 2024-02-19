package peaksoft;

public class Java {
    public static void main(String[] args) {

       Country country = new Country("USA","330ml",983.000,"English");
        System.out.println(country.toString()+"\n");
        Country country2 = new Country("RUSSIA","143ml",1700.00000,"Russian");
        System.out.println(country2.toString()+"\n");
       Country country3 = new Country("KYRGYZSTAN","7ml",198.000,"kyrgyz");
        System.out.println(country3.toString()+"\n");


        Country[] countries = {country,country2,country3};;
        System.out.println("\t\t\t\t\t\t\tThe biggest Country");
        Country.getAreaMax(countries);


    }
}

