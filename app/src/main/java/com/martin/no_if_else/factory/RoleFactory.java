package com.martin.no_if_else.factory;

import com.martin.no_if_else.RoleOperation;
import java.util.HashMap;
import java.util.Map;

public class RoleFactory {
  private Map<String, RoleOperation> roleOperationMap = new HashMap<>();

  public RoleFactory() {
    roleOperationMap.put("ROLE_ROOT_ADMIN", new RootAdminRole("ROLE_ROOT_ADMIN"));
    roleOperationMap.put("ROLE_ORDER_ADMIN", new OrderAdminRole("ROLE_ORDER_ADMIN"));
    roleOperationMap.put("ROLE_NORMAL", new NormalRole("ROLE_NORMAL"));
  }


  public RoleOperation getOp( String rolename) {
    return roleOperationMap.get(rolename);
  }
}
