package collection_100;

import java.util.HashSet;
import java.util.Random;
import java.util.stream.Stream;

/*
  수학의 집합 개념으로 정말 단순하게 값만 나열
  따라서 저장순서를 유지하지 않고, 데이터의 중복을 허용하지 않는다.
  
  저장된 값의 조회는 for문, stream()을 이용한다.
*/
public class Ex30_HashSet {

  public static void main(String[] args) {

    HashSet<Integer> numSet = new HashSet<Integer>();

    numSet.add(100);
    numSet.add(225);
    numSet.add(3);
    numSet.add(44);
    numSet.add(55);
    numSet.add(3);// 중복되기 때문에 무시

    numSet.remove(3);// 원소 삭제

    System.out.println("numSet에 포함된 원소의 개수는 " + numSet.size());// 저장된 원소의 수

    // for문으로 조회
    System.out.println("\n-----for문으로 조회-----");
    for (int num : numSet) {
      System.out.printf("%d,\t", num);
    }

    System.out.println("\n\n-----Stream으로 조회-----");
    Stream<Integer> numStream = numSet.stream();
    numStream.forEach(num -> System.out.printf("%d,\t", num));

    System.out.println("\n\n-----로또볼 추첨-----");

    // 1~45 사이에서 중복된지 않는 6개의 숫자를 랜덤하게 추출하여 HashSet 객체에 저장

    HashSet<Integer> lottoPaper = new HashSet<Integer>();
    Random random = new Random();

    while (true) {

      int ballNum = random.nextInt(45) + 1;// (0~44)+1
      lottoPaper.add(ballNum);

      if (lottoPaper.size() == 6)
        break;

    } // end of while

    // 로또번호 출력
    for (int num : lottoPaper) {
      System.out.printf("%d\t", num);
    }

    System.out.println("\n\n-----Stream 으로 출력-----");
    Stream<Integer> lottoStream = lottoPaper.stream();
    lottoStream.forEach(num -> System.out.printf("%d\t", num));

  }
}