package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zaq {
    ExecutorService zaa(ThreadFactory threadFactory, int i10);

    ExecutorService zab(int i10, int i11);

    ExecutorService zac(int i10, ThreadFactory threadFactory, int i11);
}
