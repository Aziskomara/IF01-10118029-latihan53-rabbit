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
public class animal {
    protected boolean vegetarian;
    protected String eats;
    protected int no0flegs;

    public animal(boolean vegetarian, String eats, int no0flegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.no0flegs = no0flegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNo0flegs() {
        return no0flegs;
    }
    
    
}
