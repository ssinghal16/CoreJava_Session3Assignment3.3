package com.acadgild.assignment; //package declaration

public class Assignment3 {

	public static void main(String[] args) { //Main method
		//this will first call one argument constructor of Child Class which
        //in turn call corresponding constructor of super class using super(String)
        System.out.println("Constructor chaining Example in Java");
        Child child = new Child("Jeremy");
      
        //this constructor will call no argument constructor of Child,
        //which then call one argument constructor of
        //same class, which finally call corresponding one argument constructor
        // of super class Parent.
        System.out.println("---------------------------------");
        Child emptyChild = new Child();
    } 
  
}

class Parent{								//Parent class
    private String name;
    /*
     * Calling constructor of same class with one String argument
     */
    protected Parent(){
        this("");
        System.out.println("No argument constructor of Parent called ");
    }
  
    protected Parent(String name){
        this.name = name;
        System.out.println("One String argument constructor of Parent called ");
    }
}

class Child extends Parent{                  //Child class extending Parent class 
    private String name;
  
    /*
     * Calling constructor same class with one argument
     */
    protected Child(){
        this("");
        System.out.println("No argument constructor of Child called ");
    }
  
    /*
     * Calling constructor of super class with one argument
     * call to super() must be first line in constructor
     */
    protected Child(String name){
        super(name);
        System.out.println("One argument constructor of Super class called from sub class ");
    }
}

