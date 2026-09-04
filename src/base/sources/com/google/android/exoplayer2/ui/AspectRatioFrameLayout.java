package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f18389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f18390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18391c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f18392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f18393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f18394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18395d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f18392a = f10;
            this.f18393b = f11;
            this.f18394c = z10;
            if (this.f18395d) {
                return;
            }
            this.f18395d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18395d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18391c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, mb.s.f45515a, 0, 0);
            try {
                this.f18391c = typedArrayObtainStyledAttributes.getInt(mb.s.f45517b, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f18389a = new c();
    }

    static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f18391c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f18390b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f18390b / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f18389a.a(this.f18390b, f14, false);
            return;
        }
        int i12 = this.f18391c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f18390b;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f18390b;
                    } else {
                        f11 = this.f18390b;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f18390b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f18390b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f18390b;
            measuredWidth = (int) (f13 * f10);
        }
        this.f18389a.a(this.f18390b, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f18390b != f10) {
            this.f18390b = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        if (this.f18391c != i10) {
            this.f18391c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }
}
