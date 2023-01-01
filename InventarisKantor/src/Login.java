import java.util.Scanner;

public class Login implements Inventaris{
    Scanner input = new Scanner(System.in);
    @Override
    public void login() {
        System.out.print("ID : ");
        String id = input.nextLine();
        System.out.print("Pass : ");
        String pass = input.nextLine();
        if(!id.equals("admin")&&!pass.equals("admin")){
            System.out.println("password atau ID salah");
            System.exit(0);
        }
        else {
            System.out.println("Login Berhasil");
        }

    }
}
