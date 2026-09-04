package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.inmobi.media.u9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3348u9 implements InterfaceC3322t9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ph f27613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2920dk f27614b;

    public C3348u9(Context context, double d10, Ib logLevel, boolean z10, int i10, long j10) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(logLevel, "logLevel");
        this.f27614b = new C2920dk();
        if (z10) {
            return;
        }
        Ph ph2 = new Ph(context, d10, logLevel, j10, i10);
        this.f27613a = ph2;
        CopyOnWriteArrayList copyOnWriteArrayList = Ub.f25828a;
        kotlin.jvm.internal.s.e(ph2);
        Tb.b(ph2);
    }

    public final void a(String tag, String message) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(message, "message");
        Ph ph2 = this.f27613a;
        if (ph2 != null) {
            ph2.a(Ib.DEBUG, tag, message);
        }
        if (this.f27614b != null) {
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h(message, "message");
        }
    }

    public final void b(String tag, String message) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(message, "message");
        Ph ph2 = this.f27613a;
        if (ph2 != null) {
            ph2.a(Ib.ERROR, tag, message);
        }
        if (this.f27614b != null) {
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h(message, "message");
        }
    }

    public final void c(String tag, String message) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(message, "message");
        Ph ph2 = this.f27613a;
        if (ph2 != null) {
            ph2.a(Ib.INFO, tag, message);
        }
        if (this.f27614b != null) {
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h(message, "message");
        }
    }

    public final void d(String tag, String message) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(message, "message");
        Ph ph2 = this.f27613a;
        if (ph2 != null) {
            ph2.a(Ib.STATE, tag, message);
        }
        if (this.f27614b != null) {
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h("STATE_CHANGE: " + message, "message");
        }
    }

    public final void a(String tag, String message, Exception error) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(message, "message");
        kotlin.jvm.internal.s.h(error, "error");
        Ph ph2 = this.f27613a;
        if (ph2 != null) {
            ph2.a(Ib.ERROR, tag, message + "\nError: " + fl.e.b(error));
        }
        if (this.f27614b != null) {
            kotlin.jvm.internal.s.h(tag, "tag");
            kotlin.jvm.internal.s.h(message, "message");
            kotlin.jvm.internal.s.h(error, "error");
        }
    }

    public final void a(boolean z10) {
        Ph ph2 = this.f27613a;
        if (ph2 != null) {
            ph2.b(z10);
        }
        if (z10) {
            return;
        }
        Ph ph3 = this.f27613a;
        if (ph3 == null || !ph3.f25499f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = Ub.f25828a;
            Tb.a(this.f27613a);
            this.f27613a = null;
        }
    }

    public final void a() {
        Ph ph2 = this.f27613a;
        if (ph2 != null) {
            ph2.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = Ub.f25828a;
        Tb.a(this.f27613a);
    }
}
