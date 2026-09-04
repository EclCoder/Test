package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.DataSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TextSampleEntry extends AbstractSampleEntry {
    public static final String TYPE1 = "tx3g";
    public static final String TYPE_ENCRYPTED = "enct";
    private int[] backgroundColorRgba;
    private BoxRecord boxRecord;
    private long displayFlags;
    private int horizontalJustification;
    private StyleRecord styleRecord;
    private int verticalJustification;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class BoxRecord {
        int bottom;
        int left;
        int right;
        int top;

        public BoxRecord() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BoxRecord boxRecord = (BoxRecord) obj;
            return this.bottom == boxRecord.bottom && this.left == boxRecord.left && this.right == boxRecord.right && this.top == boxRecord.top;
        }

        public void getContent(ByteBuffer byteBuffer) {
            IsoTypeWriter.writeUInt16(byteBuffer, this.top);
            IsoTypeWriter.writeUInt16(byteBuffer, this.left);
            IsoTypeWriter.writeUInt16(byteBuffer, this.bottom);
            IsoTypeWriter.writeUInt16(byteBuffer, this.right);
        }

        public int getSize() {
            return 8;
        }

        public int hashCode() {
            return (((((this.top * 31) + this.left) * 31) + this.bottom) * 31) + this.right;
        }

        public void parse(ByteBuffer byteBuffer) {
            this.top = IsoTypeReader.readUInt16(byteBuffer);
            this.left = IsoTypeReader.readUInt16(byteBuffer);
            this.bottom = IsoTypeReader.readUInt16(byteBuffer);
            this.right = IsoTypeReader.readUInt16(byteBuffer);
        }

        public BoxRecord(int i10, int i11, int i12, int i13) {
            this.top = i10;
            this.left = i11;
            this.bottom = i12;
            this.right = i13;
        }
    }

    public TextSampleEntry() {
        super(TYPE1);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new BoxRecord();
        this.styleRecord = new StyleRecord();
    }

    public int[] getBackgroundColorRgba() {
        return this.backgroundColorRgba;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(38);
        byteBufferAllocate.position(6);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.dataReferenceIndex);
        IsoTypeWriter.writeUInt32(byteBufferAllocate, this.displayFlags);
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.horizontalJustification);
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.verticalJustification);
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.backgroundColorRgba[0]);
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.backgroundColorRgba[1]);
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.backgroundColorRgba[2]);
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.backgroundColorRgba[3]);
        this.boxRecord.getContent(byteBufferAllocate);
        this.styleRecord.getContent(byteBufferAllocate);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    public BoxRecord getBoxRecord() {
        return this.boxRecord;
    }

    public int getHorizontalJustification() {
        return this.horizontalJustification;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
        long containerSize = getContainerSize() + 38;
        return containerSize + ((long) ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8));
    }

    public StyleRecord getStyleRecord() {
        return this.styleRecord;
    }

    public int getVerticalJustification() {
        return this.verticalJustification;
    }

    public boolean isContinuousKaraoke() {
        return (this.displayFlags & 2048) == 2048;
    }

    public boolean isFillTextRegion() {
        return (this.displayFlags & 262144) == 262144;
    }

    public boolean isScrollDirection() {
        return (this.displayFlags & 384) == 384;
    }

    public boolean isScrollIn() {
        return (this.displayFlags & 32) == 32;
    }

    public boolean isScrollOut() {
        return (this.displayFlags & 64) == 64;
    }

    public boolean isWriteTextVertically() {
        return (this.displayFlags & 131072) == 131072;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j10, BoxParser boxParser) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(38);
        dataSource.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBufferAllocate);
        this.displayFlags = IsoTypeReader.readUInt32(byteBufferAllocate);
        this.horizontalJustification = IsoTypeReader.readUInt8(byteBufferAllocate);
        this.verticalJustification = IsoTypeReader.readUInt8(byteBufferAllocate);
        int[] iArr = new int[4];
        this.backgroundColorRgba = iArr;
        iArr[0] = IsoTypeReader.readUInt8(byteBufferAllocate);
        this.backgroundColorRgba[1] = IsoTypeReader.readUInt8(byteBufferAllocate);
        this.backgroundColorRgba[2] = IsoTypeReader.readUInt8(byteBufferAllocate);
        this.backgroundColorRgba[3] = IsoTypeReader.readUInt8(byteBufferAllocate);
        BoxRecord boxRecord = new BoxRecord();
        this.boxRecord = boxRecord;
        boxRecord.parse(byteBufferAllocate);
        StyleRecord styleRecord = new StyleRecord();
        this.styleRecord = styleRecord;
        styleRecord.parse(byteBufferAllocate);
        initContainer(dataSource, j10 - 38, boxParser);
    }

    public void setBackgroundColorRgba(int[] iArr) {
        this.backgroundColorRgba = iArr;
    }

    public void setBoxRecord(BoxRecord boxRecord) {
        this.boxRecord = boxRecord;
    }

    public void setContinuousKaraoke(boolean z10) {
        if (z10) {
            this.displayFlags |= 2048;
        } else {
            this.displayFlags &= -2049;
        }
    }

    public void setFillTextRegion(boolean z10) {
        if (z10) {
            this.displayFlags |= 262144;
        } else {
            this.displayFlags &= -262145;
        }
    }

    public void setHorizontalJustification(int i10) {
        this.horizontalJustification = i10;
    }

    public void setScrollDirection(boolean z10) {
        if (z10) {
            this.displayFlags |= 384;
        } else {
            this.displayFlags &= -385;
        }
    }

    public void setScrollIn(boolean z10) {
        if (z10) {
            this.displayFlags |= 32;
        } else {
            this.displayFlags &= -33;
        }
    }

    public void setScrollOut(boolean z10) {
        if (z10) {
            this.displayFlags |= 64;
        } else {
            this.displayFlags &= -65;
        }
    }

    public void setStyleRecord(StyleRecord styleRecord) {
        this.styleRecord = styleRecord;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVerticalJustification(int i10) {
        this.verticalJustification = i10;
    }

    public void setWriteTextVertically(boolean z10) {
        if (z10) {
            this.displayFlags |= 131072;
        } else {
            this.displayFlags &= -131073;
        }
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return "TextSampleEntry";
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class StyleRecord {
        int endChar;
        int faceStyleFlags;
        int fontId;
        int fontSize;
        int startChar;
        int[] textColor;

        public StyleRecord() {
            this.textColor = new int[]{255, 255, 255, 255};
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            StyleRecord styleRecord = (StyleRecord) obj;
            return this.endChar == styleRecord.endChar && this.faceStyleFlags == styleRecord.faceStyleFlags && this.fontId == styleRecord.fontId && this.fontSize == styleRecord.fontSize && this.startChar == styleRecord.startChar && Arrays.equals(this.textColor, styleRecord.textColor);
        }

        public void getContent(ByteBuffer byteBuffer) {
            IsoTypeWriter.writeUInt16(byteBuffer, this.startChar);
            IsoTypeWriter.writeUInt16(byteBuffer, this.endChar);
            IsoTypeWriter.writeUInt16(byteBuffer, this.fontId);
            IsoTypeWriter.writeUInt8(byteBuffer, this.faceStyleFlags);
            IsoTypeWriter.writeUInt8(byteBuffer, this.fontSize);
            IsoTypeWriter.writeUInt8(byteBuffer, this.textColor[0]);
            IsoTypeWriter.writeUInt8(byteBuffer, this.textColor[1]);
            IsoTypeWriter.writeUInt8(byteBuffer, this.textColor[2]);
            IsoTypeWriter.writeUInt8(byteBuffer, this.textColor[3]);
        }

        public int getSize() {
            return 12;
        }

        public int hashCode() {
            int i10 = ((((((((this.startChar * 31) + this.endChar) * 31) + this.fontId) * 31) + this.faceStyleFlags) * 31) + this.fontSize) * 31;
            int[] iArr = this.textColor;
            return i10 + (iArr != null ? Arrays.hashCode(iArr) : 0);
        }

        public void parse(ByteBuffer byteBuffer) {
            this.startChar = IsoTypeReader.readUInt16(byteBuffer);
            this.endChar = IsoTypeReader.readUInt16(byteBuffer);
            this.fontId = IsoTypeReader.readUInt16(byteBuffer);
            this.faceStyleFlags = IsoTypeReader.readUInt8(byteBuffer);
            this.fontSize = IsoTypeReader.readUInt8(byteBuffer);
            int[] iArr = new int[4];
            this.textColor = iArr;
            iArr[0] = IsoTypeReader.readUInt8(byteBuffer);
            this.textColor[1] = IsoTypeReader.readUInt8(byteBuffer);
            this.textColor[2] = IsoTypeReader.readUInt8(byteBuffer);
            this.textColor[3] = IsoTypeReader.readUInt8(byteBuffer);
        }

        public StyleRecord(int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            this.startChar = i10;
            this.endChar = i11;
            this.fontId = i12;
            this.faceStyleFlags = i13;
            this.fontSize = i14;
            this.textColor = iArr;
        }
    }

    public TextSampleEntry(String str) {
        super(str);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new BoxRecord();
        this.styleRecord = new StyleRecord();
    }
}
