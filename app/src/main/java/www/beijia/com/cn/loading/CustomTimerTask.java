package www.beijia.com.cn.loading;

import android.os.Message;

import java.util.TimerTask;

/**
 * Created by Wangyingbao on 2016/6/28.
 */
public class CustomTimerTask extends TimerTask {
    CustomClipLoading mCustomClipLoading;

    CustomTimerTask(CustomClipLoading paramCustomClipLoading) {
        mCustomClipLoading = paramCustomClipLoading;
    }

    public void run() {
        Message localMessage = mCustomClipLoading.mCustomHandler.obtainMessage();
        localMessage.what = 291;
        mCustomClipLoading.mCustomHandler.sendMessage(localMessage);
    }
}
