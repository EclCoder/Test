package ff;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.activities.MainActivity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class h0 {
    public static void a(MainActivity mainActivity, FirebaseAnalytics firebaseAnalytics) {
        mainActivity.firebaseAnalytics = firebaseAnalytics;
    }

    public static void b(MainActivity mainActivity, zg.p pVar) {
        mainActivity.globalBubbleManager = pVar;
    }

    public static void c(MainActivity mainActivity, dh.f fVar) {
        mainActivity.magicViewManager = fVar;
    }

    public static void d(MainActivity mainActivity, dh.i iVar) {
        mainActivity.mainBubbleManager = iVar;
    }

    public static void e(MainActivity mainActivity, lg.a aVar) {
        mainActivity.preferenceManager = aVar;
    }
}
