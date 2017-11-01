package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yasiro01
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
    task1(3);
    System.out.println(task2(numberArr, 90));
    System.out.println(task3(numberArr, 75));
    task4(numberArr);
    task5(numberArr);
    task6();
    task7();
    System.out.println(task8(numberLst, 75));
    task9();
    task10(task9());
  }

  /**
   * TODO: Task 1: Define and call a function nHeads() that takes a number (n) as a parameter and prints the result of coin flips ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row. Seed the randomizer in the main() function.
   * @param n
   */
  public static void task1(int n) {
     System.out.println(nheads(n));
  }
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > n){
            return false;
        }
    }
    return true;
  }
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
  public static int task3(int[] arr, int threshold) {
    int count = 0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] < threshold){
            count++;
        }
    }
    return count;
  }
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, finds the difference between 100 and the largest element of the array and adds this difference to every element in the array. (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
    int min = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > min){
            min = arr[i];
        }
    }
    int diff = 100 - min;
    for(int i = 0; i < arr.length; i++){
        arr[i] += diff;
    }
    for(int i:arr){
        System.out.printf("%d ", i);
    }
  }
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and, assuming the values are scores, prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
    int A = 0; int B = 0; int C = 0; int D = 0; int F = 0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] >= 90){
            A++;
        }
        if(arr[i] >= 80){
            B++;
        }
        if(arr[i] >= 70){
            C++;
        }
        if(arr[i] >= 60){
            D++;
        }
        if(arr[i] <= 59){
            F++;
        }
    
    } 
    System.out.printf("A:%d B:%d C:%d D:%d F:%d%n", A, B, C, D, F);
    
  }
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers. Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList. Use function add() to add a number to an ArrayList.
   */
  public static void task6() {
    ArrayList<Double> arr = new ArrayList();
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter a double, if you wish to exit enter '0'.");
    double answer = scan.nextDouble();
    while(answer != 0){
        arr.add(answer);
        System.out.println("please enter a double, if you wish to exit enter '0'.");
        answer = scan.nextDouble();
    }
    System.out.print(arr);
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
    Random rnd = new Random();
    rnd.setSeed(252);
  
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(51)+50);
  }
    System.out.print(numberLst);
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters and returns the number of values in the ArrayList below a threshold. You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
    int count = 0;
    for(int i = 0; i < arrLst.size(); i++){
        if(arrLst.get(i) < threshold){
            count++;
        }
    }
    return count;
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
    int[][] values = new int [10][10];
    for(int horizontal = 0; horizontal < values.length; horizontal++){
        for(int vertical = 0; vertical < values[0].length; vertical++){
            values[horizontal][vertical] = (horizontal+1) * (vertical+1);
        }
    }
    
    return values;
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
  public static void task10(int[][] matrix) {
    int[] colSum = new int[matrix[0].length];
    int sum = 0;
    for (int i = 0; i < matrix.length; i++){
        for (int j = 0; j < matrix[0].length; j++){
            sum += matrix[i][j];
            colSum[j] += matrix[i][j];
        }
        System.out.printf("sum of rom %d = %d%n",i + 1, sum);
        sum = 0;
    }
    int count = 1;
    for(int k: colSum){
        System.out.printf("sum of column %d = %d%n",count, k);
        count++;
  }
  }

    private static int nheads(int n) {
        Random rnd = new Random();
        rnd.setSeed(200);
        int count = 0;
        int flip = 1;
        while(count < n){
            flip = rnd.nextInt(2);
            if(flip == 0){
                System.out.print("heads ");
                count++;
            } else {
                System.out.print("Tail\n");
                count=0;
            }
        }
        return count;
    }

}
