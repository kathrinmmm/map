public class electronikshop {

    public static int ieftin(int[] tastatura) {
        int pretmin = tastatura[0];
        for (int pret : tastatura) {
            if (pret < pretmin) {
                pretmin = pret;
            }
        }
        return pretmin;
    }

    public static int scump(int[] tastatura, int[] usb) {
        int pretmax = 0;
        for (int pret : tastatura) {
            if (pret > pretmax) {
                pretmax = pret;
            }
        }
        for (int pret : usb) {
            if (pret > pretmax) {
                pretmax = pret;
            }
        }
        return pretmax;
    }

    public static int celmaiscumpusb(int[] usb, int buget) {
        int max = -1;
        for (int pret : usb) {
            if (pret <= buget && pret > max) {
                max = pret;
            }
        }
        return max;
    }

    public static int bugetmax(int buget, int[] tastatura, int[] usb) {
        int max = -1;

        for (int prettastatura : tastatura) {
            for (int pretusb : usb) {
                int total = prettastatura + pretusb;
                if (total <= buget && total > max) {
                    max = total;
                }
            }
        }
        return max;
    }

}

