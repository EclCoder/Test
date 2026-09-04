package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AbstractContainerBox extends BasicContainer implements Box {
    protected boolean largeBox;
    private long offset;
    Container parent;
    protected String type;

    public AbstractContainerBox(String str) {
        this.type = str;
    }

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        writeContainer(writableByteChannel);
    }

    protected ByteBuffer getHeader() {
        ByteBuffer byteBufferWrap;
        if (this.largeBox || getSize() >= 4294967296L) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = this.type.getBytes()[0];
            bArr[5] = this.type.getBytes()[1];
            bArr[6] = this.type.getBytes()[2];
            bArr[7] = this.type.getBytes()[3];
            byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.position(8);
            IsoTypeWriter.writeUInt64(byteBufferWrap, getSize());
        } else {
            byteBufferWrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, this.type.getBytes()[0], this.type.getBytes()[1], this.type.getBytes()[2], this.type.getBytes()[3]});
            IsoTypeWriter.writeUInt32(byteBufferWrap, getSize());
        }
        byteBufferWrap.rewind();
        return byteBufferWrap;
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getOffset() {
        return this.offset;
    }

    @Override // com.coremedia.iso.boxes.Box
    public Container getParent() {
        return this.parent;
    }

    public long getSize() {
        long containerSize = getContainerSize();
        return containerSize + ((long) ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8));
    }

    @Override // com.coremedia.iso.boxes.Box
    public String getType() {
        return this.type;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void initContainer(DataSource dataSource, long j10, BoxParser boxParser) {
        this.dataSource = dataSource;
        long jPosition = dataSource.position();
        this.parsePosition = jPosition;
        this.startPosition = jPosition - ((long) ((this.largeBox || 8 + j10 >= 4294967296L) ? 16 : 8));
        dataSource.position(dataSource.position() + j10);
        this.endPosition = dataSource.position();
        this.boxParser = boxParser;
    }

    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j10, BoxParser boxParser) {
        this.offset = dataSource.position() - ((long) byteBuffer.remaining());
        this.largeBox = byteBuffer.remaining() == 16;
        initContainer(dataSource, j10, boxParser);
    }

    @Override // com.coremedia.iso.boxes.Box
    public void setParent(Container container) {
        this.parent = container;
    }
}
