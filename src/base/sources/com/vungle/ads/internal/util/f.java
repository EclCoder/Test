package com.vungle.ads.internal.util;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public static final f INSTANCE = new f();

    private f() {
    }

    public static final synchronized void addToSet(HashSet<String> hashset, String set) {
        kotlin.jvm.internal.s.h(hashset, "hashset");
        kotlin.jvm.internal.s.h(set, "set");
        hashset.add(set);
    }

    public static final synchronized HashSet<String> getNewHashSet(HashSet<String> hashSet) {
        return new HashSet<>(hashSet);
    }
}
