package com.inmobi.media;

import android.os.Build;
import com.inmobi.media.C3411wk;
import com.inmobi.media.J2;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.wk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3411wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TelemetryConfig f27804a;

    public C3411wk(TelemetryConfig telemetryConfig) {
        kotlin.jvm.internal.s.h(telemetryConfig, "telemetryConfig");
        this.f27804a = telemetryConfig;
        ((Fc) Xi.f26025e.getValue()).a(new int[]{150, 152}, new Function1() { // from class: yh.nc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3411wk.a(this.f57859a, (J2) obj);
            }
        });
    }

    public static final fl.g0 a(C3411wk c3411wk, J2 it) {
        kotlin.jvm.internal.s.h(it, "it");
        switch (it.f25043a) {
            case 150:
                Map map = it.f25045c;
                Object obj = map != null ? map.get(DataSchemeDataSource.SCHEME_DATA) : null;
                c3411wk.a("CrashEventOccurred", obj instanceof X4 ? (X4) obj : null);
                break;
            case 151:
                Map map2 = it.f25045c;
                Object obj2 = map2 != null ? map2.get(DataSchemeDataSource.SCHEME_DATA) : null;
                C3208oo c3208oo = obj2 instanceof C3208oo ? (C3208oo) obj2 : null;
                c3411wk.getClass();
                if (c3208oo != null && AbstractC3488zl.a(c3208oo)) {
                    B5.f24500a.getClass();
                    if (!B5.t()) {
                        c3411wk.a("MainThreadBlockedEvent", c3208oo);
                    }
                }
                break;
            case 152:
                Map map3 = it.f25045c;
                Object obj3 = map3 != null ? map3.get(DataSchemeDataSource.SCHEME_DATA) : null;
                c3411wk.a(obj3 instanceof C3468z1 ? (C3468z1) obj3 : null);
                break;
        }
        return fl.g0.f38750a;
    }

    public final void a(C3468z1 c3468z1) {
        if (Build.VERSION.SDK_INT < 30 || c3468z1 == null || c3468z1.f27967g != 6) {
            return;
        }
        a("ANREvent", c3468z1);
    }

    public final void a(String str, X9 x10) {
        if (this.f27804a.getPriorityEventsList().contains(str) && x10 != null && AbstractC3488zl.a(x10)) {
            C3178nk.b(str, new LinkedHashMap(), EnumC3281rk.SDK);
        }
    }
}
