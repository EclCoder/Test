package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiNative;

/* JADX INFO: renamed from: com.inmobi.media.ld, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3119ld implements Io {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sg f26939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2839ah f26940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pc f26941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Oc f26942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3068je f26943e;

    public C3119ld(InMobiNative inMobiNative, Context context, long j10) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        kotlin.jvm.internal.s.h(context, "context");
        Sg sg2 = new Sg();
        sg2.f25691a = j10;
        this.f26939a = sg2;
        C3093kd c3093kd = new C3093kd(this);
        C2839ah c2839ah = new C2839ah();
        this.f26940b = c2839ah;
        Pc pc2 = new Pc(inMobiNative, c2839ah, c3093kd);
        this.f26941c = pc2;
        this.f26942d = new Oc(context, sg2, pc2);
    }

    @Override // com.inmobi.media.Io
    public final String a(double d10) {
        return this.f26942d.a(d10);
    }

    @Override // com.inmobi.media.Io
    public final String a(int i10, double d10) {
        return this.f26942d.a(i10, d10);
    }
}
