public class StringIndexSort {
    public String[] solution(String[] strings, int n) {
        String tmp;
        for(int i=0; i<strings.length-1;i++){
            for(int j=0; j<strings.length-1; j++){
                if(strings[j].charAt(n) > strings[j+1].charAt(n)){
                    tmp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] =tmp;

                }else if(strings[j].charAt(n) == strings[j+1].charAt(n)){
                    if(compare(strings[j],strings[j+1],n))
                        continue;
                    else{
                        tmp = strings[j];
                        strings[j] = strings[j+1];
                        strings[j+1] =tmp;
                    }
                }else
                    ;
            }
        }
        String[] answer = new String[strings.length];
        for(int i=0; i<strings.length;i++){
            answer[i] = strings[i];
            System.out.println(answer[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        StringIndexSort sol = new StringIndexSort();
        String[] strarr = {"sun", "bed", "car"};
        int n = 1;
        sol.solution(strarr,n);
    }
    public static boolean compare(String min, String max,int index){
        boolean result=false;
        for(int i=index;i<min.length(); i++){
            if(min.charAt(i) < max.charAt(i))
                return true;
            else
                continue;
        }
        return result;
    }
}
