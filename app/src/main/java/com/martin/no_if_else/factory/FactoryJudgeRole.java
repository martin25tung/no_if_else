package com.martin.no_if_else.factory;

public class FactoryJudgeRole {
  public String judge(String roleName) {
    return new RoleFactory().getOp(roleName).op();
  }
}
