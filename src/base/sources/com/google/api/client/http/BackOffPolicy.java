package com.google.api.client.http;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface BackOffPolicy {
    public static final long STOP = -1;

    long getNextBackOffMillis();

    boolean isBackOffRequired(int i10);

    void reset();
}
