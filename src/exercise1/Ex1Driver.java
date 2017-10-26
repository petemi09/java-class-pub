package exercise1;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 * @author yasiro01
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    System.out.println();
    System.out.println("Task 1");
    System.out.println("Hello World");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
    System.out.println();
    System.out.println("Task 2");
      for(int i = 1; i <= 100; i++) {
        if((i % 3) == 0) {
            if((i % 5) == 0) {
                System.out.println("huh");
                }
            else {
                System.out.println("foo");
            }
        }
        if((i % 5) == 0) {
            System.out.println("bar");
            }
        else {
            System.out.println(i);
        }
            }
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
    System.out.println();
    System.out.println("Task 3");
      for(int i = 1; i <= 100; i++) {
        if((i % 7) == 0) {
            System.out.println(i);
        }
    }
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
    System.out.println();
    System.out.println("Task 4");
    int sum = 0 ;
    for(int i = 1; i <= 20; i++) {
        sum = sum + i ;
    }
    System.out.println("the sum of 1-20 is: " + sum);
    long times = 1 ;
    for(int j = 1; j <= 20; j++) {
        times = times * j ;
    }
    System.out.println("the product of 1-20: " + times);    
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    System.out.println();
    System.out.println("Task 5");
    System.out.println("Enter your full name");
    Scanner scan = new Scanner(System.in);
    String full_name = scan.nextLine();
    String[] list = full_name.split(" ");
    String fname = list[0].substring(0,1);
    String mname = list[1].substring(0,1);
    String lname = list[2].substring(0,1);
    System.out.println(fname + mname + lname);
    
    
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    System.out.println();
    System.out.println("Task 6");
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = i * i * i;
    }
    System.out.println(Arrays.toString(numbers));
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1-100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    System.out.println();
    System.out.println("Task 7");
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[100];
    for (int i = 0; i < 100; i++) {
      numbers[i] = rnd.nextInt(100) + 1;
    }
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number 1-100");
    int num = scan.nextInt();
    boolean isFound = false;
    int index = 0;
    while(!isFound && index < numbers.length){
        if(numbers[index] == num){
            isFound = true;
            break;
        } else{
            index++;
        }
    }
    if(isFound){
        System.out.println("Found it!");
    } else {
        System.out.println("Did not find");
    }
    
  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    System.out.println();
    System.out.println("Task 8");
    int sum = 0; 
    for(int i = 0; i < numbers.length; i++){
        sum += numbers[i];
    }
    
    System.out.print("The sum of all the number is: ");
    System.out.println("" + sum);
    
    return sum;
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    System.out.println();
    System.out.println("Task 9");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = scan.nextLine();
    boolean order = true;
    for(int i = 0; i < word.length()-1; i++){
        if(word.charAt(i+1) < word.charAt(i)){
            order = false;
        }
    }
    if(order == true){
        System.out.println(word + " is in order");
        System.out.println("------------------");
    }
    else {
        System.out.println(word + " is not in order");
        System.out.println("-----------------");
    }
    return order;
  }
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
  System.out.println();
  System.out.println("Task 10");
  System.out.println("prime numbers from 1-100");
  
  for(int i = 1; i <= 100; i++) {
      if(i != 1) {
        if(i == 2){
            System.out.println(i);
        }  
        if(i == 3){
            System.out.println(i);
        }  
        if(i == 5){
            System.out.println(i);
        }  
        if(i == 7){
            System.out.println(i);
        }  
        if((i % 2) != 0) {
          if((i % 3) != 0) {
              if((i % 5) != 0) {
                  if((i % 7) != 0) {
                      System.out.println(i);
                  }
              }
          }
      }
    }  
  }
  }

}