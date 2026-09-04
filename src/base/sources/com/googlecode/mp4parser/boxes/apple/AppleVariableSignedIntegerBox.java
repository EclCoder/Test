package com.googlecode.mp4parser.boxes.apple;

import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AppleVariableSignedIntegerBox extends AppleDataBox {
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    int intLength;
    long value;

    static {
        ajc$preClinit();
    }

    protected AppleVariableSignedIntegerBox(String str) {
        super(str, 15);
        this.intLength = 1;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return this.intLength;
    }

    public int getIntLength() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.intLength;
    }

    public long getValue() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        if (!isParsed()) {
            parseDetails();
        }
        return this.value;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        this.value = IsoTypeReaderVariable.read(byteBuffer, iRemaining);
        this.intLength = iRemaining;
    }

    public void setIntLength(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, pp.a.e(i10)));
        this.intLength = i10;
    }

    public void setValue(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_3, this, this, pp.a.f(j10)));
        if (j10 <= 127 && j10 > -128) {
            this.intLength = 1;
        } else if (j10 <= 32767 && j10 > -32768 && this.intLength < 2) {
            this.intLength = 2;
        } else if (j10 > 8388607 || j10 <= -8388608 || this.intLength >= 3) {
            this.intLength = 4;
        } else {
            this.intLength = 3;
        }
        this.value = j10;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        int dataLength = getDataLength();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[dataLength]);
        IsoTypeWriterVariable.write(this.value, byteBufferWrap, dataLength);
        return byteBufferWrap.array();
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("AppleVariableSignedIntegerBox.java", AppleVariableSignedIntegerBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getIntLength", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", vHmGJpUTWNVV.eglonOnMkdvIk, "", "int"), 19);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setIntLength", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "int", "intLength", "", "void"), 23);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getValue", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", "long"), 27);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "setValue", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "long", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "void"), 36);
    }
}
