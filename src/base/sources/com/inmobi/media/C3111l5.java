package com.inmobi.media;

import android.content.Context;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: renamed from: com.inmobi.media.l5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3111l5 extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3111l5(Context context) {
        super(context);
        kotlin.jvm.internal.s.h(context, "context");
        this.f26924a = 1.0f;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size != 0 && size2 != 0) {
            float f10 = this.f26924a;
            if (f10 > 0.0f) {
                int i12 = (int) (size / f10);
                if (i12 <= size2) {
                    setMeasuredDimension(size, i12);
                    return;
                } else {
                    setMeasuredDimension((int) (size2 * f10), size2);
                    return;
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    public final void setAspectRatio(float f10) {
        if (this.f26924a <= 0.0f) {
            return;
        }
        this.f26924a = f10;
        requestLayout();
    }
}
