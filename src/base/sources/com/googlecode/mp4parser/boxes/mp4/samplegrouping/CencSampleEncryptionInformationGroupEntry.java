package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.UUIDConverter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CencSampleEncryptionInformationGroupEntry extends GroupEntry {
    public static final String TYPE = "seig";
    private boolean isEncrypted;
    private byte ivSize;
    private UUID kid;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CencSampleEncryptionInformationGroupEntry cencSampleEncryptionInformationGroupEntry = (CencSampleEncryptionInformationGroupEntry) obj;
        if (this.isEncrypted != cencSampleEncryptionInformationGroupEntry.isEncrypted || this.ivSize != cencSampleEncryptionInformationGroupEntry.ivSize) {
            return false;
        }
        UUID uuid = this.kid;
        UUID uuid2 = cencSampleEncryptionInformationGroupEntry.kid;
        return uuid == null ? uuid2 == null : uuid.equals(uuid2);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public ByteBuffer get() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        IsoTypeWriter.writeUInt24(byteBufferAllocate, this.isEncrypted ? 1 : 0);
        if (this.isEncrypted) {
            IsoTypeWriter.writeUInt8(byteBufferAllocate, this.ivSize);
            byteBufferAllocate.put(UUIDConverter.convert(this.kid));
        } else {
            byteBufferAllocate.put(new byte[17]);
        }
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    public byte getIvSize() {
        return this.ivSize;
    }

    public UUID getKid() {
        return this.kid;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public String getType() {
        return TYPE;
    }

    public int hashCode() {
        int i10 = (((this.isEncrypted ? 7 : 19) * 31) + this.ivSize) * 31;
        UUID uuid = this.kid;
        return i10 + (uuid != null ? uuid.hashCode() : 0);
    }

    public boolean isEncrypted() {
        return this.isEncrypted;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer) {
        this.isEncrypted = IsoTypeReader.readUInt24(byteBuffer) == 1;
        this.ivSize = (byte) IsoTypeReader.readUInt8(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.kid = UUIDConverter.convert(bArr);
    }

    public void setEncrypted(boolean z10) {
        this.isEncrypted = z10;
    }

    public void setIvSize(int i10) {
        this.ivSize = (byte) i10;
    }

    public void setKid(UUID uuid) {
        this.kid = uuid;
    }

    public String toString() {
        return "CencSampleEncryptionInformationGroupEntry{isEncrypted=" + this.isEncrypted + ", ivSize=" + ((int) this.ivSize) + ", kid=" + this.kid + '}';
    }
}
