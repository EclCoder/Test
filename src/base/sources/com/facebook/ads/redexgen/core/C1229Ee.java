package com.facebook.ads.redexgen.core;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1229Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C1230Ef A00;
    public final /* synthetic */ C11159h A01;

    public C1229Ee(C1230Ef c1230Ef, C11159h c11159h) {
        this.A00 = c1230Ef;
        this.A01 = c11159h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.A01.A0L();
    }
}
