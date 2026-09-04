package com.inmobi.media;

import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class T5 extends Lo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout.LayoutParams f25730a;

    public T5(RelativeLayout.LayoutParams layoutParams) {
        this.f25730a = layoutParams;
    }

    @Override // com.inmobi.media.Lo
    public final void a(Lf orientation, No finalInsets) {
        kotlin.jvm.internal.s.h(orientation, "orientation");
        kotlin.jvm.internal.s.h(finalInsets, "finalInsets");
        J3.a(finalInsets, this.f25730a, orientation);
    }
}
