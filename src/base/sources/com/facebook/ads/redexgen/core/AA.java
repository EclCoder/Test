package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AA extends AbstractC2763qP implements InterfaceC2671os {
    public static byte[] A0N;
    public static String[] A0O = {"ryR4HSm2zR8tip5OkgYwdb0JWy9e3v2W", "Fm5MoQAoRuRRmRXPK4I4CJ8bYaju2JW1", "syIAGKVT8Ewa7Rni6nktnCNdH4Ja85Gc", "ScHbfbbxkU", "HZJXjhizoNO31MnMnm7FxQnRU8I8lePN", "YCsl9os6nHqs6yB8LR1hlQvfR5oCt3rk", "Ml6mHBX1GsWDWNWH2EtCrt2HpilhtHKz", "59SI8zfcXXU2xe69nRlPKARsr0343GFe"};
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public C2764qQ A06;
    public C2758qI A07;
    public C2758qI A08;
    public C6I A09;
    public C6I A0A;
    public InterfaceC1196Cx A0B;
    public boolean A0C;
    public final Handler A0D;
    public final AC A0E;
    public final SurfaceHolderCallbackC2665om A0F;
    public final InterfaceC2662oj A0G;
    public final CopyOnWriteArraySet<InterfaceC11028p> A0H;
    public final CopyOnWriteArraySet<C3U> A0I;
    public final CopyOnWriteArraySet<InterfaceC1155Bf> A0J;
    public final CopyOnWriteArraySet<GQ> A0K;
    public final CopyOnWriteArraySet<InterfaceC2664ol> A0L;
    public final InterfaceC2667oo[] A0M;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public AA(Context context, InterfaceC10817t interfaceC10817t, AbstractC1247Ew abstractC1247Ew, AnonymousClass74 anonymousClass74, F6 f10, A6 a10, InterfaceC2409kO<AnonymousClass45, InterfaceC2662oj> interfaceC2409kO, AnonymousClass45 anonymousClass45) {
        this.A0F = new SurfaceHolderCallbackC2665om(this);
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0H = new CopyOnWriteArraySet<>();
        Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0D = new Handler(looperMyLooper);
        this.A0M = interfaceC10817t.A5Y(this.A0D, this.A0F, this.A0F, this.A0F, this.A0F, a10);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A06 = C2764qQ.A07;
        this.A02 = 1;
        this.A0E = A06(this.A0M, abstractC1247Ew, anonymousClass74, f10, anonymousClass45);
        this.A0G = interfaceC2409kO.A4B(anonymousClass45);
        this.A0G.AJf(this.A0E, looperMyLooper);
        this.A0I = new CopyOnWriteArraySet<>();
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0N = new byte[]{-41, -19, -15, -12, -16, -23, -55, -4, -13, -44, -16, -27, -3, -23, -10, 12, 46, 43, 31, 26, 28, 30, 13, 30, 49, 45, 46, 43, 30, 5, 34, 44, 45, 30, 39, 30, 43, -39, 26, 37, 43, 30, 26, 29, 50, -39, 46, 39, 44, 30, 45, -39, 40, 43, -39, 43, 30, 41, 37, 26, 28, 30, 29, -25};
    }

    static {
        A0E();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kO != com.google.common.base.Function<com.facebook.ads.androidx.media3.common.util.Clock, com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsCollector> */
    public AA(Context context, InterfaceC10817t interfaceC10817t, AbstractC1247Ew abstractC1247Ew, AnonymousClass74 anonymousClass74, F6 f10, A6 a10, InterfaceC2409kO<AnonymousClass45, InterfaceC2662oj> interfaceC2409kO) {
        this(context, interfaceC10817t, abstractC1247Ew, anonymousClass74, f10, a10, interfaceC2409kO, AnonymousClass45.A00);
    }

    @Deprecated
    public AA(InterfaceC10817t interfaceC10817t, AbstractC1247Ew abstractC1247Ew, AnonymousClass74 anonymousClass74, F6 f10, A6 a10) {
        this(null, interfaceC10817t, abstractC1247Ew, anonymousClass74, f10, a10, new InterfaceC2409kO() { // from class: com.facebook.ads.redexgen.X.or
            @Override // com.facebook.ads.redexgen.core.InterfaceC2409kO
            public final Object A4B(Object obj) {
                return new A8((AnonymousClass45) obj);
            }
        });
    }

    private final AC A06(InterfaceC2667oo[] interfaceC2667ooArr, AbstractC1247Ew abstractC1247Ew, AnonymousClass74 anonymousClass74, F6 f10, AnonymousClass45 anonymousClass45) {
        return new AC(interfaceC2667ooArr, abstractC1247Ew, anonymousClass74, f10, anonymousClass45);
    }

    private void A0D() {
        if (this.A05 != null) {
            if (this.A05.getSurfaceTextureListener() != this.A0F) {
                Log.w(A07(0, 15, 71), A07(15, 49, Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        if (this.A04 != null) {
            this.A04.removeCallback(this.A0F);
            String[] strArr = A0O;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0O;
            strArr2[6] = "1mt3T64XRkFMJTK0AHNCLCnfNjMbTppi";
            strArr2[3] = "rnp4JtgfYQ";
            this.A04 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(Surface surface, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2667oo interfaceC2667oo : this.A0M) {
            if (interfaceC2667oo.A9N() == 2) {
                arrayList.add(this.A0E.A0L(interfaceC2667oo).A07(1).A08(surface).A06());
            }
        }
        if (this.A03 != null && this.A03 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C10657d) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0C) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0C = z10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2763qP
    public final void A0H(int i10, long j10) {
        this.A0G.ACe();
        this.A0E.A0H(i10, j10);
    }

    public final int A0I() {
        return this.A01;
    }

    public final C2758qI A0J() {
        return this.A07;
    }

    public final C2758qI A0K() {
        return this.A08;
    }

    public final void A0L() {
        this.A0E.A0M();
        A0D();
        if (this.A03 != null) {
            if (this.A0C) {
                this.A03.release();
            }
            this.A03 = null;
        }
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
            this.A0B = null;
        }
    }

    public final void A0M(float f10) {
        float fA00 = C5C.A00(f10, 0.0f, 1.0f);
        if (this.A00 == fA00) {
            return;
        }
        this.A00 = fA00;
        for (InterfaceC2667oo interfaceC2667oo : this.A0M) {
            if (interfaceC2667oo.A9N() == 1) {
                this.A0E.A0L(interfaceC2667oo).A07(2).A08(Float.valueOf(fA00)).A06();
            }
        }
    }

    public final void A0N(Surface surface) {
        A0D();
        A0F(surface, false);
    }

    public final void A0O(C3U c3u) {
        this.A0E.A0O(c3u);
        this.A0I.add(c3u);
    }

    public final void A0P(InterfaceC2664ol interfaceC2664ol) {
        this.A0L.add(interfaceC2664ol);
    }

    public final void A0Q(InterfaceC1196Cx interfaceC1196Cx) {
        A0R(interfaceC1196Cx, true, true);
    }

    public final void A0R(InterfaceC1196Cx interfaceC1196Cx, boolean z10, boolean z11) {
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
        }
        this.A0B = interfaceC1196Cx;
        interfaceC1196Cx.A3z(this.A0D, this.A0G);
        this.A0E.A0P(interfaceC1196Cx, z10, z11);
    }

    public final void A0S(boolean z10) {
        this.A0E.A0Q(z10);
    }

    public final boolean A0T() {
        return this.A0E.A0R();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09613b
    public final long A77() {
        return this.A0E.A77();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09613b
    public final long A7T() {
        return this.A0E.A7T();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09613b
    public final int A7Y() {
        return this.A0E.A7Y();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09613b
    public final int A7Z() {
        return this.A0E.A7Z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09613b
    public final int A7b() {
        return this.A0E.A7b();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09613b
    public final int A7c() {
        return this.A0E.A7c();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09613b
    public final long A7e() {
        return this.A0E.A7e();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09613b
    public final Timeline A7g() {
        return this.A0E.A7g();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09613b
    public final int A7h() {
        return this.A0E.A7h();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09613b
    public final long A7s() {
        return this.A0E.A7s();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09613b
    public final long A9J() {
        return this.A0E.A9J();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09613b
    public final boolean AAd() {
        return this.A0E.AAd();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09613b
    public final void AKG(boolean z10) {
        this.A0E.AKG(z10);
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
            this.A0B = null;
            if (z10) {
                this.A0B = null;
            }
        }
    }
}
