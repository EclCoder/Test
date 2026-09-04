package ig;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class y {
    public static void a(x xVar, ah.g gVar) {
        xVar.cameraBubbleManager = gVar;
    }

    public static void b(x xVar, bh.e eVar) {
        xVar.drawerBubbleManager = eVar;
    }

    public static void c(x xVar, FirebaseAnalytics firebaseAnalytics) {
        xVar.firebaseAnalytics = firebaseAnalytics;
    }

    public static void d(x xVar, lg.a aVar) {
        xVar.mPreferenceManager = aVar;
    }

    public static void e(x xVar, dh.f fVar) {
        xVar.magicViewManager = fVar;
    }

    public static void f(x xVar, dg.l lVar) {
        xVar.recordingController = lVar;
    }

    public static void g(x xVar, eh.c cVar) {
        xVar.screenshotBubbleManager = cVar;
    }
}
