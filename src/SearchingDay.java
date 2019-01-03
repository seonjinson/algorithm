public class SearchingDay {
    public static void main(String[] args)
    {
        solution(2,28);
    }
    public static String solution (int a, int b) {
        String answer = "";
        int sum =0;
        int result = 0;
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};

        for(int i=0; i<a-1; i++){
            sum +=month[i];
        }
        sum += b;

        result = sum % 7;

        switch(result) {
            case 0: answer="THU";
                break;
            case 1: answer="FRI";
                break;
            case 2: answer="SAT";
                break;
            case 3: answer="SUN";
                break;
            case 4: answer="MON";
                break;
            case 5: answer="TUE";
                break;
            case 6: answer="WED";
                break;

        }
        System.out.println(answer);
        return answer;
    }
}
