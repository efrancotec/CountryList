package Data;

import Utilities.GeneralUtilities;
import Utilities.Order;

import java.util.Scanner;

public class ListHelper {

    private static Country[] countries;

    public static Country[] getList(){

        if(countries == null) createList();

        return countries;
    }

    public static void printCountries(){
        getList();
        orderCountries();
        for(int a=0; a<getList().length; a++){
            System.out.println("[ " + (a+1) + " ] " + countries[a].getName()
                    + "  --- " + String.format("%.2f", countries[a].getPoints()));
        }
    }

    public static boolean getPoints(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECCIONE EL NUMERO DEL PAIS POR FAVOR");
        try {
            int index = Integer.parseInt(scanner.nextLine()) - 1;

            String countryName = getList()[index].getName();

            System.out.println("INGRESE EL PUNTAJE ADICIONAL PARA EL PAIS " + countryName);
            System.out.println("PUNTOS: ");
            double newPoints = Double.parseDouble(scanner.nextLine());

            plusPoints(index, newPoints);

            return true;
        }catch (NumberFormatException n){
            return false;
        }

    }

    //PRIVATE METHODS
    private static void createList(){

        countries = new Country[10];

        countries[0] = new Country("EEUU", GeneralUtilities.getRandomPoints());
        countries[1] = new Country("Suecia", GeneralUtilities.getRandomPoints());
        countries[2] = new Country("Francia", GeneralUtilities.getRandomPoints());
        countries[3] = new Country("Alemania", GeneralUtilities.getRandomPoints());
        countries[4] = new Country("Holanda", GeneralUtilities.getRandomPoints());
        countries[5] = new Country("Canadá", GeneralUtilities.getRandomPoints());
        countries[6] = new Country("España", GeneralUtilities.getRandomPoints());
        countries[7] = new Country("Inglaterra", GeneralUtilities.getRandomPoints());
        countries[8] = new Country("Brasil", GeneralUtilities.getRandomPoints());
        countries[9] = new Country("Costa Rica", GeneralUtilities.getRandomPoints());
    }

    private static void orderCountries(){
        countries = Order.quicksort(countries, 0,9);
    }

    private static void plusPoints(int index, double newPoints){
        countries[index].setPoints(countries[index].getPoints() + newPoints);
    }

}
