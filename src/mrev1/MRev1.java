/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mrev1;

import java.util.Scanner;

/**
 *
 * @author kamal
 * date
 * fetch and merge
 */
public class MRev1 {
    private String word1;

    public MRev1(String word1) {
        this.word1 = word1;
    }

    public String getWord1() {
        return word1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(word);
        // TODO code application logic here
    }
    
}
