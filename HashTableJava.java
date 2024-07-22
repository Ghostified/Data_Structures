/*
 * Operates on key value pairs
 * to resolve collisions in a hash table , increase the the size of the table
 * Hashtable are great for large tables and poor for small data setys due to large overhead
 * Each data structure in a hashtable store two unique keys to values e.g <Integer,String>
 * FAST insertion, lookup and deletion of key value pairs
 * 
 * Hashing = taking a key and computes an integer (Varies on data type)
 * In hash tables , we use the hash % (modulus) capacity to calculate the index number 
 * i.e key.hashcode () % capacity = index
 * 
 * Bucket = an indexed storage location  for more than one entry
 * can store multiple entries in case of collisions, 
 * For collissions , each bucket is treated as a linked list
 * 
 * Collisison =  happens when a hash functions generates the same index for more than one key
 * less collisions = greater efficcassy
 * 
 * Runtime complexity : O(1) --- Best Case
 *                      o(n) --- Worst Case
 */
import java.util.Hashtable;
import java.util.*;

public class HashTableJava {

    // Creating a hash table of Integers
    public static void main (String [] Args) {
        Hashtable <Integer, String> table = new Hashtable<>(10);
        table.put (100, "Spongebob");
        table.put (101, "Patrick");
        table.put (102, "Sandy");
        table.put (103, "Squidward");
        table.put (104, "Plankton");
        table.put (105, "Crabs");
        table.put (106, "Garry");

        //System.out.println(table.remove(101)); returns null after key is removed
        //System.out.println(table.get(101));

        //Print all values in a hashtable of integer objects
        for (Integer key : table.keySet()){
          System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));  
        }


        System.out.println("\n");
        System.out.println(" ");

        //Creating a hash table of Strings 
        Hashtable <String, String> tableTwo = new Hashtable<>(10);

        //Insert Objects to the hashtable 
        tableTwo.put ("100", "Spongebob");
        tableTwo.put ("101", "Patrick");
        tableTwo.put ("102", "Sandy");
        tableTwo.put ("103", "Squidward");
        tableTwo.put ("104", "Plankton");
        tableTwo.put ("105", "Crabs");
        tableTwo.put ("106", "Garry");

        //Print out all values in a hash table of strings
        for (String key : tableTwo.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + tableTwo.get(key));
        }


        } 
}

