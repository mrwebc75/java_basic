package basic_API_90;

public class Ex140_StringQuiz {

  public static void main(String[] args) {

    // 이메일 주소에서 아이디와 도메인 추출하기
    String email = "duly@korea.com";

    String email_id = "";
    String email_domain = "";

    // 방법1
    if (false) {
      String[] info = email.split("@");
      email_id = info[0];
      email_domain = info[1];
    }
    
    // 방법2 - .indexOf(), .substring()    
    int idx = email.indexOf("@");//4
    email_id = email.substring(0,idx);//duly
    email_domain = email.substring(idx+1);
    

    String result = String.format("아이디는 %s, 도메인은 %s", email_id, email_domain);
    System.out.printf(result);
  }
}












