package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11199n extends AbstractC2613nv implements DI {
    public long A00;
    public InterfaceC10295t A01;
    public InterfaceC2439ku<InterfaceExecutorC1252Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass32 A07;
    public final C2747q7 A08;
    public final C5Y A09;
    public final A6 A0A;
    public final DC A0B;
    public final FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C11199n(C2747q7 c2747q7, C5Y c5y, DC dc2, A6 a10, FF ff2, int i10, InterfaceC2439ku<InterfaceExecutorC1252Fb> interfaceC2439ku) {
        this.A07 = (AnonymousClass32) AbstractC09823y.A01(c2747q7.A03);
        this.A08 = c2747q7;
        this.A09 = c5y;
        this.A0B = dc2;
        this.A0A = a10 == null ? A6.A00 : a10;
        this.A0C = ff2;
        this.A06 = i10;
        this.A04 = true;
        this.A00 = C.TIME_UNSET;
        this.A02 = interfaceC2439ku;
    }

    private void A00() {
        final Timeline c11189m = new C11189m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9t(c11189m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.facebook.ads.redexgen.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2725pl A0I(int i10, C2725pl c2725pl, boolean z10) {
                    super.A0I(i10, c2725pl, z10);
                    c2725pl.A05 = true;
                    return c2725pl;
                }

                @Override // com.facebook.ads.redexgen.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2723pj A0L(int i10, C2723pj c2723pj, long j10) {
                    super.A0L(i10, c2723pj, j10);
                    c2723pj.A0F = true;
                    return c2723pj;
                }
            };
            c11189m = timeline;
        }
        A05(c11189m);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2613nv
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2613nv
    public final void A0A(InterfaceC10295t interfaceC10295t) {
        this.A01 = interfaceC10295t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC09823y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1196Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC2607np A5W(C2606no c2606no, F0 f10, long j10) {
        InterfaceExecutorC1252Fb interfaceExecutorC1252Fb;
        InterfaceC2694pF interfaceC2694pFA5I = this.A09.A5I();
        if (this.A01 != null) {
            interfaceC2694pFA5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        DD ddA5X = this.A0B.A5X(C8O.A03);
        A6 a10 = this.A0A;
        A1 a1A01 = A01(c2606no);
        FF ff2 = this.A0C;
        D8 d8A02 = A02(c2606no);
        String str = this.A07.A04;
        int i10 = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC1252Fb = this.A02.get();
        } else {
            interfaceExecutorC1252Fb = null;
        }
        return new C11219p(uri, interfaceC2694pFA5I, ddA5X, a10, a1A01, ff2, d8A02, this, f10, str, i10, interfaceExecutorC1252Fb);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1196Cx
    public final void ACT() {
    }

    @Override // com.facebook.ads.redexgen.core.DI
    public final void AG0(long j10, boolean z10, boolean z11) {
        if (j10 == C.TIME_UNSET) {
            j10 = this.A00;
        }
        if (!this.A04 && this.A00 == j10 && this.A05 == z10 && this.A03 == z11) {
            return;
        }
        this.A00 = j10;
        this.A05 = z10;
        this.A03 = z11;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1196Cx
    public final void AHk(InterfaceC2607np interfaceC2607np) {
        ((C11219p) interfaceC2607np).A0a();
    }
}
