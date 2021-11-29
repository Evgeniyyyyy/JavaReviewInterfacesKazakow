import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
    /*    Bird bird = new Bird();
        AirCraft airCraft = new AirCraft();
       // System.out.println(bird.doAction());
        // System.out.println(airCraft.doAction());
        IFly[] flyableStaff = new IFly[] {bird, airCraft};
        for (IFly someFlyable: flyableStaff)
        {
            System.out.println(someFlyable.fuelForFly());
        }

    }*/

        Person person1 = new Person("Bob", 25);
        Person person2 = (Person) person1.clone();
        Person person3 = new Person("Bob", 29);
        Person person4 = new Person("Bob", 19);
        person2.setName("Bob2");
        person3.setName("Alex");
        person3.setAge(10);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        Person[] stuff = new Person[] {person1, person2, person3, person4};
        System.out.println("__________________________________");

        System.out.println(Arrays.toString(stuff));
        Arrays.sort(stuff);
        System.out.println(Arrays.toString(stuff));




    }
}
