/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujian;

/**
 *
 * @author LENOVO
 */
public class Windows extends Leptoop{
    String Fitur;

    public Windows(String Fitur, String jnsBatrei, String merk, int kecProcessor, int sizeMemory, String jnsProsesor) {
        super(jnsBatrei, merk, kecProcessor, sizeMemory, jnsProsesor);
        this.Fitur = Fitur;
    }

    
public void tampilWindows(){
    System.out.println("Fitur: " + Fitur);
}
    
    
}
