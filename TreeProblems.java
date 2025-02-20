/*
 * *** Larry Gao / COMP 400C 002 SP25 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

    // make copies of setA and setB
    Set<Integer> diff = new TreeSet<>(setA); 
    Set<Integer> temp = new TreeSet<>(setB);

    // remove common ellements in setB and setA respectively
    diff.removeAll(setB);
    temp.removeAll(setA);

    // merge unique elements from both sets
    diff.addAll(temp);
    return diff;
  }  // end method different()


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */
  
  public static void removeEven(Map<Integer, String> treeMap) {
    Iterator<Integer> iterator = treeMap.keySet().iterator();
    while (iterator.hasNext()) {
      int key = iterator.next();  // get current key
      if (key % 2 == 0) {  // check if key is even
        iterator.remove();  // remove key-value pair safely
      }
    }
  }  // end method removeEven()


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */
  
  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    // use built-in equals() method to compare
    return tree1.equals(tree2);
  }  // end method treesEqual()

} // end treeProblems class
