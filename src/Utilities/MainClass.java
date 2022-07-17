package Utilities;

import Data.ListHelper;

public class MainClass {

    public static void main(String[] args){

        boolean opc = true;
        while (opc){
            System.out.println(" ==================================== ");
            System.out.println();
            ListHelper.printCountries();
            opc = ListHelper.getPoints();
            System.out.println();
        }

    }
}
