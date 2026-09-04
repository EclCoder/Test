package com.hecorat.screenrecorder.free.models;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@g(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/hecorat/screenrecorder/free/models/EncodeParam;", "", "Lcom/hecorat/screenrecorder/free/models/Resolution;", "resolution", "Lcom/hecorat/screenrecorder/free/models/BitRate;", "bitRate", "Lcom/hecorat/screenrecorder/free/models/FrameRate;", "frameRate", "<init>", "(Lcom/hecorat/screenrecorder/free/models/Resolution;Lcom/hecorat/screenrecorder/free/models/BitRate;Lcom/hecorat/screenrecorder/free/models/FrameRate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/hecorat/screenrecorder/free/models/Resolution;", "c", "()Lcom/hecorat/screenrecorder/free/models/Resolution;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/hecorat/screenrecorder/free/models/BitRate;", "()Lcom/hecorat/screenrecorder/free/models/BitRate;", "Lcom/hecorat/screenrecorder/free/models/FrameRate;", "()Lcom/hecorat/screenrecorder/free/models/FrameRate;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EncodeParam {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Resolution resolution;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BitRate bitRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final FrameRate frameRate;

    public EncodeParam(Resolution resolution, BitRate bitRate, FrameRate frameRate) {
        s.h(resolution, "resolution");
        s.h(bitRate, "bitRate");
        s.h(frameRate, "frameRate");
        this.resolution = resolution;
        this.bitRate = bitRate;
        this.frameRate = frameRate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BitRate getBitRate() {
        return this.bitRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final FrameRate getFrameRate() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Resolution getResolution() {
        return this.resolution;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncodeParam)) {
            return false;
        }
        EncodeParam encodeParam = (EncodeParam) other;
        return s.c(this.resolution, encodeParam.resolution) && s.c(this.bitRate, encodeParam.bitRate) && s.c(this.frameRate, encodeParam.frameRate);
    }

    public int hashCode() {
        return (((this.resolution.hashCode() * 31) + this.bitRate.hashCode()) * 31) + this.frameRate.hashCode();
    }

    public String toString() {
        return "EncodeParam(resolution=" + this.resolution + ", bitRate=" + this.bitRate + ", frameRate=" + this.frameRate + ')';
    }
}
