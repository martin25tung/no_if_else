package com.martin.no_if_else;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.martin.no_if_else.enum_way.EnumJudgeRole;
import com.martin.no_if_else.factory.FactoryJudgeRole;
import com.martin.no_if_else.factory.NormalRole;
import com.martin.no_if_else.factory.OrderAdminRole;
import com.martin.no_if_else.factory.RootAdminRole;
import com.martin.no_if_else.normal.NormalJudegRole;
import com.martin.no_if_else.strategy.StrategyJudgeRole;

public class MainActivity extends AppCompatActivity {

  private String TAG = getClass().getSimpleName();
  private static final String ROLE_ROOT_ADMIN = "ROLE_ROOT_ADMIN";
  private static final String ROLE_ORDER_ADMIN = "ROLE_ORDER_ADMIN";
  private static final String ROLE_NORMAL = "ROLE_NORMAL";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.d(TAG, "Normal : "+new NormalJudegRole().judge(ROLE_ROOT_ADMIN));
    Log.d(TAG, "Normal : "+new NormalJudegRole().judge(ROLE_ORDER_ADMIN));
    Log.d(TAG, "Normal : "+new NormalJudegRole().judge(ROLE_NORMAL));
    Log.d(TAG, " ");

    Log.d(TAG, "Enum : "+new EnumJudgeRole().judge(ROLE_ROOT_ADMIN));
    Log.d(TAG, "Enum : "+new EnumJudgeRole().judge(ROLE_ORDER_ADMIN));
    Log.d(TAG, "Enum : "+new EnumJudgeRole().judge(ROLE_NORMAL));
    Log.d(TAG, " ");

    Log.d(TAG, "Factory : "+new FactoryJudgeRole().judge(ROLE_ROOT_ADMIN));
    Log.d(TAG, "Factory : "+new FactoryJudgeRole().judge(ROLE_ORDER_ADMIN));
    Log.d(TAG, "Factory : "+new FactoryJudgeRole().judge(ROLE_NORMAL));
    Log.d(TAG, " ");

    Log.d(TAG, "Strategy : "+new StrategyJudgeRole().judge(new RootAdminRole(ROLE_ROOT_ADMIN)));
    Log.d(TAG, "Strategy : "+new StrategyJudgeRole().judge(new OrderAdminRole(ROLE_ORDER_ADMIN)));
    Log.d(TAG, "Strategy : "+new StrategyJudgeRole().judge(new NormalRole(ROLE_NORMAL)));
    Log.d(TAG, " ");
  }
}
