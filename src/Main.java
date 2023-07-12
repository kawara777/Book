import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names1 = new ArrayList<>();
        names1.add("ノーゲーム・ノーライフ1");
        names1.add("ノーゲーム・ノーライフ2");
        names1.add("ライアー・ライアー1");
        names1.add("ライアー・ライアー2");
        
        List<String> names2 = null ;
        
        try {
            for (String BookNames : names1){
                if (names2.contains(BookNames)){
                    System.out.println(BookNames);
                }
            }
        }catch (NullPointerException e ){
            System.out.println("name2には何も登録されていません");
        }
    }
}