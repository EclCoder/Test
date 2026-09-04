package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.view.Surface;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2125fX {
    public static byte[] A02;
    public final AA A00;
    public final C2566nA A01 = new C2566nA();

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C2125fX(C2198gi c2198gi) {
        InterfaceC1237Em trackSelectionFactory = new C2583nR(this.A01);
        C11159h c11159h = new C11159h(trackSelectionFactory);
        AnonymousClass74 loadControl = new C2676ox();
        this.A00 = AbstractC10376b.A00(new C2673ou(c2198gi), c11159h, loadControl, this.A01);
    }

    public static String A01(C2739pz c2739pz) {
        boolean z10 = c2739pz instanceof AD;
        String strA00 = A00(36, 2, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        String strA01 = A00(0, 14, 108);
        if (z10) {
            AD ad2 = (AD) c2739pz;
            return A00(55, 11, 8) + ad2.A03 + A00(14, 22, 98) + ad2.A02 + strA01 + ad2.getCause() + strA00;
        }
        return A00(41, 14, 99) + c2739pz.getMessage() + strA01 + c2739pz.getCause() + strA00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7e();
    }

    public final long A07() {
        return this.A00.A7s();
    }

    public final C2123fV A08() {
        C2758qI vf2 = this.A00.A0K();
        if (vf2 == null) {
            return null;
        }
        return new C2123fV(vf2.A0L, vf2.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f10) {
        this.A00.A0M(f10);
    }

    public final void A0D(long j10) {
        this.A00.A04(j10);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C2194ge c2194ge, Uri uri) {
        if (C1648Up.A2z(c2194ge, A03())) {
            C2129fb cacheManager = C2129fb.A06(c2194ge);
            C5Y cachedDataSourceFactory = cacheManager.A0H(c2194ge);
            this.A00.A0Q(new C11209o(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC1196Cx mediaSource = new C11209o(new C2693pE(c2194ge, C5C.A0j(c2194ge, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC2122fU interfaceC2122fU) {
        this.A00.A0O(new D6(this, interfaceC2122fU));
    }

    public final void A0H(final InterfaceC2124fW interfaceC2124fW) {
        this.A00.A0P(new InterfaceC2664ol() { // from class: com.facebook.ads.redexgen.X.2s
            @Override // com.facebook.ads.redexgen.core.C5L
            public final void AGa(int i10, int i11, int i12, float f10) {
                interfaceC2124fW.AGa(i10, i11, i12, f10);
            }
        });
    }

    public final void A0I(boolean z10) {
        this.A00.A0S(z10);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
