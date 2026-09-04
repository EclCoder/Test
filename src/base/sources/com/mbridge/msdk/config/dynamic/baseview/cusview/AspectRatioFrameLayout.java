package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f29230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f29231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29232c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f29233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f29234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f29235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f29236d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f29233a = f10;
            this.f29234b = f11;
            this.f29235c = z10;
            if (this.f29236d) {
                return;
            }
            this.f29236d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29236d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f29232c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f29231b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f29231b / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f29230a.a(this.f29231b, f14, false);
            return;
        }
        int i12 = this.f29232c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f29231b;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f29231b;
                    } else {
                        f11 = this.f29231b;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f29231b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f29231b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f29231b;
            measuredWidth = (int) (f13 * f10);
        }
        this.f29230a.a(this.f29231b, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f29231b != f10) {
            this.f29231b = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        int i11 = this.f29232c;
        int i12 = 1;
        if (i10 == 1) {
            i12 = 0;
        } else if (i10 == 2) {
            i12 = 3;
        } else if (i10 == 3) {
            i12 = 4;
        } else if (i10 != 4) {
            i12 = i10 != 5 ? i11 : 2;
        }
        if (i11 != i12) {
            this.f29232c = i12;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29232c = 0;
        this.f29230a = new c();
    }

    public void setAspectRatioListener(b bVar) {
    }
}
