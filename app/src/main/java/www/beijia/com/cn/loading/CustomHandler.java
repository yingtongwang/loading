package www.beijia.com.cn.loading;

import android.os.Handler;
import android.os.Message;

/**
 * Created by Wangyingbao on 2016/6/28.
 */
public class CustomHandler extends Handler {
    CustomClipLoading mCustomClipLoading;


    CustomHandler(CustomClipLoading paramCustomClipLoading) {
        mCustomClipLoading = paramCustomClipLoading;
    }

    public void handleMessage(Message paramMessage) {

        int j;
        int k;
        if (paramMessage.what == 291) {
            int i = mCustomClipLoading.b.getLevel();
            if (mCustomClipLoading.b.getLevel() >= 10000) {
                i = 0;
            }
            i += 100;
            mCustomClipLoading.b.setLevel(i);
        }
    }
}
