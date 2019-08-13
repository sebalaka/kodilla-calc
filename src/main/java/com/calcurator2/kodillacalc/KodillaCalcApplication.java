package com.calcurator2.kodillacalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCalcApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCalcApplication.class, args);

        Calculator Calc = new Calculator();
        System.out.println(Calc.add(2,4));
        System.out.println(Calc.sub(2,4));
    }
}

