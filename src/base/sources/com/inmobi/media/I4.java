package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class I4 implements InterfaceC3395w4 {
    @Override // com.inmobi.media.InterfaceC3395w4
    public final void a(Config config) {
        kotlin.jvm.internal.s.h(config, "config");
        synchronized (this) {
            try {
                O4 o10 = O4.f25393a;
                kotlin.jvm.internal.s.g("O4", "access$getTAG$p(...)");
                O4 o11 = O4.f25393a;
                String str = O4.f25398f;
                List<String> skipFields = O4.c().getContextualData().getSkipFields();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(P4.f25453j);
                arrayList.removeAll(skipFields);
                String strL0 = gl.r.l0(arrayList, ",", null, null, 0, null, null, 62, null);
                O4.f25398f = strL0;
                if (!kotlin.jvm.internal.s.c(strL0, str)) {
                    o11.f();
                }
                O4.a();
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
