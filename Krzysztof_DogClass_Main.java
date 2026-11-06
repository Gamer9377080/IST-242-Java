public class Krzysztof_DogClass_Main 
{
    public static void main(String[] args) 
    {
        Krzysztof_DogClass dog1 = new Krzysztof_DogClass();
        Krzysztof_DogClass dog2 = new Krzysztof_DogClass("Buddy", "Golden Retriever", "05/10/2018", 30, 4, 12, true, true);

        System.out.println("Dog 1:");
        dog1.setName("Max");
        dog1.setBreed("Labrador");
        dog1.setBirthdate("03/15/2019");
        dog1.setWeight(25);
        dog1.setHealth(2);
        dog1.setMonthsInKennel(6);
        
        System.out.println("Name: " + dog1.getName());
        System.out.println("Gender: " + dog1.getGender());
        System.out.println("Breed: " + dog1.getBreed());
        System.out.println("Birthdate: " + dog1.getBirthdate());
        System.out.println("Weight: " + dog1.getWeight() + " lbs");
        System.out.println("Health: " + dog1.getHealth());
        System.out.println("Has Shots: " + dog1.getHasShots());
        System.out.println("Months in Kennel: " + dog1.getMonthsInKennel());
        System.out.println("Age in Human Years: " + dog1.inHumanYears());

        System.out.println("\nDog 2:");
        System.out.println("Name: " + dog2.getName());
        System.out.println("Gender: " + dog2.getGender());
        System.out.println("Breed: " + dog2.getBreed());
        System.out.println("Birthdate: " + dog2.getBirthdate());
        System.out.println("Weight: " + dog2.getWeight() + " lbs");
        System.out.println("Health: " + dog2.getHealth());
        System.out.println("Has Shots: " + dog2.getHasShots());
        System.out.println("Months in Kennel: " + dog2.getMonthsInKennel());
        System.out.println("Age in Human Years: " + dog2.inHumanYears());



    }
}
