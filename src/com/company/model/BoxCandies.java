/*
 *
 * Classname: BoxCandies
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

public class BoxCandies implements ITrade {

    private String name;
    private int boxPrice;


   // name: name of candies
   // boxPrice: cost a box of candies.

    public BoxCandies() {
    }
     // create Constructor for all elements in this class
    public BoxCandies(String name, int boxPrice) {
        this.name = name;
        this.boxPrice = boxPrice;
    }
    // create method Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBoxPrice() {
        return boxPrice;
    }

    public void setBoxPrice(int boxPrice) {
        this.boxPrice = boxPrice;
    }

    // create method String
    @Override
    public String toString() {
        return "BoxCandies{" +
                "name='" + name + '\'' +
                ", boxPrice=" + boxPrice +
                '}';
    }

    // Element getPrice, implemented in interface ITrade

    @Override
    public int getPrice() {
        return this.getBoxPrice();
    }
}