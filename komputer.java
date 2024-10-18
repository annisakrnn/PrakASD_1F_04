/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujian;

/**
 *
 * @author LENOVO
 */
public class komputer {
    public String merk;
    public int kecProcessor;
    public int sizeMemory;
    public String jnsProsesor;
    
    public komputer(String merk, int kecProcessor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getKecProcessor() {
        return kecProcessor;
    }

    public void setKecProcessor(int kecProcessor) {
        this.kecProcessor = kecProcessor;
    }

    public int getSizeMemory() {
        return sizeMemory;
    }

    public void setSizeMemory(int sizeMemory) {
        this.sizeMemory = sizeMemory;
    }

    public String getJnsProsesor() {
        return jnsProsesor;
    }

    public void setJnsProsesor(String jnsProsesor) {
        this.jnsProsesor = jnsProsesor;
    }
    void tampilData() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Processor: " + kecProcessor + " GHz");
        System.out.println("Ukuran Memory: " + sizeMemory + " GB");
        System.out.println("Jenis Processor: " + jnsProsesor);
    }
}
    


