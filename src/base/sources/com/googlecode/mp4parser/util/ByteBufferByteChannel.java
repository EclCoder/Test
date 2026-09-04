package com.googlecode.mp4parser.util;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ByteBufferByteChannel implements ByteChannel {
    ByteBuffer byteBuffer;

    public ByteBufferByteChannel(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (this.byteBuffer.remaining() <= 0) {
            return -1;
        }
        byteBuffer.put((ByteBuffer) this.byteBuffer.duplicate().limit(this.byteBuffer.position() + byteBuffer.remaining()));
        ByteBuffer byteBuffer2 = this.byteBuffer;
        byteBuffer2.position(byteBuffer2.position() + iRemaining);
        return iRemaining;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        this.byteBuffer.put(byteBuffer);
        return iRemaining;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
