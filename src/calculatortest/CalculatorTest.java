package calculatortest;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        double x, y;
        int pilih = 0;
        do{
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("\n...Contoh Exception...");
                System.out.println("======================");
                System.out.println("1. Kali");
                System.out.println("2. Bagi");
                System.out.println("3. Tambah");
                System.out.println("4. Kurang");
                System.out.println("5. Advance Kalkulator");
                System.out.println("6. Keluar");
                System.out.print("Pilih [1..6] : ");
                pilih = scan.nextInt();
                switch(pilih){
                    case 1:
                        System.out.print("x\t: ");
                        x = scan.nextDouble();
                        System.out.print("y\t: ");
                        y = scan.nextDouble();
                        KalkulatorBeras kbrs1 = new KalkulatorBeras(x, y) {
                        };
                        System.out.println("Hasil\t: "+kbrs1.Ping(x, y));
                        break;
                    case 2:
                        System.out.print("x\t: ");
                        x = scan.nextDouble();
                        System.out.print("y\t: ");
                        y = scan.nextDouble();
                        KalkulatorBeras kbrs2 = new KalkulatorBeras(x, y) {
                        };
                        System.out.println("Hasil\t: "+kbrs2.Po(x, y));
                        break;
                    case 3:
                        System.out.print("x\t: ");
                        x = scan.nextDouble();
                        System.out.print("y\t: ");
                        y = scan.nextDouble();
                        KalkulatorBeras kbrs3 = new KalkulatorBeras(x, y) {
                        };
                        System.out.println("Hasil\t: "+kbrs3.Lan(x, y));
                        break;
                    case 4:
                        System.out.print("x\t: ");
                        x = scan.nextDouble();
                        System.out.print("y\t: ");
                        y = scan.nextDouble();
                        KalkulatorBeras kbrs4 = new KalkulatorBeras(x, y) {
                        };
                        System.out.println("Hasil\t: "+kbrs4.Do(x, y));
                        break;
                    case 5:
                        int pil = 0;
                        do{
                            System.out.println("\n1. Akar");
                            System.out.println("2. Pangkat");
                            System.out.println("3. Sebelumnya");
                            System.out.print("Pilih [1..3] : ");
                            pil = scan.nextInt();
                            switch(pil){
                                case 1:
                                    System.out.print("x\t: ");
                                    x = scan.nextDouble();
                                    break;
                                    case 2:
                                    System.out.print("x\t: ");
                                    x = scan.nextDouble();
                                    System.out.print("y\t: ");
                                    y = scan.nextDouble();
                                    break;
                            }
                        }while(pil!=3);
                        break;
                }    
            } catch (Exception e) {
                System.out.println("Please input the number!");
            }
 
        }while(pilih!=6);
    }
    
}
