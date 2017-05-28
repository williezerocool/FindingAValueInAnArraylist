/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingavalueinanarraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class FindingAValueInAnArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        ArrayList<Integer> arrList = new ArrayList<>();
        Random r = new Random();
        
        do{
        
            Integer num = 1 + r.nextInt(59);
            arrList.add(num);
            
        }while(arrList.size() < 10);
        
        System.out.println("arraylist: " + arrList);
        
        System.out.print("value to find: ");
        int input = keyboard.nextInt();
        
        
        if(arrList.contains(input)){
        
            System.out.println(input + " is in the arrayList");
        }else{
        
            System.out.println(input + " is not in the arrayList");
        }
    
    }
    
}
