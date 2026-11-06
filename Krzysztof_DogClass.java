import java.time.Year;
public class Krzysztof_DogClass 
{
    private String name, breed,birthdate;
    private int weight, health, monthsInKennel;
    private boolean gender, hasShots;

    private String[] allowedBreeds = {"Labrador", "Golden Retriever", "German Shepherd", "Bulldog", "Beagle"};
    public Krzysztof_DogClass() 
    {
        this.name = "Unknown";
        this.breed = "Unknown";
        this.birthdate = "Unknown";
        this.weight = 0;
        this.health = 0;
        this.monthsInKennel = 0;
        this.gender = false;
        this.hasShots = false;
    }
    public Krzysztof_DogClass(String name, String breed, String birthdate, int weight, int health, int monthsInKennel, boolean gender, boolean hasShots)
    {
        this.name = name;
        String assignedBreed = "Not Allowed";
        for (String allowedBreed : allowedBreeds) 
        {
            if (allowedBreed.equalsIgnoreCase(breed)) 
            {
                assignedBreed = breed;
            }
        }
        this.breed = assignedBreed;
        this.birthdate = birthdate;
        this.weight = weight;
        this.health = health;
        this.monthsInKennel = monthsInKennel;
        this.gender = gender;
        this.hasShots = hasShots;
    }


    //get and set name
    public void setName(String name) 
    {
        this.name = name;
    } 
    public String getName() 
    {
        return name;
    }

    //get and set breed
    public void setBreed(String breed) 
    {
        String assignedBreed = "Not Allowed";
        for (String allowedBreed : allowedBreeds) 
        {
            if (allowedBreed.equalsIgnoreCase(breed)) 
            {
                assignedBreed = breed;
            }
        }
        this.breed = assignedBreed;
    }
    public String getBreed() 
    {
        return breed;
    }

    //get and set birthdate
    public void setBirthdate(String birthdate) 
    {
        this.birthdate = birthdate;
    }
    public String getBirthdate() 
    {
        return birthdate;
    }

    //get and set weight
    public void setWeight(int weight) 
    {
        this.weight = weight;
    }
    public int getWeight() 
    {
        return weight;
    }

    //get and set health
    public void setHealth(int health) 
    {
        this.health = health;
    }
    public int getHealth() 
    {
        return health;
    }

    //get and set monthsInKennel
    public void setMonthsInKennel(int monthsInKennel) 
    {
        this.monthsInKennel = monthsInKennel;
    }
    public int getMonthsInKennel() 
    {
        return monthsInKennel;
    }
    
    //get and set gender
    public void setGender(boolean gender) 
    {
        this.gender = gender;
    }
    public String getGender() 
    {
        return gender ? "Male" : "Female";
    }

    //get and set hasShots
    public void setHasShots(boolean hasShots) 
    {
        this.hasShots = hasShots;
    }
    public String getHasShots() 
    {
        return hasShots ? "Yes" : "No";
    } 
    public int inHumanYears() 
    {
        int humanYears = 0;

        if (this.birthdate != null && this.birthdate.length() >= 10) 
        {
            String yearStr = this.birthdate.substring(6);
            int birthYear = Integer.parseInt(yearStr);
            int currentYear = Year.now().getValue();
            int ageInDogYears = currentYear - birthYear;

            if (ageInDogYears <= 0) 
            {
                humanYears = 0;
            } 
            else if (ageInDogYears == 1) 
            {
                humanYears = 15;
            } 
            else if (ageInDogYears == 2) 
            {
                humanYears = 24;
            } 
            else 
            {
                // Age 3+ varies by weight bracket
                if (this.weight <= 20) 
                {
                    // Small Dogs (<= 20 lbs)
                    humanYears = 24 + (ageInDogYears - 2) * 4;
                } 
                else if (this.weight <= 50) 
                {
                    // Medium Dogs (21 - 50 lbs)
                    humanYears = 24 + (ageInDogYears - 2) * 5;
                } 
                else 
                {
                    // Large Dogs (> 50 lbs)
                    humanYears = 24 + (ageInDogYears - 2) * 6;
                }
            }
        }

        return humanYears;
    }
}
