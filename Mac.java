/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujian;

/**
 *
 * @author LENOVO
 */
public class Mac extends Leptoop{
    String security;

    public Mac(String security, String jnsBatrei, String merk, int kecProcessor, int sizeMemory, String jnsProsesor) {
        super(jnsBatrei, merk, kecProcessor, sizeMemory, jnsProsesor);
        this.security = security;
    }

    public void tampilMac(){
        System.out.println("Security: " + security);
    }
}
