package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum j {
    OPEN(false),
    CLOSED(true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f21772a;

    j(boolean z10) {
        this.f21772a = z10;
    }

    static j e(boolean z10) {
        return z10 ? CLOSED : OPEN;
    }
}
