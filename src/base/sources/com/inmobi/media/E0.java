package com.inmobi.media;

import android.app.Activity;
import com.inmobi.media.E0;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class E0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static A0 f24684b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static em.o0 f24687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static em.o0 f24688f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fl.k f24683a = fl.l.b(new tl.a() { // from class: yh.f1
        @Override // tl.a
        public final Object invoke() {
            return E0.a();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fl.k f24685c = fl.l.b(new tl.a() { // from class: yh.g1
        @Override // tl.a
        public final Object invoke() {
            return E0.b();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B0 f24686d = new B0();

    public static final H0 a() {
        return new H0(AbstractC3193o9.b());
    }

    public static final CopyOnWriteArrayList b() {
        return new CopyOnWriteArrayList();
    }

    public static void a(Activity activity, GestureDetectorOnGestureListenerC3228pi renderView, String beaconUrl, boolean z10, JSONObject extras, Zh listener) {
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(renderView, "renderView");
        kotlin.jvm.internal.s.h(beaconUrl, "url");
        kotlin.jvm.internal.s.h(extras, "extras");
        kotlin.jvm.internal.s.h(listener, "listener");
        renderView.getAdQualityManager().a(activity, beaconUrl, z10, extras, listener);
        A0 a10 = f24684b;
        if (a10 == null) {
            kotlin.jvm.internal.s.w("executor");
            a10 = null;
        }
        a10.getClass();
        kotlin.jvm.internal.s.h(beaconUrl, "beaconUrl");
        kotlin.jvm.internal.s.h(listener, "listener");
        a10.f24427c.put(beaconUrl, new WeakReference(listener));
        String creativeID = renderView.getCreativeID();
        if (creativeID.length() > 0) {
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class);
            fl.k kVar = f24685c;
            if (((CopyOnWriteArrayList) kVar.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) kVar.getValue()).add(creativeID);
            }
        }
    }

    public static void a(GestureDetectorOnGestureListenerC3228pi adView, GestureDetectorOnGestureListenerC3228pi renderView, String beaconUrl, boolean z10, JSONObject extras, Zh listener) {
        kotlin.jvm.internal.s.h(adView, "adView");
        kotlin.jvm.internal.s.h(renderView, "renderView");
        kotlin.jvm.internal.s.h(beaconUrl, "url");
        kotlin.jvm.internal.s.h(extras, "extras");
        kotlin.jvm.internal.s.h(listener, "listener");
        renderView.getAdQualityManager().a(adView, beaconUrl, z10, extras, listener);
        A0 a10 = f24684b;
        if (a10 == null) {
            kotlin.jvm.internal.s.w("executor");
            a10 = null;
        }
        a10.getClass();
        kotlin.jvm.internal.s.h(beaconUrl, "beaconUrl");
        kotlin.jvm.internal.s.h(listener, "listener");
        a10.f24427c.put(beaconUrl, new WeakReference(listener));
        String creativeID = renderView.getCreativeID();
        if (creativeID.length() > 0) {
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class);
            fl.k kVar = f24685c;
            if (((CopyOnWriteArrayList) kVar.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) kVar.getValue()).add(creativeID);
            }
        }
    }
}
