package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class SampleImpl implements Sample {
    private ByteBuffer[] data;
    private final long offset;
    private final Container parent;
    private final long size;

    public SampleImpl(ByteBuffer byteBuffer) {
        this.offset = -1L;
        this.size = byteBuffer.limit();
        this.data = new ByteBuffer[]{byteBuffer};
        this.parent = null;
    }

    @Override // com.googlecode.mp4parser.authoring.Sample
    public ByteBuffer asByteBuffer() {
        ensureData();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[CastUtils.l2i(this.size)]);
        for (ByteBuffer byteBuffer : this.data) {
            byteBufferWrap.put(byteBuffer.duplicate());
        }
        byteBufferWrap.rewind();
        return byteBufferWrap;
    }

    protected void ensureData() {
        if (this.data != null) {
            return;
        }
        Container container = this.parent;
        if (container == null) {
            throw new RuntimeException("Missing parent container, can't read sample " + this);
        }
        try {
            this.data = new ByteBuffer[]{container.getByteBuffer(this.offset, this.size)};
        } catch (IOException e10) {
            throw new RuntimeException("couldn't read sample " + this, e10);
        }
    }

    @Override // com.googlecode.mp4parser.authoring.Sample
    public long getSize() {
        return this.size;
    }

    public String toString() {
        return "SampleImpl{offset=" + this.offset + "{size=" + this.size + '}';
    }

    @Override // com.googlecode.mp4parser.authoring.Sample
    public void writeTo(WritableByteChannel writableByteChannel) throws IOException {
        ensureData();
        for (ByteBuffer byteBuffer : this.data) {
            writableByteChannel.write(byteBuffer.duplicate());
        }
    }

    public SampleImpl(ByteBuffer[] byteBufferArr) {
        this.offset = -1L;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            iRemaining += byteBuffer.remaining();
        }
        this.size = iRemaining;
        this.data = byteBufferArr;
        this.parent = null;
    }

    public SampleImpl(long j10, long j11, ByteBuffer byteBuffer) {
        this.offset = j10;
        this.size = j11;
        this.data = new ByteBuffer[]{byteBuffer};
        this.parent = null;
    }

    public SampleImpl(long j10, long j11, Container container) {
        this.offset = j10;
        this.size = j11;
        this.data = null;
        this.parent = container;
    }
}
