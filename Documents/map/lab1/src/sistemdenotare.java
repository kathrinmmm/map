import java.util.ArrayList;
import java.util.List;


class sistemdenotare {
    public static List<Integer> insuficient(int[] note) {
        List<Integer> insuficient = new ArrayList<>();
        for (int grade : note) {
            if (grade < 40) {
                insuficient.add(grade);
            }
        }
        return insuficient;
    }

    public static double medie(int[] note) {
        int sum = 0;
        for (int grade : note) {
            sum += grade;
        }
        double media = (double) sum / note.length;
        return Math.round(media * 100.0) / 100.0;
    }


    public static int[] notarotunjita(int[] note) {
        int[] notarotunjita = new int[note.length];
        for (int i = 0; i < note.length; i++) {
            notarotunjita[i] = rotunjit(note[i]);
        }
        return notarotunjita;
    }

    private static int rotunjit(int nota) {
        if (nota < 38) {
            return nota;
        }
        int urmatorulmultiplude5 = ((nota / 5) + 1) * 5;
        if (urmatorulmultiplude5 - nota < 3) {
            return urmatorulmultiplude5;
        } else {
            return nota;
        }
    }

    public static int rotunjiremaxima(int[] note) {
        int[] notarotunjita = notarotunjita(note);
        int notamaxima = notarotunjita[0];
        for (int grade : notarotunjita) {
            if (grade > notamaxima) {
                notamaxima = grade;
            }
        }
        return notamaxima;
    }
}