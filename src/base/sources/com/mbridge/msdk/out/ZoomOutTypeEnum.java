package com.mbridge.msdk.out;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum ZoomOutTypeEnum {
    FloatBall(1),
    BigView(4),
    MediumView(3),
    SmallView(2);

    private int index;

    ZoomOutTypeEnum(int i10) {
        this.index = i10;
    }

    public int getIndex() {
        return this.index;
    }
}
