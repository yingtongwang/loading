# loading
ClipDrawable代表从其它位图上截取一个"图片片段",

![screenshot_2016-07-07-09-56-35](https://cloud.githubusercontent.com/assets/19581750/16640426/8d847c3e-442a-11e6-9406-8f10f94245ba.png)


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


