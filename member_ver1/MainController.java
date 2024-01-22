package member_ver1;

import java.util.Scanner;

public class MainController {

  public static void help() {
    System.out.println();
    System.out.println("명령어 사용법:");
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
      
      
      if(userInput.startsWith("new")) {//"new" 로 시작한다면 
        
        //유효성검사 - 전달받은 정보의 개수를 확인
        
      }//end of if
      
    }//end of while

  }// end of main
}












