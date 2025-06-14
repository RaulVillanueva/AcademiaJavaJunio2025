package Semana02.ClaseInmutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
     public static void main(String[] args) {
        List<String> initialList = new ArrayList<>();
        initialList.add("Item 1");
        initialList.add("Item 2");

        Date currentDate = new Date();

        ImmutableExample immutableObj = new ImmutableExample("Immutable String", 42, initialList, currentDate);

        System.out.println("String Value: " + immutableObj.getStringValue());
        System.out.println("Int Value: " + immutableObj.getIntValue());
        System.out.println("String List: " + immutableObj.getStringList());
        System.out.println("Date Value: " + immutableObj.getDateValue());

        // Se lanza la excepción UnsupportedOperationException)
        // immutableObj.getStringList().add("Item 3");


         System.out.println("******************************");
        // No afecta al valor original guardado en immutableObj
        currentDate.setTime(System.currentTimeMillis() + 10000);
        System.out.println("currentDate: " + currentDate);
        
        // Se muestra el valor original para date
        System.out.println("Original Date Value: " + immutableObj.getDateValue());
    }
}
