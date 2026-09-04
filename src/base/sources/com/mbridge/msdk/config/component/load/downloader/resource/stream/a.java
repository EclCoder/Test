package com.mbridge.msdk.config.component.load.downloader.resource.stream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface a {
    void close();

    void flushAndSync();

    void seek(long j10);

    void write(byte[] bArr, int i10, int i11);
}
