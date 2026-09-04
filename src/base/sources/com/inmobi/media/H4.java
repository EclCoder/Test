package com.inmobi.media;

import com.inmobi.media.H4;
import com.inmobi.media.ads.network.common.model.ContextData;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class H4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextData f24911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24913c = H4.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P4 f24914d = new P4();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f24915e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f24916f = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f24917g = new AtomicBoolean();

    public H4(ContextData contextData, long j10) {
        this.f24911a = contextData;
        this.f24912b = j10;
    }

    public final void a() {
        String TAG = this.f24913c;
        kotlin.jvm.internal.s.g(TAG, "TAG");
        ContextData contextData = this.f24911a;
        if (contextData != null) {
            O4.f25393a.a(contextData.getEnabled());
        }
        if (O4.e() && !this.f24916f.getAndSet(true)) {
            this.f24915e = System.currentTimeMillis();
            c();
            d();
            i();
            e();
            a(this.f24915e / ((long) 1000));
        }
    }

    public final void b() {
        if (!O4.e()) {
            String TAG = this.f24913c;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            return;
        }
        if (!this.f24916f.get()) {
            String TAG2 = this.f24913c;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            return;
        }
        a((int) (System.currentTimeMillis() - this.f24915e));
        if (this.f24917g.getAndSet(true)) {
            String TAG3 = this.f24913c;
            kotlin.jvm.internal.s.g(TAG3, "TAG");
            return;
        }
        String TAG4 = this.f24913c;
        kotlin.jvm.internal.s.g(TAG4, "TAG");
        Runnable runnable = new Runnable() { // from class: yh.t1
            @Override // java.lang.Runnable
            public final void run() {
                H4.a(this.f57932a);
            }
        };
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public final void c() {
        ContextData contextData;
        String advertisedContent;
        if (this.f24917g.get() || (contextData = this.f24911a) == null || (advertisedContent = contextData.getAdvertisedContent()) == null) {
            return;
        }
        P4 p10 = this.f24914d;
        p10.getClass();
        kotlin.jvm.internal.s.h(advertisedContent, "<set-?>");
        p10.f25454a = advertisedContent;
        String TAG = this.f24913c;
        kotlin.jvm.internal.s.g(TAG, "TAG");
    }

    public final void d() {
        ContextData contextData;
        Long bidderId;
        if (this.f24917g.get() || (contextData = this.f24911a) == null || (bidderId = contextData.getBidderId()) == null) {
            return;
        }
        this.f24914d.f25455b = bidderId.longValue();
        String TAG = this.f24913c;
        kotlin.jvm.internal.s.g(TAG, "TAG");
    }

    public final void e() {
        ContextData contextData;
        if (this.f24917g.get() || (contextData = this.f24911a) == null) {
            return;
        }
        this.f24914d.f25459f = contextData.getCasAdTypeId();
        String TAG = this.f24913c;
        kotlin.jvm.internal.s.g(TAG, "TAG");
    }

    public final void f() {
        if (this.f24917g.get()) {
            return;
        }
        this.f24914d.f25460g = 1;
        String TAG = this.f24913c;
        kotlin.jvm.internal.s.g(TAG, "TAG");
    }

    public final void g() {
        if (this.f24917g.get()) {
            return;
        }
        this.f24914d.f25462i = 1;
        String TAG = this.f24913c;
        kotlin.jvm.internal.s.g(TAG, "TAG");
    }

    public final void h() {
        if (this.f24917g.get()) {
            return;
        }
        this.f24914d.f25461h = 1;
        String TAG = this.f24913c;
        kotlin.jvm.internal.s.g(TAG, "TAG");
    }

    public final void i() {
        if (this.f24917g.get()) {
            return;
        }
        this.f24914d.f25458e = this.f24912b;
        String TAG = this.f24913c;
        kotlin.jvm.internal.s.g(TAG, "TAG");
    }

    public final void a(long j10) {
        if (this.f24917g.get()) {
            return;
        }
        this.f24914d.f25456c = j10;
        String TAG = this.f24913c;
        kotlin.jvm.internal.s.g(TAG, "TAG");
    }

    public final void a(int i10) {
        if (this.f24917g.get()) {
            return;
        }
        this.f24914d.f25457d = i10;
        String TAG = this.f24913c;
        kotlin.jvm.internal.s.g(TAG, "TAG");
    }

    public static final void a(H4 h10) {
        O4 o10 = O4.f25393a;
        P4 contextualDataModel = h10.f24914d;
        kotlin.jvm.internal.s.h(contextualDataModel, "contextualDataModel");
        synchronized (o10) {
            kotlin.jvm.internal.s.g("O4", "TAG");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long expiryTime = jCurrentTimeMillis - ((long) (O4.c().getContextualData().getExpiryTime() * 1000));
            O4.a(expiryTime, O4.c().getContextualData().getMaxAdRecords() - 1);
            String string = Q4.a(contextualDataModel, O4.c().getContextualData().getSkipFields()).toString();
            kotlin.jvm.internal.s.g(string, "toString(...)");
            C2828a6 c2828a6 = new C2828a6(AbstractC2854b6.a(string, O4.f25397e), jCurrentTimeMillis);
            O4.f25395c.add(c2828a6);
            Object objClone = O4.f25395c.clone();
            kotlin.jvm.internal.s.f(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            O4.f25396d = (LinkedList) objClone;
            em.j.b(null, new M4(c2828a6, expiryTime, null), 1, null);
            fl.g0 g0Var = fl.g0.f38750a;
        }
    }
}
