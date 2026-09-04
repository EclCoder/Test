package com.googlecode.mp4parser.boxes;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    protected int algorithmId;
    List<hi.a> entries;
    protected int ivSize;
    protected byte[] kid;

    static {
        ajc$preClinit();
    }

    protected AbstractSampleEncryptionBox(String str) {
        super(str);
        this.algorithmId = -1;
        this.ivSize = -1;
        this.kid = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        this.entries = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("AbstractSampleEncryptionBox.java", AbstractSampleEncryptionBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getOffsetToFirstIV", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 29);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "getEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 89);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "setEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.util.List", "entries", "", "void"), 93);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "equals", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", "boolean"), TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "hashCode", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 200);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "getEntrySizes", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), Sdk$SDKError.b.INVALID_BID_PAYLOAD_VALUE);
    }

    private int getNonEmptyEntriesNum() {
        Iterator<hi.a> it = this.entries.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().b() > 0) {
                i10++;
            }
        }
        return i10;
    }

    private List<hi.a> parseEntries(ByteBuffer byteBuffer, long j10, int i10) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            long j11 = j10 - 1;
            if (j10 <= 0) {
                return arrayList;
            }
            try {
                hi.a aVar = new hi.a();
                byte[] bArr = new byte[i10];
                aVar.f40373a = bArr;
                byteBuffer.get(bArr);
                if ((getFlags() & 2) > 0) {
                    aVar.f40374b = new hi.a.j[IsoTypeReader.readUInt16(byteBuffer)];
                    int i11 = 0;
                    while (true) {
                        hi.a.j[] jVarArr = aVar.f40374b;
                        if (i11 >= jVarArr.length) {
                            break;
                        }
                        jVarArr[i11] = aVar.a(IsoTypeReader.readUInt16(byteBuffer), IsoTypeReader.readUInt32(byteBuffer));
                        i11++;
                    }
                }
                arrayList.add(aVar);
                j10 = j11;
            } catch (BufferUnderflowException unused) {
                return null;
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) > 0) {
            this.algorithmId = IsoTypeReader.readUInt24(byteBuffer);
            this.ivSize = IsoTypeReader.readUInt8(byteBuffer);
            byte[] bArr = new byte[16];
            this.kid = bArr;
            byteBuffer.get(bArr);
        }
        long uInt32 = IsoTypeReader.readUInt32(byteBuffer);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
        List<hi.a> entries = parseEntries(byteBufferDuplicate, uInt32, 8);
        this.entries = entries;
        if (entries == null) {
            this.entries = parseEntries(byteBufferDuplicate2, uInt32, 16);
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - byteBufferDuplicate2.remaining());
        } else {
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - byteBufferDuplicate.remaining());
        }
        if (this.entries == null) {
            throw new RuntimeException("Cannot parse SampleEncryptionBox");
        }
    }

    public boolean equals(Object obj) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_3, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractSampleEncryptionBox abstractSampleEncryptionBox = (AbstractSampleEncryptionBox) obj;
        if (this.algorithmId != abstractSampleEncryptionBox.algorithmId || this.ivSize != abstractSampleEncryptionBox.ivSize) {
            return false;
        }
        List<hi.a> list = this.entries;
        if (list == null ? abstractSampleEncryptionBox.entries == null : list.equals(abstractSampleEncryptionBox.entries)) {
            return Arrays.equals(this.kid, abstractSampleEncryptionBox.kid);
        }
        return false;
    }

    @Override // com.googlecode.mp4parser.AbstractBox, com.coremedia.iso.boxes.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        super.getBox(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (isOverrideTrackEncryptionBoxParameters()) {
            IsoTypeWriter.writeUInt24(byteBuffer, this.algorithmId);
            IsoTypeWriter.writeUInt8(byteBuffer, this.ivSize);
            byteBuffer.put(this.kid);
        }
        IsoTypeWriter.writeUInt32(byteBuffer, getNonEmptyEntriesNum());
        for (hi.a aVar : this.entries) {
            if (aVar.b() > 0) {
                byte[] bArr = aVar.f40373a;
                if (bArr.length != 8 && bArr.length != 16) {
                    throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
                byteBuffer.put(bArr);
                if (isSubSampleEncryption()) {
                    IsoTypeWriter.writeUInt16(byteBuffer, aVar.f40374b.length);
                    for (hi.a.j jVar : aVar.f40374b) {
                        IsoTypeWriter.writeUInt16(byteBuffer, jVar.clear());
                        IsoTypeWriter.writeUInt32(byteBuffer, jVar.a());
                    }
                }
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        long length = (isOverrideTrackEncryptionBoxParameters() ? 8 + ((long) this.kid.length) : 4L) + 4;
        Iterator<hi.a> it = this.entries.iterator();
        while (it.hasNext()) {
            length += (long) it.next().b();
        }
        return length;
    }

    public List<hi.a> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_1, this, this));
        return this.entries;
    }

    public List<Short> getEntrySizes() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_5, this, this));
        ArrayList arrayList = new ArrayList(this.entries.size());
        for (hi.a aVar : this.entries) {
            short length = (short) aVar.f40373a.length;
            if (isSubSampleEncryption()) {
                length = (short) (((short) (length + 2)) + (aVar.f40374b.length * 6));
            }
            arrayList.add(Short.valueOf(length));
        }
        return arrayList;
    }

    public int getOffsetToFirstIV() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return (getSize() > 4294967296L ? 16 : 8) + (isOverrideTrackEncryptionBoxParameters() ? this.kid.length + 4 : 0) + 4;
    }

    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        int i10 = ((this.algorithmId * 31) + this.ivSize) * 31;
        byte[] bArr = this.kid;
        int iHashCode = (i10 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        List<hi.a> list = this.entries;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @DoNotParseDetail
    protected boolean isOverrideTrackEncryptionBoxParameters() {
        return (getFlags() & 1) > 0;
    }

    @DoNotParseDetail
    public boolean isSubSampleEncryption() {
        return (getFlags() & 2) > 0;
    }

    public void setEntries(List<hi.a> list) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_2, this, this, list));
        this.entries = list;
    }

    @DoNotParseDetail
    public void setSubSampleEncryption(boolean z10) {
        if (z10) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & 16777213);
        }
    }
}
