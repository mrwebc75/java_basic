package basic_API_90;

public class Ex140_StringQuiz {

  public static void main(String[] args) {

    // 문제1 - 이메일 주소에서 아이디와 도메인 추출하기
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
    int idx = email.indexOf("@");// 4
    email_id = email.substring(0, idx);// duly
    email_domain = email.substring(idx + 1);

    String result = String.format("아이디는 %s, 도메인은 %s", email_id, email_domain);
    System.out.printf(result);
    System.out.println("------------------------");

    // 문제2 - 주민등록번호에서 생년월일 추출하기
    // 0301213234567 - y2k 이후 2003년 01월 21일 출생한 남자
    // 9012152064119 - y2k 이전 1990년 12월 15일 출생한 여자

    String jumin = "9012152064119";

    // 주민번호를 년,월,일 단위로 각 두글자씩 떼어오기
    String yy = jumin.substring(0, 2);// 03
    String mm = jumin.substring(2, 4);// 01
    String dd = jumin.substring(4, 6);// 21

    // 성별을 나타내는 데이터 데어오기
    String gender_code = jumin.substring(6, 7);// 1~4 문자열

    // 태어난 년도 구하기 -> 뭘 기준으로 해야 할까
    // gender_code의 값이 3,4 이면 20, 1,2이면 19

    if (false) {
      // 방법1
      if (Integer.parseInt(gender_code) < 3) {
        yy = "19" + yy;
      } else {
        yy = "20" + yy;
      }
    }

    // 방법2
    if (gender_code.equals("1") || gender_code.equals("2")) {
      yy = "19" + yy;
    } else {
      yy = "20" + yy;
    }

    // y2k 이전 이후 판별
    String y2k = "y2k 이후";
    if (Integer.parseInt(yy) < 2000) {
      y2k = "y2k 이전";
    }

    // 성별 판별하기
    String gender = "남자";

    if (gender_code.equals("2") || gender_code.equals("4")) {
      gender = "여자";
    }

    // 형식에 맞춰서 출력
    String info = String.format("%s %s년 %s월 %s일 출생한 %s", y2k, yy, mm, dd, gender);
    System.out.println(info);
  }
}
