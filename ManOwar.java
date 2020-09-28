package java_fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManOwar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pirateShipInput = s.nextLine();
        String[] pirateShipInputSplit = pirateShipInput.split(">");
        List<Integer> pirateShip = new ArrayList<>();
        for (String currentSection : pirateShipInputSplit) {
            int sectionAsInteger = Integer.parseInt(currentSection);
            pirateShip.add(sectionAsInteger);
        }
        String warShipInput = s.nextLine();
        String[] warShipInputSplit = warShipInput.split(">");
        List<Integer> warShip = new ArrayList<>();
        for (String currentSection : warShipInputSplit) {
            int sectionAsInteger = Integer.parseInt(currentSection);
            warShip.add(sectionAsInteger);
        }
        int maxHealth = Integer.parseInt(s.nextLine());
        String command = s.nextLine();
        while (!command.equals("Retire")) {
            String[] tokens = command.split(" ");
            String commandName = tokens[0];
            switch (command) {
                case "Fire":
                    int fireIndex = Integer.parseInt(tokens[1]);
                    int fireDmg = Integer.parseInt(tokens[2]);
                    if (fireIndex < 0 || fireIndex > warShip.size()) {
                        break;
                    }
                    int sectionHealth = warShip.get(fireIndex);
                    sectionHealth -= fireDmg;
                    if (sectionHealth <= 0) {
                        System.out.println("You won! The enemy whip has sunken.");
                        return;
                    } else {
                        warShip.set(fireIndex, sectionHealth);
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    int dmgDealt = Integer.parseInt(tokens[3]);
                    if (startIndex < 0 || startIndex > pirateShip.size()) {
                        break;
                    }
                    if (endIndex < 0 || endIndex > pirateShip.size()) {
                        break;
                    }
                    for (int i = startIndex; i < endIndex; i++) {
                        int currentSection = pirateShip.get(i);
                        currentSection -= dmgDealt;
                        if (currentSection <= 0) {
                            System.out.println("You lost! Your ship has sunken");
                            return;
                        } else {
                            pirateShip.set(i, currentSection);
                        }
                    }
                    break;
                case "Repair":
                    int repairIndex = Integer.parseInt(tokens[1]);
                    int repairHealth = Integer.parseInt(tokens[2]);
                    if (repairIndex < 0 || repairIndex > pirateShip.size()) {
                        break;
                    }
                    int sectionToRepair = pirateShip.get(repairIndex);
                    sectionToRepair += repairHealth;
                    if (sectionToRepair > maxHealth) {
                        sectionHealth = maxHealth;
                    }
                    pirateShip.set(repairIndex, sectionToRepair);
                    break;
                case "Status":
                    int count = 0;
                    for (Integer currentSection : pirateShip) {
                        if (currentSection < 0.2 * maxHealth) {
                            count++;
                        }
                    }
                    System.out.println(count + " sections need repair.");
                    break;
            }


            command = s.nextLine();
        }
        int pirateShipStatus = 0;
        int warShipStatus = 0;
        for (Integer currentSection : warShip) {
            warShipStatus += currentSection;
        }
        for (Integer currentSection : pirateShip) {
            pirateShipStatus += currentSection;
        }
        System.out.println("Pirate ship status: " + pirateShipStatus);
        System.out.println("War ship status: " + warShipStatus);
    }
}
