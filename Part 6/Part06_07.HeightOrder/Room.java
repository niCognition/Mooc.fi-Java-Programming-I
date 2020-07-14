import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personsInRoom;

    public Room() {
        this.personsInRoom = new ArrayList<>();
    }

    public void add(Person person) {
        this.personsInRoom.add(person);
    }

    public Person take() {
        if (this.personsInRoom.isEmpty()) {
            return null;
        }

        return this.personsInRoom.remove(this.personsInRoom.indexOf(this.shortest()));
    }

    public boolean isEmpty() {
        return this.personsInRoom.isEmpty();
    }

    public Person shortest() {
        if (this.personsInRoom.isEmpty()) {
            return null;
        }

        Person shortest = this.personsInRoom.get(0);
        for (Person person : this.personsInRoom) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }

        return shortest;
    }

    public ArrayList<Person> getPersons() {
        return this.personsInRoom;
    }
}
