public class Joc {
    protected char[] tabla = new char[9];

    public Joc() {
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = '#';//initializare cu spatii libere
        }
    }

    public boolean makeMove(int pozitie, char symbol){
        if (pozitie < 0 || pozitie >= this.tabla.length){
            System.out.println("Pune altundeva");
            return false;
        }

        if (this.tabla[pozitie] == '#') {//daca e spatiu liber
            this.tabla[pozitie] = symbol;
            return true;//s-a executat mutarea
        }

        System.out.println("Spatiul ocupat.");
        return false;
    }

    public String toString() {//functie afisare
        String string = "";

        for (int i = 0; i < tabla.length; i++){
            string += this.tabla[i] + " | ";

            if (i % 3 == 2){
                string += "\n";
            }
        }

        return string;
    }

    public boolean isOver(){

        if (this.tabla[0] == this.tabla[1] && this.tabla[1] == this.tabla[2]){//linia 0
            if (this.tabla[0] != '#') {
                System.out.println("A castigat " + this.tabla[0] + "!");
                return true;
            }
        }

        if (this.tabla[0] == this.tabla[3] && this.tabla[3] == this.tabla[6]){//coloana 0
            if (this.tabla[0] != '#') {
                System.out.println("A castigat " + this.tabla[0] + "!");
                return true;
            }
        }

        if (this.tabla[0] == this.tabla[4] && this.tabla[4] == this.tabla[8]){//diag principala
            if (this.tabla[0] != '#') {
                System.out.println("A castigat " + this.tabla[0] + "!");
                return true;
            }
        }

        if (this.tabla[3] == this.tabla[4] && this.tabla[4] == this.tabla[5]){//linia 1
            if (this.tabla[3] != '#') {
                System.out.println("A castigat " + this.tabla[3] + "!");
                return true;
            };
        }

        if (this.tabla[1] == this.tabla[4] && this.tabla[4] == this.tabla[7]){//coloana 1
            if (this.tabla[1] != '#') {
                System.out.println("A castigat " + this.tabla[1] + "!");
                return true;
            }
        }

        if (this.tabla[6] == this.tabla[7] && this.tabla[7] == this.tabla[8]){//linia 2
            if (this.tabla[6] != '#') {
                System.out.println("A castigat " + this.tabla[6] + "!");
                return true;
            }
        }

        if (this.tabla[2] == this.tabla[5] && this.tabla[5] == this.tabla[7]){//coloana 2
            if (this.tabla[2] != '#') {
                System.out.println("A castigat " + this.tabla[2] + "!");
                return true;
            }
        }

        if (this.tabla[2] == this.tabla[5] && this.tabla[5] == this.tabla[7]){//diag secundara
            if (this.tabla[2] != '#') {
                System.out.println("A castigat " + this.tabla[2] + "!");
                return true;
            }
        }

        int ok = 0;

        for (char i : this.tabla){
            if (i == '#') {
                ok = 1;
            }
        }

        if (ok == 0){
            System.out.println("Remiza!");
            return true;
        }

        return false;
    }
}
