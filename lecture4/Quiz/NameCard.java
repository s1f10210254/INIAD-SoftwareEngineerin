public class NameCard{
    final String firstName;
    final String familyName;
    static int count = 0;
    int id;

    NameCard(String firstName, String familyName){
        this.firstName = firstName;
        this.familyName = familyName;
        count++;
        this.id = count;
    }

    String getLabel(){
        return "No. " + id + ": " + firstName + " " + familyName;
    }
}