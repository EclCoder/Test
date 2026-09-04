package com.coremedia.iso.boxes;

import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.DateHelper;
import com.googlecode.mp4parser.util.Logger;
import com.googlecode.mp4parser.util.Matrix;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.util.Date;
import np.a;
import qp.b;
import vl.Rlkc.CIdIVqKnNZ;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MovieHeaderBox extends AbstractFullBox {
    private static Logger LOG = null;
    public static final String TYPE = "mvhd";
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
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_23 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_24 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_25 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_26 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_27 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_28 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_6 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_7 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_8 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_9 = null;
    private Date creationTime;
    private int currentTime;
    private long duration;
    private Matrix matrix;
    private Date modificationTime;
    private long nextTrackId;
    private int posterTime;
    private int previewDuration;
    private int previewTime;
    private double rate;
    private int selectionDuration;
    private int selectionTime;
    private long timescale;
    private float volume;

    static {
        ajc$preClinit();
        LOG = Logger.getLogger(MovieHeaderBox.class);
    }

    public MovieHeaderBox() {
        super(TYPE);
        this.rate = 1.0d;
        this.volume = 1.0f;
        this.matrix = Matrix.ROTATE_0;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer));
            this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer));
            this.timescale = IsoTypeReader.readUInt32(byteBuffer);
            this.duration = byteBuffer.getLong();
        } else {
            this.creationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer));
            this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer));
            this.timescale = IsoTypeReader.readUInt32(byteBuffer);
            this.duration = byteBuffer.getInt();
        }
        if (this.duration < -1) {
            LOG.logWarn("mvhd duration is not in expected range");
        }
        this.rate = IsoTypeReader.readFixedPoint1616(byteBuffer);
        this.volume = IsoTypeReader.readFixedPoint88(byteBuffer);
        IsoTypeReader.readUInt16(byteBuffer);
        IsoTypeReader.readUInt32(byteBuffer);
        IsoTypeReader.readUInt32(byteBuffer);
        this.matrix = Matrix.fromByteBuffer(byteBuffer);
        this.previewTime = byteBuffer.getInt();
        this.previewDuration = byteBuffer.getInt();
        this.posterTime = byteBuffer.getInt();
        this.selectionTime = byteBuffer.getInt();
        this.selectionDuration = byteBuffer.getInt();
        this.currentTime = byteBuffer.getInt();
        this.nextTrackId = IsoTypeReader.readUInt32(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt64(byteBuffer, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, this.timescale);
            byteBuffer.putLong(this.duration);
        } else {
            IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer, this.timescale);
            byteBuffer.putInt((int) this.duration);
        }
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.rate);
        IsoTypeWriter.writeFixedPoint88(byteBuffer, this.volume);
        IsoTypeWriter.writeUInt16(byteBuffer, 0);
        IsoTypeWriter.writeUInt32(byteBuffer, 0L);
        IsoTypeWriter.writeUInt32(byteBuffer, 0L);
        this.matrix.getContent(byteBuffer);
        byteBuffer.putInt(this.previewTime);
        byteBuffer.putInt(this.previewDuration);
        byteBuffer.putInt(this.posterTime);
        byteBuffer.putInt(this.selectionTime);
        byteBuffer.putInt(this.selectionDuration);
        byteBuffer.putInt(this.currentTime);
        IsoTypeWriter.writeUInt32(byteBuffer, this.nextTrackId);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (getVersion() == 1 ? 32L : 20L) + 80;
    }

    public Date getCreationTime() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.creationTime;
    }

    public int getCurrentTime() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_27, this, this));
        return this.currentTime;
    }

    public long getDuration() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_3, this, this));
        return this.duration;
    }

    public Matrix getMatrix() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_6, this, this));
        return this.matrix;
    }

    public Date getModificationTime() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_1, this, this));
        return this.modificationTime;
    }

    public long getNextTrackId() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_7, this, this));
        return this.nextTrackId;
    }

    public int getPosterTime() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_21, this, this));
        return this.posterTime;
    }

    public int getPreviewDuration() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_19, this, this));
        return this.previewDuration;
    }

    public int getPreviewTime() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_17, this, this));
        return this.previewTime;
    }

    public double getRate() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        return this.rate;
    }

    public int getSelectionDuration() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_25, this, this));
        return this.selectionDuration;
    }

    public int getSelectionTime() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_23, this, this));
        return this.selectionTime;
    }

    public long getTimescale() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        return this.timescale;
    }

    public float getVolume() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_5, this, this));
        return this.volume;
    }

    public void setCreationTime(Date date) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_9, this, this, date));
        this.creationTime = date;
        if (DateHelper.convert(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setCurrentTime(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_28, this, this, pp.a.e(i10)));
        this.currentTime = i10;
    }

    public void setDuration(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_12, this, this, pp.a.f(j10)));
        this.duration = j10;
        if (j10 >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setMatrix(Matrix matrix) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_15, this, this, matrix));
        this.matrix = matrix;
    }

    public void setModificationTime(Date date) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_10, this, this, date));
        this.modificationTime = date;
        if (DateHelper.convert(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setNextTrackId(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_16, this, this, pp.a.f(j10)));
        this.nextTrackId = j10;
    }

    public void setPosterTime(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_22, this, this, pp.a.e(i10)));
        this.posterTime = i10;
    }

    public void setPreviewDuration(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_20, this, this, pp.a.e(i10)));
        this.previewDuration = i10;
    }

    public void setPreviewTime(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_18, this, this, pp.a.e(i10)));
        this.previewTime = i10;
    }

    public void setRate(double d10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_13, this, this, pp.a.c(d10)));
        this.rate = d10;
    }

    public void setSelectionDuration(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_26, this, this, pp.a.e(i10)));
        this.selectionDuration = i10;
    }

    public void setSelectionTime(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_24, this, this, pp.a.e(i10)));
        this.selectionTime = i10;
    }

    public void setTimescale(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_11, this, this, pp.a.f(j10)));
        this.timescale = j10;
    }

    public void setVolume(float f10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_14, this, this, pp.a.d(f10)));
        this.volume = f10;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_8, this, this));
        return "MovieHeaderBox[creationTime=" + getCreationTime() + ";modificationTime=" + getModificationTime() + ";timescale=" + getTimescale() + ";duration=" + getDuration() + ";rate=" + getRate() + ";volume=" + getVolume() + ";matrix=" + this.matrix + ";nextTrackId=" + getNextTrackId() + "]";
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("MovieHeaderBox.java", MovieHeaderBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 66);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 70);
        ajc$tjp_10 = bVar.h("method-execution", bVar.g("1", "setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), Sdk$SDKError.b.PLACEMENT_SLEEP_VALUE);
        ajc$tjp_11 = bVar.h("method-execution", bVar.g("1", "setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "", "void"), Sdk$SDKError.b.AD_RESPONSE_RETRY_AFTER_VALUE);
        ajc$tjp_12 = bVar.h("method-execution", bVar.g("1", "setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "", "void"), 224);
        ajc$tjp_13 = bVar.h("method-execution", bVar.g("1", "setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "", "void"), 231);
        ajc$tjp_14 = bVar.h("method-execution", bVar.g("1", "setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "", "void"), 235);
        ajc$tjp_15 = bVar.h("method-execution", bVar.g("1", "setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", CIdIVqKnNZ.RTKmgXQAMAk, "", "void"), 239);
        ajc$tjp_16 = bVar.h("method-execution", bVar.g("1", "setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "", "void"), 243);
        ajc$tjp_17 = bVar.h("method-execution", bVar.g("1", "getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 247);
        ajc$tjp_18 = bVar.h("method-execution", bVar.g("1", "setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "", "void"), 251);
        ajc$tjp_19 = bVar.h("method-execution", bVar.g("1", "getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 255);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 74);
        ajc$tjp_20 = bVar.h("method-execution", bVar.g("1", "setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "", "void"), 259);
        ajc$tjp_21 = bVar.h("method-execution", bVar.g("1", "getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 263);
        ajc$tjp_22 = bVar.h("method-execution", bVar.g("1", "setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "", "void"), 267);
        ajc$tjp_23 = bVar.h("method-execution", bVar.g("1", "getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 271);
        ajc$tjp_24 = bVar.h("method-execution", bVar.g("1", NpmRNZ.KgwWlcwTPA, "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "", "void"), 275);
        ajc$tjp_25 = bVar.h("method-execution", bVar.g("1", "getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 279);
        ajc$tjp_26 = bVar.h("method-execution", bVar.g("1", "setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "", "void"), 283);
        ajc$tjp_27 = bVar.h("method-execution", bVar.g("1", "getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        ajc$tjp_28 = bVar.h("method-execution", bVar.g("1", "setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "", "void"), 291);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 78);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", giNWGaNAgVQoO.ayt, "double"), 82);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "float"), 86);
        ajc$tjp_6 = bVar.h("method-execution", bVar.g("1", "getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 90);
        ajc$tjp_7 = bVar.h("method-execution", bVar.g("1", "getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 94);
        ajc$tjp_8 = bVar.h("method-execution", bVar.g("1", "toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"), 148);
        ajc$tjp_9 = bVar.h("method-execution", bVar.g("1", "setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"), 204);
    }
}
