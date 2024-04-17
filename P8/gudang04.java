

public class gudang04 {
    barang04[] tumpukan;
    int size;
    int top;

    public gudang04(int kapasitas){
        size = kapasitas;
        tumpukan = new barang04[size];
        top = -1;
    }

    public boolean cekKosong(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean cekPenuh(){
        if (top == size - 1){
            return true;
        }else{
            return false;
        }
    }

public void tambahBarang(barang04 brg){
    if(!cekPenuh()){
        top++;
        tumpukan[top] = brg;
        System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
    }else{
        System.out.println("Gagal! Tumpukan barang di gudang sudah penuh ");
    }
}
    public barang04 ambilBarang(){
        if (!cekKosong()){
            barang04 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        }else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public barang04 lihatBarangTeratas(){
        if(!cekKosong()){
            barang04 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        }else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public barang04 lihatBarangTerbawah(){
        if(!cekPenuh()){
            barang04 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah " + barangTerbawah.nama);
            return barangTerbawah;
        }else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public barang04 cariBarang(String nama) {
        for (barang04 brg : tumpukan) {
            if (brg != null && brg.nama.equals(nama)) {
                return brg;
            }
        }
        return null;
    }
    public void tampilkanBarang(){
        if(!cekKosong()){
            System.out.println("Rincian tumpukan barang di gudang:");
        
        for(int i = top; i >= 0; i--){
            System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
        }
    } else {
        System.out.println("Tumpukan barang kosong.");
    }
}
public String konversiDesimalKeBiner(int kode){
    StackKonversi04 stack = new StackKonversi04();
    while (kode != 0) {
        int sisa = kode % 2;
        stack.push(sisa);
        kode = kode / 2;
    }
    String biner = new String();
    while(!stack.isEmpty()){
        biner += stack.pop();
    }
    return biner;
}
}