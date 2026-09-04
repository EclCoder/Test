package com.squareup.picasso;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);

    final int index;

    MemoryPolicy(int i10) {
        this.index = i10;
    }

    static boolean shouldReadFromMemoryCache(int i10) {
        return (i10 & NO_CACHE.index) == 0;
    }

    static boolean shouldWriteToMemoryCache(int i10) {
        return (i10 & NO_STORE.index) == 0;
    }
}
