package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.li, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3124li implements InterfaceC3070jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f26952a;

    public C3124li(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        this.f26952a = gestureDetectorOnGestureListenerC3228pi;
    }

    public final void a(String id2, int i10, String str, long j10, int i11) {
        kotlin.jvm.internal.s.h(id2, "id");
        kotlin.jvm.internal.s.g(GestureDetectorOnGestureListenerC3228pi.f27210i1, "access$getTAG$cp(...)");
        JSONObject jSONObjectA = AbstractC3098ki.a("code", i10);
        if (str != null) {
            jSONObjectA.put(NotificationCompat.CATEGORY_MESSAGE, str);
        }
        jSONObjectA.put("retryCount", i11);
        String string = jSONObjectA.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        this.f26952a.h("window.imraidview.broadcastEvent('onPingComplete', '" + id2 + "', " + j10 + ", '" + string + "');");
    }
}
