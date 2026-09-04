package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class D8 {
    public final int A00;
    public final C2606no A01;
    public final long A02;
    public final CopyOnWriteArrayList<D7> A03;

    public D8() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public D8(CopyOnWriteArrayList<D7> copyOnWriteArrayList, int i10, C2606no c2606no, long j10) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i10;
        this.A01 = c2606no;
        this.A02 = j10;
    }

    private long A00(long j10) {
        long jA0P = C5C.A0P(j10);
        if (jA0P == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final Cq cq, final C1191Cs c1191Cs, final int i10) {
        for (D7 d10 : this.A03) {
            final D9 d11 = d10.A01;
            C5C.A1B(d10.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D4
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final D8 A02(int i10, C2606no c2606no, long j10) {
        return new D8(this.A03, i10, c2606no, j10);
    }

    public final void A03(int i10, C2758qI c2758qI, int i11, Object obj, long j10) {
        A0C(new C1191Cs(1, i10, c2758qI, i11, obj, A00(j10), C.TIME_UNSET));
    }

    public final void A04(Handler handler, D9 d10) {
        AbstractC09823y.A01(handler);
        AbstractC09823y.A01(d10);
        this.A03.add(new D7(handler, d10));
    }

    public final void A05(Cq cq, int i10, int i11, C2758qI c2758qI, int i12, Object obj, long j10, long j11) {
        A09(cq, new C1191Cs(i10, i11, c2758qI, i12, obj, A00(j10), A00(j11)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(Cq cq, int i10, int i11, C2758qI c2758qI, int i12, Object obj, long j10, long j11, int i13) {
        A01(cq, new C1191Cs(i10, i11, c2758qI, i12, obj, A00(j10), A00(j11)), i13);
    }

    public final void A07(Cq cq, int i10, int i11, C2758qI c2758qI, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        A0A(cq, new C1191Cs(i10, i11, c2758qI, i12, obj, A00(j10), A00(j11)), iOException, z10);
    }

    public final void A08(@MetaExoPlayerCustomization Cq cq, @MetaExoPlayerCustomization int i10, int i11, C2758qI c2758qI, int i12, Object obj, long j10, long j11, Object obj2, Object obj3) {
        A0B(cq, new C1191Cs(i10, i11, c2758qI, i12, obj, A00(j10), A00(j11)), obj2, obj3);
    }

    public final void A09(final Cq cq, final C1191Cs c1191Cs) {
        for (D7 d10 : this.A03) {
            final D9 listener = d10.A01;
            C5C.A1B(d10.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D5
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0E(listener, cq, c1191Cs);
                }
            });
        }
    }

    public final void A0A(final Cq cq, final C1191Cs c1191Cs, final IOException iOException, final boolean z10) {
        for (D7 d10 : this.A03) {
            final D9 d11 = d10.A01;
            C5C.A1B(d10.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D0
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0F(d11, cq, c1191Cs, iOException, z10);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final Cq cq, @MetaExoPlayerCustomization final C1191Cs c1191Cs, final Object obj, final Object obj2) {
        for (D7 d10 : this.A03) {
            final D9 d11 = d10.A01;
            C5C.A1B(d10.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D1
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0G(d11, cq, c1191Cs, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final C1191Cs c1191Cs) {
        for (D7 d10 : this.A03) {
            final D9 listener = d10.A01;
            C5C.A1B(d10.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D2
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0H(listener, c1191Cs);
                }
            });
        }
    }

    public final void A0D(D9 d10) {
        for (D7 listenerAndHandler : this.A03) {
            if (listenerAndHandler.A01 == d10) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final /* synthetic */ void A0E(D9 d10, Cq cq, C1191Cs c1191Cs) {
        d10.AEb(this.A00, this.A01, cq, c1191Cs);
    }

    public final /* synthetic */ void A0F(D9 d10, Cq cq, C1191Cs c1191Cs, IOException iOException, boolean z10) {
        d10.AEg(this.A00, this.A01, cq, c1191Cs, iOException, z10);
    }

    public final /* synthetic */ void A0G(D9 d10, Cq cq, C1191Cs c1191Cs, Object obj, Object obj2) {
        d10.AEd(this.A00, this.A01, cq, c1191Cs, obj, obj2);
    }

    public final /* synthetic */ void A0H(D9 d10, C1191Cs c1191Cs) {
        d10.ADk(this.A00, this.A01, c1191Cs);
    }
}
