package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ZR implements TA {
    public static ZR A07;
    public static byte[] A08;
    public InterfaceC1428Lx A00;
    public T1 A01;
    public T9 A02;
    public TP A03;
    public U7 A04;
    public VM A05;
    public CY A06;

    static {
        A07();
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{44, 62, 76, 76, 66, 72, 71, -7, 61, 58, 77, 58, -7, 66, 71, 66, 77, 66, 58, 69, 66, 83, 62, 61, 28, -13, -19, 32, 27, -15, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C2194ge c2194ge) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c2194ge);
        this.A06 = A05(c2194ge, this.A03, A03(c2194ge));
        A09(c2194ge, A00(c2194ge, this.A06));
        A0A(c2194ge, this.A06);
        A0B(c2194ge, this.A06);
        if (this.A06 != null) {
            this.A06.A6d();
        }
    }

    public static SR A00(C2194ge c2194ge, CY cy) {
        if (!C1648Up.A1r(c2194ge) || cy == null) {
            return null;
        }
        return SS.A00().A00(cy);
    }

    public static TP A01(C2194ge c2194ge) {
        return TQ.A00().A00(c2194ge, new C1897bp());
    }

    public static synchronized ZR A02() {
        if (A07 == null) {
            A07 = new ZR();
        }
        return A07;
    }

    public static InterfaceC2149fv A03(C2194ge c2194ge) {
        if (!C1648Up.A1n(c2194ge)) {
            return null;
        }
        return C2167gD.A01(c2194ge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.TA
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized CY A9F() {
        return this.A06;
    }

    public static CY A05(C2194ge c2194ge, TP tp2, InterfaceC2149fv interfaceC2149fv) {
        if (!C1648Up.A2m(c2194ge) || interfaceC2149fv == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC2190ga.A00().A00(c2194ge, tp2, interfaceC2149fv, WI.A04(c2194ge), new ZW(new WA(c2194ge, A06(0, 0, 9), null, EnumC1673Vq.A08, 0, new C1677Vu(), AbstractC1725Xt.A01(C1648Up.A0N(c2194ge)), null, null, new C2317ij()), c2194ge), C2188gY.A00().A00());
    }

    public static void A08() {
        AbstractC1681Vy.A05(A06(30, 28, 52), A06(0, 24, 99), A06(24, 6, 68));
    }

    public static void A09(C2194ge c2194ge, SR sr) {
        if (!C1648Up.A1r(c2194ge) || sr == null) {
            return;
        }
        SP.A00().A00(sr, c2194ge);
    }

    public static void A0A(C2194ge c2194ge, CY cy) {
        if (!C1648Up.A0m(c2194ge) || cy == null) {
            return;
        }
        new C1593Sm(c2194ge, cy, new C1594Sn(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C2194ge c2194ge, CY cy) {
        if (cy == null) {
            return;
        }
        AbstractC1652Ut.A00(c2194ge, cy);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final VA A6n(C2194ge c2194ge) {
        return WW.A01(c2194ge);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized T9 A74(T8 t10) {
        if (this.A02 == null) {
            this.A02 = new C1764Zg(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized T1 A7G() {
        if (this.A01 == null) {
            this.A01 = new C2199gj();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized TP A7l(T8 t10) {
        if (this.A03 == null) {
            this.A03 = A01(t10.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized InterfaceC1609Tc A7n(T8 t10) {
        return new C2092f0(t10);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized TB A7x(final T8 t10) {
        return new AbstractC1896bo(t10) { // from class: com.facebook.ads.redexgen.X.72
            @Override // com.facebook.ads.redexgen.core.TB
            public final boolean A9m() {
                return TextureViewSurfaceTextureListenerC1198Cz.A09();
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ACP() {
                U2.A06(C1571Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ACn() {
                U2.A07(C1571Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ADI(C2194ge c2194ge) {
                OP.A01(c2194ge);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized InterfaceC1428Lx A8C(T8 t10) {
        if (!C1648Up.A13(t10)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC1429Ly.A00().A00(new C1860bE(t10));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized TD A8y(T8 t10) {
        return new C1834ao(t10);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final C2194ge A8z(Context context) {
        C2194ge sdkContext = T7.A00();
        if (sdkContext == null) {
            C2194ge sdkContext2 = new C2194ge(context, this);
            T7.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized VM A90(C2194ge c2194ge) {
        if (this.A05 == null) {
            this.A05 = new XP(c2194ge);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized U7 A96() {
        if (this.A04 == null) {
            this.A04 = new U7();
            A08();
        }
        return this.A04;
    }
}
