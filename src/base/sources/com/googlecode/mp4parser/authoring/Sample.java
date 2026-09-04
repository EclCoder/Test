package com.googlecode.mp4parser.authoring;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface Sample {
    ByteBuffer asByteBuffer();

    long getSize();

    void writeTo(WritableByteChannel writableByteChannel);
}
