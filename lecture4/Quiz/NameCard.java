public class NameCard{
    // インスタンス・フィールド
    private final String firstName;
    private final String familyName;
    private final int id;

    private static int count = 1;

    //コンストラクタ
    public NameCard(String firstName, String familyName){
        this.firstName = firstName;
        this.familyName = familyName;
        this.id = count++;
    }

    public String getLabel(){
        return String.format("No. %d: %s %s", id, firstName, familyName);
    }
}