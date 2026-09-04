package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.http.HttpStatusCodes;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TrackRunBox extends AbstractFullBox {
    public static final String TYPE = "trun";
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
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_6 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_7 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_8 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_9 = null;
    private int dataOffset;
    private List<Entry> entries;
    private SampleFlags firstSampleFlags;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Entry {
        private long sampleCompositionTimeOffset;
        private long sampleDuration;
        private SampleFlags sampleFlags;
        private long sampleSize;

        public Entry() {
        }

        public long getSampleCompositionTimeOffset() {
            return this.sampleCompositionTimeOffset;
        }

        public long getSampleDuration() {
            return this.sampleDuration;
        }

        public SampleFlags getSampleFlags() {
            return this.sampleFlags;
        }

        public long getSampleSize() {
            return this.sampleSize;
        }

        public void setSampleCompositionTimeOffset(int i10) {
            this.sampleCompositionTimeOffset = i10;
        }

        public void setSampleDuration(long j10) {
            this.sampleDuration = j10;
        }

        public void setSampleFlags(SampleFlags sampleFlags) {
            this.sampleFlags = sampleFlags;
        }

        public void setSampleSize(long j10) {
            this.sampleSize = j10;
        }

        public String toString() {
            return "Entry{duration=" + this.sampleDuration + ", size=" + this.sampleSize + ", dlags=" + this.sampleFlags + ", compTimeOffset=" + this.sampleCompositionTimeOffset + '}';
        }

        public Entry(long j10, long j11, SampleFlags sampleFlags, int i10) {
            this.sampleDuration = j10;
            this.sampleSize = j11;
            this.sampleFlags = sampleFlags;
            this.sampleCompositionTimeOffset = i10;
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackRunBox() {
        super(TYPE);
        this.entries = new ArrayList();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long uInt32 = IsoTypeReader.readUInt32(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.dataOffset = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        } else {
            this.dataOffset = -1;
        }
        if ((getFlags() & 4) == 4) {
            this.firstSampleFlags = new SampleFlags(byteBuffer);
        }
        for (int i10 = 0; i10 < uInt32; i10++) {
            Entry entry = new Entry();
            if ((getFlags() & 256) == 256) {
                entry.sampleDuration = IsoTypeReader.readUInt32(byteBuffer);
            }
            if ((getFlags() & 512) == 512) {
                entry.sampleSize = IsoTypeReader.readUInt32(byteBuffer);
            }
            if ((getFlags() & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                entry.sampleFlags = new SampleFlags(byteBuffer);
            }
            if ((getFlags() & 2048) == 2048) {
                entry.sampleCompositionTimeOffset = byteBuffer.getInt();
            }
            this.entries.add(entry);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.entries.size());
        int flags = getFlags();
        if ((flags & 1) == 1) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.dataOffset);
        }
        if ((flags & 4) == 4) {
            this.firstSampleFlags.getContent(byteBuffer);
        }
        for (Entry entry : this.entries) {
            if ((flags & 256) == 256) {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleDuration);
            }
            if ((flags & 512) == 512) {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleSize);
            }
            if ((flags & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
                entry.sampleFlags.getContent(byteBuffer);
            }
            if ((flags & 2048) == 2048) {
                if (getVersion() == 0) {
                    IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleCompositionTimeOffset);
                } else {
                    byteBuffer.putInt((int) entry.sampleCompositionTimeOffset);
                }
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        int flags = getFlags();
        long j10 = (flags & 1) == 1 ? 12L : 8L;
        if ((flags & 4) == 4) {
            j10 += 4;
        }
        long j11 = (flags & 256) == 256 ? 4L : 0L;
        if ((flags & 512) == 512) {
            j11 += 4;
        }
        if ((flags & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
            j11 += 4;
        }
        if ((flags & 2048) == 2048) {
            j11 += 4;
        }
        return j10 + (j11 * ((long) this.entries.size()));
    }

    public int getDataOffset() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_15, this, this));
        return this.dataOffset;
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.entries;
    }

    public SampleFlags getFirstSampleFlags() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_16, this, this));
        return this.firstSampleFlags;
    }

    public long[] getSampleCompositionTimeOffsets() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        if (!isSampleCompositionTimeOffsetPresent()) {
            return null;
        }
        int size = this.entries.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = this.entries.get(i10).getSampleCompositionTimeOffset();
        }
        return jArr;
    }

    public long getSampleCount() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_3, this, this));
        return this.entries.size();
    }

    public boolean isDataOffsetPresent() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        return (getFlags() & 1) == 1;
    }

    public boolean isFirstSampleFlagsPresent() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_5, this, this));
        return (getFlags() & 4) == 4;
    }

    public boolean isSampleCompositionTimeOffsetPresent() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_9, this, this));
        return (getFlags() & 2048) == 2048;
    }

    public boolean isSampleDurationPresent() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_7, this, this));
        return (getFlags() & 256) == 256;
    }

    public boolean isSampleFlagsPresent() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_8, this, this));
        return (getFlags() & UserVerificationMethods.USER_VERIFY_ALL) == 1024;
    }

    public boolean isSampleSizePresent() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_6, this, this));
        return (getFlags() & 512) == 512;
    }

    public void setDataOffset(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, pp.a.e(i10)));
        if (i10 == -1) {
            setFlags(getFlags() & 16777214);
        } else {
            setFlags(getFlags() | 1);
        }
        this.dataOffset = i10;
    }

    public void setDataOffsetPresent(boolean z10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_10, this, this, pp.a.a(z10)));
        if (z10) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & 16777214);
        }
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_19, this, this, list));
        this.entries = list;
    }

    public void setFirstSampleFlags(SampleFlags sampleFlags) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_17, this, this, sampleFlags));
        if (sampleFlags == null) {
            setFlags(getFlags() & 16777211);
        } else {
            setFlags(getFlags() | 4);
        }
        this.firstSampleFlags = sampleFlags;
    }

    public void setSampleCompositionTimeOffsetPresent(boolean z10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_14, this, this, pp.a.a(z10)));
        if (z10) {
            setFlags(getFlags() | 2048);
        } else {
            setFlags(getFlags() & 16775167);
        }
    }

    public void setSampleDurationPresent(boolean z10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_12, this, this, pp.a.a(z10)));
        if (z10) {
            setFlags(getFlags() | 256);
        } else {
            setFlags(getFlags() & 16776959);
        }
    }

    public void setSampleFlagsPresent(boolean z10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_13, this, this, pp.a.a(z10)));
        if (z10) {
            setFlags(getFlags() | UserVerificationMethods.USER_VERIFY_ALL);
        } else {
            setFlags(getFlags() & 16776191);
        }
    }

    public void setSampleSizePresent(boolean z10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_11, this, this, pp.a.a(z10)));
        if (z10) {
            setFlags(getFlags() | 512);
        } else {
            setFlags(getFlags() & 16776703);
        }
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_18, this, this));
        return "TrackRunBox{sampleCount=" + this.entries.size() + ", dataOffset=" + this.dataOffset + ", dataOffsetPresent=" + isDataOffsetPresent() + ", sampleSizePresent=" + isSampleSizePresent() + ", sampleDurationPresent=" + isSampleDurationPresent() + ", sampleFlagsPresentPresent=" + isSampleFlagsPresent() + ", sampleCompositionTimeOffsetPresent=" + isSampleCompositionTimeOffsetPresent() + ", firstSampleFlags=" + this.firstSampleFlags + '}';
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("TrackRunBox.java", TrackRunBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getEntries", HqKnbV.eVgSuzLd, "", "", "", "java.util.List"), 57);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "int", "dataOffset", "", "void"), AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
        ajc$tjp_10 = bVar.h("method-execution", bVar.g("1", "setDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 267);
        ajc$tjp_11 = bVar.h("method-execution", bVar.g("1", "setSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 275);
        ajc$tjp_12 = bVar.h("method-execution", bVar.g("1", "setSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 283);
        ajc$tjp_13 = bVar.h("method-execution", bVar.g("1", "setSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 292);
        ajc$tjp_14 = bVar.h("method-execution", bVar.g("1", "setSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
        ajc$tjp_15 = bVar.h("method-execution", bVar.g("1", "getDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "int"), Sdk$SDKError.b.ASSET_FAILED_TO_DELETE_VALUE);
        ajc$tjp_16 = bVar.h("method-execution", bVar.g("1", "getFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), Sdk$SDKError.b.EVALUATE_JAVASCRIPT_FAILED_VALUE);
        ajc$tjp_17 = bVar.h("method-execution", bVar.g("1", "setFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "firstSampleFlags", "", "void"), Sdk$SDKError.b.AD_CLOSED_TEMPLATE_ERROR_VALUE);
        ajc$tjp_18 = bVar.h("method-execution", bVar.g("1", "toString", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.lang.String"), 327);
        ajc$tjp_19 = bVar.h("method-execution", bVar.g("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "java.util.List", "entries", "", "void"), 342);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getSampleCompositionTimeOffsets", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "[J"), 129);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "getSampleCount", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "long"), 238);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "isDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 242);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "isFirstSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 246);
        ajc$tjp_6 = bVar.h("method-execution", bVar.g("1", "isSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 251);
        ajc$tjp_7 = bVar.h("method-execution", bVar.g("1", "isSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 255);
        ajc$tjp_8 = bVar.h("method-execution", bVar.g("1", "isSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 259);
        ajc$tjp_9 = bVar.h("method-execution", bVar.g("1", "isSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 263);
    }
}
