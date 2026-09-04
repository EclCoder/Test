package com.facebook.ads.redexgen.core;

import com.facebook.ads.RewardedVideoAd;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2311ib extends N2 {
    public static byte[] A01;
    public final /* synthetic */ C2309iZ A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, 24, 1, 36, 40, 41, 51, 53, 40, 43, 43, 34, 53, 103, 46, 52, 103, 41, 50, 43, 43};
    }

    public C2311ib(C2309iZ c2309iZ) {
        this.A00 = c2309iZ;
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A06() {
        this.A00.A07.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A07() {
        this.A00.A07.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A08() {
        if (this.A00.A02 == null) {
            this.A00.A07.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A09() {
        if (this.A00.A02 == null) {
            this.A00.A07.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0A() {
        if (this.A00.A02 != null) {
            SJ sj2 = (SJ) this.A00.A02.buildShowAdConfig();
            sj2.A02(System.currentTimeMillis() - this.A00.A01);
            this.A00.A02.show(sj2.build());
            return;
        }
        this.A00.A07.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0C() {
        this.A00.A06.A0F().A3K();
        this.A00.A07.onAdClicked(this.A00.A08.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0D() {
        this.A00.A07.onLoggingImpression(this.A00.A08.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0F(N1 n10) {
        if (this.A00.A04 == null) {
            this.A00.A06.A08().ABC(A00(0, 3, 67), AbstractC1610Td.A0N, new C1611Te(A00(3, 18, 108)));
            return;
        }
        AbstractC2367jh abstractC2367jh = (AbstractC2367jh) n10;
        if (this.A00.A08.A03 != null) {
            abstractC2367jh.A02(this.A00.A08.A03);
        }
        this.A00.A08.A00 = abstractC2367jh.A0H();
        this.A00.A05 = true;
        this.A00.A03 = this.A00.A04.A0I();
        if (this.A00.A03 != null) {
            int iA26 = 0;
            if (!this.A00.A03.A1b()) {
                iA26 = ((AbstractC2363jd) this.A00.A03).A26();
            }
            if (iA26 > 0) {
                XC xc2 = new XC();
                if (xc2.A09(this.A00.A06, this.A00.A08.A06, iA26)) {
                    xc2.A08(this.A00.A06, true);
                    this.A00.A02 = xc2.A07(this.A00.A06, this.A00.A08.A0D, this.A00.A08.A06);
                } else {
                    xc2.A08(this.A00.A06, false);
                }
            }
        }
        if (this.A00.A02 != null) {
            ((AbstractC2363jd) this.A00.A03).A2J(true);
            RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = this.A00.A02.buildLoadAdConfig().withFailOnCacheFailureEnabled(true).withRewardData(this.A00.A03.A0s()).withAdExperience(this.A00.A08.A02).withAdListener(new OI(this)).build();
            this.A00.A02.loadAd(loadAdConfig);
            return;
        }
        this.A00.A07.onAdLoaded(this.A00.A08.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0G(C1670Vm c1670Vm) {
        this.A00.A0D(true);
        this.A00.A08.A0B.A0F().A3N(Y1.A01(this.A00.A00), c1670Vm.A03().getErrorCode(), c1670Vm.A04());
        this.A00.A07.onError(this.A00.A08.A6k(), XE.A00(c1670Vm));
    }
}
