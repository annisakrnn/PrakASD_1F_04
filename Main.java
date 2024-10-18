/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujian;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main (String[] args) {
        Mac mac = new Mac("Face ID", "Lithium", "Apple", 3, 16, "M1");
        mac.tampilData(); 
        mac.tampilLeptop(); 
        mac.tampilMac(); 

        System.out.println();

        Windows windows = new Windows("Cortana", "Li-ion", "Dell", 2, 8, "Intel");
        windows.tampilData(); 
        windows.tampilLeptop(); 
        windows.tampilWindows(); 

        System.out.println();


        Pc pc = new Pc(27, "HP", 4, 32, "AMD");
        pc.tampilData(); 
        pc.tampilPc(); 
    }
}
