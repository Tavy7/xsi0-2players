import java.util.Scanner;

public class Main {
    public static int swapJucator(int jucator){
        if (jucator == 0) return 1;
        if (jucator == 1) return 0;

        return -1;
    }

    public static void main(String args[]){
        Joc joc = new Joc();
        char[] simboluri = {'x', '0'};
        int jucator = -1;
        Scanner sc = new Scanner(System.in);

        String raspuns = "";

        while (jucator == -1) {
            System.out.println("Joci cu x sau 0 ?");
            raspuns = sc.nextLine();
            switch (raspuns) {
                case "x":
                    jucator = 0;
                    break;

                case "0":
                    jucator = 1;
                    break;

                default:
                    System.out.println("Ai gresit inputu");
            }
        }

        int pozitie;

        while (!joc.isOver()) {

            System.out.println(joc.toString());
            System.out.println("Jucator curent: " + simboluri[jucator]);
            System.out.print("Pozitia de pus simbol: ");

            pozitie = sc.nextInt();

            if (joc.makeMove(pozitie, simboluri[jucator])){
                jucator = swapJucator(jucator);
            }
        }
    }

}
