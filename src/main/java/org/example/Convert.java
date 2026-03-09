package org.example;

public class Convert {

    public float km_to_miles(int km){
        return (km * 0.621371f);
    }

    public float celsius_to_farenheit(int celsius){
        return ((celsius * 9/5f) + 32);
    }

    public float kg_to_pounds(int kg){
        return (kg * 2.20462f);
    }
}
