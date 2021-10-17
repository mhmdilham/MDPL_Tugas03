/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdpl;

import java.util.Scanner;

/**
 *
 * @author i
 */
public class MDPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double BP, NR, UE, P;
        System.out.print("Masukkan Biaya Perolehan = Rp.");
        BP = input.nextDouble();
        System.out.print("Masukkan Nilai Residu = Rp.");
        NR = input.nextDouble();
        System.out.print("Masukkan Umur Ekonomis = Rp.");
        UE = input.nextDouble();
        P = (BP-NR)/UE;
        System.out.println("Penyusutan = Rp."+P);
    }
}
