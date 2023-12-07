/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Project2;

/**
 *
 * @author munachianya
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] main = {{1,3,5},
                        {2,4,6},
                       {7,9,11},
        };
        
        System.out.println("2D Array elements:");
        for(int i=0; i<main.length; i++){
            for(int j=0; j<main[i].length; j++){
                System.out.println(main[i][j]);
            }
            System.out.println(); // print a new line after every row of numbers 
        }
        // TODO code application logic here_
    }
    
}
