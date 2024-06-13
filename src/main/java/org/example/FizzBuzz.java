package org.example;

public class FizzBuzz {


    public FizzBuzz() {
    }


    public static String fizzbuzzTransform(Integer value){
        return value % 5 == 0 && value % 3 == 0 ? "FizzBuzz" : value % 3 == 0 ? "Fizz" : value % 5 == 0 ? "Buzz" : "";
    }
}
