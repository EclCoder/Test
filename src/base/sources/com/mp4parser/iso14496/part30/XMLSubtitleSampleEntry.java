package com.mp4parser.iso14496.part30;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.googlecode.mp4parser.DataSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class XMLSubtitleSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "stpp";
    private String auxiliaryMimeTypes;
    private String namespace;
    private String schemaLocation;

    public XMLSubtitleSampleEntry() {
        super(TYPE);
        this.namespace = "";
        this.schemaLocation = "";
        this.auxiliaryMimeTypes = "";
    }

    public String getAuxiliaryMimeTypes() {
        return this.auxiliaryMimeTypes;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.namespace.length() + 8 + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3);
        byteBufferAllocate.position(6);
        IsoTypeWriter.writeUInt16(byteBufferAllocate, this.dataReferenceIndex);
        IsoTypeWriter.writeZeroTermUtf8String(byteBufferAllocate, this.namespace);
        IsoTypeWriter.writeZeroTermUtf8String(byteBufferAllocate, this.schemaLocation);
        IsoTypeWriter.writeZeroTermUtf8String(byteBufferAllocate, this.auxiliaryMimeTypes);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getSchemaLocation() {
        return this.schemaLocation;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
        long containerSize = getContainerSize() + ((long) (this.namespace.length() + 8 + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3));
        return containerSize + ((long) ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8));
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j10, BoxParser boxParser) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        dataSource.read((ByteBuffer) byteBufferAllocate.rewind());
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBufferAllocate);
        long jPosition = dataSource.position();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(UserVerificationMethods.USER_VERIFY_ALL);
        dataSource.read((ByteBuffer) byteBufferAllocate2.rewind());
        String string = IsoTypeReader.readString((ByteBuffer) byteBufferAllocate2.rewind());
        this.namespace = string;
        dataSource.position(((long) string.length()) + jPosition + 1);
        dataSource.read((ByteBuffer) byteBufferAllocate2.rewind());
        this.schemaLocation = IsoTypeReader.readString((ByteBuffer) byteBufferAllocate2.rewind());
        dataSource.position(((long) this.namespace.length()) + jPosition + ((long) this.schemaLocation.length()) + 2);
        dataSource.read((ByteBuffer) byteBufferAllocate2.rewind());
        this.auxiliaryMimeTypes = IsoTypeReader.readString((ByteBuffer) byteBufferAllocate2.rewind());
        dataSource.position(jPosition + ((long) this.namespace.length()) + ((long) this.schemaLocation.length()) + ((long) this.auxiliaryMimeTypes.length()) + 3);
        initContainer(dataSource, j10 - ((long) ((((byteBuffer.remaining() + this.namespace.length()) + this.schemaLocation.length()) + this.auxiliaryMimeTypes.length()) + 3)), boxParser);
    }

    public void setAuxiliaryMimeTypes(String str) {
        this.auxiliaryMimeTypes = str;
    }

    public void setNamespace(String str) {
        this.namespace = str;
    }

    public void setSchemaLocation(String str) {
        this.schemaLocation = str;
    }
}
