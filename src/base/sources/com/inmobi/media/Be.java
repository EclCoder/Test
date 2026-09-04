package com.inmobi.media;

import android.view.ViewGroup;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Be extends AbstractC3441y implements InterfaceC3332tj, Tk, InterfaceC2950f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ce f24536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rc f24537c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Be(Ce provider, Rc stateMachine) {
        super(provider.f24602g.f25267a);
        kotlin.jvm.internal.s.h(provider, "provider");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f24536b = provider;
        this.f24537c = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("NativeRenderedState", "Initialize Called");
        }
        InterfaceC3332tj interfaceC3332tj = this.f24536b.f24602g.f25269c.f25000c;
        I i10 = interfaceC3332tj instanceof I ? (I) interfaceC3332tj : null;
        if (i10 != null) {
            i10.g();
        }
        Ce ce2 = this.f24536b;
        Fi fi2 = ce2.f24597b;
        if (!fi2.f24792a) {
            fi2.f24792a = true;
            AbstractC2926e1 abstractC2926e1 = ce2.f24600e;
            if (abstractC2926e1.f26432c == null) {
                InterfaceC3322t9 interfaceC3322t9 = abstractC2926e1.f26431b;
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).a(AbstractC2926e1.f26429f, "Failed to startAdSession. adSession is null");
                }
            } else {
                InterfaceC3322t9 interfaceC3322t10 = abstractC2926e1.f26431b;
                if (interfaceC3322t10 != null) {
                    ((C3348u9) interfaceC3322t10).a(AbstractC2926e1.f26429f, "startAdSession");
                }
                T4.a(abstractC2926e1.f26430a, new C2849b1(abstractC2926e1, null));
            }
            Ce ce3 = this.f24536b;
            AbstractC2926e1 abstractC2926e2 = ce3.f24600e;
            ViewGroup adView = ce3.f24598c.f26265a.getParentView();
            abstractC2926e2.getClass();
            kotlin.jvm.internal.s.h(adView, "adView");
            if (abstractC2926e2.f26432c == null) {
                InterfaceC3322t9 interfaceC3322t11 = abstractC2926e2.f26431b;
                if (interfaceC3322t11 != null) {
                    ((C3348u9) interfaceC3322t11).a(AbstractC2926e1.f26429f, "Failed to registerAdView. adSession is null");
                }
            } else {
                InterfaceC3322t9 interfaceC3322t12 = abstractC2926e2.f26431b;
                if (interfaceC3322t12 != null) {
                    ((C3348u9) interfaceC3322t12).a(AbstractC2926e1.f26429f, "registerAdView");
                }
                T4.a(abstractC2926e2.f26430a, new Y0(abstractC2926e2, adView, null));
            }
            G g10 = this.f27890a.f27823b;
            kotlin.jvm.internal.s.h(g10, "<this>");
            MetaInfo metaInfo = g10.f24814d;
            if (kotlin.jvm.internal.s.c(metaInfo != null ? metaInfo.getCreativeType() : null, MimeTypes.BASE_TYPE_VIDEO)) {
                this.f24536b.f24600e.a(true);
            } else {
                this.f24536b.f24600e.a();
            }
        }
        InterfaceC3322t9 interfaceC3322t9L2 = l();
        if (interfaceC3322t9L2 != null) {
            ((C3348u9) interfaceC3322t9L2).a("NativeRenderedState", "listenMediaEvents - setting up media event listener");
        }
        em.k.d(this.f24536b.f24603h, null, null, new C3172ne(((C3325tc) this.f24536b.f24602g.f25273g.getValue()).f27545e, null, this), 3, null);
        T4.a(this.f24536b.f24603h, new C3094ke(this, null));
        Ce ce4 = this.f24536b;
        if (ce4.f24597b.f24793b) {
            InterfaceC3322t9 interfaceC3322t9L3 = l();
            if (interfaceC3322t9L3 != null) {
                ((C3348u9) interfaceC3322t9L3).a("NativeRenderedState", "Track Views Attached to Telemetry - Already triggered, skipping");
            }
        } else {
            em.k.d(ce4.f24603h, null, null, new C3481ze(this, null), 3, null);
        }
        if (this.f24536b.f24597b.f24794c) {
            InterfaceC3322t9 interfaceC3322t9L4 = l();
            if (interfaceC3322t9L4 != null) {
                ((C3348u9) interfaceC3322t9L4).a("NativeRenderedState", "Impression Tracking - Already triggered, skipping");
            }
        } else {
            G g11 = this.f27890a.f27823b;
            kotlin.jvm.internal.s.h(g11, "<this>");
            if (g11.f24823m.f24739a == 0) {
                InterfaceC3322t9 interfaceC3322t9L5 = l();
                if (interfaceC3322t9L5 != null) {
                    ((C3348u9) interfaceC3322t9L5).a("NativeRenderedState", "Impression Event Occurred - Load (immediate fire)");
                }
                m();
            } else {
                em.k.d(this.f24536b.f24603h, null, null, new C3379ve(this, null), 3, null);
            }
        }
        if (!this.f24536b.f24597b.f24795d) {
            if (D4.a(this.f27890a.f27823b, "mrc50").isEmpty()) {
                InterfaceC3322t9 interfaceC3322t9L6 = l();
                if (interfaceC3322t9L6 != null) {
                    ((C3348u9) interfaceC3322t9L6).a("NativeRenderedState", "MRC50 Trackers unavailable");
                }
            } else {
                Map mapA = AbstractC3487zk.a(((Lc) this.f24536b.f24602g.f25272f.getValue()).f25200a);
                C3178nk c3178nk = C3178nk.f27064a;
                C3178nk.b("MRCViewable50Started", mapA, EnumC3281rk.SDK);
                em.k.d(this.f24536b.f24603h, null, null, new C3431xe(this, null), 3, null);
            }
        }
        C3325tc c3325tc = (C3325tc) this.f24536b.f24602g.f25273g.getValue();
        hm.w windowFlow = ((Po) this.f24536b.f24607l.getValue()).f25518b;
        c3325tc.getClass();
        kotlin.jvm.internal.s.h(windowFlow, "windowFlow");
        C3348u9 c3348u9 = c3325tc.f27541a;
        if (c3348u9 != null) {
            c3348u9.a("MediaViewManager", "attachWindowLifecycleObserver called");
        }
        AbstractC3082k2 abstractC3082k2 = c3325tc.f27542b;
        if (abstractC3082k2 != null) {
            abstractC3082k2.a(windowFlow);
        }
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("NativeRenderedState", "Finalize Called");
        }
        T4.a(this.f24536b.k(), new C3120le(this, null));
        J3.a(this.f24536b.f24603h);
        ((Nd) this.f24536b.f24606k.getValue()).f25345a.a();
        ((C3171nd) this.f24536b.f24605j.getValue()).a();
        L6.a(((Po) this.f24536b.f24607l.getValue()).f25517a);
    }

    @Override // com.inmobi.media.Tk
    public final void d() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("NativeRenderedState", "unTrackViews");
        }
        C3325tc c3325tc = (C3325tc) this.f24536b.f24602g.f25273g.getValue();
        C3348u9 c3348u9 = c3325tc.f27541a;
        if (c3348u9 != null) {
            c3348u9.a("MediaViewManager", "detachObserversAndPause called");
        }
        AbstractC3082k2 abstractC3082k2 = c3325tc.f27542b;
        if (abstractC3082k2 != null) {
            abstractC3082k2.b();
        }
        Ce ce2 = this.f24536b;
        C2865bh c2865bh = ce2.f24598c;
        this.f24537c.a(new Ge(c2865bh.f26267c, c2865bh.f26266b, ce2.f24597b, ce2.f24600e, ce2.f24599d, ce2.f24601f, ce2.f24602g, this.f24537c), this);
    }

    public final void m() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("NativeRenderedState", "fireNativeImpression - Starting impression fire");
        }
        Ce ce2 = this.f24536b;
        ce2.f24597b.f24794c = true;
        Map mapA = AbstractC3487zk.a(((Lc) ce2.f24602g.f25272f.getValue()).f25200a);
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("AdImpressionSuccessful", mapA, EnumC3281rk.SDK);
        this.f24536b.f24602g.f25269c.g();
        this.f24536b.f24601f.f25893b.f25750f.a(C2863bf.f26261a);
        AbstractC2926e1 abstractC2926e1 = this.f24536b.f24600e;
        if (abstractC2926e1.f26434e == null) {
            InterfaceC3322t9 interfaceC3322t9 = abstractC2926e1.f26431b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a(AbstractC2926e1.f26429f, "Failed to registerImpression: AdEvent is null");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = abstractC2926e1.f26431b;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).a(AbstractC2926e1.f26429f, "registerImpression");
        }
        T4.a(abstractC2926e1.f26430a, new Z0(abstractC2926e1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        if (r9.a(r2, r8, r0) == r1) goto L57;
     */
    @Override // com.inmobi.media.InterfaceC2950f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kl.f r9) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Be.a(kl.f):java.lang.Object");
    }
}
