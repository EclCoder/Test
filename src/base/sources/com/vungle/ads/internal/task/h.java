package com.vungle.ads.internal.task;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class h implements com.vungle.ads.internal.executor.i.b {
    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        s.h(other, "other");
        if (!(other instanceof h)) {
            return -1;
        }
        return s.i(((h) other).getPriority(), getPriority());
    }

    public abstract int getPriority();
}
