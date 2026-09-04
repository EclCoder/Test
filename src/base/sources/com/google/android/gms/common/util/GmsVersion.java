package com.google.android.gms.common.util;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class GmsVersion {
    public static final int VERSION_HALLOUMI = 4100000;
    public static final int VERSION_JARLSBERG = 4300000;
    public static final int VERSION_KENAFA = 4400000;
    public static final int VERSION_LONGHORN = 5000000;
    public static final int VERSION_MANCHEGO = 6000000;
    public static final int VERSION_ORLA = 7000000;
    public static final int VERSION_PARMESAN = 7200000;
    public static final int VERSION_QUESO = 7500000;
    public static final int VERSION_REBLOCHON = 7800000;
    public static final int VERSION_SAGA = 8000000;

    private GmsVersion() {
    }

    public static boolean isAtLeastFenacho(int i10) {
        return i10 >= 3200000;
    }
}
