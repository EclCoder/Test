package com.facebook.ads.redexgen.core;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1211Dm implements InterfaceC2086eu {
    public static String[] A0E = {"2ZSu0wXuDbQnaud22BC", "QCmSLF", "fQxhtf", "E3sU0uCnWEnB3ZcSzOkvj4xNFgaNSXPe", "Ye0yKWwaCEsRuR61siA7kBVWrkv2bkox", "1q930HE08Ni0sTckStF", "wfAs2pJjw0biCEJKLi3nGPcNksloIp8Y", "ZBBhRoR6L"};
    public C1235Ek A01;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final E4 A09 = new E4() { // from class: com.facebook.ads.redexgen.X.42
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4B c4b) {
            this.A00.A07.removeCallbacksAndMessages(null);
            if (this.A00.A0G(EnumC2111fJ.A04)) {
                this.A00.A03();
                this.A00.A06(true, false);
            }
            this.A00.A05 = true;
        }
    };
    public final EA A08 = new EA() { // from class: com.facebook.ads.redexgen.X.41
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4K c4k) {
            this.A00.A02 = true;
            if (this.A00.A03) {
                return;
            }
            this.A00.A03();
            this.A00.A06(false, false);
            this.A00.A05 = true;
        }
    };
    public final E2 A0A = new C09813x(this);
    public final AbstractC1224Dz A0B = new AbstractC1224Dz() { // from class: com.facebook.ads.redexgen.X.3w
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4A c4a) {
            if (this.A00.A04 || !this.A00.A0G(EnumC2111fJ.A04)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, false);
        }
    };
    public final AbstractC1218Dt A0C = new C09793v(this);
    public final Handler A07 = new Handler();
    public final List<InterfaceC2112fK> A0D = new ArrayList();
    public int A00 = 2000;
    public boolean A02 = false;

    public C1211Dm(boolean z10, boolean z11) {
        this.A04 = z10;
        this.A03 = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        this.A07.removeCallbacksAndMessages(null);
        Iterator<InterfaceC2112fK> it = this.A0D.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0E[7].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "Y40dGjVL9Zscw9FMyiKWKh6z3JvZ0T5u";
            strArr[4] = "hO4VpYUkDoigTR3nwiJ8PFOPPoG0N1QG";
            if (zHasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(boolean z10, boolean z11) {
        Iterator<InterfaceC2112fK> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().A4A(z10, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0G(EnumC2111fJ enumC2111fJ) {
        Iterator<InterfaceC2112fK> it = this.A0D.iterator();
        while (it.hasNext()) {
            if (it.next().A9B() != enumC2111fJ) {
                return false;
            }
        }
        return true;
    }

    public final void A0H() {
        this.A0D.clear();
    }

    public final void A0I() {
        if (this.A04) {
            this.A07.removeCallbacksAndMessages(null);
            this.A04 = false;
        }
    }

    public final void A0J() {
        this.A06 = true;
        this.A05 = true;
        A06(false, false);
    }

    public final void A0K(int i10) {
        this.A00 = i10;
    }

    public final void A0L(InterfaceC2112fK interfaceC2112fK) {
        this.A0D.add(interfaceC2112fK);
    }

    public final boolean A0M() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2086eu
    public final void AAv(C1235Ek c1235Ek) {
        this.A01 = c1235Ek;
        c1235Ek.getEventBus().A03(this.A09, this.A0C, this.A0A, this.A0B, this.A08);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2086eu
    public final void AKV(C1235Ek c1235Ek) {
        A03();
        c1235Ek.getEventBus().A04(this.A08, this.A0C, this.A0A, this.A0B, this.A09);
        this.A01 = null;
    }
}
