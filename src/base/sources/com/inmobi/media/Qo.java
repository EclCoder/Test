package com.inmobi.media;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Qo implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gm.s f25575a;

    public Qo(gm.s sVar) {
        this.f25575a = sVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v10) {
        kotlin.jvm.internal.s.h(v10, "v");
        this.f25575a.e(Boolean.TRUE);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v10) {
        kotlin.jvm.internal.s.h(v10, "v");
        this.f25575a.e(Boolean.FALSE);
    }
}
