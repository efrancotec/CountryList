package Utilities;

import Data.Country;

public class Order {


    public static Country[] quicksort(Country[] countries, int left, int right){

        if(left < right){
            int index = partition(countries, left, right);
            countries = quicksort(countries, left, index);
            countries = quicksort(countries, index+1, right);
        }

        return countries;
    }

    private static int partition(Country[] countries, int left, int right){

        Country pivot = countries[left];
        while(true){
            while(countries[left].getPoints() > pivot.getPoints()){
                left++;
            }
            while(countries[right].getPoints() < pivot.getPoints()){
                right--;
            }

            if(left >= right){
                return right;
            }
            else{
                Country temp = countries[left];
                countries[left] = countries[right];
                countries[right] = temp;
                left++;
                right--;
            }
        }
    }
}
