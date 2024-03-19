public class StringBuilder {
  public static void main(String[] args) {
    StringBuilder sb=new StringBuilder();
    System.out.println(sb);

    //chat at index 0
    System.out.println(sb.charAt(0));

    //set chat at index0
    sb.setCharAt(0,'p');
    System.out.println(sb);
  }
}
