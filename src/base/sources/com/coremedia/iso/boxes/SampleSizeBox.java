package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import np.a;
import qp.b;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class SampleSizeBox extends AbstractFullBox {
    public static final String TYPE = "stsz";
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_6 = null;
    int sampleCount;
    private long sampleSize;
    private long[] sampleSizes;

    static {
        ajc$preClinit();
    }

    public SampleSizeBox() {
        super(TYPE);
        this.sampleSizes = new long[0];
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.sampleSize = IsoTypeReader.readUInt32(byteBuffer);
        int iL2i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.sampleCount = iL2i;
        if (this.sampleSize == 0) {
            this.sampleSizes = new long[iL2i];
            for (int i10 = 0; i10 < this.sampleCount; i10++) {
                this.sampleSizes[i10] = IsoTypeReader.readUInt32(byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.sampleSize);
        if (this.sampleSize != 0) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.sampleCount);
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer, this.sampleSizes.length);
        for (long j10 : this.sampleSizes) {
            IsoTypeWriter.writeUInt32(byteBuffer, j10);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (this.sampleSize == 0 ? this.sampleSizes.length * 4 : 0) + 12;
    }

    public long getSampleCount() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_3, this, this));
        return this.sampleSize > 0 ? this.sampleCount : this.sampleSizes.length;
    }

    public long getSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.sampleSize;
    }

    public long getSampleSizeAtIndex(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_2, this, this, pp.a.e(i10)));
        long j10 = this.sampleSize;
        return j10 > 0 ? j10 : this.sampleSizes[i10];
    }

    public long[] getSampleSizes() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        return this.sampleSizes;
    }

    public void setSampleSize(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, pp.a.f(j10)));
        this.sampleSize = j10;
    }

    public void setSampleSizes(long[] jArr) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_5, this, this, jArr));
        this.sampleSizes = jArr;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_6, this, this));
        return "SampleSizeBox[sampleSize=" + getSampleSize() + ";sampleCount=" + getSampleCount() + "]";
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("SampleSizeBox.java", SampleSizeBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 50);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", UoyZyZEcGYBpIg.hXENznWksO, "", "void"), 54);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "", "long"), 59);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 67);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"), 76);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", "void"), 80);
        ajc$tjp_6 = bVar.h("method-execution", bVar.g("1", "toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"), Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE);
    }
}
