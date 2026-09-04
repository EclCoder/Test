package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Jn implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gm.s f25090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f25091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25092c;

    public Jn(gm.s sVar, View view, ViewGroup viewGroup) {
        this.f25090a = sVar;
        this.f25091b = view;
        this.f25092c = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v10) {
        kotlin.jvm.internal.s.h(v10, "v");
        this.f25090a.e(Boolean.valueOf(Mn.a(this.f25091b, this.f25092c)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v10) {
        kotlin.jvm.internal.s.h(v10, "v");
        this.f25090a.e(Boolean.FALSE);
    }
}
