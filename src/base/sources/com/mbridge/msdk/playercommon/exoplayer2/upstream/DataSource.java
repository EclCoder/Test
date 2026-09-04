package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface DataSource {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface Factory {
        DataSource createDataSource();
    }

    void close();

    Uri getUri();

    long open(DataSpec dataSpec);

    int read(byte[] bArr, int i10, int i11);
}
