package member_ver1;

public class MemberInfoService {

  private MemberDAO dao;

  public MemberInfoService() {
    dao = new MemberDAO();
  }

  public void printMember(String email) {

    MemberVO vo = dao.selectOne(email);

    System.out.printf("회원정보 - 이름:%s, 이메일:%s, 비번:%s, 등록일:%s", vo.getName(), vo.getEmail(),
        vo.getPwd(), vo.getRegDate());
  }

}
