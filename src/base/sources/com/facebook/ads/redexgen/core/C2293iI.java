package com.facebook.ads.redexgen.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2293iI implements T5 {
    public int A00 = -1;
    public long A01 = -1;
    public AdExperienceType A02;
    public RewardData A03;
    public RewardedVideoAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public Ad A09;
    public WeakReference<Ad> A0A;
    public final C2198gi A0B;
    public final U3 A0C;
    public final String A0D;

    public C2293iI(C2198gi c2198gi, String str, Ad ad2, U3 u10) {
        this.A0B = c2198gi;
        this.A0D = str;
        this.A09 = ad2;
        this.A0A = new WeakReference<>(ad2);
        this.A0C = u10;
        c2198gi.A0N(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.T5
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final RewardedVideoAdListener A6o() {
        return this.A04;
    }

    public final C2198gi A01() {
        return this.A0B;
    }

    public final void A02(Ad ad2) {
        if (ad2 == null && !C1648Up.A0u(this.A0B)) {
            return;
        }
        this.A09 = ad2;
    }

    @Override // com.facebook.ads.redexgen.core.T5
    public final Ad A6k() {
        return this.A09 != null ? this.A09 : this.A0A.get();
    }
}
