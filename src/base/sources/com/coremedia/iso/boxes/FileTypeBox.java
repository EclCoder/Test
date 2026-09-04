package com.coremedia.iso.boxes;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class FileTypeBox extends AbstractBox {
    public static final String TYPE = "ftyp";
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private List<String> compatibleBrands;
    private String majorBrand;
    private long minorVersion;

    static {
        ajc$preClinit();
    }

    public FileTypeBox() {
        super(TYPE);
        this.compatibleBrands = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("FileTypeBox.java", FileTypeBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.lang.String"), 85);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "", "void"), 103);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "long"), Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.util.List"), Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "", "void"), Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.majorBrand = IsoTypeReader.read4cc(byteBuffer);
        this.minorVersion = IsoTypeReader.readUInt32(byteBuffer);
        int iRemaining = byteBuffer.remaining() / 4;
        this.compatibleBrands = new LinkedList();
        for (int i10 = 0; i10 < iRemaining; i10++) {
            this.compatibleBrands.add(IsoTypeReader.read4cc(byteBuffer));
        }
    }

    public List<String> getCompatibleBrands() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        return this.compatibleBrands;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(IsoFile.fourCCtoBytes(this.majorBrand));
        IsoTypeWriter.writeUInt32(byteBuffer, this.minorVersion);
        Iterator<String> it = this.compatibleBrands.iterator();
        while (it.hasNext()) {
            byteBuffer.put(IsoFile.fourCCtoBytes(it.next()));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (this.compatibleBrands.size() * 4) + 8;
    }

    public String getMajorBrand() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.majorBrand;
    }

    public long getMinorVersion() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_3, this, this));
        return this.minorVersion;
    }

    public void setCompatibleBrands(List<String> list) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_5, this, this, list));
        this.compatibleBrands = list;
    }

    public void setMajorBrand(String str) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, str));
        this.majorBrand = str;
    }

    public void setMinorVersion(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_2, this, this, pp.a.f(j10)));
        this.minorVersion = j10;
    }

    @DoNotParseDetail
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FileTypeBox[");
        sb2.append("majorBrand=");
        sb2.append(getMajorBrand());
        sb2.append(";");
        sb2.append("minorVersion=");
        sb2.append(getMinorVersion());
        for (String str : this.compatibleBrands) {
            sb2.append(";");
            sb2.append(PvZsvNiPV.wZXCOXCfgk);
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public FileTypeBox(String str, long j10, List<String> list) {
        super(TYPE);
        List list2 = Collections.EMPTY_LIST;
        this.majorBrand = str;
        this.minorVersion = j10;
        this.compatibleBrands = list;
    }
}
