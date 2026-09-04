package com.inmobi.media;

import com.inmobi.media.C3370v5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.v5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3370v5 implements InterfaceC3332tj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Nc f27681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC3288s1 f27682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A8 f27683c;

    public C3370v5(A8 a10) {
        this.f27681a = null;
        this.f27682b = null;
        this.f27683c = a10;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        em.o0 o0VarA;
        em.z1 z1VarD;
        InterfaceC3322t9 interfaceC3322t9C;
        A8 a10 = this.f27683c;
        if (a10 != null && (interfaceC3322t9C = a10.c()) != null) {
            ((C3348u9) interfaceC3322t9C).a("AUM-DestroyedState", "Initialize Called");
        }
        A8 a11 = this.f27683c;
        if (a11 == null || (o0VarA = a11.a()) == null || (z1VarD = em.k.d(o0VarA, null, null, new C3344u5(this, null), 3, null)) == null) {
            return;
        }
        z1VarD.q(new Function1() { // from class: yh.hc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3370v5.a(this.f57761a, (Throwable) obj);
            }
        });
    }

    public static final fl.g0 a(C3370v5 c3370v5, Throwable th2) {
        InterfaceC3322t9 interfaceC3322t9C;
        A8 a10 = c3370v5.f27683c;
        if (a10 != null && (interfaceC3322t9C = a10.c()) != null) {
            ((C3348u9) interfaceC3322t9C).a();
        }
        A8 a11 = c3370v5.f27683c;
        J3.a(a11 != null ? a11.a() : null);
        c3370v5.f27682b = null;
        c3370v5.f27683c = null;
        c3370v5.f27681a = null;
        return fl.g0.f38750a;
    }

    public C3370v5(Nc nc2, AbstractC3288s1 abstractC3288s1, A8 a10) {
        this.f27681a = nc2;
        this.f27682b = abstractC3288s1;
        this.f27683c = a10;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
    }
}
