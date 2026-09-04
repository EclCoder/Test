package dg;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.models.EncodeParam;
import em.k0;
import em.o0;
import fl.g0;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.j0;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements ji.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0553a f36735k = new C0553a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zg.p f36736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dk.a f36737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f36738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k0 f36739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f36740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f36741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private yi.a f36742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet f36743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36745j;

    /* JADX INFO: renamed from: dg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0553a {
        public /* synthetic */ C0553a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0553a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends MediaProjection.Callback {
        b() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            if (ef.a.f()) {
                a.this.q();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f36747r;

        c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return a.this.new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f36747r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            a.this.r();
            return g0.f38750a;
        }
    }

    public a(zg.p globalBubbleManager, dk.a liveFbRepository, o0 externalScope, k0 mainDispatcher) {
        kotlin.jvm.internal.s.h(globalBubbleManager, "globalBubbleManager");
        kotlin.jvm.internal.s.h(liveFbRepository, "liveFbRepository");
        kotlin.jvm.internal.s.h(externalScope, "externalScope");
        kotlin.jvm.internal.s.h(mainDispatcher, "mainDispatcher");
        this.f36736a = globalBubbleManager;
        this.f36737b = liveFbRepository;
        this.f36738c = externalScope;
        this.f36739d = mainDispatcher;
        Context applicationContext = AzRecorderApp.e().getApplicationContext();
        kotlin.jvm.internal.s.g(applicationContext, "getApplicationContext(...)");
        this.f36741f = applicationContext;
        this.f36743h = new HashSet();
        this.f36745j = 1;
    }

    private final void i() {
        l0.D(this.f36741f, "show_live_notification");
        synchronized (this.f36743h) {
            Iterator it = this.f36743h.iterator();
            kotlin.jvm.internal.s.g(it, "iterator(...)");
            if (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.s.g(next, "next(...)");
                android.support.v4.media.session.b.a(next);
                throw null;
            }
            g0 g0Var = g0.f38750a;
        }
    }

    private final void j() {
        l0.D(this.f36741f, "show_stop_recording_notification");
        synchronized (this.f36743h) {
            Iterator it = this.f36743h.iterator();
            kotlin.jvm.internal.s.g(it, "iterator(...)");
            if (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.s.g(next, "next(...)");
                android.support.v4.media.session.b.a(next);
                throw null;
            }
            g0 g0Var = g0.f38750a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.f36744i = 0;
        ef.a.m(false);
        this.f36736a.r(4);
        zg.p.t(this.f36736a, 2, false, 2, null);
        j();
    }

    @Override // ji.f
    public void a(String reason) {
        kotlin.jvm.internal.s.h(reason, "reason");
        j0.h(R.string.live_connection_failed);
        yi.a aVar = this.f36742g;
        if (aVar == null) {
            kotlin.jvm.internal.s.w("rtmpDisplay");
            aVar = null;
        }
        aVar.x();
        em.k.d(this.f36738c, this.f36739d, null, new c(null), 2, null);
    }

    @Override // ji.f
    public void b(String url) {
        kotlin.jvm.internal.s.h(url, "url");
        wp.a.a("Connection started", new Object[0]);
    }

    @Override // ji.f
    public void c() {
        wp.a.a("Connection success", new Object[0]);
    }

    @Override // ji.f
    public void e() {
        wp.a.a("Disconnected rtmp", new Object[0]);
    }

    @Override // ji.f
    public void f() {
        j0.h(R.string.live_authorization_failed);
    }

    @Override // ji.f
    public void g() {
        j0.h(R.string.live_authorization_successful);
    }

    public final Intent k() {
        yi.a aVar = new yi.a(this.f36741f, false, this);
        this.f36742g = aVar;
        aVar.s(new b());
        yi.a aVar2 = this.f36742g;
        if (aVar2 == null) {
            kotlin.jvm.internal.s.w("rtmpDisplay");
            aVar2 = null;
        }
        return aVar2.q();
    }

    public final long l() {
        return (System.currentTimeMillis() - this.f36740e) / ((long) 1000);
    }

    public final int m() {
        return this.f36744i;
    }

    public final int n() {
        return this.f36745j;
    }

    public final boolean o(int i10, Intent intent, EncodeParam encodeParam) {
        yi.a aVar;
        kotlin.jvm.internal.s.h(encodeParam, "encodeParam");
        yi.a aVar2 = this.f36742g;
        if (aVar2 == null) {
            kotlin.jvm.internal.s.w("rtmpDisplay");
            aVar2 = null;
        }
        aVar2.r(i10, intent);
        try {
            yi.a aVar3 = this.f36742g;
            if (aVar3 == null) {
                kotlin.jvm.internal.s.w("rtmpDisplay");
                aVar3 = null;
            }
            if (!aVar3.k()) {
                return false;
            }
            yi.a aVar4 = this.f36742g;
            if (aVar4 == null) {
                kotlin.jvm.internal.s.w("rtmpDisplay");
                aVar = null;
            } else {
                aVar = aVar4;
            }
            return aVar.n(encodeParam.getResolution().getWidth(), encodeParam.getResolution().getHeight(), encodeParam.getFrameRate().getValue(), encodeParam.getBitRate().getValue(), 0, this.f36741f.getResources().getDisplayMetrics().densityDpi);
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            return false;
        }
    }

    public final void p(String url, int i10) {
        kotlin.jvm.internal.s.h(url, "url");
        yi.a aVar = this.f36742g;
        if (aVar == null) {
            kotlin.jvm.internal.s.w("rtmpDisplay");
            aVar = null;
        }
        aVar.v(url);
        this.f36744i = 1;
        this.f36745j = i10;
        ef.a.m(true);
        this.f36740e = System.currentTimeMillis();
        this.f36736a.u(2);
        zg.p.t(this.f36736a, 4, false, 2, null);
        i();
        Bundle bundle = new Bundle();
        bundle.putString("platform", i10 == 0 ? "facebook" : "youtube");
        FirebaseAnalytics.getInstance(this.f36741f).a("start_livestream", bundle);
    }

    public final void q() {
        yi.a aVar = this.f36742g;
        yi.a aVar2 = null;
        if (aVar == null) {
            kotlin.jvm.internal.s.w("rtmpDisplay");
            aVar = null;
        }
        if (aVar.g()) {
            yi.a aVar3 = this.f36742g;
            if (aVar3 == null) {
                kotlin.jvm.internal.s.w("rtmpDisplay");
            } else {
                aVar2 = aVar3;
            }
            aVar2.x();
            if (this.f36745j == 0) {
                ((rf.b) this.f36737b.get()).i();
            }
            j0.h(R.string.toast_live_stream_stopped);
            r();
        }
    }
}
