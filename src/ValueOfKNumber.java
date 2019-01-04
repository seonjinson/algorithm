import java.util.ArrayList;
import java.util.Collections;

public class ValueOfKNumber {
    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2,5,3},
                {4,4,1},
                {1,7,3}
        };
        ValueOfKNumber sol = new ValueOfKNumber();
        sol.solution(array,commands);
    }
    public int[] solution (int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arrlist= null;
        System.out.println(commands.length);

        for(int i=0; i<commands.length; i++){
            arrlist = new ArrayList<>();
            System.out.println("commands[i][1]"+commands[i][1]);
            for(int j=commands[i][0]; j<=commands[i][1];j++) {
                arrlist.add(array[j-1]);
                System.out.println("j "+array[j-1]);
            }
            Collections.sort(arrlist);
            answer[i] = arrlist.get(commands[i][2]);

        }
        for(int i=0; i<answer.length;i++){
            System.out.println(answer[i]);
        }
        return answer;
    }
}
