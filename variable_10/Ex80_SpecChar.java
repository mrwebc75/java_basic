package variable_10;

public class Ex80_SpecChar {
  public static void main(String[] args) {

    String src = "JAVA";

    // 문자열안에 쌍따옴표 포함시키기
    System.out.println("\"" + src);

    // 문자열안에 홑따옴표 포함시키기
    System.out.println("\'" + src);

    // 한줄바꿈을 의미하는 특수문자 \n
    System.out.println("\n" + src);

    // 탭키에 해당하는 문자 \t
    System.out.println("\t" + src);
  }
}
