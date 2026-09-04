package com.facebook.ads;

import java.util.EnumSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum CacheFlag {
    NONE,
    ICON,
    IMAGE,
    VIDEO;

    public static final EnumSet<CacheFlag> ALL = EnumSet.allOf(CacheFlag.class);
}
