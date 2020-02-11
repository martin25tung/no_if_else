package com.martin.no_if_else.factory;

import com.martin.no_if_else.RoleOperation;

public class NormalRole implements RoleOperation {

  private String roleName;

  public NormalRole(String roleName) {
    this.roleName = roleName;
  }

  @Override public String op() {
    return roleName + " has CCC permission";
  }
}
