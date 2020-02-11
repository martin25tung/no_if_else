package com.martin.no_if_else.strategy;

import com.martin.no_if_else.RoleOperation;

public class RoleContext {
  private RoleOperation operation;

  public RoleContext(RoleOperation operation) {
    this.operation = operation;
  }

  public String execute() {
    return operation.op();
  }
}
