package com.example.androidlifecycle;

import android.util.Log;

public class LifeCycle {
  public static final String TAG = "LifeCycle";
  private static int curLevel=0;
  public static void logStart() {
    StringBuilder builder = new StringBuilder();
    for(int i=0;i<curLevel;i++) builder.append("  ");
    builder.append(LifeCycle.func()+"\t:start");
    Log.d(TAG, builder.toString());
    curLevel++;
  }

  public static void logEnd(){
    curLevel--;
    StringBuilder builder = new StringBuilder();
    for(int i=0;i<curLevel;i++) builder.append("  ");
    builder.append(LifeCycle.func()+"\t:end");
    Log.d(TAG, builder.toString());
  }

  private static String func() {
//    StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
    int index = 4;
    return
            Thread.currentThread().getStackTrace()[index].getClassName() + ":" + Thread.currentThread()
                    .getStackTrace()[index].getMethodName();
//    return traceElement.getMethodName();
  }

}
