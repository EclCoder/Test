package com.googlecode.mp4parser;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface DataSource extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    ByteBuffer map(long j10, long j11);

    long position();

    void position(long j10);

    int read(ByteBuffer byteBuffer);

    long size();

    long transferTo(long j10, long j11, WritableByteChannel writableByteChannel);
}
