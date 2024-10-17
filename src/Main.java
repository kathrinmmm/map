import java.util.Arrays;
import java.util.Scanner;
public class Main {

//Hello
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
        System.out.println("ex 1");
        System.out.println("numarul de note:");

        int n = scanner.nextInt();
        int[] note = new int[n];

        System.out.println("scrieti notele:");
        for (int i = 0; i < n; i++) {
            note[i] = scanner.nextInt();
        }

        System.out.println("notele insuficiente " + sistemdenotare.insuficient(note));
        System.out.println("media: " + sistemdenotare.medie(note));
        System.out.println("notele rotunjite: " + Arrays.toString(sistemdenotare.notarotunjita(note)));
        System.out.println("cea mai mare nota rotunjita: " + sistemdenotare.rotunjiremaxima(note));

        //2
        System.out.println("ex 2");

        System.out.println("numarul de numere:");
        int m = scanner.nextInt();
        int[] numbers = new int[m];

        System.out.println("scrieti numerele:");
        for (int i = 0; i < m; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("numar maxim: " + array.gasestemax(numbers));
        System.out.println("numar minim: " + array.gasestemin(numbers));
        System.out.println("suma maxima de n-1 numere: " + array.sumamaxima(numbers));
        System.out.println("suma minima de n-1 numere: " + array.sumamin(numbers));

        //3
        System.out.println("ex 3");

        int[] num1 = new int[9];
        int[] num2 = new int[9];

        System.out.println("Scrieți 9 cifre pentru primul număr (Suma):");
        for (int i = 0; i < 9; i++) {
            num1[i] = scanner.nextInt();
        }

        System.out.println("Scrieți 9 cifre pentru al doilea număr (Suma):");
        for (int i = 0; i < 9; i++) {
            num2[i] = scanner.nextInt();
        }

        System.out.println("Summe: " + Arrays.toString(Zahlen.suma(num1, num2)));

        System.out.println("Scrieți 9 cifre pentru primul număr (Diferență):");
        for (int i = 0; i < 9; i++) {
            num1[i] = scanner.nextInt();
        }

        System.out.println("Scrieți 9 cifre pentru al doilea număr (Diferență):");
        for (int i = 0; i < 9; i++) {
            num2[i] = scanner.nextInt();
        }

        System.out.println("Diferenta: " + Arrays.toString(Zahlen.diferenta(num1, num2)));

        System.out.println("Scrieți 9 cifre pentru primul număr (Înmulțire):");
        for (int i = 0; i < 9; i++) {
            num1[i] = scanner.nextInt();
        }

        System.out.print("Scrieți o cifră pentru înmulțire (0-9): ");
        int digit = scanner.nextInt();

        if (digit < 0 || digit > 9) {
            System.out.println("Cifra trebuie să fie între 0 și 9.");
            return;
        }

        System.out.println("Inmultire: " + Arrays.toString(Zahlen.inmultire(num1, digit)));

        System.out.println("Scrieți 9 cifre pentru primul număr (Divizare):");
        for (int i = 0; i < 9; i++) {
            num1[i] = scanner.nextInt();
        }

        System.out.print("Scrieți o cifră pentru divizare (1-9): ");
        digit = scanner.nextInt();

        if (digit < 1 || digit > 9) {
            System.out.println("Cifra trebuie să fie între 1 și 9.");
            return;
        }

        System.out.println("Impartire: " + Arrays.toString(Zahlen.impartire(num1, digit)));


        //4
        System.out.println("ex 4");

        System.out.println("Care este numarul de tastaturi:");
        int prettastatura = scanner.nextInt();
        int[] tastaturi = new int[prettastatura];

        System.out.println("Care sunt preturile tastaturilor:");
        for (int i = 0; i < prettastatura; i++) {
        tastaturi[i] = scanner.nextInt();
        }

        int ceamaiieftinatastatura = electronikshop.ieftin(tastaturi);
        System.out.println("Tastatura cea mai ieftina: " + ceamaiieftinatastatura);

        System.out.println("Care este numarul usb-urilor:");
        int numarusb = scanner.nextInt();
        int[] usb = new int[numarusb];

        System.out.println("Care este pretul usb-urilor:");
        for (int i = 0; i < numarusb; i++) {
        usb[i] = scanner.nextInt();
        }

        int celmaiscumpdispozitiv = electronikshop.scump(tastaturi, usb);
        System.out.println("Dispozitivul cel mai scump este: " + celmaiscumpdispozitiv);

        System.out.println("Care este bugetul:");
        int buget = scanner.nextInt();
        int usbposibil = electronikshop.celmaiscumpusb(usb, buget);
        System.out.println("Cel mai ieftin usb care poate fi cumparat cu acest buget: " + usbposibil);

        System.out.println("Suma maximă de bani pe care Markus o poate cheltui: " + electronikshop.bugetmax(buget, tastaturi, usb));

        scanner.close();
    }

}