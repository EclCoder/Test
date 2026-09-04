package com.googlecode.mp4parser.contentprotection;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class PlayReadyHeader extends ProtectionSpecificHeader {
    public static UUID PROTECTION_SYSTEM_ID;
    private long length;
    private List<PlayReadyRecord> records;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class PlayReadyRecord {
        int type;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class DefaulPlayReadyRecord extends PlayReadyRecord {
            ByteBuffer value;

            public DefaulPlayReadyRecord(int i10) {
                super(i10);
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public ByteBuffer getValue() {
                return this.value;
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public void parse(ByteBuffer byteBuffer) {
                this.value = byteBuffer.duplicate();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class EmeddedLicenseStore extends PlayReadyRecord {
            ByteBuffer value;

            public EmeddedLicenseStore() {
                super(3);
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public ByteBuffer getValue() {
                return this.value;
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public void parse(ByteBuffer byteBuffer) {
                this.value = byteBuffer.duplicate();
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public String toString() {
                return "EmeddedLicenseStore{length=" + getValue().limit() + '}';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class RMHeader extends PlayReadyRecord {
            String header;

            public RMHeader() {
                super(1);
            }

            public String getHeader() {
                return this.header;
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public ByteBuffer getValue() {
                try {
                    return ByteBuffer.wrap(this.header.getBytes("UTF-16LE"));
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public void parse(ByteBuffer byteBuffer) {
                try {
                    byte[] bArr = new byte[byteBuffer.slice().limit()];
                    byteBuffer.get(bArr);
                    this.header = new String(bArr, "UTF-16LE");
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }

            public void setHeader(String str) {
                this.header = str;
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public String toString() {
                return "RMHeader{length=" + getValue().limit() + ", header='" + this.header + "'}";
            }
        }

        public PlayReadyRecord(int i10) {
            this.type = i10;
        }

        public static List<PlayReadyRecord> createFor(ByteBuffer byteBuffer, int i10) {
            PlayReadyRecord rMHeader;
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int uInt16BE = IsoTypeReader.readUInt16BE(byteBuffer);
                int uInt16BE2 = IsoTypeReader.readUInt16BE(byteBuffer);
                if (uInt16BE == 1) {
                    rMHeader = new RMHeader();
                } else if (uInt16BE != 2) {
                    rMHeader = uInt16BE != 3 ? new DefaulPlayReadyRecord(uInt16BE) : new EmeddedLicenseStore();
                } else {
                    rMHeader = new DefaulPlayReadyRecord(2);
                }
                rMHeader.parse((ByteBuffer) byteBuffer.slice().limit(uInt16BE2));
                byteBuffer.position(byteBuffer.position() + uInt16BE2);
                arrayList.add(rMHeader);
            }
            return arrayList;
        }

        public abstract ByteBuffer getValue();

        public abstract void parse(ByteBuffer byteBuffer);

        public String toString() {
            return "PlayReadyRecord{type=" + this.type + ", length=" + getValue().limit() + '}';
        }
    }

    static {
        UUID uuidFromString = UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95");
        PROTECTION_SYSTEM_ID = uuidFromString;
        ProtectionSpecificHeader.uuidRegistry.put(uuidFromString, PlayReadyHeader.class);
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public ByteBuffer getData() {
        Iterator<PlayReadyRecord> it = this.records.iterator();
        int iLimit = 6;
        while (it.hasNext()) {
            iLimit = iLimit + 4 + it.next().getValue().rewind().limit();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iLimit);
        IsoTypeWriter.writeUInt32BE(byteBufferAllocate, iLimit);
        IsoTypeWriter.writeUInt16BE(byteBufferAllocate, this.records.size());
        for (PlayReadyRecord playReadyRecord : this.records) {
            IsoTypeWriter.writeUInt16BE(byteBufferAllocate, playReadyRecord.type);
            IsoTypeWriter.writeUInt16BE(byteBufferAllocate, playReadyRecord.getValue().limit());
            byteBufferAllocate.put(playReadyRecord.getValue());
        }
        return byteBufferAllocate;
    }

    public List<PlayReadyRecord> getRecords() {
        return Collections.unmodifiableList(this.records);
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public UUID getSystemId() {
        return PROTECTION_SYSTEM_ID;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public void parse(ByteBuffer byteBuffer) {
        this.length = IsoTypeReader.readUInt32BE(byteBuffer);
        this.records = PlayReadyRecord.createFor(byteBuffer, IsoTypeReader.readUInt16BE(byteBuffer));
    }

    public void setRecords(List<PlayReadyRecord> list) {
        this.records = list;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public String toString() {
        return "PlayReadyHeader{length=" + this.length + ", recordCount=" + this.records.size() + ", records=" + this.records + '}';
    }
}
