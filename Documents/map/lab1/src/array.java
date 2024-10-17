class array {

    public static int gasestemax(int[] numere) {
        int max = numere[0];
        for (int numar : numere) {
            if (numar > max) {
                max = numar;
            }
        }
        return max;
    }


    public static int gasestemin(int[] numere) {
        int min = numere[0];
        for (int numar : numere) {
            if (numar < min) {
                min = numar;
            }
        }
        return min;
    }


    public static int sumamaxima(int[] numere) {
        int min = gasestemin(numere);
        int sum = 0;
        for (int numar : numere) {
            sum += numar;
        }
        return sum - min;
    }


    public static int sumamin(int[] numere) {
        int max = gasestemax(numere);
        int sum = 0;
        for (int numar : numere) {
            sum += numar;
        }
        return sum - max;
    }
}