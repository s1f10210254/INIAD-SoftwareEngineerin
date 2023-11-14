package quiz4;

public class NameCard {
    //インスタンスフィールド
    final String firstName;
    final String famiyName;
    final int id;
    static int cnt;

    //コンストラクタ
    NameCard(String firstName, String familyName){
        this.firstName = firstName;
        this.famiyName = familyName;
        cnt++;
        this.id = cnt;
    }

    //インスタンス・メソッド
    String getLabel(){
        return String.format("No. %d: %s %s", id, firstName, famiyName);
    }
}