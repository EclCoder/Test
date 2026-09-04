package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Oc implements Ah, Tk, Io {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3348u9 f25413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ic f25414b;

    public Oc(Context context, Sg pubSettings, Pc nativeCallbacks) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(pubSettings, "pubSettings");
        kotlin.jvm.internal.s.h(nativeCallbacks, "nativeCallbacks");
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h("native", "logType");
        kotlin.jvm.internal.s.h("native", "adType");
        kotlin.jvm.internal.s.h(pubSettings, "pubSettings");
        Ib ib2 = Sh.f25698a;
        this.f25413a = Sh.a("native", pubSettings.f25697g);
        this.f25414b = new Ic(new C3185o1(context, this, new C3211p1(this, pubSettings)), nativeCallbacks);
    }

    @Override // com.inmobi.media.Io
    public final String a(int i10, double d10) {
        return this.f25414b.a(i10, d10);
    }

    @Override // com.inmobi.media.Tk
    public final void d() {
        this.f25414b.d();
    }

    @Override // com.inmobi.media.Io
    public final String a(double d10) {
        return this.f25414b.a(d10);
    }

    @Override // com.inmobi.media.Ah
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        kotlin.jvm.internal.s.h(inMobiNativeViewData, "inMobiNativeViewData");
        this.f25414b.a(inMobiNativeViewData);
    }
}
