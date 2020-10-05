package oopLecture;

public class OopLecture {

    public static void main(String[] args) {
//        Person rick = new Person();
//        rick.firstName = "Rick";
//        rick.lastName = "Sanchez";
//        System.out.println(rick.sayHello());
//
//        Person justin = new Person();
//        justin.firstName = "Justin";
//        justin.lastName = "Reich";
//        System.out.println(justin.sayHello());

        Dog d1 = new Dog();

        d1.age = 3;
        d1.breed = "corgi";
        d1.canBreed = false;
        d1.name = "Tater";
        d1.callForDog("Sparky");
    }
}
