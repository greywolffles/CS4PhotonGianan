public class Main {
  public static void main(String[] args) {
    String name1 = "Charlie Spring";
    int schoolYear1 = 10;
    String mbti1 = "ISTP";
    String name2 = "Elle Argent";
    int schoolYear2 = 11;
    String mbti2 = "ENTJ";
    String name3 = "Darcy Olsson";
    int schoolYear3 = 11;
    String mbti3 = "ESFP";

    System.out.println("Favorite Heartstopper Character No. 1");
    System.out.println("Name: " + name1);
    System.out.println("School Year: " + schoolYear1);
    System.out.println("MBTI: " + mbti1 + "\n");
    
    System.out.println("Favorite Heartstopper Character No. 2");
    System.out.println("Name: " + name2);
    System.out.println("School Year: " + schoolYear2);
    System.out.println("MBTI: " + mbti2 + "\n");

    System.out.println("Favorite Heartstopper Character No. 3");
    System.out.println("Name: " + name3);
    System.out.println("School Year: " + schoolYear3);
    System.out.println("MBTI: " + mbti3 + "\n");

    System.out.println("Charlie's School Year Level Four (4) Years Ago: " + (schoolYear1 - 4));
    System.out.println("Elle and Darcy Have the Same SY Level: " + (schoolYear2 == schoolYear3));
    System.out.println("Charlie and Elle Have the Same MBTI: " + (mbti1 == mbti2));
  }
}