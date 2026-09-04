package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import com.inmobi.media.W;
import com.inmobi.media.Z;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3185o1 f26102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f26103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3211p1 f26104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdConfig f26105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3121lf f26106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Gk f26107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26108g;

    public Z(C3185o1 adManagerComponent, C3377vc mediationSpecificConfig) {
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(mediationSpecificConfig, "mediationSpecificConfig");
        this.f26102a = adManagerComponent;
        this.f26103b = new X(adManagerComponent.f27106d, adManagerComponent.f27108f);
        C3211p1 c3211p1 = adManagerComponent.f27103a;
        this.f26104c = c3211p1;
        AdConfig adConfig = c3211p1.f27160b;
        this.f26105d = adConfig;
        this.f26106e = new C3173nf(adManagerComponent.f27104b, adManagerComponent.f27105c).a();
        Integer num = mediationSpecificConfig.f27715d;
        long jIntValue = num != null ? num.intValue() : 15000;
        Integer num2 = mediationSpecificConfig.f27715d;
        long jIntValue2 = num2 != null ? num2.intValue() : 15000;
        Integer num3 = mediationSpecificConfig.f27715d;
        this.f26107f = new Gk(jIntValue, jIntValue2, num3 != null ? num3.intValue() : 15000);
        this.f26108g = adConfig.getApplyGzipReq();
    }

    public final Object a(T6 t10) {
        C3348u9 c3348u9 = this.f26102a.f27105c;
        if (c3348u9 != null) {
            c3348u9.a("AdFetchManager", "fetchAd Called");
        }
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        Sg sg2 = this.f26104c.f27159a;
        Map map = sg2.f25693c;
        long j10 = sg2.f25691a;
        Context context = this.f26102a.f27104b;
        kotlin.jvm.internal.s.h(context, "context");
        String str = context instanceof Activity ? "activity" : "others";
        this.f26104c.getClass();
        return new C3260qo(new C3210p0(this.f26105d.getUrl(), new Rk(this.f26105d.getIncludeIds()), new C3158n0(string, map, j10, str, "native", gl.l0.h(), this.f26104c.f27159a.f25692b, this.f26105d.getRendering().getEnablePubMuteControl() && Xi.f26026f), this.f26107f, this.f26106e, this.f26102a.f27105c, this.f26108g).a(), this.f26102a.f27105c).a(new Function1() { // from class: yh.q6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Z.a(this.f57891a, (W) obj);
            }
        }, t10);
    }

    public static final fl.g0 a(Z z10, W adFetchEvent) {
        kotlin.jvm.internal.s.h(adFetchEvent, "adFetchEvent");
        C3348u9 c3348u9 = z10.f26102a.f27105c;
        if (c3348u9 != null) {
            c3348u9.a("AdFetchManager", "adFetchEvent " + adFetchEvent);
        }
        z10.f26103b.a(adFetchEvent);
        return fl.g0.f38750a;
    }
}
