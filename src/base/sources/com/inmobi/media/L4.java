package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class L4 implements InterfaceC3395w4 {
    @Override // com.inmobi.media.InterfaceC3395w4
    public final void a(Config config) {
        kotlin.jvm.internal.s.h(config, "config");
        synchronized (this) {
            try {
                O4 o10 = O4.f25393a;
                kotlin.jvm.internal.s.g("O4", "access$getTAG$p(...)");
                O4 o11 = O4.f25393a;
                C3136m4 c3136m4 = AbstractC2878c4.f26300a;
                kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
                C3136m4 c3136m5 = AbstractC2878c4.f26300a;
                O4.f25397e = AbstractC2854b6.a(((SignalsConfig) c3136m5.a(SignalsConfig.class)).getKA());
                Context context = Xi.f26021a;
                if (context != null) {
                    kotlin.jvm.internal.s.g("O4", "TAG");
                    ConcurrentHashMap concurrentHashMap = La.f25197b;
                    La laA = Ka.a(context, "c_data_store");
                    Context context2 = Xi.f26021a;
                    int i10 = 1;
                    if (context2 != null) {
                        La laA2 = Ka.a(context2, "c_data_store");
                        String key = KPtaxpyICj.fVRmpjcyReQQhH;
                        kotlin.jvm.internal.s.h(key, "key");
                        i10 = laA2.f25198a.getInt(key, 1);
                    }
                    kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
                    if (((SignalsConfig) c3136m5.a(SignalsConfig.class)).getVAK() != i10) {
                        kotlin.jvm.internal.s.g("O4", "TAG");
                        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
                        laA.a("akv", ((SignalsConfig) c3136m5.a(SignalsConfig.class)).getVAK(), false);
                        o11.f();
                    }
                }
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
