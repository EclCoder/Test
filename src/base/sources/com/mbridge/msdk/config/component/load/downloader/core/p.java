package com.mbridge.msdk.config.component.load.downloader.core;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface p {
    p a(int i10);

    p a(com.mbridge.msdk.config.component.load.downloader.f fVar);

    d build();

    p withHttpRetryCounter(int i10);

    p withTimeout(long j10);
}
