package com.google.api.client.util;

import sc.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Joiner {
    private final i wrapped;

    private Joiner(i iVar) {
        this.wrapped = iVar;
    }

    public static Joiner on(char c10) {
        return new Joiner(i.f(c10));
    }

    public final String join(Iterable<?> iterable) {
        return this.wrapped.d(iterable);
    }
}
