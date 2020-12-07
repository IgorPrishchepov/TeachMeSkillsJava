public class Runner {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "I like java";

      //  System.out.println("I".concat(" ").concat("like").concat("Java"));
      //  System.out.println(str1 + str2);

      /*  String str5 = null;
        String str6;
        str2.concat(Integer.toString(23));
        System.out.println(str1 + 234 + true);*/

        int a = 5;
        System.out.println(String.valueOf(5));

        String.join(" ", "I", "like", "Java");
        String[] array = {"I", "like", "Java"};
       // System.out.println(String.join(" ", array));

        "A".compareTo("A");
        char[] chars = new char[5];

        "abcdefg".getChars(2,5,chars,0);

        "abc".equals("abc");
        String str3 = "abc";

        str1.equals(str3);

        "Welcome to TeachMeSkills".regionMatches(0, "Teach", 0, 5);

        "Welcome to TeachMeSkills".indexOf("to");

    //    System.out.println("dffdwejnf.wew.wew.".replace(".", " "));

       /* System.out.println("I3234 l3i3k53e 23Ja34va".replaceAll("[0-9]", ""));
        System.out.println("I3234 l3i3k53e 23Ja34va".replaceAll("\\d", ""));
        System.out.println("I3234 l3i3k53e 23Ja34va".replaceAll("\\D", ""));
        System.out.println("I3234 l3i3k53e 23Ja34va".replaceAll("[A-Z0-9]", ""));*/

       //System.out.println("11 122 33 33".replaceFirst("\\d{3}", "_"));

     //  System.out.println("11 122 33 33".replaceFirst("\\d{3,4}", "_"));

      //  System.out.println(" I like Java. ".trim());

        String str_ = "Hello, world".substring(5,8);

        CharSequence sequence = "Hello, world".subSequence(7,10);

        "I Like JAVA".toLowerCase().contains("java");


    }
}
