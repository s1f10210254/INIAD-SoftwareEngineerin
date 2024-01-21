public class NameCard {
    final String firstName;
    final String familyName;
    final int id;
    static int count = 0;

    NameCard(String firstName, String familyName){
        this.firstName = firstName;
        this.familyName = familyName;
        count++;
        this.id =count;
    }

    String getLabel(){
        String result = "No. " + id + ": " + firstName + " " + familyName;
        return result;
    }
}
