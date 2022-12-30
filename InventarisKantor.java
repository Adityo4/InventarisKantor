public abstract class InventarisKantor extends Inventaris {
    string a = "admin";
    string b = "admin";
    string brng;
    string id;
    string nama;
    @Override
    public void login() {
        System.out.println("Id : ");
        string id = input.nextLine();
        System.out.println("Pass : ");
        string pass = input.nextLine();
        if(id!=a&&pass!=b){
            System.out.println("Id atau pass salah");
        }
    }

    @Override
    public void input(string id,string brng,string nama) {
        int banyak;
        System.out.println("Masukkan banyak Item : ");
        banyak = input.nextInt();
        for(int i=0;i<banyak;i++){
            System.out.println("Masukkan id barang : ");
            string id = input.nextLine();
            System.out.println("Masukkan nama item : ");
            string barang=input.nextLine();
            System.out.println("Masukkan untuk siapa barang tersebut : ");
            string nama = input.nextLine();
        }

    }

    @Override
    public void menu() {
        System.out.println("Selamat datang"+a );
        System.out.println("1. Input");
        System.out.println("2. Exit");
        System.out.println("Pilih : ");

    }
}
