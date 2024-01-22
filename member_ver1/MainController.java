package member_ver1;

import java.util.Scanner;

public class MainController {

  public static void help() {
    System.out.println();
    System.out.println("명령어 사용법:");
    System.out.println("-------------------------------");
    System.out.println("new 이메일 이름 암호 암호확인");
    System.out.println("change 이메일 현재암호 변경암호");
    System.out.println("list");
    System.out.println("info 이메일");
    System.out.println("exit - 프로그램 종료");
    System.out.println("help - 도움말");
    System.out.println();
  }

  public static void main(String[] args) {

    help();

    Scanner sc = new Scanner(System.in);

    while (true) {

      System.out.println("명령어를 입력하세요");
      String userInput = sc.nextLine();

      // 사용자가 입력한 정보를 빈칸으로 구분하여 배열로 저장
      String[] userInputs = userInput.split(" ");

      if (userInput.startsWith("new")) {// "new" 로 시작한다면

        // 유효성검사 - 전달받은 정보의 개수를 확인
        if (userInputs.length != 5) {
          System.out.println("입력하신 정보가 형식에 맞지 않습니다.");
          help();
          continue;
        }

        // 전달받은 데이터를 RequestDTO 객체에 담는다.
        RequestDTO dto = new RequestDTO(userInputs[1], userInputs[2], userInputs[3], userInputs[4]);

        // 유효성검사 -비번일치 여부
        if (!dto.comparePwd()) { // dto.comparePwd() == false 와 같은 표현
          System.out.println("입력하신 비번이 일치하지 않습니다.");
          continue;
        }

        MemberRegisterSerivce regSrv = new MemberRegisterSerivce();
        regSrv.regist(dto);

      } // end of if

    } // end of while

  }// end of main
}
