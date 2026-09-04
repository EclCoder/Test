package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/k2fsa/sherpa/onnx/FastClusteringConfig;", "", "numClusters", "", "threshold", "", "(IF)V", "getNumClusters", "()I", "setNumClusters", "(I)V", "getThreshold", "()F", "setThreshold", "(F)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class FastClusteringConfig {
    private int numClusters;
    private float threshold;

    public FastClusteringConfig() {
        this(0, 0.0f, 3, null);
    }

    public static /* synthetic */ FastClusteringConfig copy$default(FastClusteringConfig fastClusteringConfig, int i10, float f10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = fastClusteringConfig.numClusters;
        }
        if ((i11 & 2) != 0) {
            f10 = fastClusteringConfig.threshold;
        }
        return fastClusteringConfig.copy(i10, f10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumClusters() {
        return this.numClusters;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getThreshold() {
        return this.threshold;
    }

    public final FastClusteringConfig copy(int numClusters, float threshold) {
        return new FastClusteringConfig(numClusters, threshold);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FastClusteringConfig)) {
            return false;
        }
        FastClusteringConfig fastClusteringConfig = (FastClusteringConfig) other;
        return this.numClusters == fastClusteringConfig.numClusters && Float.compare(this.threshold, fastClusteringConfig.threshold) == 0;
    }

    public final int getNumClusters() {
        return this.numClusters;
    }

    public final float getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        return (Integer.hashCode(this.numClusters) * 31) + Float.hashCode(this.threshold);
    }

    public final void setNumClusters(int i10) {
        this.numClusters = i10;
    }

    public final void setThreshold(float f10) {
        this.threshold = f10;
    }

    public String toString() {
        return "FastClusteringConfig(numClusters=" + this.numClusters + ", threshold=" + this.threshold + ')';
    }

    public FastClusteringConfig(int i10, float f10) {
        this.numClusters = i10;
        this.threshold = f10;
    }

    public /* synthetic */ FastClusteringConfig(int i10, float f10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? 0.5f : f10);
    }
}
