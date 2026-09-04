package com.inmobi.media;

import android.graphics.Rect;

/* JADX INFO: renamed from: com.inmobi.media.bo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2872bo implements InterfaceC2975fo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2846ao f26279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3280rj f26280b;

    public C2872bo(C2846ao visibilityConfig, C3280rj simpleViewHolder) {
        kotlin.jvm.internal.s.h(visibilityConfig, "visibilityConfig");
        kotlin.jvm.internal.s.h(simpleViewHolder, "simpleViewHolder");
        this.f26279a = visibilityConfig;
        this.f26280b = simpleViewHolder;
    }

    @Override // com.inmobi.media.InterfaceC2975fo
    public final EnumC2949eo a() {
        C3111l5 c3111l5 = this.f26280b.f27403a;
        Rect rect = new Rect();
        if (!c3111l5.getGlobalVisibleRect(rect)) {
            return EnumC2949eo.HIDDEN;
        }
        C2846ao c2846ao = this.f26279a;
        return (AbstractC3156mo.a(c3111l5, rect, c2846ao.f26234a, c2846ao.f26235b) && AbstractC3156mo.a(c3111l5, rect, this.f26279a.f26234a, this.f26280b.f27404b)) ? EnumC2949eo.VISIBLE : EnumC2949eo.HIDDEN;
    }
}
