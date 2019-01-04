import java.util.ArrayList;
import java.util.Collections;

public class StringIndexSort2 {
    public static void main(String[] args){
        StringIndexSort2 sol = new StringIndexSort2();
        String[] arr = {"sun","bed","car"};
        int n = 1;
        sol.solution(arr,1);
    }
    public String[] solution(String[] strings, int n) {

        ArrayList<String> arrlist = new ArrayList<>();
        for(int i=0; i<strings.length; i++) {
            arrlist.add(""+strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(arrlist);
        String[] answer = new String[strings.length];
        for(int i=0; i<strings.length; i++){
            answer[i] = arrlist.get(i).substring(1,arrlist.get(i).length());
        }

        for(int i=0;i<strings.length; i++){
            System.out.println(answer[i]);
        }
        return answer;
    }
}
