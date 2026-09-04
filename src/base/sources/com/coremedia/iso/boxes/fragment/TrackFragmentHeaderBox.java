package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TrackFragmentHeaderBox extends AbstractFullBox {
    public static final String TYPE = "tfhd";
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
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_6 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_7 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_8 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_9 = null;
    private long baseDataOffset;
    private boolean defaultBaseIsMoof;
    private long defaultSampleDuration;
    private SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private boolean durationIsEmpty;
    private long sampleDescriptionIndex;
    private long trackId;

    static {
        ajc$preClinit();
    }

    public TrackFragmentHeaderBox() {
        super(TYPE);
        this.baseDataOffset = -1L;
        this.defaultSampleDuration = -1L;
        this.defaultSampleSize = -1L;
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("TrackFragmentHeaderBox.java", TrackFragmentHeaderBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "hasBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "hasSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 130);
        ajc$tjp_10 = bVar.h("method-execution", bVar.g("1", "setSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "sampleDescriptionIndex", "", "void"), 171);
        ajc$tjp_11 = bVar.h("method-execution", bVar.g("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 180);
        ajc$tjp_12 = bVar.h("method-execution", bVar.g("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleDuration", "", "void"), 184);
        ajc$tjp_13 = bVar.h("method-execution", bVar.g("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 191);
        ajc$tjp_14 = bVar.h("method-execution", bVar.g("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleSize", "", "void"), 195);
        ajc$tjp_15 = bVar.h("method-execution", bVar.g("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 204);
        ajc$tjp_16 = bVar.h("method-execution", bVar.g("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), Sdk$SDKError.b.INVALID_BID_PAYLOAD_VALUE);
        ajc$tjp_17 = bVar.h("method-execution", bVar.g("1", "isDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE);
        ajc$tjp_18 = bVar.h("method-execution", bVar.g("1", "setDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "durationIsEmpty", "", "void"), Sdk$SDKError.b.AD_LOAD_FAIL_RETRY_AFTER_VALUE);
        ajc$tjp_19 = bVar.h("method-execution", bVar.g("1", "isDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 230);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "hasDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 134);
        ajc$tjp_20 = bVar.h("method-execution", bVar.g("1", "setDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "defaultBaseIsMoof", "", "void"), 234);
        ajc$tjp_21 = bVar.h("method-execution", bVar.g("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "java.lang.String"), 244);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "hasDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 138);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "hasDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 142);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 146);
        ajc$tjp_6 = bVar.h("method-execution", bVar.g("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "trackId", "", "void"), 150);
        ajc$tjp_7 = bVar.h("method-execution", bVar.g("1", "getBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 154);
        ajc$tjp_8 = bVar.h("method-execution", bVar.g("1", "setBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "baseDataOffset", "", "void"), 158);
        ajc$tjp_9 = bVar.h("method-execution", bVar.g("1", "getSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 167);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = IsoTypeReader.readUInt32(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.baseDataOffset = IsoTypeReader.readUInt64(byteBuffer);
        }
        if ((getFlags() & 2) == 2) {
            this.sampleDescriptionIndex = IsoTypeReader.readUInt32(byteBuffer);
        }
        if ((getFlags() & 8) == 8) {
            this.defaultSampleDuration = IsoTypeReader.readUInt32(byteBuffer);
        }
        if ((getFlags() & 16) == 16) {
            this.defaultSampleSize = IsoTypeReader.readUInt32(byteBuffer);
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags = new SampleFlags(byteBuffer);
        }
        if ((getFlags() & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 65536) {
            this.durationIsEmpty = true;
        }
        if ((getFlags() & 131072) == 131072) {
            this.defaultBaseIsMoof = true;
        }
    }

    public long getBaseDataOffset() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_7, this, this));
        return this.baseDataOffset;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.trackId);
        if ((getFlags() & 1) == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer, getBaseDataOffset());
        }
        if ((getFlags() & 2) == 2) {
            IsoTypeWriter.writeUInt32(byteBuffer, getSampleDescriptionIndex());
        }
        if ((getFlags() & 8) == 8) {
            IsoTypeWriter.writeUInt32(byteBuffer, getDefaultSampleDuration());
        }
        if ((getFlags() & 16) == 16) {
            IsoTypeWriter.writeUInt32(byteBuffer, getDefaultSampleSize());
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags.getContent(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        int flags = getFlags();
        long j10 = (flags & 1) == 1 ? 16L : 8L;
        if ((flags & 2) == 2) {
            j10 += 4;
        }
        if ((flags & 8) == 8) {
            j10 += 4;
        }
        if ((flags & 16) == 16) {
            j10 += 4;
        }
        return (flags & 32) == 32 ? j10 + 4 : j10;
    }

    public long getDefaultSampleDuration() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_11, this, this));
        return this.defaultSampleDuration;
    }

    public SampleFlags getDefaultSampleFlags() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_15, this, this));
        return this.defaultSampleFlags;
    }

    public long getDefaultSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_13, this, this));
        return this.defaultSampleSize;
    }

    public long getSampleDescriptionIndex() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_9, this, this));
        return this.sampleDescriptionIndex;
    }

    public long getTrackId() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_5, this, this));
        return this.trackId;
    }

    public boolean hasBaseDataOffset() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return (getFlags() & 1) != 0;
    }

    public boolean hasDefaultSampleDuration() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        return (getFlags() & 8) != 0;
    }

    public boolean hasDefaultSampleFlags() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        return (getFlags() & 32) != 0;
    }

    public boolean hasDefaultSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_3, this, this));
        return (getFlags() & 16) != 0;
    }

    public boolean hasSampleDescriptionIndex() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_1, this, this));
        return (getFlags() & 2) != 0;
    }

    public boolean isDefaultBaseIsMoof() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_19, this, this));
        return this.defaultBaseIsMoof;
    }

    public boolean isDurationIsEmpty() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_17, this, this));
        return this.durationIsEmpty;
    }

    public void setBaseDataOffset(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_8, this, this, pp.a.f(j10)));
        if (j10 == -1) {
            setFlags(getFlags() & 2147483646);
        } else {
            setFlags(getFlags() | 1);
        }
        this.baseDataOffset = j10;
    }

    public void setDefaultBaseIsMoof(boolean z10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_20, this, this, pp.a.a(z10)));
        if (z10) {
            setFlags(getFlags() | 131072);
        } else {
            setFlags(getFlags() & 16646143);
        }
        this.defaultBaseIsMoof = z10;
    }

    public void setDefaultSampleDuration(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_12, this, this, pp.a.f(j10)));
        setFlags(getFlags() | 8);
        this.defaultSampleDuration = j10;
    }

    public void setDefaultSampleFlags(SampleFlags sampleFlags) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_16, this, this, sampleFlags));
        if (sampleFlags != null) {
            setFlags(getFlags() | 32);
        } else {
            setFlags(getFlags() & 16777183);
        }
        this.defaultSampleFlags = sampleFlags;
    }

    public void setDefaultSampleSize(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_14, this, this, pp.a.f(j10)));
        if (j10 != -1) {
            setFlags(getFlags() | 16);
        } else {
            setFlags(getFlags() & 16777199);
        }
        this.defaultSampleSize = j10;
    }

    public void setDurationIsEmpty(boolean z10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_18, this, this, pp.a.a(z10)));
        if (this.defaultBaseIsMoof) {
            setFlags(getFlags() | C.DEFAULT_BUFFER_SEGMENT_SIZE);
        } else {
            setFlags(getFlags() & 16711679);
        }
        this.durationIsEmpty = z10;
    }

    public void setSampleDescriptionIndex(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_10, this, this, pp.a.f(j10)));
        if (j10 == -1) {
            setFlags(getFlags() & 2147483645);
        } else {
            setFlags(getFlags() | 2);
        }
        this.sampleDescriptionIndex = j10;
    }

    public void setTrackId(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_6, this, this, pp.a.f(j10)));
        this.trackId = j10;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_21, this, this));
        return "TrackFragmentHeaderBox{trackId=" + this.trackId + ", baseDataOffset=" + this.baseDataOffset + ", sampleDescriptionIndex=" + this.sampleDescriptionIndex + ", defaultSampleDuration=" + this.defaultSampleDuration + ", defaultSampleSize=" + this.defaultSampleSize + ", defaultSampleFlags=" + this.defaultSampleFlags + ", durationIsEmpty=" + this.durationIsEmpty + ", defaultBaseIsMoof=" + this.defaultBaseIsMoof + '}';
    }
}
