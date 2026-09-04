package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Utf8AppleDataBox extends AppleDataBox {
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    String value;

    static {
        ajc$preClinit();
    }

    protected Utf8AppleDataBox(String str) {
        super(str, 1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("Utf8AppleDataBox.java", Utf8AppleDataBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getValue", "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox", "", "", "", "java.lang.String"), 21);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setValue", "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox", "java.lang.String", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "void"), 30);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return this.value.getBytes(Charset.forName(C.UTF8_NAME)).length;
    }

    public String getValue() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        if (!isParsed()) {
            parseDetails();
        }
        return this.value;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer) {
        this.value = IsoTypeReader.readString(byteBuffer, byteBuffer.remaining());
    }

    public void setValue(String str) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, str));
        this.value = str;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    @DoNotParseDetail
    public byte[] writeData() {
        return Utf8.convert(this.value);
    }
}
