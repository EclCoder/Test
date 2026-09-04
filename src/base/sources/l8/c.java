package l8;

import com.facebook.ads.AdExperienceType;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c extends b {
    public c(MediationAdLoadCallback mediationAdLoadCallback, e eVar) {
        super(mediationAdLoadCallback, eVar);
    }

    @Override // l8.b
    AdExperienceType a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL;
    }
}
