package com.liuhunan.myuitest;

import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.intent.IntentStubberRegistry;
import android.support.test.uiautomator.UiDevice;
import android.view.KeyEvent;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by liuhunan on 2016/11/7.
 */
@RunWith(AndroidJUnit4.class)
public class UiTestDemo {
    @Test
    public void presskey() throws RemoteException {
        UiDevice mdevice=UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        mdevice.pressHome();
        mdevice.pressMenu();
        mdevice.pressRecentApps();
        mdevice.pressKeyCode(KeyEvent.KEYCODE_VOLUME_UP);



    }
}
