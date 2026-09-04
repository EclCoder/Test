package mh;

import android.media.projection.MediaProjectionManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.ui.permission.ProjectionActivity;
import zg.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static void a(ProjectionActivity projectionActivity, FirebaseAnalytics firebaseAnalytics) {
        projectionActivity.firebaseAnalytics = firebaseAnalytics;
    }

    public static void b(ProjectionActivity projectionActivity, p pVar) {
        projectionActivity.globalBubbleManager = pVar;
    }

    public static void c(ProjectionActivity projectionActivity, MediaProjectionManager mediaProjectionManager) {
        projectionActivity.mediaProjectionManager = mediaProjectionManager;
    }

    public static void d(ProjectionActivity projectionActivity, lg.a aVar) {
        projectionActivity.preferenceManager = aVar;
    }
}
