package com.mp4parser.iso14496.part12;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class HintSampleEntry extends AbstractSampleEntry {
    protected byte[] data;

    public HintSampleEntry(String str) {
        super(str);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.position(6);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.dataReferenceIndex);
        byteBufferAllocate.rewind();
        writableByteChannel.write(byteBufferAllocate);
        writableByteChannel.write(ByteBuffer.wrap(this.data));
    }

    public byte[] getData() {
        return this.data;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
        long length = this.data.length + 8;
        return length + ((long) ((this.largeBox || 8 + length >= 4294967296L) ? 16 : 8));
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j10, BoxParser boxParser) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        dataSource.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBufferAllocate);
        byte[] bArr = new byte[CastUtils.l2i(j10 - 8)];
        this.data = bArr;
        dataSource.read(ByteBuffer.wrap(bArr));
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }
}
