import java.util.Scanner;

public class kuvvetAlma {
    public static void main(String[] args) {
        int num;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sınır sayıyı giriniz : ");
        num = inp.nextInt();

        System.out.print("4'ün kuvvetleri : ");
        for(int i=1; i<=num; i*=4){
            System.out.print(i + ", ");
        }
        System.out.print("\n5'in kuvvetleri : ");
        for(int j=1; j<=num; j*=5){
            System.out.print(j + ", ");
        }
    }
}
