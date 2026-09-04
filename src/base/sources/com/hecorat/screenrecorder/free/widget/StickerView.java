package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class StickerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f23716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f23717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f23718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ImageView f23719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f23720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f23721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f23722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f23723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f23724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f23727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private double f23728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected c f23729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final View.OnTouchListener f23730o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int i10;
            if (view.getTag().equals("draggableViewGroup")) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    StickerView.this.f23722g = motionEvent.getRawX();
                    StickerView.this.f23723h = motionEvent.getRawY();
                } else if (action == 1) {
                    StickerView stickerView = StickerView.this;
                    c cVar = stickerView.f23729n;
                    if (cVar != null) {
                        cVar.j(stickerView);
                    }
                } else if (action == 2) {
                    float rawX = motionEvent.getRawX() - StickerView.this.f23722g;
                    float rawY = motionEvent.getRawY() - StickerView.this.f23723h;
                    StickerView stickerView2 = StickerView.this;
                    stickerView2.setX(stickerView2.getX() + rawX);
                    StickerView stickerView3 = StickerView.this;
                    stickerView3.setY(stickerView3.getY() + rawY);
                    StickerView.this.f23722g = motionEvent.getRawX();
                    StickerView.this.f23723h = motionEvent.getRawY();
                }
            } else if (view.getTag().equals("ivScale")) {
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    StickerView.this.f23720e = motionEvent.getRawX();
                    StickerView.this.f23721f = motionEvent.getRawY();
                    StickerView stickerView4 = StickerView.this;
                    stickerView4.f23727l = stickerView4.getX() + ((View) StickerView.this.getParent()).getX() + (StickerView.this.getWidth() / 2.0f);
                    int iM = nh.b.m(StickerView.this.getContext());
                    StickerView stickerView5 = StickerView.this;
                    stickerView5.f23728m = stickerView5.getY() + ((View) StickerView.this.getParent()).getY() + iM + (StickerView.this.getHeight() / 2.0f);
                } else if (action2 == 2) {
                    double dAbs = (Math.abs(Math.atan2(motionEvent.getRawY() - StickerView.this.f23721f, motionEvent.getRawX() - StickerView.this.f23720e) - Math.atan2(((double) StickerView.this.f23721f) - StickerView.this.f23728m, ((double) StickerView.this.f23720e) - StickerView.this.f23727l)) * 180.0d) / 3.141592653589793d;
                    StickerView stickerView6 = StickerView.this;
                    double dR = stickerView6.r(stickerView6.f23727l, StickerView.this.f23728m, StickerView.this.f23720e, StickerView.this.f23721f);
                    StickerView stickerView7 = StickerView.this;
                    double dR2 = stickerView7.r(stickerView7.f23727l, StickerView.this.f23728m, motionEvent.getRawX(), motionEvent.getRawY());
                    int iQ = StickerView.q(80.0f, StickerView.this.getContext());
                    if (dR2 > dR && (dAbs < 25.0d || Math.abs(dAbs - 180.0d) < 25.0d)) {
                        double dRound = Math.round(Math.max(Math.abs(motionEvent.getRawX() - StickerView.this.f23720e), Math.abs(motionEvent.getRawY() - StickerView.this.f23721f)));
                        StickerView.this.getLayoutParams().width += (int) (dRound / ((double) StickerView.this.f23724i));
                        ViewGroup.LayoutParams layoutParams = StickerView.this.getLayoutParams();
                        layoutParams.height = (int) (((double) layoutParams.height) + dRound);
                        StickerView.this.u(true);
                    } else if (dR2 < dR && ((dAbs < 25.0d || Math.abs(dAbs - 180.0d) < 25.0d) && StickerView.this.getLayoutParams().width > (i10 = iQ / 2) && StickerView.this.getLayoutParams().height > i10)) {
                        double dRound2 = Math.round(Math.max(Math.abs(motionEvent.getRawX() - StickerView.this.f23720e), Math.abs(motionEvent.getRawY() - StickerView.this.f23721f)));
                        StickerView.this.getLayoutParams().width -= (int) (dRound2 / ((double) StickerView.this.f23724i));
                        ViewGroup.LayoutParams layoutParams2 = StickerView.this.getLayoutParams();
                        layoutParams2.height = (int) (((double) layoutParams2.height) - dRound2);
                        StickerView.this.u(false);
                    }
                    StickerView.this.setRotation(((float) ((Math.atan2(((double) motionEvent.getRawY()) - StickerView.this.f23728m, ((double) motionEvent.getRawX()) - StickerView.this.f23727l) * 180.0d) / 3.141592653589793d)) - 45.0f);
                    StickerView.this.t();
                    StickerView.this.f23720e = motionEvent.getRawX();
                    StickerView.this.f23721f = motionEvent.getRawY();
                    StickerView.this.postInvalidate();
                    StickerView.this.requestLayout();
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b extends View {
        public b(Context context) {
            super(context);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            Rect rect = new Rect();
            rect.left = getLeft() - layoutParams.leftMargin;
            rect.top = getTop() - layoutParams.topMargin;
            rect.right = getRight() - layoutParams.rightMargin;
            rect.bottom = getBottom() - layoutParams.bottomMargin;
            Paint paint = new Paint();
            paint.setStrokeWidth(6.0f);
            paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawRect(rect, paint);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void e(StickerView stickerView);

        void j(StickerView stickerView);

        void u(StickerView stickerView);
    }

    public StickerView(Context context, float f10) {
        super(context);
        this.f23720e = -1.0f;
        this.f23721f = -1.0f;
        this.f23722g = -1.0f;
        this.f23723h = -1.0f;
        this.f23730o = new a();
        s(context, f10);
    }

    public static /* synthetic */ void a(StickerView stickerView, View view) {
        c cVar = stickerView.f23729n;
        if (cVar != null) {
            cVar.e(stickerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(float f10, Context context) {
        return (int) (f10 * (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double r(double d10, double d11, double d12, double d13) {
        return Math.sqrt(Math.pow(d13 - d11, 2.0d) + Math.pow(d12 - d10, 2.0d));
    }

    private void s(Context context, float f10) {
        int i10;
        this.f23724i = f10;
        this.f23716a = new b(context);
        this.f23717b = new ImageView(context);
        this.f23718c = new ImageView(context);
        this.f23719d = new ImageView(context);
        this.f23717b.setImageResource(R.drawable.ic_rotate);
        this.f23718c.setImageResource(R.drawable.ic_close_circle);
        setTag("draggableViewGroup");
        this.f23716a.setTag("borderView");
        this.f23717b.setTag("ivScale");
        this.f23718c.setTag("ivClose");
        this.f23719d.setTag("ivTopLeft");
        int iQ = q(30.0f, getContext()) / 2;
        int iQ2 = q(80.0f, getContext());
        if (f10 > 1.0f) {
            i10 = (int) (iQ2 * f10);
        } else {
            iQ2 = (int) (iQ2 / f10);
            i10 = iQ2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iQ2, i10);
        layoutParams.gravity = 17;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.setMargins(iQ, iQ, iQ, iQ);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.setMargins(iQ, iQ, iQ, iQ);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(q(30.0f, getContext()), q(30.0f, getContext()));
        layoutParams4.gravity = 85;
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(q(30.0f, getContext()), q(30.0f, getContext()));
        layoutParams5.gravity = 53;
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(q(30.0f, getContext()), q(30.0f, getContext()));
        layoutParams6.gravity = 51;
        setLayoutParams(layoutParams);
        addView(getMainView(), layoutParams2);
        addView(this.f23716a, layoutParams3);
        addView(this.f23717b, layoutParams4);
        addView(this.f23718c, layoutParams5);
        addView(this.f23719d, layoutParams6);
        setOnTouchListener(this.f23730o);
        this.f23717b.setOnTouchListener(this.f23730o);
        this.f23718c.setOnClickListener(new View.OnClickListener() { // from class: com.hecorat.screenrecorder.free.widget.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StickerView.a(this.f23787a, view);
            }
        });
    }

    public Bitmap getBitmap() {
        return null;
    }

    public int getEndTime() {
        return this.f23726k;
    }

    protected View getImageViewFlip() {
        return this.f23719d;
    }

    protected abstract View getMainView();

    public int[] getOffset() {
        return new int[]{this.f23717b.getMeasuredWidth() / 2, this.f23717b.getMeasuredHeight() / 2};
    }

    public int getStartTime() {
        return this.f23725j;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setControlItemsHidden(boolean z10) {
        if (z10) {
            this.f23716a.setVisibility(4);
            this.f23717b.setVisibility(4);
            this.f23718c.setVisibility(4);
            this.f23719d.setVisibility(4);
            return;
        }
        this.f23716a.setVisibility(0);
        this.f23717b.setVisibility(0);
        this.f23718c.setVisibility(0);
        this.f23719d.setVisibility(0);
    }

    public void setControlsGone(boolean z10) {
        if (z10) {
            this.f23716a.setVisibility(8);
            this.f23718c.setVisibility(8);
            this.f23719d.setVisibility(8);
            this.f23717b.setVisibility(8);
            return;
        }
        this.f23716a.setVisibility(0);
        this.f23718c.setVisibility(0);
        this.f23719d.setVisibility(0);
        this.f23717b.setVisibility(0);
    }

    public void setEndTime(int i10) {
        this.f23726k = i10;
    }

    public void setListener(c cVar) {
        this.f23729n = cVar;
    }

    public void setStartTime(int i10) {
        this.f23725j = i10;
    }

    public StickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23720e = -1.0f;
        this.f23721f = -1.0f;
        this.f23722g = -1.0f;
        this.f23723h = -1.0f;
        this.f23730o = new a();
        s(context, 1.0f);
    }

    protected void t() {
    }

    protected void u(boolean z10) {
    }
}
