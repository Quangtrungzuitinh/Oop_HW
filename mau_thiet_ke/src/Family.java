import java.util.ArrayList;
import java.util.List;

class Family implements Person {
    List<Person> members = new ArrayList<>();

    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public void displayDetails() {
        for (Person member : members) {
            member.displayDetails();
        }
    }
}