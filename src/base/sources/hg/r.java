package hg;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.feedback.RateActivity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class r {
    public static void a(RateActivity rateActivity, FirebaseAnalytics firebaseAnalytics) {
        rateActivity.firebaseAnalytics = firebaseAnalytics;
    }

    public static void b(RateActivity rateActivity, lg.a aVar) {
        rateActivity.preferenceManager = aVar;
    }
}
