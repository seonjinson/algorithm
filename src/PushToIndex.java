//시저 암호
public class PushToIndex {
    public static void main(String[] args) {
        PushToIndex sol = new PushToIndex();
        System.out.println(sol.solution("AB",1));
        System.out.println(sol.solution("z",1));
        System.out.println(sol.solution("a B z",4));

    }

    public String solution(String s, int n){
        String answer="";
        char[] arrChar = s.toCharArray();
        for(int i=0; i<arrChar.length; i++){
            int num =0;
            if(arrChar[i] >=65 && arrChar[i]<= 90) {
                if(arrChar[i]+n > 90){
                     num = arrChar[i]+n -90;
                     arrChar[i] = (char)(num+64);
                }
                else {
                    arrChar[i] +=n;
                }
            }
            if(arrChar[i] >=97 && arrChar[i]<=122) {
                if(arrChar[i] +n >122){
                    num = arrChar[i]+n -122;
                    arrChar[i] = (char)(num+96);
                }else {
                    arrChar[i] +=n;
                }
            }
        }
        answer = new String(arrChar);
        return answer;
    }
}
