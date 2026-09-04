package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Id extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Vc f25001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ld f25004d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Id(Ld ld2, kl.f fVar) {
        super(2, fVar);
        this.f25004d = ld2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Id id2 = new Id(this.f25004d, fVar);
        id2.f25003c = obj;
        return id2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        Id id2 = new Id(this.f25004d, (kl.f) obj2);
        id2.f25003c = (em.o0) obj;
        return id2.invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:47:0x013e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x019b  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a9  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00da, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        A6 c3180nm;
        em.v0 v0VarB;
        NativeMedia media;
        View view;
        G6 g10;
        InterfaceC3322t9 interfaceC3322t9L;
        Vc vc2;
        Object objJ;
        Vc vc3;
        InterfaceC3322t9 interfaceC3322t9L2;
        InterfaceC3322t9 interfaceC3322t9L3;
        Object objF = ll.b.f();
        int i10 = this.f25002b;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f25003c;
            InterfaceC3322t9 interfaceC3322t9L4 = this.f25004d.l();
            if (interfaceC3322t9L4 != null) {
                ((C3348u9) interfaceC3322t9L4).a("NativeLoadingState", "loadMediaViews - building experience loader");
            }
            Ld ld2 = this.f25004d;
            Mc nativeAdUnitComponent = ld2.f25202b;
            AbstractC2926e1 adSessionManager = ld2.f25204d;
            kotlin.jvm.internal.s.h(nativeAdUnitComponent, "nativeAdUnitComponent");
            kotlin.jvm.internal.s.h(adSessionManager, "adSessionManager");
            JsonAssetObject assetsObject = nativeAdUnitComponent.f25268b.getAssetsObject();
            String type = (assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType();
            if (kotlin.jvm.internal.s.c(type, "static")) {
                c3180nm = new Gj(nativeAdUnitComponent, adSessionManager);
            } else {
                c3180nm = kotlin.jvm.internal.s.c(type, MimeTypes.BASE_TYPE_VIDEO) ? new C3180nm(nativeAdUnitComponent, adSessionManager) : new Sk(nativeAdUnitComponent, adSessionManager);
            }
            v0VarB = em.k.b(o0Var, null, null, new Hd(c3180nm, null), 3, null);
            em.v0 v0VarB2 = em.k.b(o0Var, null, null, new Gd(this.f25004d, null), 3, null);
            Ld ld3 = this.f25004d;
            this.f25003c = v0VarB;
            this.f25002b = 1;
            obj = ld3.a(v0VarB2, this);
            if (obj != objF) {
            }
            return objF;
        }
        if (i10 == 1) {
            v0VarB = (em.v0) this.f25003c;
            fl.s.b(obj);
        } else {
            if (i10 == 2) {
                view = (View) this.f25003c;
                fl.s.b(obj);
                g10 = (G6) obj;
                if (g10 instanceof D6) {
                    interfaceC3322t9L3 = this.f25004d.l();
                    if (interfaceC3322t9L3 != null) {
                        ((C3348u9) interfaceC3322t9L3).a("NativeLoadingState", "Experience Result Failure - errorCode: " + ((int) ((D6) g10).f24640a));
                    }
                    this.f25004d.a(((D6) g10).f24640a);
                } else {
                    if (!(g10 instanceof E6)) {
                        if (g10 instanceof F6) {
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC3322t9L = this.f25004d.l();
                        if (interfaceC3322t9L != null) {
                            ((C3348u9) interfaceC3322t9L).a("NativeLoadingState", "Experience Result UnAvailable - no media view");
                        }
                        Ld ld4 = this.f25004d;
                        Bl bl2 = ((F6) g10).f24757a;
                        C2874c0 c2874c0 = ld4.f27890a.f27822a.f27106d;
                        Mc mc2 = ld4.f25202b;
                        kotlin.jvm.internal.s.h(mc2, "<this>");
                        vc2 = new Vc(bl2, c2874c0, new Ji(mc2.f25267a.f27823b.f24817g));
                        C3325tc c3325tc = (C3325tc) this.f25004d.f25202b.f25273g.getValue();
                        this.f25003c = view;
                        this.f25001a = vc2;
                        this.f25002b = 3;
                        c3325tc.getClass();
                        objJ = em.i.j(em.c1.c(), new C3273rc(c3325tc, null), this);
                        if (objJ != ll.b.f()) {
                            objJ = fl.g0.f38750a;
                        }
                        if (objJ != objF) {
                            vc3 = vc2;
                        }
                        return objF;
                    }
                    interfaceC3322t9L2 = this.f25004d.l();
                    if (interfaceC3322t9L2 != null) {
                        ((C3348u9) interfaceC3322t9L2).a("NativeLoadingState", "Experience Result Success - mediaView loaded");
                    }
                    Ld ld5 = this.f25004d;
                    E6 e10 = (E6) g10;
                    Bl bl3 = e10.f24698b;
                    C2874c0 c2874c1 = ld5.f27890a.f27822a.f27106d;
                    Mc mc3 = ld5.f25202b;
                    kotlin.jvm.internal.s.h(mc3, "<this>");
                    this.f25004d.a(e10.f24697a, view, new Vc(bl3, c2874c1, new Ji(mc3.f25267a.f27823b.f24817g)));
                }
                return fl.g0.f38750a;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vc3 = this.f25001a;
            view = (View) this.f25003c;
            fl.s.b(obj);
        }
        this.f25004d.a(null, view, vc3);
        return fl.g0.f38750a;
        View view2 = (View) obj;
        this.f25003c = view2;
        this.f25002b = 2;
        Object objN0 = v0VarB.N0(this);
        if (objN0 != objF) {
            view = view2;
            obj = objN0;
            g10 = (G6) obj;
            if (g10 instanceof D6) {
                interfaceC3322t9L3 = this.f25004d.l();
                if (interfaceC3322t9L3 != null) {
                    ((C3348u9) interfaceC3322t9L3).a("NativeLoadingState", "Experience Result Failure - errorCode: " + ((int) ((D6) g10).f24640a));
                }
                this.f25004d.a(((D6) g10).f24640a);
            } else if (!(g10 instanceof E6)) {
                interfaceC3322t9L2 = this.f25004d.l();
                if (interfaceC3322t9L2 != null) {
                    ((C3348u9) interfaceC3322t9L2).a("NativeLoadingState", "Experience Result Success - mediaView loaded");
                }
                Ld ld6 = this.f25004d;
                E6 e11 = (E6) g10;
                Bl bl4 = e11.f24698b;
                C2874c0 c2874c2 = ld6.f27890a.f27822a.f27106d;
                Mc mc4 = ld6.f25202b;
                kotlin.jvm.internal.s.h(mc4, "<this>");
                this.f25004d.a(e11.f24697a, view, new Vc(bl4, c2874c2, new Ji(mc4.f25267a.f27823b.f24817g)));
            } else {
                if (g10 instanceof F6) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3322t9L = this.f25004d.l();
                if (interfaceC3322t9L != null) {
                    ((C3348u9) interfaceC3322t9L).a("NativeLoadingState", "Experience Result UnAvailable - no media view");
                }
                Ld ld7 = this.f25004d;
                Bl bl5 = ((F6) g10).f24757a;
                C2874c0 c2874c3 = ld7.f27890a.f27822a.f27106d;
                Mc mc5 = ld7.f25202b;
                kotlin.jvm.internal.s.h(mc5, "<this>");
                vc2 = new Vc(bl5, c2874c3, new Ji(mc5.f25267a.f27823b.f24817g));
                C3325tc c3325tc2 = (C3325tc) this.f25004d.f25202b.f25273g.getValue();
                this.f25003c = view;
                this.f25001a = vc2;
                this.f25002b = 3;
                c3325tc2.getClass();
                objJ = em.i.j(em.c1.c(), new C3273rc(c3325tc2, null), this);
                if (objJ != ll.b.f()) {
                    objJ = fl.g0.f38750a;
                }
                if (objJ != objF) {
                    vc3 = vc2;
                    this.f25004d.a(null, view, vc3);
                }
            }
            return fl.g0.f38750a;
        }
        return objF;
    }
}
