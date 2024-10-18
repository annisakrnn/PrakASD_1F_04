/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujian;

/**
 *
 * @author LENOVO
 */
public class Leptoop extends komputer{
    String jnsBatrei;

    public Leptoop(String jnsBatrei, String merk, int kecProcessor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProcessor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilLeptop(){
        System.out.println("Jenis Baterai: " + jnsBatrei);
    }
}
