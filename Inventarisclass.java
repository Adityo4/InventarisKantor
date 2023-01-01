import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Inventarisclass extends InventarisKantor{
    BarangModel[] bm;
    Scanner input = new Scanner(System.in);
    int jumlah;
    public Inventarisclass() {
    }

    public Inventarisclass(int jumlah) {
        bm=new BarangModel[jumlah];
        this.jumlah=jumlah;
    }

    @Override
    public void input() {
        for(int i = 0;i<jumlah;i++){
        System.out.print("ID barang : ");
        String id = input.nextLine();
        System.out.print("Nama Barang : ");
        String brng = input.nextLine();
        System.out.println("Nama Penerima : ");
        String nama = input.nextLine();
//        int length = bm.length;
//        bm = Arrays.copyOf(bm,length + 1);
//        bm[length-1]=bm1;
            bm[i]=new BarangModel(id,nama,brng);
        System.out.println("Input sukses");
        }
    }

    @Override
    public void lihat() {
//        System.out.println(bm);
        File file = new File("inventory.txt");
        for(int i=0;i<jumlah;i++){
            System.out.println("ID : "+bm[i].id);
            System.out.println("Nama Barang : "+bm[i].brng);
            System.out.println("Nama Peneriman : "+bm[i].nama);
            try {
                PrintWriter output = new PrintWriter(file);
                try {
                    for(int j=0;j<jumlah;j++) {
                        output.println("ID : " + bm[j].id);
                        output.println("Nama Barang : " + bm[j].brng);
                        output.println("Nama Peneriman : " + bm[j].nama);
                    }
                    output.close();

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }catch (FileNotFoundException e){
                System.out.println("Terjadi Kesahan");
            }

        }
    }

    @Override
    public void menu() {
        System.out.println("Selamat datang" );
        System.out.println("1. Input");
        System.out.println("2. Lihat");
        System.out.println("3. Exit");
        System.out.println("Pilih : ");
    }
}
