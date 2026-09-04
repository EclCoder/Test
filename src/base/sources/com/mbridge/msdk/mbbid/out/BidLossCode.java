package com.mbridge.msdk.mbbid.out;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BidLossCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f31380a;

    private BidLossCode(int i10) {
        f31380a = i10;
    }

    public static BidLossCode bidPriceNotHighest() {
        return new BidLossCode(102);
    }

    public static BidLossCode bidTimeOut() {
        return new BidLossCode(2);
    }

    public static BidLossCode bidWinButNotShow() {
        return new BidLossCode(3001);
    }

    public int getCurrentCode() {
        return f31380a;
    }
}
