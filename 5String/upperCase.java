public class upperCase {
   
    public static String toUpperCase(String str){
        StringBuilder sd = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
         sd.append(ch);
        for(int i = 1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1){
                 sd.append(str.charAt(i));
                 i++;
                 sd.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sd.append(str.charAt(i));
            }
           }
           return sd.toString();
    }
    
    public static void main(String[] args) {
         String str = "hi, i am aniket";
         System.out.println(toUpperCase(str));    
    }
}
