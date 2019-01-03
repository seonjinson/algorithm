import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;

public class DuplicateValue {
    public static void main(String[] args)
    {
        int[] arr = {1,1,3,3,0,1,1};
        print(solution(arr));
    }
    public static int[] solution(int []arr) {
        ArrayList<Integer> numbers = new ArrayList<>();

        int tmp = arr[0];
        numbers.add(arr[0]);

        for(int i=1; i<arr.length; i++){
            if(tmp == arr[i])
                continue;
            else {
                numbers.add(arr[i]);
                tmp = arr[i];
            }
        }
        int[] answer = new int[numbers.size()];
        for(int i=0; i<numbers.size();i++){
            answer[i] = numbers.get(i);
        }

        return answer;
    }
    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
