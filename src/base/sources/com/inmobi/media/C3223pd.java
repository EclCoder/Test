package com.inmobi.media;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.pd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3223pd implements Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3274rd f27199a;

    public C3223pd(C3274rd c3274rd) {
        this.f27199a = c3274rd;
    }

    @Override // com.inmobi.media.Ta
    public final void a(String trackerName, Map macros) {
        kotlin.jvm.internal.s.h(trackerName, "trackerName");
        kotlin.jvm.internal.s.h(macros, "macros");
    }

    @Override // com.inmobi.media.Ta
    public final void a() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27199a.f27390a.f27465g;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("PublisherViewClickHandler", "User left application");
        }
        AbstractC3002h abstractC3002h = (AbstractC3002h) this.f27199a.f27390a.f27464f;
        abstractC3002h.getClass();
        InterfaceC3332tj interfaceC3332tj = ((Ic) abstractC3002h).f25000c;
        Ei ei2 = interfaceC3332tj instanceof Ei ? (Ei) interfaceC3332tj : null;
        if (ei2 != null) {
            InterfaceC3322t9 interfaceC3322t9L = ei2.l();
            if (interfaceC3322t9L != null) {
                ((C3348u9) interfaceC3322t9L).a("AUM-RenderedState", "onUserLeftApplication");
            }
            T4.a(ei2.k(), new Di(ei2, null));
        }
    }

    @Override // com.inmobi.media.Ta
    public final void a(String str, String message, String str2) {
        kotlin.jvm.internal.s.h(message, "message");
        InterfaceC3322t9 interfaceC3322t9 = this.f27199a.f27390a.f27465g;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("PublisherViewClickHandler", "Landing page error: " + message + " " + str2);
        }
    }

    @Override // com.inmobi.media.Ta
    public final void a(Intent intent) {
        kotlin.jvm.internal.s.h(intent, "intent");
        InterfaceC3322t9 interfaceC3322t9 = this.f27199a.f27390a.f27465g;
        if (interfaceC3322t9 != null) {
            ComponentName component = intent.getComponent();
            ((C3348u9) interfaceC3322t9).a("PublisherViewClickHandler", "Starting activity: " + (component != null ? component.getClassName() : null));
        }
        this.f27199a.a(intent);
    }

    @Override // com.inmobi.media.Ta
    public final void b(String str, String str2, String str3) {
    }
}
