package Personaggi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Guerriero guerriero = new Guerriero("Aragor", 100, 50, "Spada");
        Guerriero guerriero2 = new Guerriero("Legolas", 100, 50,"Arco");
        Mago mago = new Mago("Silente", 100, 50,50,"Avadakedavra", "Expeliarmus");
        Guaritore guaritore = new Guaritore("Frodo", 100, 50, 10, "Bastone");
        Guaritore guaritore2 = new Guaritore("Bilbo", 100, 50, 20, "Erbe Mediche");
        Goblin goblin = new Goblin("Gollum", 100, 10);
        Goblin smeagle = new Goblin("Smeagle", 100, 15);

        ClasseBasePersonaggio[] personaggio = {guerriero, guerriero2, mago, guaritore, guaritore2, goblin, smeagle};
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Scegli il tuo personaggio: ");
            System.out.println("1) Aragor");
            System.out.println("2) Legolas");
            System.out.println("3) Silente");
            System.out.println("4) Frodo");
            System.out.println("5) Bilbo");

            int selezione = sc.nextInt();
            sc.nextLine();

            switch (selezione) {
                case 1: case 2:
                    System.out.println(" ");
                    System.out.println("Ottima scelta! Cosa vuoi far fare al tuo personaggio?");
                    System.out.println(" ");
                    System.out.println("1) Incrementa la forza.");
                    System.out.println("2) Diminuisci la forza.");
                    System.out.println("3) Attacca.");
                    System.out.println("4) Cambia personaggio.");

                    int azionePersonaggio1; // da dichiarare fuori altrimenti non sa come accederci
                    do {
        azionePersonaggio1 = sc.nextInt();// devo riassegnare qui per far si che si aggiorni
                        Guerriero guerrieroScelto = (Guerriero)personaggio[selezione - 1]; // [selezione - 1] cosi da poter aver sempre l'indice corretto
        switch (azionePersonaggio1) {
            case 1:
                    guerrieroScelto.prendiPozione();
                break;

            case 2:
                    guerrieroScelto.malus();
                break;

            case 3:
                System.out.println(" ");
                System.out.println("Chi vuoi attaccare?");
                System.out.println(" ");
                System.out.println("1) Gollum");
                System.out.println("2) Smeagle");

                int selezioneNemico = sc.nextInt();

                if (selezioneNemico == 1) {
                    guerrieroScelto.combatti(goblin);
                } else {;
                   guerrieroScelto.combatti(smeagle);
                }
                break;


        }

    } while (azionePersonaggio1 !=4);
                    break;

                case 3:
                    System.out.println(" ");
                    System.out.println("Ah, un mago! Cosa vuoi far fare al tuo personaggio?");
                    System.out.println(" ");
                    System.out.println("1) Ricarica il mana.");
                    System.out.println("2) Attacca.");
                    System.out.println("3) Cambia personaggio.");

                    int azionePersonaggio2;
                    do {
                        azionePersonaggio2 = sc.nextInt();
                        Mago magoScelto = (Mago)personaggio[selezione - 1];
                        switch (azionePersonaggio2) {
                            case 1:
                                    magoScelto.ricaricaMana();
                                break;

                            case 2:
                                System.out.println(" ");
                                System.out.println("Chi vuoi attaccare?");
                                System.out.println(" ");
                                System.out.println("1) Gollum");
                                System.out.println("2) Smeagle");

                                int selezioneNemico = sc.nextInt();

                                if (selezioneNemico == 1) {
                                    magoScelto.combatti(goblin);
                                } else {;
                                    magoScelto.combatti(smeagle);
                                }
                                break;
                        }

                    } while (azionePersonaggio2 !=3);
                    break;

                case 4: case 5:
                    System.out.println(" ");
                    System.out.println("Molto bene! Cosa vuoi far fare al tuo personaggio?");
                    System.out.println(" ");
                    System.out.println("1) Ricarica il mana.");
                    System.out.println("2) Cura alleato.");
                    System.out.println("3) Cambia personaggio.");

                    int azionePersonaggio3;
                    do {
                        azionePersonaggio3 = sc.nextInt();
                        Guaritore guaritoreScelto = (Guaritore) personaggio[selezione - 1];
                        switch (azionePersonaggio3) {
                            case 1:
                                    guaritoreScelto.ricaricaMana();
                                break;

                            case 2:
                                System.out.println(" ");
                                System.out.println("Chi vuoi curare?");
                                System.out.println(" ");
                                System.out.println("1) Aragor");
                                System.out.println("2) Silente");

                                int selezioneAlleato = sc.nextInt();

                                if (selezioneAlleato == 1) {
                                    guaritoreScelto.curaAlleato(guerriero);
                                } else {;
                                  guaritoreScelto.curaAlleato(mago);
                                }
                                break;
                        }

                    } while (azionePersonaggio3 !=3);
                    break;



        }











    }
}}