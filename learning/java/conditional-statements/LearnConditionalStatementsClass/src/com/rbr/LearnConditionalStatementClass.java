package com.rbr;

/**
 DOCUMENTATION :
 Author : Reechika Jain
 Created on : 28-07-2021
 Company : RBR

 this project is to print the branch names to understand the conditional statements

 */

public class LearnConditionalStatementClass {

    public static void main(String[] args ) {
	// Print your branch name
        String branch = "Ct";
        if(branch == "CS"){
            System.out.println("Computer Science");
        } else if (branch == "Electrical"){
            System.out.println("Electrical");
        } else if (branch == "Electronics"){
            System.out.println("Electronics");
        } else {
            System.out.println("Invalid branch");
        }
    }
}
