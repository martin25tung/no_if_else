package com.martin.no_if_else.strategy;

import com.martin.no_if_else.RoleOperation;

public class StrategyJudgeRole {
  public String judge(RoleOperation roleOperation) {
    RoleContext roleContext = new RoleContext(roleOperation);
    return roleContext.execute();
  }
}
