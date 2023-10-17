public class NameCard{
    // インスタンス・フィールド
    final String firstName;
    final String familyName;
    final int id;

    static int count = 1;

    //コンストラクタ
    NameCard(String firstName, String familyName){
        this.firstName = firstName;
        this.familyName = familyName;
        this.id = count++;
    }

    String getLabel(){
        return String.format("No. %d: %s %s", id, firstName, familyName);
    }
}