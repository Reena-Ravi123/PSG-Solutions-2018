/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainfall;

import java.text.*;
import java.util.*;

import javax.swing.*;

/**
 *
 * @author d16mx02
 */
public class Rainfall {

    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        String[] monthName = { "January", "February", "March",
                               "April", "May", "June", "July",
                               "August", "September", "October",
                               "November", "December"  };

        double[]  rainfall = new double[12];
        double[]  quarterAverage = new double[4];
        double  annualAverage;
        double sum = 0;
        double difference;
                
        for(int i = 0; i < rainfall.length; i++)
          System.out.println(monthName[i] + ": " + rainfall[i]);
    
        for (int i = 0; i < rainfall.length; i++)
        {
            rainfall[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Rainfall for" + monthName[i]));
            sum += rainfall[i];
        }
        annualAverage = sum / 12.0;
        System.out.println( "Total rainfall: " + sum);
        System.out.println( "Average Monthly Rainfall: " + df.format(annualAverage ));
        
         
        double great = 0.0;
        for(int i = 0; i < rainfall.length; i++) {
            if(rainfall[i] > great)
                great = rainfall[i];
        }
        
        double less = 0.0;
        for(int i = 0; i > rainfall.length; i++) {
            if(rainfall[i] < less)
                less = rainfall[i];
        }
    }                  
}


