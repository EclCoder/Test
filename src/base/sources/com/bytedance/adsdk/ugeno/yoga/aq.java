package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public enum aq {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int gjv;

    aq(int i10) {
        this.gjv = i10;
    }

    public static aq hnj(int i10) {
        if (i10 == 0) {
            return UNDEFINED;
        }
        if (i10 == 1) {
            return EXACTLY;
        }
        if (i10 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }
}
