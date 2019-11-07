/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan53.rabbit;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Rabbit
 */
public class IF0110118029Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    rabbit rabbit = new rabbit("Grey", "Peter", false, "seed", 4);
    
    System.out.println(rabbit.getNama() + " has " + rabbit.getNo0flegs() + " legs");
    System.out.println(rabbit.getNama() + " color is " + rabbit.getColor() );
   }
}
