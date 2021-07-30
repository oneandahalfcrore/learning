package com.rbr;

/**
 * DOCUMENTATION :
 * Author : Reechika Jain
 * Created on : 30-07-2021
 * Company : RBR

 this program is to print the branch names using switch statements
 */

public class LearnSwitchStatementClass {

    public static void main(String[] args) {
	// write your code here
        String branch = "CS";
        switch (branch){
            case "CS":
                System.out.println("CS");
            case "Electronics" :
                System.out.println("Electronics");
                break;
            case "Electrical" :
                System.out.println("Electrical");
                break;
            default:
                System.out.println("Invalid Branch");
        }
    }
}
