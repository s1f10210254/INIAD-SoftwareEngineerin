package uml;

import java.time.LocalDate;
import java.time.Period;

public class User {
    private static int idCounter;
    private int id;
    private String familyName;
    private String firstName;
    private LocalDate birthday;

    public User(String firstName, String familyName){
        this.id = idCounter;
        this.firstName = firstName;
        this.familyName = familyName;
        idCounter++;
        
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return String.format("%s %s", familyName, firstName);
    }

    public int getAge(LocalDate when){
        return Period.between(birthday, when).getYears();
    }
}
