package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    public static Callable b(final Object obj) {
        return new Callable() { // from class: com.google.common.util.concurrent.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return l.a(obj);
            }
        };
    }

    public static /* synthetic */ Object a(Object obj) {
        return obj;
    }
}
