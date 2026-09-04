package com.googlecode.mp4parser.h264.model;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ScalingMatrix {
    public ScalingList[] ScalingList4x4;
    public ScalingList[] ScalingList8x8;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScalingMatrix{ScalingList4x4=");
        ScalingList[] scalingListArr = this.ScalingList4x4;
        sb2.append(scalingListArr == null ? null : Arrays.asList(scalingListArr));
        sb2.append("\n");
        sb2.append(", ScalingList8x8=");
        ScalingList[] scalingListArr2 = this.ScalingList8x8;
        sb2.append(scalingListArr2 != null ? Arrays.asList(scalingListArr2) : null);
        sb2.append("\n");
        sb2.append('}');
        return sb2.toString();
    }
}
