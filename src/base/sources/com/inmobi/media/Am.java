package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Am extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fm f24490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Am(Fm fm2, kl.f fVar) {
        super(2, fVar);
        this.f24490c = fm2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Am am2 = new Am(this.f24490c, fVar);
        am2.f24489b = obj;
        return am2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        Am am2 = new Am(this.f24490c, (kl.f) obj2);
        am2.f24489b = (AbstractC3050im) obj;
        return am2.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC3050im mediaEvent;
        Object objF = ll.b.f();
        int i10 = this.f24488a;
        if (i10 == 0) {
            fl.s.b(obj);
            AbstractC3050im abstractC3050im = (AbstractC3050im) this.f24489b;
            hm.v vVar = this.f24490c.f24803d;
            this.f24489b = abstractC3050im;
            this.f24488a = 1;
            if (vVar.emit(abstractC3050im, this) == objF) {
                return objF;
            }
            mediaEvent = abstractC3050im;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaEvent = (AbstractC3050im) this.f24489b;
            fl.s.b(obj);
        }
        Hn hn2 = this.f24490c.f24802c.f24890g;
        kotlin.jvm.internal.s.h(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof Sm) {
            Map mapA = AbstractC3487zk.a(hn2.f24969a);
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("VideoLoadStarted", mapA, EnumC3281rk.SDK);
        } else if (mediaEvent instanceof Vm) {
            Map mapA2 = AbstractC3487zk.a(hn2.f24969a);
            C3178nk c3178nk2 = C3178nk.f27064a;
            C3178nk.b("VideoLoadSuccess", mapA2, EnumC3281rk.SDK);
        } else if (mediaEvent instanceof Bn) {
            boolean[] zArr = hn2.f24970b;
            if (!zArr[0]) {
                zArr[0] = true;
                Map mapA3 = AbstractC3487zk.a(hn2.f24969a);
                C3178nk c3178nk3 = C3178nk.f27064a;
                C3178nk.b("VideoStart", mapA3, EnumC3281rk.SDK);
            }
        } else if (mediaEvent instanceof Om) {
            boolean[] zArr2 = hn2.f24970b;
            if (!zArr2[1]) {
                zArr2[1] = true;
                Map mapA4 = AbstractC3487zk.a(hn2.f24969a);
                C3178nk c3178nk4 = C3178nk.f27064a;
                C3178nk.b("VideoFirstQuartile", mapA4, EnumC3281rk.SDK);
            }
        } else if (mediaEvent instanceof C3490zn) {
            boolean[] zArr3 = hn2.f24970b;
            if (!zArr3[2]) {
                zArr3[2] = true;
                Map mapA5 = AbstractC3487zk.a(hn2.f24969a);
                C3178nk c3178nk5 = C3178nk.f27064a;
                C3178nk.b("VideoSecondQuartile", mapA5, EnumC3281rk.SDK);
            }
        } else if (mediaEvent instanceof In) {
            boolean[] zArr4 = hn2.f24970b;
            if (!zArr4[3]) {
                zArr4[3] = true;
                Map mapA6 = AbstractC3487zk.a(hn2.f24969a);
                C3178nk c3178nk6 = C3178nk.f27064a;
                C3178nk.b("VideoThirdQuartile", mapA6, EnumC3281rk.SDK);
            }
        } else if (mediaEvent instanceof C2999gm) {
            boolean[] zArr5 = hn2.f24970b;
            if (!zArr5[4]) {
                zArr5[4] = true;
                Map mapA7 = AbstractC3487zk.a(hn2.f24969a);
                C3178nk c3178nk7 = C3178nk.f27064a;
                C3178nk.b("VideoComplete", mapA7, EnumC3281rk.SDK);
            }
        } else if (mediaEvent instanceof C3025hm) {
            Map mapV = gl.l0.v(AbstractC3487zk.a(hn2.f24969a));
            mapV.put("errorCode", (short) 66);
            C3178nk c3178nk8 = C3178nk.f27064a;
            C3178nk.b("VideoLoadFailure", mapV, EnumC3281rk.SDK);
        }
        C2922dm c2922dm = this.f24490c.f24802c.f24889f;
        kotlin.jvm.internal.s.h(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof Vm) {
            c2922dm.f26420b.f25832d = AbstractC3463yl.a(((Vm) mediaEvent).f25912a);
            c2922dm.f26421c.f26366f.a(C2863bf.f26261a);
        } else if (mediaEvent instanceof C3025hm) {
            c2922dm.f26421c.f26373m.a(new Wo(gl.l0.f(fl.w.a("[ERRORCODE]", String.valueOf(405))), null, 2));
        } else if (mediaEvent instanceof Bn) {
            String str = ((Bn) mediaEvent).f24570b;
            if (c2922dm.f26419a.incrementAndGet() > 1) {
                Map mapM = gl.l0.m(fl.w.a("trigger", str));
                C3178nk c3178nk9 = C3178nk.f27064a;
                C3178nk.b("MultipleVideoReadyFired", mapM, EnumC3281rk.SDK);
            }
            Gc gc2 = c2922dm.f26421c.f26367g;
            C2863bf c2863bf = C2863bf.f26261a;
            gc2.a(c2863bf);
            c2922dm.f26421c.f26368h.a(c2863bf);
        } else if (mediaEvent instanceof C3465yn) {
            c2922dm.f26421c.f26372l.a(C2863bf.f26261a);
        } else if (mediaEvent instanceof C2974fn) {
            c2922dm.f26421c.f26371k.a(C2863bf.f26261a);
        } else if (mediaEvent instanceof Om) {
            c2922dm.f26421c.f26362b.a(C2863bf.f26261a);
        } else if (mediaEvent instanceof C3490zn) {
            c2922dm.f26421c.f26363c.a(C2863bf.f26261a);
        } else if (mediaEvent instanceof In) {
            c2922dm.f26421c.f26364d.a(C2863bf.f26261a);
        } else if (mediaEvent instanceof C2999gm) {
            c2922dm.f26421c.f26365e.a(C2863bf.f26261a);
        } else if (mediaEvent instanceof C3207on) {
            c2922dm.f26420b.f25833e = ((C3207on) mediaEvent).f27148a;
            c2922dm.f26421c.f26374n.a(C2863bf.f26261a);
        } else if (mediaEvent instanceof S1) {
            if (((S1) mediaEvent).f25666a) {
                c2922dm.f26421c.f26369i.a(C2863bf.f26261a);
            } else {
                c2922dm.f26421c.f26370j.a(C2863bf.f26261a);
            }
        }
        return fl.g0.f38750a;
    }
}
