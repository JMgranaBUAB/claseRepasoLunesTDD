package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        System.out.println("9 km -> "+ new Convert().km_to_miles(9) + " millas");
        System.out.println("27 Celsius -> "+ new Convert().celsius_to_farenheit(27) + " Farenheit");
        System.out.println("10 Kilos -> "+new Convert().kg_to_pounds(10) + " Libras");

    }
}
