package J110_1_1;

import java.util.Arrays;

public class CountryInfo {
    private String country_name = "";
    private double country_area = 0;
    private double population_country = 0;
    private String capital_name = "";
    private double population_capital = 0;

    String[] countries  = new String[] {"Russia, 17,1 млн кв. км., 146,7 млн чел., Moscow, 12,6 млн чел."
            , "Finland, 338 тыс. кв. км., 5,5 млн чел., Helsinki, 655 тыс. чел."
            , "France, 643,8 тыс. кв. км., 67,8 млн чел., Paris, 2,1 млн чел."
            , "Andorra, 467 кв. км., 85,4 тыс. чел., Andorra la Vella, 22,6 тыс. чел.",
            "Singapore, 725 кв. км., 5,7 млн чел."
    };

    public CountryInfo(String country_name, double country_area, double population_country, String capital_name, double population_capital) {
        this.country_name = country_name;
        this.country_area = country_area;
        this.population_country = population_country;
        this.capital_name = capital_name;
        this.population_capital = population_capital;
    }
    public CountryInfo(String country_name, double country_area, String capital_name) {
        this.country_name = country_name;
        this.country_area = country_area;
        this.capital_name = capital_name;
    }

    public CountryInfo(String country_name, double country_area, double population_country) {
        this.country_name = country_name;
        this.country_area = country_area;
        this.population_country = population_country;
        this.capital_name = "";
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        if (country_name.length() > 0) {
            this.country_name = country_name;
        } else {
            throw new IllegalArgumentException("Длина название страны должна быть больше 0 символов");
        }
    }

    public double getСountry_area() {
        return country_area;
    }

    public void setСountry_area(double country_area) {
        if (country_name.length() > 0) {
            this.country_area = country_area;
        } else {
            throw new IllegalArgumentException("Площадь страны должна быть больше 0");
        }
    }

    public double getPopulation_country() {
        return population_country;
    }

    public void setPopulation_country(double population_country) {
        if (country_name.length() > 0) {
            this.population_country = population_country;
        } else {
            throw new IllegalArgumentException("Население страны должно быть больше 0");
        }


    }

    public String getCapital_name() {
        return capital_name;
    }

    public void setCapital_name(String capital_name) {
        if (country_name.length() > 0) {
            this.capital_name = capital_name;
        } else {
            throw new IllegalArgumentException("Название столицы страны должно быть больше 0 символов");
        }
    }

    public double getPopulation_capital() {
        return population_capital;
    }

    public void setPopulation_capital(double population_capital) {
        if (country_name.length() > 0) {
            this.population_capital = population_capital;
        } else {
            throw new IllegalArgumentException("Население столицы страны должно быть больше 0 человек");
        }
    }

    public double getPopulation_density() {
        return population_capital / country_area;
    }

    public void setCapital_info(String capital_name, double population_capital) {
        this.capital_name = capital_name;
        this.population_capital = population_capital;
    }

    public void print() {
        if(capital_name.length() > 0 && population_capital > 0) {
            System.out.println("Название страны : " + country_name + "; Площадь страны : " + country_area +
                    "; Население страны :" + population_country +
                    "; Название столицы : " + capital_name + ";  Население столицы : " + population_capital);
        } else {
            System.out.println("Название страны : " + country_name + "; Площадь страны : " + country_area +
                    "; Население страны :" + population_country );
        }

    }


    @Override
    public String toString() {
        return "CountryInfo{" +
                "country_name='" + country_name + '\'' +
                ", country_area=" + country_area +
                ", population_country=" + population_country +
                ", capital_name='" + capital_name + '\'' +
                ", population_capital=" + population_capital +
                ", countries=" + Arrays.toString(countries) +
                '}';
    }
    public void printAll(){
        for (int i = 0; i < countries.length -1; i++) {
            System.out.println(countries[i].toString());

        }

    }
}


