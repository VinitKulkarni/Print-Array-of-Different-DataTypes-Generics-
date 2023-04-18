package com.bridgelabz.genericsexmaple2;

public class GenericsMainMethod {
    static void displayStringArray(String arrayData[]){
        for (String temp:arrayData) {
            System.out.println(temp);
        }
    }

    static void displayFloatArray(float arrayData[]){
        for (float temp:arrayData) {
            System.out.println(temp);
        }
    }

    static <T>void genericDisplayMethod(T arrayData[]){
        System.out.println("THIS IS GENERIC METHOD");
        for (T tempVariable: arrayData) {
            System.out.print(tempVariable + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String nameArray[] = {"vinit","raam","kiran"};
        float salaryArray[] = {50.5f, 100.6f,20.33f};

        //without using generics
        displayStringArray(nameArray);
        displayFloatArray(salaryArray);



        String nameArray1[] = {"vinit","raam","kiran"};
        Float salaryArray2[] = {50.5f, 100.6f,20.33f};

        //with generics(must use wrapper class datatypes)
        genericDisplayMethod(nameArray1);
        genericDisplayMethod(salaryArray2);
    }
}
