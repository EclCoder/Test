package com.googlecode.mp4parser;

import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MemoryDataSourceImpl implements DataSource {
    ByteBuffer data;

    public MemoryDataSourceImpl(byte[] bArr) {
        this.data = ByteBuffer.wrap(bArr);
    }

    @Override // com.googlecode.mp4parser.DataSource
    public ByteBuffer map(long j10, long j11) {
        int iPosition = this.data.position();
        this.data.position(CastUtils.l2i(j10));
        ByteBuffer byteBufferSlice = this.data.slice();
        byteBufferSlice.limit(CastUtils.l2i(j11));
        this.data.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long position() {
        return this.data.position();
    }

    @Override // com.googlecode.mp4parser.DataSource
    public int read(ByteBuffer byteBuffer) {
        if (this.data.remaining() == 0 && byteBuffer.remaining() != 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.data.remaining());
        if (byteBuffer.hasArray()) {
            byteBuffer.put(this.data.array(), this.data.position(), iMin);
            ByteBuffer byteBuffer2 = this.data;
            byteBuffer2.position(byteBuffer2.position() + iMin);
            return iMin;
        }
        byte[] bArr = new byte[iMin];
        this.data.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long size() {
        return this.data.capacity();
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long transferTo(long j10, long j11, WritableByteChannel writableByteChannel) {
        return writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.data.position(CastUtils.l2i(j10))).slice().limit(CastUtils.l2i(j11)));
    }

    @Override // com.googlecode.mp4parser.DataSource
    public void position(long j10) {
        this.data.position(CastUtils.l2i(j10));
    }

    public MemoryDataSourceImpl(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    @Override // com.googlecode.mp4parser.DataSource, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
