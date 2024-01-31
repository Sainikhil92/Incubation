package OOPs_HomeTask.Task_3;

import java.util.*;

public class Home {

    static Map<Appliances, Boolean> map = new HashMap<>();
    static Set<String> applianceMap = new HashSet<>();
    static int totalNoOfAppliance;
    static Scanner scan;
    static int totalConsumption = 0;

    public static void totalApplianceUnits() {
        for (Appliances m : map.keySet()) {
            if (map.get(m).equals(true)) {
                totalConsumption += m.getUnits();
            }
        }
    }

    public static void switchOnappliance() {
        for (String choice : applianceMap) {

            if (choice.contains("tv")) {
                System.out.println("enter the value as true or false for Tv");
                map.put(new Tv("Tv"), scan.nextBoolean());
            } else if (choice.contains("laptop")) {
                System.out.print("enter the value as true or false for laptop");
                map.put(new Laptop("laptop"), scan.nextBoolean());
            } else if (choice.contains("fan")) {
                System.out.println("enter the value as true or false for Fan");
                map.put(new Fan("fan"), scan.nextBoolean());
            } else if (choice.contains("light")) {
                System.out.println("enter the value as true or false for Light");
                map.put(new Light("light"), scan.nextBoolean());
            } else {
                throw new RuntimeException("invalid input");
            }
        }
    }

    public static void sortedAppliances() {

        List<Appliances> sortedList = new ArrayList<>(map.keySet());

        Collections.sort(sortedList, Comparator.comparingInt(Appliances::getUnits).reversed());

        System.out.println("Appliances sorted by power consumption:");
        for (Appliances appliance : sortedList) {
            System.out.println(appliance.getname() + ": " + appliance.getUnits() + " units");
        }
    }

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        System.out.println("Please enter the total no of Appliances");
        totalNoOfAppliance = scan.nextInt();
        System.out.println("Please enter the Appliances from list \n 1.tv \n 2.laptop \n 3.fan \n 4.Light and \n units");
        for (int i = 0; i < totalNoOfAppliance; i++) {
            applianceMap.add(scan.next());
        }
        switchOnappliance();
        totalApplianceUnits();
        System.out.println("Total Power consumption is " + totalConsumption);
        sortedAppliances();
    }

}
