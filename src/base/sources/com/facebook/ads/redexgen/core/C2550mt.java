package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2550mt implements InterfaceC1305Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.facebook.ads.redexgen.core.InterfaceC1305Hd
    public final /* synthetic */ int AIp(InterfaceC09382c interfaceC09382c, int i10, boolean z10) {
        return AbstractC1302Ha.A00(this, interfaceC09382c, i10, z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1305Hd
    public final /* synthetic */ void AIr(C10054v c10054v, int i10) {
        AbstractC1302Ha.A01(this, c10054v, i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1305Hd
    public final void A6e(C2758qI c2758qI) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1305Hd
    public final int AIq(InterfaceC09382c interfaceC09382c, int i10, boolean z10, int i11) throws IOException {
        int bytesSkipped = interfaceC09382c.read(this.A00, 0, Math.min(this.A00.length, i10));
        if (bytesSkipped == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1305Hd
    public final void AIs(C10054v c10054v, int i10, int i11) {
        c10054v.A0g(i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1305Hd
    public final void AIu(long j10, int i10, int i11, int i12, C1303Hb c1303Hb) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1305Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
