package exercise11;

import java.util.ArrayList;
import java.util.Collection;


/**
 * Exercise 11 logic
 * @author garipa01 / Patrick Garin
 */
public class Ex11Logic {
  
  /**
   * Task 1
   * @param <T>
   * @param item
   * @return length of the parameter's string representation
   */
    
    public <T> int strLen(T item){
        return item.toString().length();
    }
  // TODO: Implement method strLen
  
  /**
   * Task 2
   * @param <T>
   * @param item1
   * @param item2
   * @param item3
   * @return the greater of three parameters
   */
  // TODO: Implement method greater
    public <T extends Comparable> T greater(T thing_1, T thing_2, T thing_3){
        if(thing_1.compareTo(thing_2) >= 0 && thing_1.compareTo(thing_3) >= 0){
            return thing_1;
            } else if(thing_2.compareTo(thing_3) >= 0) {
                return thing_2;
                } else {
                    return thing_3;
        }
    }
  
  /**
   * Task 3
   // @param <T>
   // @param list of objects
   * print a list of items
   */
  // TODO: Implement method printList
  public <T> void printList(T ... list){
      // '...' provides a empty list space to pass through parameter
      for(T t: list){
          System.out.print(t.toString() + " ");
      }
  }
  /**
   * Task 4
   * @param <T>
   * @param list of objects
   * @return the smallest item in the collection
   */
  // TODO: Implement method findMinItem
  public <T extends Comparable> T findMinItem(Collection<T> list){
      try {
      T small = list.iterator().next();
      for(T t: list){
          if(t.compareTo(small) < 0){
              small = t;
          }
      }
      return small;
      } catch(IndexOutOfBoundsException e){
          System.out.println("Error");
          return null;
      }
  
    }
}


  /**
   * Task 5
   * @param <T>
   * @param <U>
   * A class with two data members, T fuzz and U buzz
   * Implement the constructor, getters, setters, and toString
   */
  // TODO: Implement class Foo


class Foo<T,U> {
    protected T fuzz;
    protected U buzz;

    public Foo(T fuzz, U buzz) {
        this.fuzz = fuzz;
        this.buzz = buzz;
    }

    public T getFuzz() {
        return fuzz;
    }

    public void setFuzz(T fuzz) {
        this.fuzz = fuzz;
    }

    public U getBuzz() {
        return buzz;
    }

    public void setBuzz(U buzz) {
        this.buzz = buzz;
    }

    @Override
    public String toString() {
        return "Foo{" + "fuzz=" + fuzz + ", buzz=" + buzz + '}';
    }
    
}

