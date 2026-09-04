package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.ea, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2935ea extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2961fa f26478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f26482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2935ea(C2961fa c2961fa, long j10, String str, int i10, String str2, kl.f fVar) {
        super(1, fVar);
        this.f26478a = c2961fa;
        this.f26479b = j10;
        this.f26480c = str;
        this.f26481d = i10;
        this.f26482e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C2935ea(this.f26478a, this.f26479b, this.f26480c, this.f26481d, this.f26482e, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C2935ea) create((kl.f) obj)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3426x9.f27835a;
        ArrayList arrayList2 = new ArrayList();
        C2884ca c2884ca = new C2884ca();
        ArrayList arrayList3 = new ArrayList();
        em.j.b(null, new C2858ba(c2884ca, arrayList3, null), 1, null);
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            arrayList2.add(new C3064ja((C2910da) obj2));
        }
        arrayList.addAll(arrayList2);
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.s.g(next, "next(...)");
            C2961fa c2961fa = this.f26478a;
            long j10 = this.f26479b;
            C3064ja c3064ja = (C3064ja) ((InterfaceC2987ga) next);
            long j11 = c3064ja.f26798a.f26402c.f27932b;
            if (j10 >= j11 && j10 - j11 <= c2961fa.f26547a) {
                String str = this.f26480c;
                int i11 = this.f26481d;
                c3064ja.a("Message - " + str + ", Reason - " + i11 + ", Timestamp - " + j10 + ", Data - " + this.f26482e);
                c3064ja.b(String.valueOf(i11));
                Throwable thE = fl.r.e(c3064ja.b());
                if (thE != null) {
                    try {
                        kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
                        M2 m10 = new M2(thE);
                        k0Var.f43597a = m10;
                        W9.a(m10);
                        Object objA = c3064ja.a();
                        Throwable thE2 = fl.r.e(objA);
                        if (thE2 != null) {
                            try {
                                M2 m11 = new M2(thE2);
                                k0Var.f43597a = m11;
                                W9.a(m11);
                                objA = fl.r.b(fl.g0.f38750a);
                            } catch (Throwable th2) {
                                fl.r.a aVar = fl.r.f38769b;
                                objA = fl.r.b(fl.s.a(th2));
                            }
                        }
                        fl.r.b(fl.r.a(objA));
                    } catch (Throwable th3) {
                        fl.r.a aVar2 = fl.r.f38769b;
                        fl.r.b(fl.s.a(th3));
                    }
                }
            }
        }
        return fl.g0.f38750a;
    }
}
