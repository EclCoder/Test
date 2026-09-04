package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C09351z {
    public final AudioAttributes A00;

    public C09351z(C2764qQ c2764qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2764qQ.A02).setFlags(c2764qQ.A03).setUsage(c2764qQ.A05);
        if (C5C.A02 >= 29) {
            C09331x.A00(usage, c2764qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C09341y.A00(usage, c2764qQ.A04);
        }
        this.A00 = usage.build();
    }
}
