package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public enum dkl {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);

    private final int dse;

    dkl(int i10) {
        this.dse = i10;
    }

    public int hnj() {
        return this.dse;
    }

    public static dkl hnj(int i10) {
        if (i10 == 0) {
            return FLEX_START;
        }
        if (i10 == 1) {
            return CENTER;
        }
        if (i10 == 2) {
            return FLEX_END;
        }
        if (i10 == 3) {
            return SPACE_BETWEEN;
        }
        if (i10 == 4) {
            return SPACE_AROUND;
        }
        if (i10 == 5) {
            return SPACE_EVENLY;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }

    public static dkl hnj(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return CENTER;
            case "space_around":
                return SPACE_AROUND;
            case "space_evenly":
                return SPACE_EVENLY;
            case "flex_start":
                return FLEX_START;
            case "space_between":
                return SPACE_BETWEEN;
            case "flex_end":
                return FLEX_END;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
