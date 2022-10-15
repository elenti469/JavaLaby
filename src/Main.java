public class Main
{
    public static void main(String[] args)
    {
        Animal dog = new Animal("canis");
        dog.name = "Szarik";
        dog.species = "canis";
        dog.isAlive = true;


        System.out.println(dog.name);
        System.out.println(dog.isAlive);


        Car hatchback = new Car("Toyota", "Yaris");
        hatchback.make = "Toyota";
        hatchback.model = "Yaris";
        hatchback.color = "Red";
        hatchback.odometer = 51000;
        hatchback.isRunning = false;

        Car combi = new Car("Citroen", "C4 Grand Picasso");
        combi.make = "Citroen";
        combi.model = "C4 Grand Picasso";
        combi.color = "Silver";
        combi.odometer = 200000;
        combi.isRunning = true;

        System.out.print(hatchback.make + " ");
        System.out.println(hatchback.model);


        Human me = new Human(2002);
        System.out.println(me.yearOfBirth);

        Human you = new Human(1900);



        Car fiat1 = new Car("fiat", "bravo");
        Car fiat2 = new Car("fiat", "bravo");
        Boolean isTheSame = (fiat1 == fiat2);
        System.out.println(isTheSame);


        dog.takeForAWalk();
        dog.feed();





    }
}