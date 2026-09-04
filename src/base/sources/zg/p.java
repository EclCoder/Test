package zg;

import com.hecorat.screenrecorder.free.AzRecorderApp;
import em.k0;
import em.o0;
import fl.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dk.a f58883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dk.a f58884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dk.a f58885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dk.a f58886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dk.a f58887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final yf.c f58888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final yf.u f58889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final yf.s f58890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final yf.q f58891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o0 f58892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k0 f58893k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f58894r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f58896t;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58894r = obj;
            this.f58896t |= Integer.MIN_VALUE;
            return p.this.l(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f58897r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f58899t;

        b(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58897r = obj;
            this.f58899t |= Integer.MIN_VALUE;
            return p.this.m(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f58900r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f58902t;

        c(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58900r = obj;
            this.f58902t |= Integer.MIN_VALUE;
            return p.this.o(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f58903r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f58905t;

        d(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58903r = obj;
            this.f58905t |= Integer.MIN_VALUE;
            return p.this.p(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58906r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f58908t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f58909u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, boolean z10, kl.f fVar) {
            super(2, fVar);
            this.f58908t = i10;
            this.f58909u = z10;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return p.this.new e(this.f58908t, this.f58909u, fVar);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0097  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:38:0x0102  */
        /* JADX WARN: Code duplicated, block: B:40:0x010e  */
        /* JADX WARN: Code duplicated, block: B:48:0x0147  */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            if (r9 == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
        
            if (r9 == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
        
            if (r9 == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0116, code lost:
        
            if (r9 == r0) goto L42;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 366
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zg.p.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public p(dk.a mainBubbleManager, dk.a screenshotBubbleManager, dk.a drawerBubbleManager, dk.a cameraBubbleManager, dk.a liveBubbleManager, yf.c getHideBubbleDuringRecordUseCase, yf.u getShowScreenshotBubbleUseCase, yf.s getShowDrawerBubbleUseCase, yf.q getShowCameraBubbleUseCase, o0 externalScope, k0 mainDispatcher) {
        kotlin.jvm.internal.s.h(mainBubbleManager, "mainBubbleManager");
        kotlin.jvm.internal.s.h(screenshotBubbleManager, "screenshotBubbleManager");
        kotlin.jvm.internal.s.h(drawerBubbleManager, "drawerBubbleManager");
        kotlin.jvm.internal.s.h(cameraBubbleManager, "cameraBubbleManager");
        kotlin.jvm.internal.s.h(liveBubbleManager, "liveBubbleManager");
        kotlin.jvm.internal.s.h(getHideBubbleDuringRecordUseCase, "getHideBubbleDuringRecordUseCase");
        kotlin.jvm.internal.s.h(getShowScreenshotBubbleUseCase, "getShowScreenshotBubbleUseCase");
        kotlin.jvm.internal.s.h(getShowDrawerBubbleUseCase, "getShowDrawerBubbleUseCase");
        kotlin.jvm.internal.s.h(getShowCameraBubbleUseCase, "getShowCameraBubbleUseCase");
        kotlin.jvm.internal.s.h(externalScope, "externalScope");
        kotlin.jvm.internal.s.h(mainDispatcher, "mainDispatcher");
        this.f58883a = mainBubbleManager;
        this.f58884b = screenshotBubbleManager;
        this.f58885c = drawerBubbleManager;
        this.f58886d = cameraBubbleManager;
        this.f58887e = liveBubbleManager;
        this.f58888f = getHideBubbleDuringRecordUseCase;
        this.f58889g = getShowScreenshotBubbleUseCase;
        this.f58890h = getShowDrawerBubbleUseCase;
        this.f58891i = getShowCameraBubbleUseCase;
        this.f58892j = externalScope;
        this.f58893k = mainDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(kl.f fVar) {
        a aVar;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f58896t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f58896t = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object objB = aVar.f58894r;
        Object objF = ll.b.f();
        int i11 = aVar.f58896t;
        boolean z10 = false;
        if (i11 == 0) {
            fl.s.b(objB);
            if (!ef.a.g() && !ef.a.i()) {
                yf.q qVar = this.f58891i;
                g0 g0Var = g0.f38750a;
                aVar.f58896t = 1;
                objB = qVar.b(g0Var, aVar);
                if (objB == objF) {
                    return objF;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fl.s.b(objB);
        if (((Boolean) wg.d.b((wg.c) objB, kotlin.coroutines.jvm.internal.b.a(false))).booleanValue()) {
            z10 = true;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(kl.f fVar) {
        b bVar;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f58899t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f58899t = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object objB = bVar.f58897r;
        Object objF = ll.b.f();
        int i11 = bVar.f58899t;
        boolean z10 = false;
        if (i11 == 0) {
            fl.s.b(objB);
            if (!ef.a.g() && !ef.a.i()) {
                yf.s sVar = this.f58890h;
                g0 g0Var = g0.f38750a;
                bVar.f58899t = 1;
                objB = sVar.b(g0Var, bVar);
                if (objB == objF) {
                    return objF;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fl.s.b(objB);
        if (((Boolean) wg.d.b((wg.c) objB, kotlin.coroutines.jvm.internal.b.a(false))).booleanValue()) {
            z10 = true;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n() {
        return (ef.a.h() || ef.a.i() || !ef.a.f()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(kl.f fVar) {
        c cVar;
        if (fVar instanceof c) {
            cVar = (c) fVar;
            int i10 = cVar.f58902t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f58902t = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(fVar);
            }
        } else {
            cVar = new c(fVar);
        }
        Object objB = cVar.f58900r;
        Object objF = ll.b.f();
        int i11 = cVar.f58902t;
        boolean z10 = false;
        if (i11 == 0) {
            fl.s.b(objB);
            if (!ef.a.f() && !ef.a.g() && !ef.a.i()) {
                if (ef.a.h()) {
                    yf.c cVar2 = this.f58888f;
                    g0 g0Var = g0.f38750a;
                    cVar.f58902t = 1;
                    objB = cVar2.b(g0Var, cVar);
                    if (objB == objF) {
                        return objF;
                    }
                } else {
                    z10 = true;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fl.s.b(objB);
        if (!((Boolean) wg.d.b((wg.c) objB, kotlin.coroutines.jvm.internal.b.a(false))).booleanValue()) {
            z10 = true;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(kl.f fVar) {
        d dVar;
        if (fVar instanceof d) {
            dVar = (d) fVar;
            int i10 = dVar.f58905t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f58905t = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(fVar);
            }
        } else {
            dVar = new d(fVar);
        }
        Object objB = dVar.f58903r;
        Object objF = ll.b.f();
        int i11 = dVar.f58905t;
        boolean z10 = false;
        if (i11 == 0) {
            fl.s.b(objB);
            if (!ef.a.g() && !ef.a.i()) {
                yf.u uVar = this.f58889g;
                g0 g0Var = g0.f38750a;
                dVar.f58905t = 1;
                objB = uVar.b(g0Var, dVar);
                if (objB == objF) {
                    return objF;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fl.s.b(objB);
        if (((Boolean) wg.d.b((wg.c) objB, kotlin.coroutines.jvm.internal.b.a(false))).booleanValue()) {
            z10 = true;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static /* synthetic */ void t(p pVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        pVar.s(i10, z10);
    }

    public final void r(int i10) {
        if (lg.c.c()) {
            if (q(i10, 2)) {
                ((dh.i) this.f58883a.get()).Q();
            }
            if (q(i10, 8)) {
                ((eh.c) this.f58884b.get()).s();
            }
            if (q(i10, 16)) {
                ((bh.e) this.f58885c.get()).F();
            }
            if (q(i10, 32)) {
                ((ah.g) this.f58886d.get()).b();
            }
            if (q(i10, 4)) {
                ((ch.d) this.f58887e.get()).O();
            }
        }
    }

    public final void s(int i10, boolean z10) {
        wp.a.h(AzRecorderApp.f22504d).g("show GlobalBubbleManager", new Object[0]);
        if (lg.c.c()) {
            wp.a.h(AzRecorderApp.f22504d).g("finish checking overlay permission", new Object[0]);
            em.k.d(this.f58892j, this.f58893k, null, new e(i10, z10, null), 2, null);
        }
    }

    public final void u(int i10) {
        if (lg.c.c()) {
            if (q(i10, 2)) {
                ((dh.i) this.f58883a.get()).n();
            }
            if (q(i10, 8)) {
                ((eh.c) this.f58884b.get()).n();
            }
            if (q(i10, 16)) {
                ((bh.e) this.f58885c.get()).K();
            }
            if (q(i10, 32)) {
                ((ah.g) this.f58886d.get()).d();
            }
            if (q(i10, 4)) {
                ((ch.d) this.f58887e.get()).n();
            }
        }
    }
}
