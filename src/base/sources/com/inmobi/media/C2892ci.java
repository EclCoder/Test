package com.inmobi.media;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.inmobi.media.ci, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2892ci implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f26351a;

    public C2892ci(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        this.f26351a = gestureDetectorOnGestureListenerC3228pi;
    }

    public final void a(I6 metrics) {
        kotlin.jvm.internal.s.h(metrics, "metrics");
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f26351a;
        float f10 = metrics.f24987a;
        J6 j10 = metrics.f24988b;
        Object jSONArray = "null";
        Object objA = j10 != null ? K6.a(j10) : "null";
        ArrayList arrayList = metrics.f24989c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(gl.r.v(arrayList, 10));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                arrayList2.add(K6.a((J6) obj));
            }
            jSONArray = new JSONArray((Collection) arrayList2);
        }
        gestureDetectorOnGestureListenerC3228pi.h("window.mraidview.broadcastEvent('exposureChange', " + f10 + ", " + objA + ", " + jSONArray + ");");
    }
}
