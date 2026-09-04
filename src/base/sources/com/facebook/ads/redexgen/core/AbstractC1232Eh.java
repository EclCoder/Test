package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.AbstractC1232Eh;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1232Eh<T extends AbstractC1232Eh<T>> {
    public final int A00;
    public final int A01;
    public final C2758qI A02;
    public final C2721pg A03;

    public abstract int A08();

    public abstract boolean A09(T t10);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC1232Eh(int i10, C2721pg c2721pg, int i11) {
        this.A00 = i10;
        this.A03 = c2721pg;
        this.A01 = i11;
        this.A02 = c2721pg.A08(i11);
    }
}
