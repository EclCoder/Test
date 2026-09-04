package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Oo implements Jo {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final WeakHashMap f25441g = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lo f25442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3322t9 f25443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f25444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f25445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f25446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Lf f25447f;

    public Oo(Activity activity, Lo windowInsetListener, InterfaceC3322t9 interfaceC3322t9) {
        Window window;
        kotlin.jvm.internal.s.h(windowInsetListener, "windowInsetListener");
        this.f25442a = windowInsetListener;
        this.f25443b = interfaceC3322t9;
        this.f25445d = new ConcurrentHashMap();
        WeakReference weakReference = new WeakReference(activity);
        this.f25446e = weakReference;
        B5.f24500a.getClass();
        if (!B5.w()) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        Activity activity2 = (Activity) weakReference.get();
        View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            this.f25444c = decorView;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("WindowInsetsHandler", "startListeningToInsets");
            }
            WeakHashMap weakHashMap = f25441g;
            Object ko2 = weakHashMap.get(decorView);
            if (ko2 == null) {
                ko2 = new Ko(decorView);
                weakHashMap.put(decorView, ko2);
            }
            kotlin.jvm.internal.s.h(this, "listener");
            ((Ko) ko2).f25147a.add(this);
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
            }
        }
    }

    public final void a(WindowInsets windowInsets) {
        try {
            Activity activity = (Activity) this.f25446e.get();
            if (!this.f25442a.a()) {
                InterfaceC3322t9 interfaceC3322t9 = this.f25443b;
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).a("WindowInsetsHandler", "listener is not interested in computing insets, skipping");
                    return;
                }
                return;
            }
            if (activity == null) {
                InterfaceC3322t9 interfaceC3322t10 = this.f25443b;
                if (interfaceC3322t10 != null) {
                    ((C3348u9) interfaceC3322t10).b("WindowInsetsHandler", "Activity is null, skipping safeArea computation");
                    return;
                }
                return;
            }
            Mo moB = J3.a(activity) ? Gi.b(windowInsets) : Gi.a(windowInsets);
            Integer numF = N5.f();
            int iIntValue = numF != null ? numF.intValue() : N5.a(windowInsets);
            N5.a(Integer.valueOf(iIntValue));
            a(moB, iIntValue);
        } catch (Error e10) {
            InterfaceC3322t9 interfaceC3322t11 = this.f25443b;
            if (interfaceC3322t11 != null) {
                ((C3348u9) interfaceC3322t11).b("WindowInsetsHandler", "Error in getting safeArea " + e10.getMessage());
            }
        } catch (Exception e11) {
            InterfaceC3322t9 interfaceC3322t12 = this.f25443b;
            if (interfaceC3322t12 != null) {
                ((C3348u9) interfaceC3322t12).a("WindowInsetsHandler", "Exception in getting safeArea", e11);
            }
        }
    }

    public final void a(Mo insets, int i10) {
        Lf orientation = Mf.a(N5.g());
        No no2 = (No) this.f25445d.get(Integer.valueOf(i10));
        if (no2 == null) {
            no2 = new No();
            this.f25445d.put(Integer.valueOf(i10), no2);
        }
        kotlin.jvm.internal.s.h(orientation, "orientation");
        Mo mo2 = (Mo) no2.f25373a.get(orientation);
        if (mo2 != null && kotlin.jvm.internal.s.c(insets, mo2)) {
            InterfaceC3322t9 interfaceC3322t9 = this.f25443b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("WindowInsetsHandler", "SafeArea - Same value, no need to update");
            }
        } else {
            InterfaceC3322t9 interfaceC3322t10 = this.f25443b;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("WindowInsetsHandler", "safeArea - New value, updating to KV store");
            }
            kotlin.jvm.internal.s.h(orientation, "orientation");
            kotlin.jvm.internal.s.h(insets, "insets");
            no2.f25373a.put(orientation, insets);
            ConcurrentHashMap concurrentHashMap = this.f25445d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gl.l0.e(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((No) entry.getValue()).a());
            }
            N5.a(linkedHashMap);
        }
        if (this.f25447f != orientation) {
            this.f25447f = orientation;
            Lo lo2 = this.f25442a;
            Object obj = this.f25445d.get(Integer.valueOf(i10));
            kotlin.jvm.internal.s.e(obj);
            lo2.a(orientation, (No) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Oo(GestureDetectorOnGestureListenerC3228pi view, Lo windowInsetListener, InterfaceC3322t9 interfaceC3322t9) {
        this((Activity) null, windowInsetListener, interfaceC3322t9);
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(windowInsetListener, "windowInsetListener");
        B5.f24500a.getClass();
        if (!B5.w()) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        this.f25444c = view;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("WindowInsetsHandler", "startListeningToInsets");
        }
        WeakHashMap weakHashMap = f25441g;
        Object ko2 = weakHashMap.get(view);
        if (ko2 == null) {
            ko2 = new Ko(view);
            weakHashMap.put(view, ko2);
        }
        kotlin.jvm.internal.s.h(this, "listener");
        ((Ko) ko2).f25147a.add(this);
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
        }
    }

    public final void a() {
        View view = this.f25444c;
        if (view != null) {
            WeakHashMap weakHashMap = f25441g;
            Ko ko2 = (Ko) weakHashMap.get(view);
            if (ko2 != null) {
                kotlin.jvm.internal.s.h(this, "listener");
                ko2.f25147a.remove(this);
                if (ko2.f25147a.isEmpty()) {
                    ko2.a();
                    weakHashMap.remove(view);
                }
            }
            InterfaceC3322t9 interfaceC3322t9 = this.f25443b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("WindowInsetsHandler_INSTANCE", this + " destroy - " + weakHashMap.size());
            }
        }
        this.f25444c = null;
        this.f25445d.clear();
    }
}
