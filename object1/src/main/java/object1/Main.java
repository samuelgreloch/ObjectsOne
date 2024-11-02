package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {

        Person person1 = new Person("Sam", 21, 160);
        Car affordable = new Car("honda", "civic", 2012);
        Chair chair1 = new Chair("Leather", "blue", 2);
        Dog heaven = new Dog("Alexander", 100, "Doberman");

        System.out.println(person1);
    }
}


//Logger logger=Logger.getLogger(Main.class.getName());
        //logger.info("This is a module-using Hello World!");
//Person sam  = new Person ["Sam",21,160];
//Car affordable = new Car ["Civic",2012,12000]
//Chair old = new Chair ["Leather",'blue', 2]
//Dog heaven = new Dog ["Alexander",100, "Doberman"]
//