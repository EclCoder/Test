package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1138Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC2814rY A00;
    public InterfaceC2802rI A01;
    public C2790r5 A02;
    public final InterfaceC2803rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC2802rI A03 = new C1139Ap(this);

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public C1138Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC2814rY interfaceC2814rY, InterfaceC2803rJ interfaceC2803rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC2814rY;
        this.A04 = interfaceC2803rJ;
    }

    public static C1138Ao A01() {
        return new C1138Ao(new ViewpointQeConfig(), new C1141Ar(), null);
    }

    private void A05(AbstractC2805rL abstractC2805rL, InterfaceC2810rQ interfaceC2810rQ, InterfaceC1136Al interfaceC1136Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C2790r5.A01(this.A05, abstractC2805rL, interfaceC2810rQ, interfaceC1136Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C2811rU c2811rU) {
        C2790r5 c2790r5 = this.A02;
        if (c2790r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c2811rU != null) {
                c2790r5.A07(dspViewableNode, c2811rU);
            } else {
                c2790r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C2811rU c2811rU, C2807rN c2807rN) {
        C2790r5 c2790r5 = this.A02;
        if (c2790r5 != null && dspViewableNode != null && c2807rN != null) {
            if (this.A05.A00 && c2811rU != null) {
                c2807rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c2807rN.A08 + c2811rU;
                c2790r5.A08(dspViewableNode, c2811rU, c2807rN);
            } else {
                c2790r5.A09(dspViewableNode, c2807rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2807rN<?, ?> c2807rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c2807rN);
    }

    public final void A0A(AbstractC2805rL abstractC2805rL, View view) {
        if (abstractC2805rL != null && view != null) {
            A05(abstractC2805rL, new C1140Aq(view, this.A00), new C09301u(null), null);
        }
    }
}
