package com.inmobi.media;

import android.view.View;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.Ld;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ld extends AbstractC3441y implements InterfaceC3332tj, InterfaceC2950f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mc f25202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rc f25203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2926e1 f25204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final em.o0 f25205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3390w f25206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fl.k f25207g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ld(Mc nativeAdUnitComponent, Rc stateMachine) {
        NativeMedia media;
        super(nativeAdUnitComponent.f25267a);
        kotlin.jvm.internal.s.h(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f25202b = nativeAdUnitComponent;
        this.f25203c = stateMachine;
        kotlin.jvm.internal.s.h(nativeAdUnitComponent, "<this>");
        JsonAssetObject assetsObject = nativeAdUnitComponent.f25268b.getAssetsObject();
        em.o0 o0Var = nativeAdUnitComponent.f25267a.f27822a.f27107e;
        this.f25204d = kotlin.jvm.internal.s.c((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), MimeTypes.BASE_TYPE_VIDEO) ? new Ie(o0Var, nativeAdUnitComponent.f25267a.f27822a.f27105c) : new Kc(o0Var, nativeAdUnitComponent.f25267a.f27822a.f27105c);
        this.f25205e = T4.a(k());
        C3416x adComponent = nativeAdUnitComponent.f25267a;
        JsonAssetObject assetsObject2 = nativeAdUnitComponent.f25268b.getAssetsObject();
        Image adChoice = assetsObject2 != null ? assetsObject2.getAdChoice() : null;
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        this.f25206f = new C3390w(adComponent.f27822a.f27104b, adChoice, adComponent.f27823b.f24811a.f27160b.getNative().getAdChoiceConfig(), adComponent.f27822a.f27105c);
        this.f25207g = fl.l.b(new tl.a() { // from class: yh.i2
            @Override // tl.a
            public final Object invoke() {
                return Ld.a(this.f57767a);
            }
        });
    }

    public static final C3306sj a(final Ld ld2) {
        return new C3306sj(new Uc(ld2.f27890a.f27822a.f27106d, null, null, 30), new tl.a() { // from class: yh.j2
            @Override // tl.a
            public final Object invoke() {
                return Ld.b(this.f57786a);
            }
        });
    }

    public static final List b(Ld ld2) {
        return D4.a("load_called", ld2.f25202b.f25267a.f27823b.f24817g);
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
        J3.a(this.f25205e);
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("NativeLoadingState", "Initialize Called - starting inflation process");
        }
        em.k.d(this.f25205e, null, null, new C3480zd(this, null), 3, null);
    }

    @Override // com.inmobi.media.InterfaceC2950f
    public final Object a(kl.f fVar) {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("NativeLoadingState", "onDestroy");
        }
        Object objA = this.f25203c.a(new C2913dd(), this, (kotlin.coroutines.jvm.internal.d) fVar);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(em.v0 v0Var, kotlin.coroutines.jvm.internal.d dVar) {
        Jd jd2;
        if (dVar instanceof Jd) {
            jd2 = (Jd) dVar;
            int i10 = jd2.f25062c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jd2.f25062c = i10 - Integer.MIN_VALUE;
            } else {
                jd2 = new Jd(this, dVar);
            }
        } else {
            jd2 = new Jd(this, dVar);
        }
        Object objN0 = jd2.f25060a;
        Object objF = ll.b.f();
        int i11 = jd2.f25062c;
        try {
            if (i11 == 0) {
                fl.s.b(objN0);
                jd2.f25062c = 1;
                objN0 = v0Var.N0(jd2);
                if (objN0 == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(objN0);
            }
            View view = (View) objN0;
            InterfaceC3322t9 interfaceC3322t9L = l();
            if (interfaceC3322t9L != null) {
                ((C3348u9) interfaceC3322t9L).a("NativeLoadingState", "waitForAdChoiceView - ad choice view inflated successfully");
            }
            return view;
        } catch (Exception e10) {
            C3348u9 c3348u9 = this.f25202b.f25267a.f27822a.f27105c;
            if (c3348u9 == null) {
                return null;
            }
            c3348u9.b("NativeLoadingState", "AdChoiceView inflation failed: " + e10);
            return null;
        }
    }

    public final void a(MediaView mediaView, View view, Vc vc2) {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("NativeLoadingState", "onInflateSuccess - transitioning to loaded state (mediaView: " + (mediaView != null) + ", adChoice: " + (view != null) + ")");
        }
        this.f25203c.a(new C3455yd(mediaView, view, this.f25204d, vc2, this.f25202b, this.f25203c), this);
    }

    public final void a(short s10) {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("NativeLoadingState", "transitionToFailedState - errorCode: " + ((int) s10));
        }
        this.f25203c.a(new C2964fd(s10, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.f25202b, this.f25203c), this);
    }
}
