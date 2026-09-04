package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b<K, V> {
    public long a() {
        g gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarF == null) {
            gVarF = h.b().a();
        }
        return gVarF.b0() * 1000;
    }

    public abstract V a(K k10, int i10);

    public abstract void a(K k10, V v10);

    public abstract void a(K k10, V v10, String str);

    public abstract void a(String str, Campaign campaign, String str2);

    public V b(K k10, int i10) {
        return null;
    }

    public long b() {
        g gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarF == null) {
            gVarF = h.b().a();
        }
        return gVarF.c0() * 1000;
    }
}
