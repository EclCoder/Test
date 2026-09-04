package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3322t9 f24571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f24572b = new ConcurrentHashMap();

    public Bo(InterfaceC3322t9 interfaceC3322t9) {
        this.f24571a = interfaceC3322t9;
    }

    public final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, String str) {
        this.f24572b.put(str, gestureDetectorOnGestureListenerC3228pi);
        InterfaceC3322t9 interfaceC3322t9 = this.f24571a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("SiblingWebViewManager", "Registered bridge for WebView ID: " + str);
        }
    }

    public final void b(Function1 action) {
        kotlin.jvm.internal.s.h(action, "action");
        ConcurrentHashMap concurrentHashMap = this.f24572b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((GestureDetectorOnGestureListenerC3228pi) entry.getValue()) instanceof C3435xi) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) ((Map.Entry) it.next()).getValue();
            kotlin.jvm.internal.s.f(gestureDetectorOnGestureListenerC3228pi, "null cannot be cast to non-null type com.inmobi.ads.containers.companions.RenderViewSibling");
            action.invoke((C3435xi) gestureDetectorOnGestureListenerC3228pi);
        }
    }

    public final void a(String id2) {
        kotlin.jvm.internal.s.h(id2, "id");
        this.f24572b.remove(id2);
        InterfaceC3322t9 interfaceC3322t9 = this.f24571a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("SiblingWebViewManager", "Unregistered bridge for WebView ID: " + id2);
        }
    }

    public final void a(Function1 action) {
        kotlin.jvm.internal.s.h(action, "action");
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) this.f24572b.get("default");
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            action.invoke(gestureDetectorOnGestureListenerC3228pi);
        }
        ConcurrentHashMap concurrentHashMap = this.f24572b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!kotlin.jvm.internal.s.c(entry.getKey(), "default")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke((GestureDetectorOnGestureListenerC3228pi) ((Map.Entry) it.next()).getValue());
        }
    }

    public final GestureDetectorOnGestureListenerC3228pi a(Qi route, Context context, short s10, C3184o0 adMetaData, AdConfig adConfig) {
        GestureDetectorOnGestureListenerC3228pi c3435xi;
        kotlin.jvm.internal.s.h(route, "route");
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(adMetaData, "adMetaData");
        kotlin.jvm.internal.s.h(adConfig, "adConfig");
        if (s10 == 0) {
            InterfaceC3322t9 interfaceC3322t9 = this.f24571a;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("SiblingWebViewManager", "Creating standard WebView with ID: " + route.f25563b);
            }
            c3435xi = new GestureDetectorOnGestureListenerC3228pi(context, adMetaData.f27097o, adMetaData.f27098p, adMetaData.f27099q, adMetaData.f27100r, 0L, adMetaData.f27101s, adMetaData.f27102t, route, this, adMetaData, adConfig, 80);
        } else if (s10 == 1) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24571a;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("SiblingWebViewManager", "Creating Sibling WebView with ID: " + route.f25563b);
            }
            c3435xi = new C3435xi(context, adMetaData.f27097o, adMetaData.f27102t, C3184o0.a(adMetaData, null, 4194047), this, route, adConfig);
        } else {
            InterfaceC3322t9 interfaceC3322t11 = this.f24571a;
            if (interfaceC3322t11 != null) {
                ((C3348u9) interfaceC3322t11).b("SiblingWebViewManager", "Unsupported WebView type: " + ((int) s10));
            }
            throw new IllegalArgumentException("Unsupported WebView type: " + ((int) s10));
        }
        a(c3435xi, route.f25563b);
        return c3435xi;
    }
}
