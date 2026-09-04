package com.inmobi.media;

import android.util.Log;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.e1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2926e1 implements InterfaceC2825a3, InterfaceC2870bm {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f26429f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f26430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3322t9 f26431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdSession f26432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediaEvents f26433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdEvents f26434e;

    static {
        String simpleName = AbstractC2926e1.class.getSimpleName();
        kotlin.jvm.internal.s.g(simpleName, "getSimpleName(...)");
        f26429f = simpleName;
    }

    public AbstractC2926e1(em.o0 coroutineScope, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        this.f26430a = coroutineScope;
        this.f26431b = interfaceC3322t9;
    }

    public void a() {
    }

    public abstract void a(String str, List list, Map map, String str2, String str3, boolean z10);

    public final void b() {
        InterfaceC3322t9 interfaceC3322t9 = this.f26431b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a(f26429f, "initAdEvents");
        }
        try {
            this.f26434e = AdEvents.createAdEvents(this.f26432c);
        } catch (IllegalArgumentException e10) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26431b;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a(f26429f, "Failure initAdEvents: " + Log.getStackTraceString(e10));
            }
        }
    }

    public final void c() {
        InterfaceC3322t9 interfaceC3322t9 = this.f26431b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a(f26429f, "initMediaAdEvents");
        }
        try {
            this.f26433d = MediaEvents.createMediaEvents(this.f26432c);
        } catch (IllegalArgumentException e10) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26431b;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a(f26429f, "Failure initMediaAdEvents: " + Log.getStackTraceString(e10));
            }
        }
    }

    public void a(boolean z10) {
    }

    @Override // com.inmobi.media.InterfaceC2870bm
    public void a(AbstractC3050im videoEvent) {
        kotlin.jvm.internal.s.h(videoEvent, "videoEvent");
    }

    public final void a(InteractionType type) {
        kotlin.jvm.internal.s.h(type, "type");
        if (this.f26433d == null) {
            InterfaceC3322t9 interfaceC3322t9 = this.f26431b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a(f26429f, "Failed to register adUserInteractionEvent with type: " + type);
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f26431b;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).a(f26429f, "trackAdUserInteractionEvent with type: " + type);
        }
        T4.a(this.f26430a, new C2901d1(this, type, null));
    }

    public final void a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        kotlin.jvm.internal.s.h(adSessionConfiguration, "adSessionConfiguration");
        kotlin.jvm.internal.s.h(adSessionContext, "adSessionContext");
        if (this.f26432c != null) {
            InterfaceC3322t9 interfaceC3322t9 = this.f26431b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a(f26429f, "initAdSession: adSession is already created");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f26431b;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).a(f26429f, "initAdSession");
        }
        try {
            this.f26432c = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t11 = this.f26431b;
            if (interfaceC3322t11 != null) {
                ((C3348u9) interfaceC3322t11).a(f26429f, "AdSession creation failed. " + e10);
            }
        }
    }
}
