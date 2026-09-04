package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC1305Hd {
    void A6e(C2758qI c2758qI);

    int AIp(InterfaceC09382c interfaceC09382c, int i10, boolean z10) throws IOException;

    int AIq(InterfaceC09382c interfaceC09382c, int i10, boolean z10, int i11) throws IOException;

    void AIr(C10054v c10054v, int i10);

    void AIs(C10054v c10054v, int i10, int i11);

    void AIu(long j10, int i10, int i11, int i12, C1303Hb c1303Hb);

    @MetaExoPlayerCustomization("New Meta API")
    void AKf(Uri uri);
}
