package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class QuicktimeTextSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "text";
    int backgroundB;
    int backgroundG;
    int backgroundR;
    int dataReferenceIndex;
    long defaultTextBox;
    int displayFlags;
    short fontFace;
    String fontName;
    short fontNumber;
    int foregroundB;
    int foregroundG;
    int foregroundR;
    long reserved1;
    byte reserved2;
    short reserved3;
    int textJustification;

    public QuicktimeTextSampleEntry() {
        super("text");
        this.foregroundR = 65535;
        this.foregroundG = 65535;
        this.foregroundB = 65535;
        this.fontName = "";
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void addBox(Box box) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }

    public int getBackgroundB() {
        return this.backgroundB;
    }

    public int getBackgroundG() {
        return this.backgroundG;
    }

    public int getBackgroundR() {
        return this.backgroundR;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        String str = this.fontName;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((str != null ? str.length() : 0) + 52);
        byteBufferAllocate.position(6);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.dataReferenceIndex);
        byteBufferAllocate.putInt(this.displayFlags);
        byteBufferAllocate.putInt(this.textJustification);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.backgroundR);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.backgroundG);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.backgroundB);
        IsoTypeWriter.writeUInt64(byteBufferAllocate, this.defaultTextBox);
        IsoTypeWriter.writeUInt64(byteBufferAllocate, this.reserved1);
        byteBufferAllocate.putShort(this.fontNumber);
        byteBufferAllocate.putShort(this.fontFace);
        byteBufferAllocate.put(this.reserved2);
        byteBufferAllocate.putShort(this.reserved3);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.foregroundR);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.foregroundG);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.foregroundB);
        String str2 = this.fontName;
        if (str2 != null) {
            IsoTypeWriter.writeUInt8(byteBufferAllocate, str2.length());
            byteBufferAllocate.put(this.fontName.getBytes());
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
    }

    public long getDefaultTextBox() {
        return this.defaultTextBox;
    }

    public int getDisplayFlags() {
        return this.displayFlags;
    }

    public short getFontFace() {
        return this.fontFace;
    }

    public String getFontName() {
        return this.fontName;
    }

    public short getFontNumber() {
        return this.fontNumber;
    }

    public int getForegroundB() {
        return this.foregroundB;
    }

    public int getForegroundG() {
        return this.foregroundG;
    }

    public int getForegroundR() {
        return this.foregroundR;
    }

    public long getReserved1() {
        return this.reserved1;
    }

    public byte getReserved2() {
        return this.reserved2;
    }

    public short getReserved3() {
        return this.reserved3;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
        long containerSize = getContainerSize() + 52;
        String str = this.fontName;
        long length = containerSize + ((long) (str != null ? str.length() : 0));
        return length + ((long) ((this.largeBox || 8 + length >= 4294967296L) ? 16 : 8));
    }

    public int getTextJustification() {
        return this.textJustification;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j10, BoxParser boxParser) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(CastUtils.l2i(j10));
        dataSource.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.displayFlags = byteBufferAllocate.getInt();
        this.textJustification = byteBufferAllocate.getInt();
        this.backgroundR = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.backgroundG = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.backgroundB = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.defaultTextBox = IsoTypeReader.readUInt64(byteBufferAllocate);
        this.reserved1 = IsoTypeReader.readUInt64(byteBufferAllocate);
        this.fontNumber = byteBufferAllocate.getShort();
        this.fontFace = byteBufferAllocate.getShort();
        this.reserved2 = byteBufferAllocate.get();
        this.reserved3 = byteBufferAllocate.getShort();
        this.foregroundR = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.foregroundG = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.foregroundB = IsoTypeReader.readUInt16(byteBufferAllocate);
        if (byteBufferAllocate.remaining() <= 0) {
            this.fontName = null;
            return;
        }
        byte[] bArr = new byte[IsoTypeReader.readUInt8(byteBufferAllocate)];
        byteBufferAllocate.get(bArr);
        this.fontName = new String(bArr);
    }

    public void setBackgroundB(int i10) {
        this.backgroundB = i10;
    }

    public void setBackgroundG(int i10) {
        this.backgroundG = i10;
    }

    public void setBackgroundR(int i10) {
        this.backgroundR = i10;
    }

    @Override // com.googlecode.mp4parser.BasicContainer, com.coremedia.iso.boxes.Container
    public void setBoxes(List<Box> list) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }

    public void setDefaultTextBox(long j10) {
        this.defaultTextBox = j10;
    }

    public void setDisplayFlags(int i10) {
        this.displayFlags = i10;
    }

    public void setFontFace(short s10) {
        this.fontFace = s10;
    }

    public void setFontName(String str) {
        this.fontName = str;
    }

    public void setFontNumber(short s10) {
        this.fontNumber = s10;
    }

    public void setForegroundB(int i10) {
        this.foregroundB = i10;
    }

    public void setForegroundG(int i10) {
        this.foregroundG = i10;
    }

    public void setForegroundR(int i10) {
        this.foregroundR = i10;
    }

    public void setReserved1(long j10) {
        this.reserved1 = j10;
    }

    public void setReserved2(byte b10) {
        this.reserved2 = b10;
    }

    public void setReserved3(short s10) {
        this.reserved3 = s10;
    }

    public void setTextJustification(int i10) {
        this.textJustification = i10;
    }
}
