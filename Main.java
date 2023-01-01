import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventarisclass ik = new Inventarisclass();
        Login login = new Login();
        Scanner input = new Scanner(System.in);
        int x;
        login.login();
        do {

        ik.menu();
        int pil = input.nextInt();
        switch (pil){
            case 1 :
                System.out.println("Masukkan jumlah Item yang ingin dimasukkan : ");
                int jumlah = input.nextInt();
                ik= new Inventarisclass(jumlah);
                    ik.input();
            break;

            case 2 : ik.lihat();
            break;

            case 3 : System.exit(0);
        }
        x=pil;
        }while(x<4);



    }
}