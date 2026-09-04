package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.hj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3022hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3322t9 f26688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f26689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final em.o0 f26690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f26691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EnumC2970fj f26693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public em.z1 f26695i;

    public C3022hj(long j10, InterfaceC3322t9 interfaceC3322t9, Function1 onLoadingCompleted) {
        kotlin.jvm.internal.s.h(onLoadingCompleted, "onLoadingCompleted");
        this.f26687a = j10;
        this.f26688b = interfaceC3322t9;
        this.f26689c = onLoadingCompleted;
        this.f26690d = em.p0.a(em.u2.b(null, 1, null).plus(em.c1.c().X0()));
        this.f26693g = EnumC2970fj.IDLE;
    }

    public final void a() {
        try {
            em.z1 z1Var = this.f26695i;
            if (z1Var != null) {
                em.b2.g(z1Var);
            }
            em.z1 z1Var2 = this.f26695i;
            if (z1Var2 != null) {
                em.z1.c0(z1Var2, null, 1, null);
            }
        } catch (Exception unused) {
            InterfaceC3322t9 interfaceC3322t9 = this.f26688b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("SessionTracker", "No pending commit completion job to cancel.");
            }
        }
        this.f26695i = null;
    }

    public final void a(String str, String str2) {
        boolean z10 = this.f26692f;
        if (z10) {
            return;
        }
        long j10 = this.f26687a;
        if (j10 <= 0) {
            return;
        }
        if (!z10 && j10 > 0) {
            this.f26692f = true;
            this.f26693g = EnumC2970fj.DONE;
            a();
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f26688b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("SessionTracker", "onLoadingCompleted sessionId=" + this.f26691e + " reason=" + str + " url=" + str2);
        }
        this.f26689c.invoke(str);
    }
}
