package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Mg {
    public static final void a(Jg priority, Function1 block) {
        kotlin.jvm.internal.s.h(priority, "priority");
        kotlin.jvm.internal.s.h(block, "block");
        int iOrdinal = priority.ordinal();
        if (iOrdinal == 0) {
            em.k.d(H9.f24931d, null, null, new Kg(block, null), 3, null);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            em.k.d(H9.f24930c, null, null, new Lg(block, null), 3, null);
        }
    }
}
