
/**
 * This is the code for the Variables, Operations, and Input Assignment
 *
 * @Manaal Lakhani
 * @March 18, 2024
 */

import java.util.Scanner;

public class variablesOperationsAndInputAssignment
{
    public static void grade() {
            // This method takes 5 grades from the user and finds the average 
        
        Scanner scan = new Scanner(System.in);
            // Creates a Scanner object to read input from the user
            
        System.out.print("Enter the first grade %: ");
        int grade1 = scan.nextInt();
        System.out.print("Enter the second grade %: ");
        int grade2 = scan.nextInt();
        System.out.print("Enter the third grade %: ");
        int grade3 = scan.nextInt();
        System.out.print("Enter the fourth grade %: ");
        int grade4 = scan.nextInt();
        System.out.print("Enter the fifth grade %: ");
        int grade5 = scan.nextInt();
            // Asks user to enter 5 grades and stores them as int 
        
        scan.close();
            // Close the Scanner to prevent leak
            
        int sumOfGrades = grade1 + grade2 + grade3 + grade4 + grade5;
        int averageOfGrades = sumOfGrades /  5;
            // Creates average of all the grades by taking the sum and dividing by 5 

        System.out.println("The average of your grades is " + averageOfGrades + "%");
            // Prints out average of all grades provided  
        
    }
    public static void pizza() {
            /* This method takes an input from the user of the size of the 
             * pizza and displays the cost for making it
             */ 
        
        Scanner scan = new Scanner(System.in);
            // Creates a Scanner object to read the input from the user
            
        System.out.print("Enter the diameter of the pizza in inches: ");
        double diameter = scan.nextDouble();
            // Prompts the user to enter the size of the pizza in inches and then stores it as a double
        
        scan.close();
           // Close the Scanner to prevent leak

        double laborCost = 0.75;
        double rentCost = 1.00;
        double materialsCostPerSquareInch = 0.05;
            // Saves values of costs for labor, rent and materials that we will need later as doubles
        
        double radius = diameter / 2;
        double area = 3.14159 * radius * radius;
            // Calculates radius to then after calculate the area and also saves them as doubles
        
        double materialsCost = materialsCostPerSquareInch * area;
        double totalCost = laborCost + rentCost + materialsCost;
            // Calculates overall materials cost and the total overall final cost of everything and saves it as a double
        
        System.out.println("Cost breakdown:");
        System.out.println("Labor cost: $" + laborCost);
        System.out.println("Rent cost: $" + rentCost);
        System.out.println("Materials cost: $" + materialsCost);
        System.out.println("Total cost for making the pizza: $" + totalCost);
            // Prints out all the values we calculated as a cost breakdown
        
    }
    public static void radius(){
            /* This method helps calculate perimeters/ surface area and 
             * area/volume of a circle, cylinder, and sphere 
             */ 
        
        Scanner scan = new Scanner(System.in);
            // Creates a Scanner object to read the input from the user
        
        System.out.print("Enter the radius: ");
        double radius = scan.nextDouble();
        System.out.print("Enter the height: ");
        double height = scan.nextDouble();
            // Prompts user to enter a radius and height value and store them both as doubles 
        
        scan.close();
            // Close the Scanner to prevent leak
        
        double pi = 3.14;
            // Stores the value of pi which we will need later as a double
        
        double circlePerimeter = 2 * pi * radius;
        double circleArea = pi * radius * radius;
            // Calculate perimeter and area of the circle using pi that we stored previously and the radius that was given, then store as a double
        
        double cylinderSurfaceArea = (2 * circleArea) + (circlePerimeter * height);
        double cylinderVolume = circleArea * height;
            // Calculate the surface area and volume of the cylinder using the calculations from the Circle from above, then store as a double
        
        double sphereSurfaceArea = 4 * pi * radius * radius;
        double sphereVolume = (4/3) * pi * radius * radius * radius;
            // Calculate the surface area and volume of the sphere and store the values as a double 
        
        System.out.println("Perimeter of the circle: " + circlePerimeter);
        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Surface area of the cylinder: " + cylinderSurfaceArea);
        System.out.println("Volume of the cylinder: " + cylinderVolume);
        System.out.println("Surface area of the sphere: " + sphereSurfaceArea);
        System.out.println("Volume of the sphere: " + sphereVolume);
            // Prints out all the results of all of the values we calculated using the users radius imput
            
    }
    public static void prom(){
            /* This method combines all the costs of running prom and creates 
             * the number of tickets you would need to break even
             */ 
        
        Scanner scan = new Scanner(System.in);
            // Creates a Scanner object to read the input from the user
        
        System.out.print("Enter the cost of food: ");
        double foodCost = scan.nextDouble();
        System.out.print("Enter the cost of the DJ: ");
        double djCost = scan.nextDouble();
        System.out.print("Enter the cost of the hall: ");
        double hallCost = scan.nextDouble();
        System.out.print("Enter the cost of decorations: ");
        double decorationsCost = scan.nextDouble();
        System.out.print("Enter the cost of the waiting staff: ");
        double staffCost = scan.nextDouble();
            // Prompts the user to enter the costs of the following aspects of hosting a prom and stores tehm all as doubles
            
        scan.close();
            // Close the Scanner to prevent leak
        
        int ticketPrice = 65;
        int miscellaneousExpenses = 100;
            // Store the ticket price and the other misclellaneous expenses as integers 
        
        double totalExpense = foodCost + djCost + hallCost + decorationsCost + staffCost + miscellaneousExpenses;
            // Calculates the total expense by adding all the doubles we got from the user and saves it as a double
        
        int ticketsToBreakEven = (int) (totalExpense + ticketPrice -1)/ ticketPrice;
            // Calculates the number of tickets needed to break even by using the values we calculated before and saves it as an int
    
        System.out.println("Number of tickets to break even: " + ticketsToBreakEven);
            // Prints out the tickets to break even number 
        
    }
    public static void box(){
            /* This method takes in the length and width from the user and 
             * creates a box with X's
             */
        
        Scanner scan = new Scanner(System.in);
            // Creates a Scanner object to read the input from the user
        
        System.out.print("Enter the lenght of the box: ");
        int length = scan.nextInt();
        System.out.print("Enter the width of the box: ");
        int width = scan.nextInt();
            // Prompts the user to enter the lenght and width of the box to be created and stores teh values as integers
        
        scan.close();
            // Close the Scanner to prevent leak
        
        int i = 0;
        while(i < width){
            int j= 0;
            while (j< length){
                    // This is to make it print "X" if it is at the border if true, otherwise print a space " "
                if(i == 0 || i == width - 1 || j == 0 || j == length -1){
                    System.out.print("X");
                }
                else{
                    System.out.print(" ");
                }
                j= j + 1; 
                    // Increment j (used a video to learn this because i couldnt figure out another way to do this)
            }
            System.out.println();
            i = i + 1;
                // // Increment i (used a video to learn this because i couldnt figure out another way to do this)
        }
    }
    public static void prime(){
            /* This method asks the user for a number and outputs all its 
             * prime numbers 
             */ 
        Scanner scan = new Scanner(System.in);
            // Creates a Scanner object to read the input from the user
        
        System.out.print("Enter a number: ");
        int x = scan.nextInt();
            // Prompts the user to enter a number and saves it as an Int "x"
        scan.close();
            // Close the Scanner to prevent leak
        
        System.out.println("Prime numbers from 1 to " + x + ":");
        for (int i = 2; i <= x; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                    //Checks if the number is a prime number (used a video to learn this because i couldnt figure out another way to do this)
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
                // outputs the prime members 
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
    public static void sum(){
            /* This method takes a number from the user and outputs the sum 
             * of the numbers from 1 to that number inputted
             */ 
        Scanner scan = new Scanner(System.in);
            // Creates a Scanner object to read the input from the user
        
        System.out.print("Enter a number: ");
        int x = scan.nextInt();
            // Prompts the user to enter a number and saves it as an int "x"
            
        scan.close();
            // Close the Scanner to prevent leak
        
        int sum = 0;
        int i = 1;
            while (i <= x) {
            sum += i;
            i = i + 1; 
            }
                // Calculates the sum of the numbers from 1 to the value provided, initializes the sum variable to store the sum of the numbers 
        
        System.out.println("The sum of all the numbers from 1 all the way to " + x +": " + sum);
            // Prints out the sum of all the numbers 
        
    }
    public static void leapYear(){
            /* This method asks the user for the current year and outputs if 
             * that year is a Leap year or not 
             */
        Scanner scanner = new Scanner(System.in);
            // Creates a Scanner object to read the input from the user
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
            // Prompt the user to enter a year and store it as an Int 

        scanner.close();
            // Close the Scanner to prevent leak

        boolean isLeap = false;
            // Checks if the year is divisible by 4
        if (year % 4 == 0) {
                // If the year is divisble by 4, check if its not divisble by 100 or by 400
            if (year % 100 != 0 || year % 400 == 0) {
                isLeap = true;
                    // If the conditions are true the year is a leap year
            }
        }

        if (isLeap) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
            // Outputs if the year provided from the user is a leap year or not 
            
    }
}
        
    


    

