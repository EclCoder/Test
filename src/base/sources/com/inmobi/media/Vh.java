package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Vh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ zl.k[] f25904a = {kotlin.jvm.internal.l0.g(new kotlin.jvm.internal.c0(Vh.class, "areImraidLogsEnabled", "getAreImraidLogsEnabled()Z", 0))};

    public static JSONObject a(String browser, String event) {
        kotlin.jvm.internal.s.h(browser, "browser");
        kotlin.jvm.internal.s.h(event, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("browser", browser);
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, event);
        return jSONObject;
    }
}
