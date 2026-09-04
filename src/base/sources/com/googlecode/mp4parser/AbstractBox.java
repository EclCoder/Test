package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.UserBox;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Logger;
import com.googlecode.mp4parser.util.Path;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBox implements Box {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Logger LOG = Logger.getLogger(AbstractBox.class);
    private ByteBuffer content;
    DataSource dataSource;
    private ByteBuffer deadBytes = null;
    boolean isParsed = true;
    long offset;
    private Container parent;
    protected String type;
    private byte[] userType;

    protected AbstractBox(String str) {
        this.type = str;
    }

    private void getHeader(ByteBuffer byteBuffer) {
        if (isSmallBox()) {
            IsoTypeWriter.writeUInt32(byteBuffer, getSize());
            byteBuffer.put(IsoFile.fourCCtoBytes(getType()));
        } else {
            IsoTypeWriter.writeUInt32(byteBuffer, 1L);
            byteBuffer.put(IsoFile.fourCCtoBytes(getType()));
            IsoTypeWriter.writeUInt64(byteBuffer, getSize());
        }
        if (UserBox.TYPE.equals(getType())) {
            byteBuffer.put(getUserType());
        }
    }

    private boolean isSmallBox() {
        int i10 = UserBox.TYPE.equals(getType()) ? 24 : 8;
        if (!this.isParsed) {
            return ((long) (this.content.limit() + i10)) < 4294967296L;
        }
        long contentSize = getContentSize();
        ByteBuffer byteBuffer = this.deadBytes;
        return (contentSize + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i10) < 4294967296L;
    }

    private boolean verify(ByteBuffer byteBuffer) {
        long contentSize = getContentSize();
        ByteBuffer byteBuffer2 = this.deadBytes;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(CastUtils.l2i(contentSize + ((long) (byteBuffer2 != null ? byteBuffer2.limit() : 0))));
        getContent(byteBufferAllocate);
        ByteBuffer byteBuffer3 = this.deadBytes;
        if (byteBuffer3 != null) {
            byteBuffer3.rewind();
            while (this.deadBytes.remaining() > 0) {
                byteBufferAllocate.put(this.deadBytes);
            }
        }
        byteBuffer.rewind();
        byteBufferAllocate.rewind();
        if (byteBuffer.remaining() != byteBufferAllocate.remaining()) {
            System.err.print(String.valueOf(getType()) + ": remaining differs " + byteBuffer.remaining() + " vs. " + byteBufferAllocate.remaining());
            LOG.logError(String.valueOf(getType()) + ": remaining differs " + byteBuffer.remaining() + " vs. " + byteBufferAllocate.remaining());
            return false;
        }
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 1;
        int iLimit2 = byteBufferAllocate.limit() - 1;
        while (iLimit >= iPosition) {
            byte b10 = byteBuffer.get(iLimit);
            byte b11 = byteBufferAllocate.get(iLimit2);
            if (b10 != b11) {
                LOG.logError(String.format("%s: buffers differ at %d: %2X/%2X", getType(), Integer.valueOf(iLimit), Byte.valueOf(b10), Byte.valueOf(b11)));
                byte[] bArr = new byte[byteBuffer.remaining()];
                byte[] bArr2 = new byte[byteBufferAllocate.remaining()];
                byteBuffer.get(bArr);
                byteBufferAllocate.get(bArr2);
                System.err.println("original      : " + Hex.encodeHex(bArr, 4));
                System.err.println("reconstructed : " + Hex.encodeHex(bArr2, 4));
                return false;
            }
            iLimit--;
            iLimit2--;
        }
        return true;
    }

    protected abstract void _parseDetails(ByteBuffer byteBuffer);

    @Override // com.coremedia.iso.boxes.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        if (!this.isParsed) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((isSmallBox() ? 8 : 16) + (UserBox.TYPE.equals(getType()) ? 16 : 0));
            getHeader(byteBufferAllocate);
            writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
            writableByteChannel.write((ByteBuffer) this.content.position(0));
            return;
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(CastUtils.l2i(getSize()));
        getHeader(byteBufferAllocate2);
        getContent(byteBufferAllocate2);
        ByteBuffer byteBuffer = this.deadBytes;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            while (this.deadBytes.remaining() > 0) {
                byteBufferAllocate2.put(this.deadBytes);
            }
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate2.rewind());
    }

    protected abstract void getContent(ByteBuffer byteBuffer);

    protected abstract long getContentSize();

    @Override // com.coremedia.iso.boxes.Box
    public long getOffset() {
        return this.offset;
    }

    @Override // com.coremedia.iso.boxes.Box
    @DoNotParseDetail
    public Container getParent() {
        return this.parent;
    }

    @DoNotParseDetail
    public String getPath() {
        return Path.createPath(this);
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getSize() {
        long jLimit;
        if (this.isParsed) {
            jLimit = getContentSize();
        } else {
            ByteBuffer byteBuffer = this.content;
            jLimit = byteBuffer != null ? byteBuffer.limit() : 0;
        }
        long j10 = jLimit + ((long) ((jLimit >= 4294967288L ? 8 : 0) + 8 + (UserBox.TYPE.equals(getType()) ? 16 : 0)));
        ByteBuffer byteBuffer2 = this.deadBytes;
        return j10 + ((long) (byteBuffer2 != null ? byteBuffer2.limit() : 0));
    }

    @Override // com.coremedia.iso.boxes.Box
    @DoNotParseDetail
    public String getType() {
        return this.type;
    }

    @DoNotParseDetail
    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    @Override // com.coremedia.iso.boxes.Box
    @DoNotParseDetail
    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j10, BoxParser boxParser) {
        this.offset = dataSource.position() - ((long) byteBuffer.remaining());
        this.dataSource = dataSource;
        this.content = ByteBuffer.allocate(CastUtils.l2i(j10));
        while (this.content.remaining() > 0) {
            dataSource.read(this.content);
        }
        this.content.position(0);
        this.isParsed = false;
    }

    public final synchronized void parseDetails() {
        try {
            LOG.logDebug("parsing details of " + getType());
            ByteBuffer byteBuffer = this.content;
            if (byteBuffer != null) {
                this.isParsed = true;
                byteBuffer.rewind();
                _parseDetails(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.deadBytes = byteBuffer.slice();
                }
                this.content = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.coremedia.iso.boxes.Box
    @DoNotParseDetail
    public void setParent(Container container) {
        this.parent = container;
    }

    protected AbstractBox(String str, byte[] bArr) {
        this.type = str;
        this.userType = bArr;
    }
}
