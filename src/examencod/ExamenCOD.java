package examencod;
//autor Micael Pereria Salgado

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 11;
        if (metodoRename(num)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int x = 2; x < 1000; x++) {
            if (metodoRename(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static boolean metodoRename(int variable) {
        int j = 2;
        boolean numaux = true;
        while ((numaux) && (j != variable)) {
            if (variable % j == 0) {
                numaux = false;
            }
            j++;
        }
        return numaux;
    }
//fin revertidooooooo
}
