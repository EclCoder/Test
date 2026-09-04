package d7;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum n {
    EVENT(NotificationCompat.CATEGORY_EVENT),
    ACTION_SOURCE("action_source"),
    APP(MBridgeConstans.DYNAMIC_VIEW_WX_APP),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36406a;

    n(String str) {
        this.f36406a = str;
    }

    public final String g() {
        return this.f36406a;
    }
}
