package com.mbridge.msdk.playercommon.exoplayer2.offline;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface Downloader {
    void cancel();

    void download();

    float getDownloadPercentage();

    long getDownloadedBytes();

    void remove();
}
