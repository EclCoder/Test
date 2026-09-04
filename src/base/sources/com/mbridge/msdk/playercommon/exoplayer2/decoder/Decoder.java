package com.mbridge.msdk.playercommon.exoplayer2.decoder;

import java.lang.Exception;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface Decoder<I, O, E extends Exception> {
    I dequeueInputBuffer();

    O dequeueOutputBuffer();

    void flush();

    String getName();

    void queueInputBuffer(I i10);

    void release();
}
