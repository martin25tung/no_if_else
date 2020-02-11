package com.martin.no_if_else.enum_way;

public class EnumJudgeRole {
  public String judge(String roleName) {
    return RoleEnum.valueOf(roleName).op();
  }
}
