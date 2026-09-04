package com.inmobi.media;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Fm extends AbstractC3082k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final em.o0 f24801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gm f24802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hm.v f24803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3348u9 f24804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f24805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f24806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3144mc f24807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public O3 f24808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewGroup f24809j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fm(Context context, em.o0 coroutineScope, Gm videoExperienceModel, hm.v mediaEventFlow, C3348u9 c3348u9) {
        super(context);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(videoExperienceModel, "videoExperienceModel");
        kotlin.jvm.internal.s.h(mediaEventFlow, "mediaEventFlow");
        this.f24801b = coroutineScope;
        this.f24802c = videoExperienceModel;
        this.f24803d = mediaEventFlow;
        this.f24804e = c3348u9;
        this.f24805f = new ArrayList();
        this.f24806g = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (b(r0) == r1) goto L25;
     */
    @Override // com.inmobi.media.AbstractC3082k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3309sm
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.sm r0 = (com.inmobi.media.C3309sm) r0
            int r1 = r0.f27484d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27484d = r1
            goto L18
        L13:
            com.inmobi.media.sm r0 = new com.inmobi.media.sm
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f27482b
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f27484d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            fl.s.b(r9)
            goto L84
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            com.inmobi.media.Fm r2 = r0.f27481a
            fl.s.b(r9)
            goto L75
        L3b:
            fl.s.b(r9)
            com.inmobi.media.u9 r9 = r8.f24804e
            if (r9 == 0) goto L60
            com.inmobi.media.Gm r2 = r8.f24802c
            java.util.ArrayList r2 = r2.f24886c
            int r2 = r2.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "load Called - mediaFiles count: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.String r6 = "VideoExperienceManager"
            r9.a(r6, r2)
        L60:
            em.i2 r9 = em.c1.c()
            com.inmobi.media.tm r2 = new com.inmobi.media.tm
            r2.<init>(r8, r3)
            r0.f27481a = r8
            r0.f27484d = r5
            java.lang.Object r9 = em.i.j(r9, r2, r0)
            if (r9 != r1) goto L74
            goto L83
        L74:
            r2 = r8
        L75:
            com.inmobi.media.mc r9 = (com.inmobi.media.InterfaceC3144mc) r9
            r2.f24807h = r9
            r0.f27481a = r3
            r0.f27484d = r4
            java.lang.Object r9 = r8.b(r0)
            if (r9 != r1) goto L84
        L83:
            return r1
        L84:
            fl.g0 r9 = fl.g0.f38750a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fm.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(kotlin.coroutines.jvm.internal.d dVar) {
        C3361um c3361um;
        Fm fm2;
        C3348u9 c3348u9;
        if (dVar instanceof C3361um) {
            c3361um = (C3361um) dVar;
            int i10 = c3361um.f27646d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3361um.f27646d = i10 - Integer.MIN_VALUE;
            } else {
                c3361um = new C3361um(this, dVar);
            }
        } else {
            c3361um = new C3361um(this, dVar);
        }
        Object objD = c3361um.f27644b;
        Object objF = ll.b.f();
        int i11 = c3361um.f27646d;
        if (i11 != 0) {
            if (i11 == 1) {
                fl.s.b(objD);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fm2 = c3361um.f27643a;
                fl.s.b(objD);
            }
            fm2.f24809j = (ViewGroup) objD;
            c3348u9 = this.f24804e;
            if (c3348u9 != null) {
                c3348u9.a("VideoExperienceManager", "Video Experience Load Success");
            }
            return fl.g0.f38750a;
        }
        fl.s.b(objD);
        C3348u9 c3348u10 = this.f24804e;
        if (c3348u10 != null) {
            c3348u10.a("VideoExperienceManager", "loadVideoExperience - getting sorted media files");
        }
        c3361um.f27646d = 1;
        ArrayList mediaFiles = this.f24802c.f24886c;
        kotlin.jvm.internal.s.h(mediaFiles, "mediaFiles");
        ArrayList arrayList = new ArrayList();
        int size = mediaFiles.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = mediaFiles.get(i12);
            i12++;
            Gl gl2 = (Gl) obj;
            if (URLUtil.isHttpUrl(gl2.f24882c) || URLUtil.isHttpsUrl(gl2.f24882c)) {
                arrayList.add(obj);
            }
        }
        objD = em.p0.d(new Mm(arrayList, ((double) AbstractC2844am.a(this.f24802c.f24884a)) / ((double) 1000), this.f24802c.f24887d, null), c3361um);
        if (objD != objF) {
        }
        return objF;
        List list = (List) objD;
        ArrayList arrayList2 = new ArrayList(gl.r.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Gl) it.next()).f24882c);
        }
        InterfaceC3144mc interfaceC3144mc = this.f24807h;
        if (interfaceC3144mc == null) {
            kotlin.jvm.internal.s.w("mediaPlayer");
            interfaceC3144mc = null;
        }
        c3361um.f27643a = this;
        c3361um.f27646d = 2;
        objD = ((C2836ae) interfaceC3144mc).a(arrayList2, c3361um);
        if (objD != objF) {
            fm2 = this;
            fm2.f24809j = (ViewGroup) objD;
            c3348u9 = this.f24804e;
            if (c3348u9 != null) {
                c3348u9.a("VideoExperienceManager", "Video Experience Load Success");
            }
            return fl.g0.f38750a;
        }
        return objF;
    }

    public final void c() {
        hm.v vVar;
        em.z1 z1VarD;
        C3348u9 c3348u9 = this.f24804e;
        if (c3348u9 != null) {
            c3348u9.a("VideoExperienceManager", "observeCompanionAdEvents - setting up companion ad event observers");
        }
        if (this.f24802c.f24885b.isEmpty()) {
            return;
        }
        C3348u9 c3348u10 = this.f24804e;
        if (c3348u10 != null) {
            c3348u10.a("VideoExperienceManager", "observeCompanionAdEvents - collecting companion ad events");
        }
        O3 o10 = this.f24808i;
        if (o10 != null && (vVar = o10.f25386d) != null && (z1VarD = em.k.d(this.f24801b, null, null, new C3413wm(vVar, null, this), 3, null)) != null) {
            ArrayList activeJobs = this.f24805f;
            kotlin.jvm.internal.s.h(z1VarD, "<this>");
            kotlin.jvm.internal.s.h(activeJobs, "activeJobs");
            activeJobs.add(z1VarD);
        }
        C3348u9 c3348u11 = this.f24804e;
        if (c3348u11 != null) {
            c3348u11.a("VideoExperienceManager", "observeCompanionAdEvents - companion ad event observer setup complete");
        }
    }

    @Override // com.inmobi.media.AbstractC3082k2
    public final Object a(FrameLayout frameLayout, C3299sc c3299sc) {
        Object objJ = em.i.j(em.c1.c(), new C3283rm(this, frameLayout, null), c3299sc);
        return objJ == ll.b.f() ? objJ : fl.g0.f38750a;
    }

    @Override // com.inmobi.media.AbstractC3082k2
    public final void a(hm.w windowFlow) {
        kotlin.jvm.internal.s.h(windowFlow, "windowFlow");
        em.z1 z1VarD = em.k.d(this.f24801b, null, null, new C3232pm(windowFlow, null, this), 3, null);
        ArrayList activeJobs = this.f24806g;
        kotlin.jvm.internal.s.h(z1VarD, "<this>");
        kotlin.jvm.internal.s.h(activeJobs, "activeJobs");
        activeJobs.add(z1VarD);
    }

    @Override // com.inmobi.media.AbstractC3082k2
    public final void a() {
        C3348u9 c3348u9 = this.f24804e;
        if (c3348u9 != null) {
            c3348u9.a("VideoExperienceManager", "destroy");
        }
        b();
        InterfaceC3144mc interfaceC3144mc = this.f24807h;
        if (interfaceC3144mc != null) {
            C2836ae c2836ae = (C2836ae) interfaceC3144mc;
            C3348u9 c3348u10 = c2836ae.f26203c;
            if (c3348u10 != null) {
                c3348u10.a("NativeMediaPlayer", "destroy called");
            }
            c2836ae.f26205e = Bg.STATE_DESTROYED;
            T4.a(c2836ae.f26204d);
            c2836ae.f26211k.b();
            C3043ie c3043ie = c2836ae.f26209i;
            c3043ie.f26744g.removeAllViews();
            c3043ie.f26743f.d();
            c2836ae.f26210j.c();
            c2836ae.f26207g.removeAllViews();
            c2836ae.f26208h.release();
        }
        T4.a(this.f24806g);
        O3 o10 = this.f24808i;
        if (o10 != null) {
            o10.a();
        }
    }

    @Override // com.inmobi.media.AbstractC3082k2
    public final void b() {
        T4.a(this.f24801b, new C3258qm(this, null));
        InterfaceC3144mc interfaceC3144mc = this.f24807h;
        if (interfaceC3144mc == null) {
            kotlin.jvm.internal.s.w("mediaPlayer");
            interfaceC3144mc = null;
        }
        C2836ae c2836ae = (C2836ae) interfaceC3144mc;
        c2836ae.f26210j.c();
        Gn gn2 = c2836ae.f26211k;
        Zj zj2 = gn2.f24899h;
        if (zj2 != null) {
            zj2.b();
        }
        gn2.f24895d.set(false);
        Fg fg2 = (Fg) gn2.f24900i.f27082d.getValue();
        fg2.f24784f.set(true);
        L6.a(fg2.f24783e);
        fg2.f24783e = null;
        T4.a(gn2.f24896e);
        T4.a(c2836ae.f26204d);
        T4.a(this.f24805f);
    }
}
