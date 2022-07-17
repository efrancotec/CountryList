package Utilities;

import java.text.DecimalFormat;
import java.util.Random;

public class GeneralUtilities {

    public static double getRandomPoints(){

        /*Random random = new Random(System.currentTimeMillis());

        return 3000*random.nextDouble() + 1;*/
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return  Math.random() * 2999 + 1;
    }
}
