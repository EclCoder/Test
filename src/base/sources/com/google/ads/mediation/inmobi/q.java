package com.google.ads.mediation.inmobi;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import java.util.List;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q {
    public final AdSize a(Context context, AdSize adSize, List potentials) {
        s.h(context, "context");
        s.h(adSize, "adSize");
        s.h(potentials, "potentials");
        return MediationUtils.findClosestSize(context, adSize, potentials);
    }
}
