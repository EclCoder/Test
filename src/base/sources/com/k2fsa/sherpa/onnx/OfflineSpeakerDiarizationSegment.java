package com.k2fsa.sherpa.onnx;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationSegment;", "", "start", "", TtmlNode.END, "speaker", "", "(FFI)V", "getEnd", "()F", "getSpeaker", "()I", "getStart", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OfflineSpeakerDiarizationSegment {
    private final float end;
    private final int speaker;
    private final float start;

    public OfflineSpeakerDiarizationSegment(float f10, float f11, int i10) {
        this.start = f10;
        this.end = f11;
        this.speaker = i10;
    }

    public static /* synthetic */ OfflineSpeakerDiarizationSegment copy$default(OfflineSpeakerDiarizationSegment offlineSpeakerDiarizationSegment, float f10, float f11, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f10 = offlineSpeakerDiarizationSegment.start;
        }
        if ((i11 & 2) != 0) {
            f11 = offlineSpeakerDiarizationSegment.end;
        }
        if ((i11 & 4) != 0) {
            i10 = offlineSpeakerDiarizationSegment.speaker;
        }
        return offlineSpeakerDiarizationSegment.copy(f10, f11, i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSpeaker() {
        return this.speaker;
    }

    public final OfflineSpeakerDiarizationSegment copy(float start, float end, int speaker) {
        return new OfflineSpeakerDiarizationSegment(start, end, speaker);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineSpeakerDiarizationSegment)) {
            return false;
        }
        OfflineSpeakerDiarizationSegment offlineSpeakerDiarizationSegment = (OfflineSpeakerDiarizationSegment) other;
        return Float.compare(this.start, offlineSpeakerDiarizationSegment.start) == 0 && Float.compare(this.end, offlineSpeakerDiarizationSegment.end) == 0 && this.speaker == offlineSpeakerDiarizationSegment.speaker;
    }

    public final float getEnd() {
        return this.end;
    }

    public final int getSpeaker() {
        return this.speaker;
    }

    public final float getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((Float.hashCode(this.start) * 31) + Float.hashCode(this.end)) * 31) + Integer.hashCode(this.speaker);
    }

    public String toString() {
        return "OfflineSpeakerDiarizationSegment(start=" + this.start + ", end=" + this.end + ", speaker=" + this.speaker + ')';
    }
}
