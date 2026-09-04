package gh;

import ag.u;
import android.content.Intent;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q1;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.models.EncodeParam;
import com.hecorat.screenrecorder.free.models.FBLiveDestination;
import em.o0;
import fl.g0;
import fl.s;
import fl.w;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class o extends fh.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ag.c f39197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ag.g f39198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ag.q f39199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ag.i f39200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ag.m f39201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ag.a f39202n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ag.k f39203o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final u f39204p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final dg.a f39205q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final rf.b f39206r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p0 f39207s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p0 f39208t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p0 f39209u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final p0 f39210v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p0 f39211w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final k0 f39212x;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f39213r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f39214s;

        a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return o.this.new a(fVar);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x00a3  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p0 p0VarQ;
            p0 p0Var;
            p0 p0Var2;
            Object objB;
            p0 p0Var3;
            Object objF = ll.b.f();
            int i10 = this.f39214s;
            if (i10 == 0) {
                s.b(obj);
                o.this.s().q(kotlin.coroutines.jvm.internal.b.a(true));
                p0VarQ = o.this.Q();
                ag.m mVar = o.this.f39201m;
                g0 g0Var = g0.f38750a;
                this.f39213r = p0VarQ;
                this.f39214s = 1;
                obj = mVar.b(g0Var, this);
                if (obj != objF) {
                }
                return objF;
            }
            if (i10 == 1) {
                p0VarQ = (p0) this.f39213r;
                s.b(obj);
            } else {
                if (i10 == 2) {
                    p0Var = (p0) this.f39213r;
                    s.b(obj);
                    p0Var.q(wg.d.b((wg.c) obj, nh.p.b()));
                    p0Var2 = o.this.f39210v;
                    ag.g gVar = o.this.f39198j;
                    g0 g0Var2 = g0.f38750a;
                    this.f39213r = p0Var2;
                    this.f39214s = 3;
                    objB = gVar.b(g0Var2, this);
                    if (objB != objF) {
                        p0Var3 = p0Var2;
                        obj = objB;
                    }
                    return objF;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p0Var3 = (p0) this.f39213r;
                s.b(obj);
            }
            p0Var3.q(wg.d.b((wg.c) obj, nh.p.d()));
            o.this.s().q(kotlin.coroutines.jvm.internal.b.a(false));
            return g0.f38750a;
            p0VarQ.q(wg.d.a((wg.c) obj));
            p0Var = o.this.f39209u;
            ag.c cVar = o.this.f39197i;
            g0 g0Var3 = g0.f38750a;
            this.f39213r = p0Var;
            this.f39214s = 2;
            obj = cVar.b(g0Var3, this);
            if (obj != objF) {
                p0Var.q(wg.d.b((wg.c) obj, nh.p.b()));
                p0Var2 = o.this.f39210v;
                ag.g gVar2 = o.this.f39198j;
                g0 g0Var4 = g0.f38750a;
                this.f39213r = p0Var2;
                this.f39214s = 3;
                objB = gVar2.b(g0Var4, this);
                if (objB != objF) {
                    p0Var3 = p0Var2;
                    obj = objB;
                    p0Var3.q(wg.d.b((wg.c) obj, nh.p.d()));
                    o.this.s().q(kotlin.coroutines.jvm.internal.b.a(false));
                    return g0.f38750a;
                }
            }
            return objF;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f39216r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f39217s;

        b(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l0 l0Var, kl.f fVar) {
            return ((b) create(l0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            b bVar = o.this.new b(fVar);
            bVar.f39217s = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r5.f39216r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fl.s.b(r6)
                goto L51
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f39217s
                androidx.lifecycle.l0 r1 = (androidx.lifecycle.l0) r1
                fl.s.b(r6)
                goto L3d
            L22:
                fl.s.b(r6)
                java.lang.Object r6 = r5.f39217s
                r1 = r6
                androidx.lifecycle.l0 r1 = (androidx.lifecycle.l0) r1
                gh.o r6 = gh.o.this
                ag.k r6 = gh.o.D(r6)
                fl.g0 r4 = fl.g0.f38750a
                r5.f39217s = r1
                r5.f39216r = r3
                java.lang.Object r6 = r6.b(r4, r5)
                if (r6 != r0) goto L3d
                goto L50
            L3d:
                wg.c r6 = (wg.c) r6
                java.lang.String r3 = ""
                java.lang.Object r6 = wg.d.b(r6, r3)
                r3 = 0
                r5.f39217s = r3
                r5.f39216r = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L51
            L50:
                return r0
            L51:
                fl.g0 r6 = fl.g0.f38750a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: gh.o.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f39219r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f39220s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f39221t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f39222u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f39224w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ Intent f39225x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ String f39226y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, Intent intent, String str, kl.f fVar) {
            super(2, fVar);
            this.f39224w = i10;
            this.f39225x = intent;
            this.f39226y = str;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            c cVar = o.this.new c(this.f39224w, this.f39225x, this.f39226y, fVar);
            cVar.f39222u = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:24:0x00da  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            o0 o0Var;
            FBLiveDestination fBLiveDestination;
            o oVar;
            JSONObject jSONObject;
            Object objF = ll.b.f();
            int i10 = this.f39221t;
            if (i10 == 0) {
                s.b(obj);
                o0Var = (o0) this.f39222u;
                o.this.s().q(kotlin.coroutines.jvm.internal.b.a(true));
                ag.i iVar = o.this.f39200l;
                g0 g0Var = g0.f38750a;
                this.f39222u = o0Var;
                this.f39221t = 1;
                obj = iVar.b(g0Var, this);
                if (obj != objF) {
                }
                return objF;
            }
            if (i10 == 1) {
                o0Var = (o0) this.f39222u;
                s.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fBLiveDestination = (FBLiveDestination) this.f39220s;
                oVar = (o) this.f39219r;
                s.b(obj);
            }
            jSONObject = (JSONObject) wg.d.a((wg.c) obj);
            if (jSONObject != null) {
                String string = jSONObject.getString("stream_url");
                oVar.f39206r.g(fBLiveDestination);
                oVar.f39206r.h(jSONObject.getString("id"));
                dg.a aVar = oVar.f39205q;
                kotlin.jvm.internal.s.e(string);
                aVar.p(string, 0);
                oVar.u().q(kotlin.coroutines.jvm.internal.b.a(true));
            } else {
                oVar.t().q(new wg.a(kotlin.coroutines.jvm.internal.b.d(R.string.toast_common_error)));
            }
            o.this.s().q(kotlin.coroutines.jvm.internal.b.a(false));
            return g0.f38750a;
            EncodeParam encodeParam = (EncodeParam) wg.d.b((wg.c) obj, nh.p.a());
            FBLiveDestination fBLiveDestination2 = (FBLiveDestination) o.this.f39210v.f();
            if (fBLiveDestination2 != null) {
                o oVar2 = o.this;
                int i11 = this.f39224w;
                Intent intent = this.f39225x;
                String str = this.f39226y;
                if (oVar2.f39205q.o(i11, intent, encodeParam)) {
                    ag.a aVar2 = oVar2.f39202n;
                    fl.q qVarA = w.a(fBLiveDestination2, str);
                    this.f39222u = o0Var;
                    this.f39219r = oVar2;
                    this.f39220s = fBLiveDestination2;
                    this.f39221t = 2;
                    obj = aVar2.b(qVarA, this);
                    if (obj != objF) {
                        fBLiveDestination = fBLiveDestination2;
                        oVar = oVar2;
                        jSONObject = (JSONObject) wg.d.a((wg.c) obj);
                        if (jSONObject != null) {
                            String string2 = jSONObject.getString("stream_url");
                            oVar.f39206r.g(fBLiveDestination);
                            oVar.f39206r.h(jSONObject.getString("id"));
                            dg.a aVar3 = oVar.f39205q;
                            kotlin.jvm.internal.s.e(string2);
                            aVar3.p(string2, 0);
                            oVar.u().q(kotlin.coroutines.jvm.internal.b.a(true));
                        } else {
                            oVar.t().q(new wg.a(kotlin.coroutines.jvm.internal.b.d(R.string.toast_common_error)));
                        }
                    }
                    return objF;
                }
                oVar2.t().q(new wg.a(kotlin.coroutines.jvm.internal.b.d(R.string.toast_common_error)));
            }
            o.this.s().q(kotlin.coroutines.jvm.internal.b.a(false));
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f39227r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f39229t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, kl.f fVar) {
            super(2, fVar);
            this.f39229t = str;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((d) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return o.this.new d(this.f39229t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f39227r;
            if (i10 == 0) {
                s.b(obj);
                u uVar = o.this.f39204p;
                String str = this.f39229t;
                this.f39227r = 1;
                if (uVar.b(str, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f39230r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ FBLiveDestination f39232t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(FBLiveDestination fBLiveDestination, kl.f fVar) {
            super(2, fVar);
            this.f39232t = fBLiveDestination;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return o.this.new e(this.f39232t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f39230r;
            if (i10 == 0) {
                s.b(obj);
                ag.q qVar = o.this.f39199k;
                FBLiveDestination fBLiveDestination = this.f39232t;
                this.f39230r = 1;
                if (qVar.b(fBLiveDestination, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ag.c getAvailableFbDestinationsUseCase, ag.g getFbDestinationUseCase, ag.q setFbDestinationUseCase, ag.i getFbEncodeParamUseCase, ag.m getFbUserUseCase, ag.a createFbLiveUseCase, ag.k getFbTitleUseCase, u setFbTitleUseCase, dg.a azLive, rf.b liveFbRepository) {
        super(azLive);
        kotlin.jvm.internal.s.h(getAvailableFbDestinationsUseCase, "getAvailableFbDestinationsUseCase");
        kotlin.jvm.internal.s.h(getFbDestinationUseCase, "getFbDestinationUseCase");
        kotlin.jvm.internal.s.h(setFbDestinationUseCase, "setFbDestinationUseCase");
        kotlin.jvm.internal.s.h(getFbEncodeParamUseCase, "getFbEncodeParamUseCase");
        kotlin.jvm.internal.s.h(getFbUserUseCase, "getFbUserUseCase");
        kotlin.jvm.internal.s.h(createFbLiveUseCase, "createFbLiveUseCase");
        kotlin.jvm.internal.s.h(getFbTitleUseCase, "getFbTitleUseCase");
        kotlin.jvm.internal.s.h(setFbTitleUseCase, "setFbTitleUseCase");
        kotlin.jvm.internal.s.h(azLive, "azLive");
        kotlin.jvm.internal.s.h(liveFbRepository, "liveFbRepository");
        this.f39197i = getAvailableFbDestinationsUseCase;
        this.f39198j = getFbDestinationUseCase;
        this.f39199k = setFbDestinationUseCase;
        this.f39200l = getFbEncodeParamUseCase;
        this.f39201m = getFbUserUseCase;
        this.f39202n = createFbLiveUseCase;
        this.f39203o = getFbTitleUseCase;
        this.f39204p = setFbTitleUseCase;
        this.f39205q = azLive;
        this.f39206r = liveFbRepository;
        this.f39207s = new p0();
        this.f39208t = new p0();
        this.f39209u = new p0();
        this.f39210v = new p0();
        this.f39211w = new p0();
        this.f39212x = androidx.lifecycle.i.b(null, 0L, new b(null), 3, null);
        em.k.d(q1.a(this), null, null, new a(null), 3, null);
    }

    public final k0 N() {
        return this.f39209u;
    }

    public final k0 O() {
        return this.f39208t;
    }

    public final k0 P() {
        return this.f39212x;
    }

    public final p0 Q() {
        return this.f39211w;
    }

    public final k0 R() {
        return this.f39207s;
    }

    public final k0 S() {
        return this.f39210v;
    }

    public final void T() {
        this.f39208t.q(new wg.a(g0.f38750a));
    }

    public final void U() {
        this.f39207s.q(new wg.a(g0.f38750a));
    }

    public void V(String title) {
        kotlin.jvm.internal.s.h(title, "title");
        em.k.d(q1.a(this), null, null, new d(title, null), 3, null);
    }

    public final void W(FBLiveDestination destination) {
        kotlin.jvm.internal.s.h(destination, "destination");
        this.f39210v.q(destination);
        FBLiveDestination fBLiveDestination = (FBLiveDestination) this.f39210v.f();
        if (fBLiveDestination != null) {
            em.k.d(q1.a(this), null, null, new e(fBLiveDestination, null), 3, null);
        }
    }

    @Override // fh.j
    public void w(int i10, Intent intent, String title) {
        kotlin.jvm.internal.s.h(title, "title");
        em.k.d(q1.a(this), null, null, new c(i10, intent, title, null), 3, null);
    }
}
