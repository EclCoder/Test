package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Gf extends Vn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Wn f24862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ie f24863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3373v8 f24864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3322t9 f24865g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gf(Context context, GestureDetectorOnGestureListenerC3228pi adContainer, Wn mViewableAd, em.o0 hybridScope, Ie ie2, C3373v8 c3373v8, InterfaceC3322t9 interfaceC3322t9) {
        super(adContainer);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(adContainer, "adContainer");
        kotlin.jvm.internal.s.h(mViewableAd, "mViewableAd");
        kotlin.jvm.internal.s.h(hybridScope, "hybridScope");
        this.f24862d = mViewableAd;
        this.f24863e = ie2;
        this.f24864f = c3373v8;
        this.f24865g = interfaceC3322t9;
        em.o0 o0VarA = T4.a(hybridScope);
        kotlin.jvm.internal.s.h(context, "context");
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("Gf", "TAG");
            ((C3348u9) interfaceC3322t9).b("Gf", "initializeOMSDK called");
        }
        int i10 = AbstractC3302sf.f27467a;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.s.g(applicationContext, "getApplicationContext(...)");
        AbstractC3302sf.a(applicationContext);
        em.k.d(o0VarA, null, null, new Ff(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(Gf gf2, kotlin.coroutines.jvm.internal.d dVar) {
        Ef ef2;
        InterfaceC3322t9 interfaceC3322t9;
        gf2.getClass();
        if (dVar instanceof Ef) {
            ef2 = (Ef) dVar;
            int i10 = ef2.f24720c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ef2.f24720c = i10 - Integer.MIN_VALUE;
            } else {
                ef2 = new Ef(gf2, dVar);
            }
        } else {
            ef2 = new Ef(gf2, dVar);
        }
        Object objJ = ef2.f24718a;
        Object objF = ll.b.f();
        int i11 = ef2.f24720c;
        fl.g0 g0Var = null;
        if (i11 == 0) {
            fl.s.b(objJ);
            C3432xf c3432xf = C3432xf.f27854a;
            ef2.f24720c = 1;
            Context context = Xi.f26021a;
            objJ = context == null ? "" : em.i.j(em.c1.b(), new C3380vf(context, null), ef2);
            if (objJ == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objJ);
        }
        String str = (String) objJ;
        C3373v8 c3373v8 = gf2.f24864f;
        if (c3373v8 == null) {
            interfaceC3322t9 = gf2.f24865g;
            if (interfaceC3322t9 != null) {
                kotlin.jvm.internal.s.g("Gf", "TAG");
                ((C3348u9) interfaceC3322t9).a("Gf", "OmidInfo is null, cannot track ad");
                fl.g0 g0Var2 = fl.g0.f38750a;
            }
        } else {
            Ie ie2 = gf2.f24863e;
            if (ie2 != null) {
                ie2.a(str, c3373v8.f27696a, c3373v8.f27697b, c3373v8.f27699d, c3373v8.f27698c, c3373v8.f27700e);
                g0Var = fl.g0.f38750a;
            }
            if (g0Var == null) {
                interfaceC3322t9 = gf2.f24865g;
                if (interfaceC3322t9 != null) {
                    kotlin.jvm.internal.s.g("Gf", "TAG");
                    ((C3348u9) interfaceC3322t9).a("Gf", "OmidInfo is null, cannot track ad");
                    fl.g0 g0Var3 = fl.g0.f38750a;
                }
            }
        }
        return fl.g0.f38750a;
    }

    @Override // com.inmobi.media.Wn
    public final View b() {
        return this.f24862d.b();
    }

    @Override // com.inmobi.media.Wn
    public final View c() {
        InterfaceC3322t9 interfaceC3322t9 = this.f24865g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("Gf", "TAG");
            ((C3348u9) interfaceC3322t9).c("Gf", "inflateView called");
        }
        return this.f24862d.c();
    }

    @Override // com.inmobi.media.Wn
    public final void d() {
        InterfaceC3322t9 interfaceC3322t9 = this.f24865g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("Gf", "TAG");
            ((C3348u9) interfaceC3322t9).a("Gf", "stopTrackingForImpression");
        }
        this.f24862d.d();
    }

    @Override // com.inmobi.media.Wn
    public final void a(View childView, FriendlyObstructionPurpose friendlyObstruction) {
        kotlin.jvm.internal.s.h(childView, "childView");
        kotlin.jvm.internal.s.h(friendlyObstruction, "obstructionCode");
        Ie ie2 = this.f24863e;
        if (ie2 != null) {
            kotlin.jvm.internal.s.h(childView, "childView");
            kotlin.jvm.internal.s.h(friendlyObstruction, "friendlyObstruction");
            if (ie2.f26432c == null) {
                InterfaceC3322t9 interfaceC3322t9 = ie2.f26431b;
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).a(AbstractC2926e1.f26429f, "Failed to addObstruction: adSession is null");
                    return;
                }
                return;
            }
            InterfaceC3322t9 interfaceC3322t10 = ie2.f26431b;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a(AbstractC2926e1.f26429f, "addObstruction");
            }
            T4.a(ie2.f26430a, new X0(ie2, childView, friendlyObstruction, null));
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(View childView) {
        kotlin.jvm.internal.s.h(childView, "childView");
        Ie ie2 = this.f24863e;
        if (ie2 != null) {
            kotlin.jvm.internal.s.h(childView, "childView");
            if (ie2.f26432c == null) {
                return;
            }
            T4.a(ie2.f26430a, new C2823a1(ie2, childView, null));
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(Map map) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24865g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("Gf", "TAG");
            ((C3348u9) interfaceC3322t9).a("Gf", "startTrackingForImpression");
        }
        this.f24862d.a(map);
    }

    @Override // com.inmobi.media.Wn
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.s.h(context, "context");
        this.f24862d.a(context, b10);
    }

    @Override // com.inmobi.media.Wn
    public final void a() {
        InterfaceC3322t9 interfaceC3322t9 = this.f24865g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("Gf", "TAG");
            ((C3348u9) interfaceC3322t9).c("Gf", "destroy");
        }
        WeakReference weakReference = this.f25982b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f24863e = null;
        this.f24862d.a();
    }
}
