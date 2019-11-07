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
public class rabbit extends animal {
    final private String color;
    final private String nama;

    public rabbit(String color, String nama, boolean vegetarian, String eats, int no0flegs) {
        super(vegetarian, eats, no0flegs);
        this.color = color;
        this.nama = nama;
        
        System.out.println("Hello,His Name is " + nama);
        System.out.println(nama + " is Vegetarian? " + vegetarian);
        System.out.println(nama + " Eats " + eats);
        
    }

        public String getColor() {
        return color;
    }

    public String getNama() {
        return nama;
    }
    
    
}
