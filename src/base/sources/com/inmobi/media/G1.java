package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class G1 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f24828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public If f24833f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(Context context) {
        super(context, null);
        kotlin.jvm.internal.s.h(context, "context");
        this.f24829b = -1;
        this.f24830c = -1;
        this.f24831d = -1;
        this.f24832e = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i10 == this.f24829b && i11 == this.f24830c && i14 == this.f24831d && i15 == this.f24832e) {
            return;
        }
        this.f24829b = i10;
        this.f24830c = i11;
        this.f24831d = i14;
        this.f24832e = i15;
        If r10 = this.f24833f;
        if (r10 != null) {
            R7 r11 = ((F7) r10).f24758a;
            VideoViewPosition videoViewPosition = new VideoViewPosition();
            videoViewPosition.setX(J3.a(i10));
            videoViewPosition.setY(J3.a(i11));
            videoViewPosition.setWidth(J3.a(i14));
            videoViewPosition.setHeight(J3.a(i15));
            r11.a(new C3192o8(videoViewPosition));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float f10 = this.f24828a;
        if (f10 > 0.0f) {
            float f11 = size;
            float f12 = size2;
            if (f11 / f12 > f10) {
                size = (int) (f12 * f10);
            } else {
                size2 = (int) (f11 / f10);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void setOnPositionChangeListener(If r10) {
        this.f24833f = r10;
    }
}
