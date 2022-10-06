/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05photongianan;

/**
 *
 * @author PHOTON
 */
import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    earnings = 0;
    itemList = new ArrayList();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if (index < itemList.size() &&  index >= 0){
        earnings = earnings + itemList.get(index).getCost();
        System.out.println("The item has been sold!");
    }
    else {
        System.out.println("There are only " + itemList.size() + " items in the store.");
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to getEarnings
    // print statement indicating the sale
    boolean found = false;
    for (int j = 0; j < itemList.size(); j++){
        System.out.println(itemList.get(j).getName());
        if(itemList.get(j).getName().equalsIgnoreCase(name)){
            found = true;
            earnings = earnings + itemList.get(j).getCost();
            System.out.println("The item has been sold!");
        }
    }
    if(!found){
        System.out.println("The store doesn't sell this item.");
    }
    
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to getEarnings
    // print statement indicating the sale
    if(storeList.contains(i)){
        earnings = earnings + i.getCost();
        System.out.println("The item has been sold!");
    }
    else {
        System.out.println("The store doesn't sell this item.");
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
    
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for(Item i : itemList){
        if(i.getType() == type){
            System.out.println(i.getName());
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    for(Item i : itemList){
        if(i.getCost() <= maxCost){
            System.out.println(i.getName());
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    for(Item i : itemList){
        if(i.getCost() >= minCost){
            System.out.println(i.getName());
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for(Store s : storeList){
        System.out.println(s.getName());
        System.out.println(s.getEarnings());
    }
  }
}

