package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2763qP implements InterfaceC09613b {
    public final C2723pj A00 = new C2723pj();

    @MetaExoPlayerCustomization("Should be final")
    public abstract void A0H(int i10, long j10);

    public final int A00() {
        long jA77 = A77();
        long jA7s = A7s();
        if (jA77 == C.TIME_UNSET || jA7s == C.TIME_UNSET) {
            return 0;
        }
        if (jA7s == 0) {
            return 100;
        }
        return C5C.A07((int) ((100 * jA77) / jA7s), 0, 100);
    }

    public void A01() {
        AKG(false);
    }

    public final void A02() {
        A03(A7h());
    }

    public final void A03(int i10) {
        A0H(i10, C.TIME_UNSET);
    }

    public final void A04(long j10) {
        A0H(A7h(), j10);
    }
}
