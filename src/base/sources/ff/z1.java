package ff;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.activities.UpgradeActivity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class z1 {
    public static void a(UpgradeActivity upgradeActivity, FirebaseAnalytics firebaseAnalytics) {
        upgradeActivity.mFirebaseAnalytics = firebaseAnalytics;
    }

    public static void b(UpgradeActivity upgradeActivity, lg.a aVar) {
        upgradeActivity.mPreferenceManager = aVar;
    }
}
