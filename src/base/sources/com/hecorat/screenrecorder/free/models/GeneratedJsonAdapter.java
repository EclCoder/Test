package com.hecorat.screenrecorder.free.models;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.squareup.moshi.f;
import com.squareup.moshi.i;
import com.squareup.moshi.o;
import com.squareup.moshi.r;
import gl.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vj.c;

/* JADX INFO: renamed from: com.hecorat.screenrecorder.free.models.EncodeParamJsonAdapter, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006 "}, d2 = {"Lcom/hecorat/screenrecorder/free/models/EncodeParamJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/hecorat/screenrecorder/free/models/EncodeParam;", "Lcom/squareup/moshi/r;", "moshi", "<init>", "(Lcom/squareup/moshi/r;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/i;", "reader", "a", "(Lcom/squareup/moshi/i;)Lcom/hecorat/screenrecorder/free/models/EncodeParam;", "Lcom/squareup/moshi/o;", "writer", "value_", "Lfl/g0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Lcom/squareup/moshi/o;Lcom/hecorat/screenrecorder/free/models/EncodeParam;)V", "Lcom/squareup/moshi/i$a;", "Lcom/squareup/moshi/i$a;", "options", "Lcom/hecorat/screenrecorder/free/models/Resolution;", "Lcom/squareup/moshi/f;", "resolutionAdapter", "Lcom/hecorat/screenrecorder/free/models/BitRate;", "c", "bitRateAdapter", "Lcom/hecorat/screenrecorder/free/models/FrameRate;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "frameRateAdapter", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GeneratedJsonAdapter extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i.a options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f resolutionAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f bitRateAdapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f frameRateAdapter;

    public GeneratedJsonAdapter(r moshi) {
        s.h(moshi, "moshi");
        i.a aVarA = i.a.a("resolution", "bitRate", "frameRate");
        s.g(aVarA, "of(...)");
        this.options = aVarA;
        f fVarF = moshi.f(Resolution.class, s0.d(), "resolution");
        s.g(fVarF, "adapter(...)");
        this.resolutionAdapter = fVarF;
        f fVarF2 = moshi.f(BitRate.class, s0.d(), "bitRate");
        s.g(fVarF2, "adapter(...)");
        this.bitRateAdapter = fVarF2;
        f fVarF3 = moshi.f(FrameRate.class, s0.d(), "frameRate");
        s.g(fVarF3, "adapter(...)");
        this.frameRateAdapter = fVarF3;
    }

    @Override // com.squareup.moshi.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EncodeParam fromJson(i reader) {
        s.h(reader, "reader");
        reader.h();
        Resolution resolution = null;
        BitRate bitRate = null;
        FrameRate frameRate = null;
        while (reader.q()) {
            int iN0 = reader.N0(this.options);
            if (iN0 == -1) {
                reader.W0();
                reader.X0();
            } else if (iN0 == 0) {
                resolution = (Resolution) this.resolutionAdapter.fromJson(reader);
                if (resolution == null) {
                    throw c.v("resolution", "resolution", reader);
                }
            } else if (iN0 == 1) {
                bitRate = (BitRate) this.bitRateAdapter.fromJson(reader);
                if (bitRate == null) {
                    throw c.v("bitRate", "bitRate", reader);
                }
            } else if (iN0 == 2 && (frameRate = (FrameRate) this.frameRateAdapter.fromJson(reader)) == null) {
                throw c.v("frameRate", "frameRate", reader);
            }
        }
        reader.l();
        if (resolution == null) {
            throw c.n("resolution", "resolution", reader);
        }
        if (bitRate == null) {
            throw c.n("bitRate", "bitRate", reader);
        }
        if (frameRate != null) {
            return new EncodeParam(resolution, bitRate, frameRate);
        }
        throw c.n("frameRate", "frameRate", reader);
    }

    @Override // com.squareup.moshi.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(o writer, EncodeParam value_) {
        s.h(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.h();
        writer.t("resolution");
        this.resolutionAdapter.toJson(writer, value_.getResolution());
        writer.t("bitRate");
        this.bitRateAdapter.toJson(writer, value_.getBitRate());
        writer.t("frameRate");
        this.frameRateAdapter.toJson(writer, value_.getFrameRate());
        writer.m();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("EncodeParam");
        sb2.append(')');
        return sb2.toString();
    }
}
