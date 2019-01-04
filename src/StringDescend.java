import java.util.Arrays;
import java.util.Collections;

public class StringDescend {
    public static void main(String[] args){
        StringDescend sol = new StringDescend();
        System.out.println(sol.solution("Zbcdefg"));

    }

    public String solution(String s) {
        String answer;
        String[] strArr = s.split("");
        Arrays.sort(strArr, Collections.reverseOrder());
        answer = String.join("",strArr);

        return answer;
    }
}
