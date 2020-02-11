package com.martin.no_if_else.normal;

public class NormalJudegRole {
  public String judge(String roleName) {
    String result = "";
    if (roleName.equals("ROLE_ROOT_ADMIN")) {
      result = "ROLE_ROOT_ADMIN: " + "has AAA permission";
    } else if (roleName.equals("ROLE_ORDER_ADMIN")) {
      result = "ROLE_ORDER_ADMIN: " + "has BBB permission";
    } else if (roleName.equals("ROLE_NORMAL")) {
      result = "ROLE_NORMAL: " + "has CCC permission";
    } else {
      result = "XXX";
    }
    return result;
  }
}
