public class reversestring {
    public static void main(String[] args) {
        //System.out.println("dog");

        String r = reverse("dog");
        //System.out.println(r);


    }
public static String same(String s) {
    char[] letters = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      //  System.out.println(s.charAt(i));
    }
    return s;
}
        public  static String reverse(String s){
            char [] rstring = new char[s.length()];
           int  letterindex = 0;
                for (int i = s.length()-1; i >=0; i--){
                    rstring[letterindex] = s.charAt(i) ;
                    letterindex++;
                }
            System.out.println(rstring);
                return s;
        }




}

