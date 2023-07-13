import java.util.ArrayList;
import java.util.List;

public class List_Main {
    public static void main(String[] age){

        List<String> names = List.of("ノーゲーム・ノーライフ1","ノーゲーム・ノーライフ2","ライアー・ライアー1","ライアー・ライアー2");
        List<String> result = new ArrayList<>();
        
        for (String name : names){
            if (name.contains("ノーゲーム・ノーライフ")){
                result.add(name);
            }
        }
        System.out.println(result);
    }
}