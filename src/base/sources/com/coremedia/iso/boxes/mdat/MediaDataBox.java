package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class MediaDataBox implements Box {
    public static final String TYPE = "mdat";
    private DataSource dataSource;
    private long offset;
    Container parent;
    private long size;

    private static void transfer(DataSource dataSource, long j10, long j11, WritableByteChannel writableByteChannel) {
        long jTransferTo = 0;
        while (jTransferTo < j11) {
            jTransferTo += dataSource.transferTo(j10 + jTransferTo, Math.min(67076096L, j11 - jTransferTo), writableByteChannel);
        }
    }

    @Override // com.coremedia.iso.boxes.Box
    public void getBox(WritableByteChannel writableByteChannel) {
        transfer(this.dataSource, this.offset, this.size, writableByteChannel);
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getOffset() {
        return this.offset;
    }

    @Override // com.coremedia.iso.boxes.Box
    public Container getParent() {
        return this.parent;
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getSize() {
        return this.size;
    }

    @Override // com.coremedia.iso.boxes.Box
    public String getType() {
        return TYPE;
    }

    @Override // com.coremedia.iso.boxes.Box
    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j10, BoxParser boxParser) {
        this.offset = dataSource.position() - ((long) byteBuffer.remaining());
        this.dataSource = dataSource;
        this.size = ((long) byteBuffer.remaining()) + j10;
        dataSource.position(dataSource.position() + j10);
    }

    @Override // com.coremedia.iso.boxes.Box
    public void setParent(Container container) {
        this.parent = container;
    }

    public String toString() {
        return "MediaDataBox{size=" + this.size + '}';
    }
}
