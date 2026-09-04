package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/k2fsa/sherpa/onnx/EndpointRule;", "", "mustContainNonSilence", "", "minTrailingSilence", "", "minUtteranceLength", "(ZFF)V", "getMinTrailingSilence", "()F", "setMinTrailingSilence", "(F)V", "getMinUtteranceLength", "setMinUtteranceLength", "getMustContainNonSilence", "()Z", "setMustContainNonSilence", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class EndpointRule {
    private float minTrailingSilence;
    private float minUtteranceLength;
    private boolean mustContainNonSilence;

    public EndpointRule(boolean z10, float f10, float f11) {
        this.mustContainNonSilence = z10;
        this.minTrailingSilence = f10;
        this.minUtteranceLength = f11;
    }

    public static /* synthetic */ EndpointRule copy$default(EndpointRule endpointRule, boolean z10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = endpointRule.mustContainNonSilence;
        }
        if ((i10 & 2) != 0) {
            f10 = endpointRule.minTrailingSilence;
        }
        if ((i10 & 4) != 0) {
            f11 = endpointRule.minUtteranceLength;
        }
        return endpointRule.copy(z10, f10, f11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getMustContainNonSilence() {
        return this.mustContainNonSilence;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getMinTrailingSilence() {
        return this.minTrailingSilence;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMinUtteranceLength() {
        return this.minUtteranceLength;
    }

    public final EndpointRule copy(boolean mustContainNonSilence, float minTrailingSilence, float minUtteranceLength) {
        return new EndpointRule(mustContainNonSilence, minTrailingSilence, minUtteranceLength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndpointRule)) {
            return false;
        }
        EndpointRule endpointRule = (EndpointRule) other;
        return this.mustContainNonSilence == endpointRule.mustContainNonSilence && Float.compare(this.minTrailingSilence, endpointRule.minTrailingSilence) == 0 && Float.compare(this.minUtteranceLength, endpointRule.minUtteranceLength) == 0;
    }

    public final float getMinTrailingSilence() {
        return this.minTrailingSilence;
    }

    public final float getMinUtteranceLength() {
        return this.minUtteranceLength;
    }

    public final boolean getMustContainNonSilence() {
        return this.mustContainNonSilence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.mustContainNonSilence;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return (((r10 * 31) + Float.hashCode(this.minTrailingSilence)) * 31) + Float.hashCode(this.minUtteranceLength);
    }

    public final void setMinTrailingSilence(float f10) {
        this.minTrailingSilence = f10;
    }

    public final void setMinUtteranceLength(float f10) {
        this.minUtteranceLength = f10;
    }

    public final void setMustContainNonSilence(boolean z10) {
        this.mustContainNonSilence = z10;
    }

    public String toString() {
        return "EndpointRule(mustContainNonSilence=" + this.mustContainNonSilence + ", minTrailingSilence=" + this.minTrailingSilence + ", minUtteranceLength=" + this.minUtteranceLength + ')';
    }
}
