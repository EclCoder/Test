package ff;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.activities.ToolboxActivity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j1 {
    public static void a(ToolboxActivity toolboxActivity, ah.g gVar) {
        toolboxActivity.cameraBubbleManager = gVar;
    }

    public static void b(ToolboxActivity toolboxActivity, bh.e eVar) {
        toolboxActivity.drawerBubbleManager = eVar;
    }

    public static void c(ToolboxActivity toolboxActivity, FirebaseAnalytics firebaseAnalytics) {
        toolboxActivity.firebaseAnalytics = firebaseAnalytics;
    }

    public static void d(ToolboxActivity toolboxActivity, dh.f fVar) {
        toolboxActivity.magicViewManager = fVar;
    }

    public static void e(ToolboxActivity toolboxActivity, lg.a aVar) {
        toolboxActivity.preferenceManager = aVar;
    }

    public static void f(ToolboxActivity toolboxActivity, dg.l lVar) {
        toolboxActivity.recordingController = lVar;
    }

    public static void g(ToolboxActivity toolboxActivity, eh.c cVar) {
        toolboxActivity.screenshotBubbleManager = cVar;
    }
}
