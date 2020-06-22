/*
 *
 * Classname: Main
 *
 * @version 22.06.2020
 * @author Serhii Tronevych
 *
 * Version 2
 *
 *
 * Module 3 task 2
 *
 * Topic: Object-oriented programming,  JavaCollectionFramework
 *
 * Choose a subject according to your number.
 * Develop a service using all your best in OOP and Java collections.
 *
 * Six methods must be written like in the following example.
 * A point for each one.
 *
 * Creative approaches are welcome.
 *
 * EXAMPLE
 *
 * A company contains two types of employees:  full-time and  part-time ones.
 *
 * 1. Create two appropriate classes and 5 objects of each one.
 * 2. Calculate the total salary of a month.
 * 3. Find the highest salary employee.
 * 4. Find he lowest salary employee
 * 5.  The average salary.
 * 6. Who get more salary, part-time or full-time employees?
 *
 * /----------------  Subjects according to your number ------------------
 *
 * 1. Employees.
 * 2. Candies in boxes and by weight.
 * 3. Beer draft  and  bottled.
 * 4. Sugar packed and by weight.
 * 5. Cafe : standard lunch and ordering.
 * 6. Air fly : low-cost and business-class.
 * 7.  Trip by train: social sitting places and business-class.
 * 8. Hotel: only bed  and lux.
 * 9. Taxi: payment for km and for time.
 * 10. Fitness centre:  minimal month subscription and free choice.
 *
 *
 */
package com.company;


import com.company.model.BoxCandies;
import com.company.model.WeightCandies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create objects for BoxCandies class
        BoxCandies Bonjur = new BoxCandies("Bonjur", 35);
        BoxCandies Korivka = new BoxCandies("Korivka", 30);
        BoxCandies Lasunka = new BoxCandies("Lasunka", 45);
        BoxCandies Skittls = new BoxCandies("Skittls", 50);
        BoxCandies MMdms = new BoxCandies("MMdms", 90);

        // Create objects for BoxCandies class
        WeightCandies Romashka = new WeightCandies("Romashka", 5, 70);
        WeightCandies Kislinka = new WeightCandies("Kislinka", 3, 80);
        WeightCandies Shokolapki = new WeightCandies("Shokolapki", 3.5, 60);
        WeightCandies ZoryaneSayvo = new WeightCandies("ZoryaneSayvo", 8, 120);
        WeightCandies Gulliver = new WeightCandies("Gulliver", 15, 55);

        // Create ArrayList with all objects from our ITrading
        List<ITrade> candies = new ArrayList<>();
        candies.add(Bonjur);
        candies.add(Korivka);
        candies.add(Lasunka);
        candies.add(Skittls);
        candies.add(MMdms);
        candies.add(Romashka);
        candies.add(Kislinka);
        candies.add(Shokolapki);
        candies.add(ZoryaneSayvo);
        candies.add(Gulliver);

        // Total Price for all candies in the receiept
        int sumOfPrice = candies.stream().mapToInt(ITrade::getPrice).sum();
        System.out.println("The price of all candies " + sumOfPrice
        + " UAH");
        int price = candies.stream().mapToInt(ITrade::getPrice).sum();
        // Find most Expensive Candies in List
        ITrade mostExpensiveCandies = candies.stream().
                max(Comparator.comparingInt(ITrade::getPrice))
                .orElse(null);
        System.out.println("Most expensive candies is - " + mostExpensiveCandies);
        // Find most Cheap Candies in List
        ITrade mostCheapCandies = candies.stream().
                min(Comparator.comparingInt(ITrade::getPrice))
                .orElse(null);
        System.out.println("Most cheap candies is - " + mostCheapCandies);
        // Find average price of all bought candies
        double avg = candies.stream().mapToInt(ITrade::getPrice)
                .average().orElse(0);
        System.out.println("Find average price of all bought candies " + avg);
        // filter fot weightCandiesPrice elements
        int weightCandiesPrice = candies.stream().filter(el -> el instanceof  WeightCandies)
           .mapToInt(ITrade::getPrice).sum();
        // filter all boxCandiesPrice elements,
        int boxCandiesPrice = candies.stream().filter(el -> el instanceof  WeightCandies)
                .mapToInt(ITrade::getPrice).sum();

        if (weightCandiesPrice > boxCandiesPrice){
            System.out.println(" buyers are more likely to choose candy by weight than candy in boxes");
        }else {
            System.out.println("Customers like weight more\n" +
                    "because you can choose the size of the purchase");
        }
       // Show in output line
         System.out.println("In shop available " + candies.size() + " types of candies"
                 + System.lineSeparator() + "The full price of which " + price + " UAH " +
                 "");



        /*
            ------- Compilation -------
       The price of all candies 2835 UAH
   Most expensive candies is - WeightCandies{name='ZoryaneSayvo', rate=8.0, weightPrice=120}
   Most cheap candies is - BoxCandies{name='Korivka', boxPrice=30}
   Find average price of all bought candies 283.5
   Customers like weight more
   because you can choose the size of the purchase
   In shop available 10 types of candies
   The full price of which 2835 UAH

        */
    }

}