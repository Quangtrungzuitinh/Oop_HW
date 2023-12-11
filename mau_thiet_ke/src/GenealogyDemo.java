public class GenealogyDemo {
    public static void main(String[] args) {
        // Creating individuals
        Individual james = new Individual("01/01/1970", "Male");
        Individual hana = new Individual("05/05/1975", "Female");
        Individual ryan = new Individual("10/10/1995", "Male");
        Individual kai = new Individual("15/08/2000", "Male");
        Individual jennifer = new Individual("20/12/1998", "Female");

        // Creating families
        Family jamesFamily = new Family();
        jamesFamily.addMember(james);
        jamesFamily.addMember(hana);

        Family kaiFamily = new Family();
        kaiFamily.addMember(kai);
        kaiFamily.addMember(jennifer);

        // Building the genealogy tree
        jamesFamily.addMember(ryan);
        jamesFamily.addMember(kaiFamily);

        // Displaying details
        System.out.println("All unmarried individuals:");
        displayUnmarried(jamesFamily);

        System.out.println("\nAll couples with two children:");
        displayCouplesWithTwoChildren(jamesFamily);

        System.out.println("\nThe latest generation:");
        displayLatestGeneration(jamesFamily);
    }

    private static void displayUnmarried(Person person) {
        if (person instanceof Individual) {
            System.out.println("Unmarried Individual:");
            person.displayDetails();
        } else if (person instanceof Family) {
            for (Person member : ((Family) person).members) {
                displayUnmarried(member);
            }
        }
    }

    private static void displayCouplesWithTwoChildren(Person person) {
        if (person instanceof Family) {
            Family family = (Family) person;
            if (family.members.size() == 2 && family.members.get(0) instanceof Individual &&
                    family.members.get(1) instanceof Individual) {
                System.out.println("Couple with two children:");
                family.displayDetails();
            }
            for (Person member : family.members) {
                displayCouplesWithTwoChildren(member);
            }
        }
    }

    private static void displayLatestGeneration(Person person) {
        if (person instanceof Individual) {
            System.out.println("Latest generation individual:");
            person.displayDetails();
        } else if (person instanceof Family) {
            for (Person member : ((Family) person).members) {
                displayLatestGeneration(member);
            }
        }
    }
}