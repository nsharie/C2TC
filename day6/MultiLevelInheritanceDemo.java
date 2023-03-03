package day6;

public class MultiLevelInheritanceDemo {
    public static void main(String args[]){
        City city = new City();
        city.setCityName("Bangalore");
        city.setArea(568.2f);
        city.setStateName("Karnataka");
        city.setLanguage("Kannada");
        city.setCountryName("India");
        city.setCapital("Delhi");
        System.out.println(city.toString());
    }
    
}
