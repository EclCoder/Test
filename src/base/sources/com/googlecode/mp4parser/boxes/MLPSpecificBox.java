package com.googlecode.mp4parser.boxes;

import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import java.nio.ByteBuffer;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MLPSpecificBox extends AbstractBox {
    public static final String TYPE = "dmlp";
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_6 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_7 = null;
    int format_info;
    int peak_data_rate;
    int reserved;
    int reserved2;

    static {
        ajc$preClinit();
    }

    public MLPSpecificBox() {
        super(TYPE);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        this.format_info = bitReaderBuffer.readBits(32);
        this.peak_data_rate = bitReaderBuffer.readBits(15);
        this.reserved = bitReaderBuffer.readBits(1);
        this.reserved2 = bitReaderBuffer.readBits(32);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.writeBits(this.format_info, 32);
        bitWriterBuffer.writeBits(this.peak_data_rate, 15);
        bitWriterBuffer.writeBits(this.reserved, 1);
        bitWriterBuffer.writeBits(this.reserved2, 32);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 10L;
    }

    public int getFormat_info() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.format_info;
    }

    public int getPeak_data_rate() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        return this.peak_data_rate;
    }

    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        return this.reserved;
    }

    public int getReserved2() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_6, this, this));
        return this.reserved2;
    }

    public void setFormat_info(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, pp.a.e(i10)));
        this.format_info = i10;
    }

    public void setPeak_data_rate(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_3, this, this, pp.a.e(i10)));
        this.peak_data_rate = i10;
    }

    public void setReserved(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_5, this, this, pp.a.e(i10)));
        this.reserved = i10;
    }

    public void setReserved2(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_7, this, this, pp.a.e(i10)));
        this.reserved2 = i10;
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("MLPSpecificBox.java", MLPSpecificBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 49);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "format_info", "", "void"), 53);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 57);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "setPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "peak_data_rate", "", "void"), 61);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "getReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", PAFNPq.DYJpoClAFtAR, "", "int"), 65);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "setReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved", "", "void"), 69);
        ajc$tjp_6 = bVar.h("method-execution", bVar.g("1", "getReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 73);
        ajc$tjp_7 = bVar.h("method-execution", bVar.g("1", "setReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved2", "", "void"), 77);
    }
}
