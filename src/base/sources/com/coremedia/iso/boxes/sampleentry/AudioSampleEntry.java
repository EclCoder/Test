package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.util.CastUtils;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class AudioSampleEntry extends AbstractSampleEntry {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE1 = "samr";
    public static final String TYPE10 = "mlpa";
    public static final String TYPE11 = "dtsl";
    public static final String TYPE12 = "dtsh";
    public static final String TYPE13 = "dtse";
    public static final String TYPE2 = "sawb";
    public static final String TYPE3 = "mp4a";
    public static final String TYPE4 = "drms";
    public static final String TYPE5 = "alac";
    public static final String TYPE7 = "owma";
    public static final String TYPE8 = "ac-3";
    public static final String TYPE9 = "ec-3";
    public static final String TYPE_ENCRYPTED = "enca";
    private long bytesPerFrame;
    private long bytesPerPacket;
    private long bytesPerSample;
    private int channelCount;
    private int compressionId;
    private int packetSize;
    private int reserved1;
    private long reserved2;
    private long sampleRate;
    private int sampleSize;
    private long samplesPerPacket;
    private int soundVersion;
    private byte[] soundVersion2Data;

    public AudioSampleEntry(String str) {
        super(str);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        int i10 = this.soundVersion;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((i10 == 1 ? 16 : 0) + 28 + (i10 == 2 ? 36 : 0));
        byteBufferAllocate.position(6);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.dataReferenceIndex);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.soundVersion);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.reserved1);
        IsoTypeWriter.writeUInt32(byteBufferAllocate, this.reserved2);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.channelCount);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.sampleSize);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.compressionId);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.packetSize);
        if (this.type.equals(TYPE10)) {
            IsoTypeWriter.writeUInt32(byteBufferAllocate, getSampleRate());
        } else {
            IsoTypeWriter.writeUInt32(byteBufferAllocate, getSampleRate() << 16);
        }
        if (this.soundVersion == 1) {
            IsoTypeWriter.writeUInt32(byteBufferAllocate, this.samplesPerPacket);
            IsoTypeWriter.writeUInt32(byteBufferAllocate, this.bytesPerPacket);
            IsoTypeWriter.writeUInt32(byteBufferAllocate, this.bytesPerFrame);
            IsoTypeWriter.writeUInt32(byteBufferAllocate, this.bytesPerSample);
        }
        if (this.soundVersion == 2) {
            IsoTypeWriter.writeUInt32(byteBufferAllocate, this.samplesPerPacket);
            IsoTypeWriter.writeUInt32(byteBufferAllocate, this.bytesPerPacket);
            IsoTypeWriter.writeUInt32(byteBufferAllocate, this.bytesPerFrame);
            IsoTypeWriter.writeUInt32(byteBufferAllocate, this.bytesPerSample);
            byteBufferAllocate.put(this.soundVersion2Data);
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    public long getBytesPerFrame() {
        return this.bytesPerFrame;
    }

    public long getBytesPerPacket() {
        return this.bytesPerPacket;
    }

    public long getBytesPerSample() {
        return this.bytesPerSample;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getCompressionId() {
        return this.compressionId;
    }

    public int getPacketSize() {
        return this.packetSize;
    }

    public int getReserved1() {
        return this.reserved1;
    }

    public long getReserved2() {
        return this.reserved2;
    }

    public long getSampleRate() {
        return this.sampleRate;
    }

    public int getSampleSize() {
        return this.sampleSize;
    }

    public long getSamplesPerPacket() {
        return this.samplesPerPacket;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
        int i10 = this.soundVersion;
        int i11 = 16;
        long containerSize = ((long) ((i10 == 1 ? 16 : 0) + 28 + (i10 == 2 ? 36 : 0))) + getContainerSize();
        if (!this.largeBox && 8 + containerSize < 4294967296L) {
            i11 = 8;
        }
        return containerSize + ((long) i11);
    }

    public int getSoundVersion() {
        return this.soundVersion;
    }

    public byte[] getSoundVersion2Data() {
        return this.soundVersion2Data;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j10, BoxParser boxParser) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(28);
        dataSource.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.soundVersion = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.reserved1 = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.reserved2 = IsoTypeReader.readUInt32(byteBufferAllocate);
        this.channelCount = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.sampleSize = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.compressionId = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.packetSize = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.sampleRate = IsoTypeReader.readUInt32(byteBufferAllocate);
        if (!this.type.equals(TYPE10)) {
            this.sampleRate >>>= 16;
        }
        if (this.soundVersion == 1) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
            dataSource.read(byteBufferAllocate2);
            byteBufferAllocate2.rewind();
            this.samplesPerPacket = IsoTypeReader.readUInt32(byteBufferAllocate2);
            this.bytesPerPacket = IsoTypeReader.readUInt32(byteBufferAllocate2);
            this.bytesPerFrame = IsoTypeReader.readUInt32(byteBufferAllocate2);
            this.bytesPerSample = IsoTypeReader.readUInt32(byteBufferAllocate2);
        }
        if (this.soundVersion == 2) {
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(36);
            dataSource.read(byteBufferAllocate3);
            byteBufferAllocate3.rewind();
            this.samplesPerPacket = IsoTypeReader.readUInt32(byteBufferAllocate3);
            this.bytesPerPacket = IsoTypeReader.readUInt32(byteBufferAllocate3);
            this.bytesPerFrame = IsoTypeReader.readUInt32(byteBufferAllocate3);
            this.bytesPerSample = IsoTypeReader.readUInt32(byteBufferAllocate3);
            byte[] bArr = new byte[20];
            this.soundVersion2Data = bArr;
            byteBufferAllocate3.get(bArr);
        }
        if (!TYPE7.equals(this.type)) {
            long j11 = j10 - 28;
            int i10 = this.soundVersion;
            initContainer(dataSource, (j11 - ((long) (i10 != 1 ? 0 : 16))) - ((long) (i10 != 2 ? 0 : 36)), boxParser);
            return;
        }
        System.err.println(TYPE7);
        long j12 = j10 - 28;
        int i11 = this.soundVersion;
        final long j13 = (j12 - ((long) (i11 != 1 ? 0 : 16))) - ((long) (i11 != 2 ? 0 : 36));
        final ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(CastUtils.l2i(j13));
        dataSource.read(byteBufferAllocate4);
        addBox(new Box() { // from class: com.coremedia.iso.boxes.sampleentry.AudioSampleEntry.1
            @Override // com.coremedia.iso.boxes.Box
            public void getBox(WritableByteChannel writableByteChannel) throws IOException {
                byteBufferAllocate4.rewind();
                writableByteChannel.write(byteBufferAllocate4);
            }

            @Override // com.coremedia.iso.boxes.Box
            public long getOffset() {
                return 0L;
            }

            @Override // com.coremedia.iso.boxes.Box
            public Container getParent() {
                return AudioSampleEntry.this;
            }

            @Override // com.coremedia.iso.boxes.Box
            public long getSize() {
                return j13;
            }

            @Override // com.coremedia.iso.boxes.Box
            public String getType() {
                return InternalFrame.ID;
            }

            @Override // com.coremedia.iso.boxes.Box
            public void parse(DataSource dataSource2, ByteBuffer byteBuffer2, long j14, BoxParser boxParser2) {
                throw new RuntimeException("NotImplemented");
            }

            @Override // com.coremedia.iso.boxes.Box
            public void setParent(Container container) {
                if (!AudioSampleEntry.$assertionsDisabled && container != AudioSampleEntry.this) {
                    throw new AssertionError("you cannot diswown this special box");
                }
            }
        });
    }

    public void setBytesPerFrame(long j10) {
        this.bytesPerFrame = j10;
    }

    public void setBytesPerPacket(long j10) {
        this.bytesPerPacket = j10;
    }

    public void setBytesPerSample(long j10) {
        this.bytesPerSample = j10;
    }

    public void setChannelCount(int i10) {
        this.channelCount = i10;
    }

    public void setCompressionId(int i10) {
        this.compressionId = i10;
    }

    public void setPacketSize(int i10) {
        this.packetSize = i10;
    }

    public void setReserved1(int i10) {
        this.reserved1 = i10;
    }

    public void setReserved2(long j10) {
        this.reserved2 = j10;
    }

    public void setSampleRate(long j10) {
        this.sampleRate = j10;
    }

    public void setSampleSize(int i10) {
        this.sampleSize = i10;
    }

    public void setSamplesPerPacket(long j10) {
        this.samplesPerPacket = j10;
    }

    public void setSoundVersion(int i10) {
        this.soundVersion = i10;
    }

    public void setSoundVersion2Data(byte[] bArr) {
        this.soundVersion2Data = bArr;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.bytesPerSample + ", bytesPerFrame=" + this.bytesPerFrame + ", bytesPerPacket=" + this.bytesPerPacket + ", samplesPerPacket=" + this.samplesPerPacket + ", packetSize=" + this.packetSize + ", compressionId=" + this.compressionId + ", soundVersion=" + this.soundVersion + ", sampleRate=" + this.sampleRate + ", sampleSize=" + this.sampleSize + ", channelCount=" + this.channelCount + ", boxes=" + getBoxes() + '}';
    }
}
