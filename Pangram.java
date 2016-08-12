# Pangram
public class Pangram {
    public static boolean check(String test){
        for (char a = 'A'; a <= 'Z'; a++)
            if ((test.indexOf(a) < 0) && (test.indexOf((char)(a + 32)) < 0))
                return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sr=new Scanner(System.in);
        String str=sr.nextLine();
        System.out.println(check(str));
       
       
       
    }
}
