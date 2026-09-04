package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.List;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TimeCodeBox extends AbstractBox implements SampleEntry, Container {
    public static final String TYPE = "tmcd";
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_10 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_11 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_12 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_13 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_14 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_15 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_16 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_17 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_18 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_19 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_20 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_21 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_22 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_6 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_7 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_8 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_9 = null;
    int dataReferenceIndex;
    long flags;
    int frameDuration;
    int numberOfFrames;
    int reserved1;
    int reserved2;
    byte[] rest;
    int timeScale;

    static {
        ajc$preClinit();
    }

    public TimeCodeBox() {
        super(TYPE);
        this.rest = new byte[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("TimeCodeBox.java", TimeCodeBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 88);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "dataReferenceIndex", "", "void"), 92);
        ajc$tjp_10 = bVar.h("method-execution", bVar.g("1", "setReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved1", "", "void"), Sdk$SDKError.b.TPAT_RETRY_FAILED_VALUE);
        ajc$tjp_11 = bVar.h("method-execution", bVar.g("1", "getReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 141);
        ajc$tjp_12 = bVar.h("method-execution", bVar.g("1", "setReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved2", "", "void"), 145);
        ajc$tjp_13 = bVar.h("method-execution", bVar.g("1", "getFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "long"), 149);
        ajc$tjp_14 = bVar.h("method-execution", bVar.g("1", "setFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "long", "flags", "", "void"), 153);
        ajc$tjp_15 = bVar.h("method-execution", bVar.g("1", "getRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "[B"), 157);
        ajc$tjp_16 = bVar.h("method-execution", bVar.g("1", "setRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "[B", "rest", "", "void"), 161);
        ajc$tjp_17 = bVar.h("method-execution", bVar.g("1", "getBoxes", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.util.List"), 166);
        ajc$tjp_18 = bVar.h("method-execution", bVar.g("1", "setBoxes", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "java.util.List", "boxes", "", "void"), 170);
        ajc$tjp_19 = bVar.h("method-execution", bVar.g("1", "getBoxes", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "java.lang.Class", "clazz", "", "java.util.List"), 174);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "toString", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.lang.String"), 98);
        ajc$tjp_20 = bVar.h("method-execution", bVar.g("1", "getBoxes", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "java.lang.Class:boolean", "clazz:recursive", "", "java.util.List"), 178);
        ajc$tjp_21 = bVar.h("method-execution", bVar.g("1", "getByteBuffer", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "long:long", "start:size", "java.io.IOException", "java.nio.ByteBuffer"), 182);
        ajc$tjp_22 = bVar.h("method-execution", bVar.g("1", "writeContainer", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "java.nio.channels.WritableByteChannel", "bb", "java.io.IOException", "void"), 186);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "getTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 109);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "setTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "timeScale", "", "void"), Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE);
        ajc$tjp_6 = bVar.h("method-execution", bVar.g("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "frameDuration", "", "void"), Sdk$SDKError.b.TPAT_ERROR_VALUE);
        ajc$tjp_7 = bVar.h("method-execution", bVar.g("1", "getNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE);
        ajc$tjp_8 = bVar.h("method-execution", bVar.g("1", "setNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "numberOfFrames", "", "void"), 129);
        ajc$tjp_9 = bVar.h("method-execution", bVar.g("1", "getReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), Sdk$SDKError.b.OMSDK_JS_WRITE_FAILED_VALUE);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        byteBuffer.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
        this.reserved1 = byteBuffer.getInt();
        this.flags = IsoTypeReader.readUInt32(byteBuffer);
        this.timeScale = byteBuffer.getInt();
        this.frameDuration = byteBuffer.getInt();
        this.numberOfFrames = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved2 = IsoTypeReader.readUInt24(byteBuffer);
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.rest = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.coremedia.iso.boxes.Container
    public List<Box> getBoxes() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_17, this, this));
        return Collections.EMPTY_LIST;
    }

    @Override // com.coremedia.iso.boxes.Container
    public ByteBuffer getByteBuffer(long j10, long j11) {
        RequiresParseDetailAspect.aspectOf().before(b.e(ajc$tjp_21, this, this, pp.a.f(j10), pp.a.f(j11)));
        return null;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[6]);
        IsoTypeWriter.writeUInt16(byteBuffer, this.dataReferenceIndex);
        byteBuffer.putInt(this.reserved1);
        IsoTypeWriter.writeUInt32(byteBuffer, this.flags);
        byteBuffer.putInt(this.timeScale);
        byteBuffer.putInt(this.frameDuration);
        IsoTypeWriter.writeUInt8(byteBuffer, this.numberOfFrames);
        IsoTypeWriter.writeUInt24(byteBuffer, this.reserved2);
        byteBuffer.put(this.rest);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.rest.length + 28;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public int getDataReferenceIndex() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.dataReferenceIndex;
    }

    public long getFlags() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_13, this, this));
        return this.flags;
    }

    public int getFrameDuration() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_5, this, this));
        return this.frameDuration;
    }

    public int getNumberOfFrames() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_7, this, this));
        return this.numberOfFrames;
    }

    public int getReserved1() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_9, this, this));
        return this.reserved1;
    }

    public int getReserved2() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_11, this, this));
        return this.reserved2;
    }

    public byte[] getRest() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_15, this, this));
        return this.rest;
    }

    public int getTimeScale() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_3, this, this));
        return this.timeScale;
    }

    @Override // com.coremedia.iso.boxes.Container
    public void setBoxes(List<Box> list) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_18, this, this, list));
        throw new RuntimeException("Time Code Box doesn't accept any children");
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public void setDataReferenceIndex(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, pp.a.e(i10)));
        this.dataReferenceIndex = i10;
    }

    public void setFlags(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_14, this, this, pp.a.f(j10)));
        this.flags = j10;
    }

    public void setFrameDuration(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_6, this, this, pp.a.e(i10)));
        this.frameDuration = i10;
    }

    public void setNumberOfFrames(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_8, this, this, pp.a.e(i10)));
        this.numberOfFrames = i10;
    }

    public void setReserved1(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_10, this, this, pp.a.e(i10)));
        this.reserved1 = i10;
    }

    public void setReserved2(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_12, this, this, pp.a.e(i10)));
        this.reserved2 = i10;
    }

    public void setRest(byte[] bArr) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_16, this, this, bArr));
        this.rest = bArr;
    }

    public void setTimeScale(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_4, this, this, pp.a.e(i10)));
        this.timeScale = i10;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        return "TimeCodeBox{timeScale=" + this.timeScale + ", frameDuration=" + this.frameDuration + ", numberOfFrames=" + this.numberOfFrames + ", reserved1=" + this.reserved1 + ", reserved2=" + this.reserved2 + ", flags=" + this.flags + '}';
    }

    @Override // com.coremedia.iso.boxes.Container
    public void writeContainer(WritableByteChannel writableByteChannel) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_22, this, this, writableByteChannel));
    }

    @Override // com.coremedia.iso.boxes.Container
    public <T extends Box> List<T> getBoxes(Class<T> cls) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_19, this, this, cls));
        return Collections.EMPTY_LIST;
    }

    @Override // com.coremedia.iso.boxes.Container
    public <T extends Box> List<T> getBoxes(Class<T> cls, boolean z10) {
        RequiresParseDetailAspect.aspectOf().before(b.e(ajc$tjp_20, this, this, cls, pp.a.a(z10)));
        return Collections.EMPTY_LIST;
    }
}
