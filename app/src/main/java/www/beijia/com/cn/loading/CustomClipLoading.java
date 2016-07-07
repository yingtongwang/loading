package www.beijia.com.cn.loading;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.util.Timer;

/**
 * Created by Wangyingbao on 2016/6/28.
 */
public class CustomClipLoading extends FrameLayout {
    public static final int a = 10000;
    public ClipDrawable b;
    public Timer c;
    private boolean d = true;
    public Handler mCustomHandler = new CustomHandler(this);

    public CustomClipLoading(Context paramContext) {
        this(paramContext, null, 0);
    }

    public CustomClipLoading(Context paramContext, AttributeSet paramAttributeSet) {
        this(paramContext, paramAttributeSet, 0);
    }

    public CustomClipLoading(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
        super(paramContext, paramAttributeSet, paramInt);
        a(paramContext);
    }

    public void a() {
        this.d = true;
        if (this.c == null) {
            this.c = new Timer();
            this.c.schedule(new CustomTimerTask(this), 0L, 15L);
        }

    }

    public void a(Context paramContext) {
        addView(LayoutInflater.from(paramContext).inflate(R.layout.custom_loading, null));
        this.b = ((ClipDrawable) ((ImageView) findViewById(R.id.iv_progress)).getDrawable());
    }

    public void b() {
        if (this.c != null) {
            this.c.cancel();

        }

    }
}
