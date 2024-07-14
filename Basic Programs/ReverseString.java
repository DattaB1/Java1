public class ReverseString {
  public static void main(String[] args) {
    String s="RAM";
    int lang=s.length();
    String rev="";
    System.out.println(lang);

    for(int i=lang-1;i>=0;i--)
    {
      rev=rev+s.charAt(i);
    }
    System.out.println("Reverseof" + s + " is "  + rev) ;
  }
}
