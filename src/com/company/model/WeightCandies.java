/*
 *
 * Classname: WeightCandies
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
package com.company.model;

import com.company.ITrade;

public class WeightCandies implements ITrade {

    private String name;
    private double weight;
    private int weightPrice;

    //name: name of candies
    //weight:  weight of candies was a purchase
    //weightPrice: cost a 1kh of candies

    // create Method Select None Constructor  for class WeightCandies
    public WeightCandies() {
    }


    // create Method Constructor  for class WeightCandies
    public WeightCandies(String name, double weight, int weightPrice) {
        this.name = name;
        this.weight = weight;
        this.weightPrice = weightPrice;
    }

    // create method Getters and Setters for all elements in WeightCandies
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double rate) {
        this.weight = weight;
    }

    public int getWeightPrice() {
        return weightPrice;
    }

    public void setWeightPrice(int weightPrice) {
        this.weightPrice = weightPrice;
    }

    // create method String
    @Override
    public String toString() {
        return "WeightCandies{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", weightPrice=" + weightPrice +
                '}';
    }

    // Element getPrice, implemented in interface ITrade
    @Override
    public int getPrice() {
        return (int) (this.getWeightPrice() * getWeight());
    }
}