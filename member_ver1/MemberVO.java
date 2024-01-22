package member_ver1;

import java.util.Date;

public class MemberVO {

  private int id;
  private String name;
  private String email;
  private String pwd;
  private Date regDate;
  
  
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPwd() {
    return pwd;
  }
  public void setPwd(String pwd) {
    this.pwd = pwd;
  }
  public Date getRegDate() {
    return regDate;
  }
  public void setRegDate(Date regDate) {
    this.regDate = regDate;
  }
}
