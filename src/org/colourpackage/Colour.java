package org.colourpackage;

public class Colour<T1, T2, T3> {

    public Colour(){

    }
    public Colour(T1 red, T2 yellow, T3 blue){

    }


    public static void main(String[] args){
        Red red = new Red();
        Yellow yellow = new Yellow();
        Orange orange = new Orange();
        Colour<Red, Yellow, Orange>  colourMix = new Colour<>();
        Colour<Red, Yellow, Orange>  colourMix2 = new Colour<Red, Yellow, Orange>(red, yellow, orange);

    }

}
