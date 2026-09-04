package com.inmobi.media;

import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class M6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2 f25249a;

    public M6(String b64feature) {
        kotlin.jvm.internal.s.h(b64feature, "b64feature");
        E2 e10 = new E2();
        this.f25249a = e10;
        e10.a(b64feature);
    }

    public final boolean a(boolean z10) {
        BitSet bitSet = this.f25249a.f24690a;
        return bitSet != null ? bitSet.get(0) : z10;
    }
}
