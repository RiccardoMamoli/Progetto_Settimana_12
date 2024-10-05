package Personaggi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Guerriero guerriero = new Guerriero("Aragor", 100, 50, "Spada");
        Mago mago = new Mago("Silente", 100, 50,50,"Avadakedavra", "Expeliarmus");
        Guaritore guaritore = new Guaritore("Frodo", 100, 50, 10, "Bastone");
        Goblin goblin = new Goblin("Gollum", 100, 10);
        Goblin smeagle = new Goblin("Smeagle", 100, 15);

        ClasseBasePersonaggio[] personaggi = {guerriero, mago, guaritore, goblin, smeagle};

        System.out.println("Scegli il tuo personaggio: ");
        System.out.println("1) Aragor");

        Scanner sc = new Scanner(System.in);









    }
}
