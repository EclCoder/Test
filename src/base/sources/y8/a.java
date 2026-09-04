package y8;

import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends w8.a {
    @Override // w8.a
    public String e(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        s.h(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        return null;
    }

    @Override // w8.a
    public void f(com.vungle.ads.b adConfig, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        s.h(adConfig, "adConfig");
        s.h(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.vungle.b vungleFactory) {
        super(mediationAdLoadCallback, vungleFactory);
        s.h(mediationAdLoadCallback, obFGmWgqyy.UGGhaIYEtdsd);
        s.h(vungleFactory, "vungleFactory");
    }
}
