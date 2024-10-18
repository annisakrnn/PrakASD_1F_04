/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujian;

/**
 *
 * @author LENOVO
 */
public class Pc extends komputer{
    int ukuranMonitor;

    public Pc(int ukuranMonitor, String merk, int kecProcessor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProcessor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    public void tampilPc(){
        System.out.println("Ukuran Monitor: " + ukuranMonitor + " inch");
    }
}
