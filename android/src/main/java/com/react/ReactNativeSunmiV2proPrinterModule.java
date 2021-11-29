// ReactNativeSunmiV2proPrinterModule.java

package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

import com.react.utils.SunmiPrintHelper;



public class ReactNativeSunmiV2proPrinterModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    public ReactNativeSunmiV2proPrinterModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        SunmiPrintHelper.getInstance().initSunmiPrinterService(this);
    }

    @Override
    public String getName() {
        return "ReactNativeSunmiV2proPrinter";
    }

    @ReactMethod
    public void labelLocate() {
      SunmiPrintHelper.getInstance().labelLocate();
    }
    
    @ReactMethod
    public void labelOutput() {
      SunmiPrintHelper.getInstance().labelOutput();
    }

    @ReactMethod
    public void isLabelMode() {
      SunmiPrintHelper.getInstance().isLabelMode();
    }

    @ReactMethod
    public void printText(String content, float size, boolean isBold, boolean isUnderLine) {
      SunmiPrintHelper.getInstance().printText(content, size, isBold, isUnderLine);
    }

    @ReactMethod
    public void printQRCode(String data, int modulesize, int errorlevel) {
      SunmiPrintHelper.getInstance().printQr(data, modulesize, errorlevel);
    }

    @ReactMethod
    public void lineWrap(int lines) {
      SunmiPrintHelper.getInstance().lineWrap(lines);
    }

    @ReactMethod
    public void setAlignment(int align) {
      SunmiPrintHelper.getInstance().setAlign(align);
    }    
}
