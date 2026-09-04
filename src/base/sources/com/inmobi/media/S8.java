package com.inmobi.media;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class S8 extends kotlin.properties.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T8 f25678a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S8(Lf lf2, T8 t10) {
        super(lf2);
        this.f25678a = t10;
    }

    @Override // kotlin.properties.b
    public final void afterChange(zl.k property, Object obj, Object obj2) {
        kotlin.jvm.internal.s.h(property, "property");
        Lf lf2 = (Lf) obj2;
        if (Mf.a((Lf) obj) == Mf.a(lf2)) {
            return;
        }
        Iterator it = this.f25678a.f25740b.iterator();
        while (it.hasNext()) {
            ((Of) it.next()).a(lf2);
        }
    }
}
