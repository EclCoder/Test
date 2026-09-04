package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.z1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3468z1 extends X9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f27968h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3468z1(String str, int i10, String trace) {
        super("AppExitReasonReporting", "AppExitReasonEvent", AbstractC3488zl.a("reason - " + i10 + " description - " + (str == null ? "ApplicationExit" : str), trace));
        kotlin.jvm.internal.s.h(trace, "trace");
        this.f27967g = i10;
        this.f27968h = trace;
    }
}
