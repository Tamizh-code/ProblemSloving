package week1.day4_8_1;

public class exe {
    public static void main(String [] args){
        String s1="String";
        String s2="stRingaBc";
        for(char c:s1.toCharArray()){
            c=Character.toUpperCase(c);
            if(s2.indexOf(c)!=-1)s2=s2.replace(String.valueOf(c),"");
            c=Character.toLowerCase(c);
            if(s2.indexOf(c)!=-1)s2=s2.replace(String.valueOf(c),"");
        }
        System.out.println(s2);
    }
}
