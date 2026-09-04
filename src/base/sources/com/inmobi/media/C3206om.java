package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.om, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3206om implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fm f27147a;

    public C3206om(em.o0 o0Var, Fm fm2) {
        this.f27147a = fm2;
    }

    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C3348u9 c3348u9 = this.f27147a.f24804e;
        if (c3348u9 != null) {
            c3348u9.a("VideoExperienceManager", "attachWindowLifecycleObserver - window visibility changed: " + zBooleanValue);
        }
        if (zBooleanValue) {
            Fm fm2 = this.f27147a;
            C3348u9 c3348u10 = fm2.f24804e;
            if (c3348u10 != null) {
                c3348u10.a("VideoExperienceManager", "handleOnWindowVisible called - starting media player and setting up observers");
            }
            InterfaceC3144mc interfaceC3144mc = fm2.f24807h;
            if (interfaceC3144mc == null) {
                kotlin.jvm.internal.s.w("mediaPlayer");
                interfaceC3144mc = null;
            }
            C2836ae c2836ae = (C2836ae) interfaceC3144mc;
            Gn gn2 = c2836ae.f26211k;
            gn2.f24895d.set(true);
            Fg fg2 = (Fg) gn2.f24900i.f27082d.getValue();
            fg2.f24780b.setValue(EnumC2949eo.HIDDEN);
            fg2.f24784f.set(true);
            L6.a(fg2.f24783e);
            fg2.f24783e = null;
            Fg fg3 = (Fg) gn2.f24900i.f27082d.getValue();
            fg3.a();
            em.z1 z1VarD = em.k.d(gn2.f24892a, em.c1.c(), null, new En(new C3155mn(fg3.f24780b), null, gn2), 2, null);
            ArrayList activeJobs = gn2.f24896e;
            kotlin.jvm.internal.s.h(z1VarD, "<this>");
            kotlin.jvm.internal.s.h(activeJobs, "activeJobs");
            activeJobs.add(z1VarD);
            gn2.a();
            em.z1 z1VarD2 = em.k.d(c2836ae.f26201a, null, null, new Td(new Wd(c2836ae.f26213m), null, c2836ae), 3, null);
            ArrayList activeJobs2 = c2836ae.f26204d;
            kotlin.jvm.internal.s.h(z1VarD2, "<this>");
            kotlin.jvm.internal.s.h(activeJobs2, "activeJobs");
            activeJobs2.add(z1VarD2);
            c2836ae.f26210j.b();
            C3348u9 c3348u11 = fm2.f24804e;
            if (c3348u11 != null) {
                c3348u11.a("VideoExperienceManager", "observeMediaEvents - setting up media event observers");
            }
            InterfaceC3144mc interfaceC3144mc2 = fm2.f24807h;
            if (interfaceC3144mc2 == null) {
                kotlin.jvm.internal.s.w("mediaPlayer");
                interfaceC3144mc2 = null;
            }
            em.z1 z1VarV = hm.g.v(hm.g.y(new C3489zm(hm.g.y(((C2836ae) interfaceC3144mc2).f26213m, new Am(fm2, null))), new Bm(fm2, null)), fm2.f24801b);
            ArrayList activeJobs3 = fm2.f24805f;
            kotlin.jvm.internal.s.h(z1VarV, "<this>");
            kotlin.jvm.internal.s.h(activeJobs3, "activeJobs");
            activeJobs3.add(z1VarV);
            T4.a(fm2.f24801b, new Em(fm2, null));
            fm2.c();
        } else {
            this.f27147a.b();
        }
        return fl.g0.f38750a;
    }
}
