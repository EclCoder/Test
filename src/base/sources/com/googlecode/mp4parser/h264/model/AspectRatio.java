package com.googlecode.mp4parser.h264.model;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AspectRatio {
    public static final AspectRatio Extended_SAR = new AspectRatio(255);
    private int value;

    private AspectRatio(int i10) {
        this.value = i10;
    }

    public static AspectRatio fromValue(int i10) {
        AspectRatio aspectRatio = Extended_SAR;
        return i10 == aspectRatio.value ? aspectRatio : new AspectRatio(i10);
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return "AspectRatio{value=" + this.value + '}';
    }
}
