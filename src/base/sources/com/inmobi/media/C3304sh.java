package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.inmobi.media.AbstractC3175nh;
import com.inmobi.media.C2968fh;
import com.inmobi.media.C3304sh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.sh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3304sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1 f27468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BillingClient f27469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f27470c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2968fh f27471d = new C2968fh();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27472e = 2;

    public static final void a(com.android.billingclient.api.c cVar, List list) {
        kotlin.jvm.internal.s.h(cVar, "<unused var>");
    }

    public static final void b(com.android.billingclient.api.c cVar, List list) {
        kotlin.jvm.internal.s.h(cVar, "<unused var>");
    }

    public static BillingClient b(Context context) {
        try {
            return BillingClient.e(context).b(com.android.billingclient.api.f.c().b().a()).c(new l5.l() { // from class: yh.vb
                @Override // l5.l
                public final void b(com.android.billingclient.api.c cVar, List list) {
                    C3304sh.b(cVar, list);
                }
            }).a();
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
            e10.getMessage();
            return null;
        } catch (NoClassDefFoundError e11) {
            fl.k kVar2 = W9.f25935a;
            W9.a(new M2(e11));
            e11.getMessage();
            return null;
        }
    }

    public final void a(Context context, Function1 onComplete) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(onComplete, "onComplete");
        try {
            this.f27468a = onComplete;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.s.g(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            if (string == null) {
                a(new C3020hh((short) 2236), (C2968fh) null);
                return;
            }
            BillingClient billingClient = (BillingClient) a(string).invoke(context);
            if (billingClient == null) {
                a(new C3020hh((short) 2233), (C2968fh) null);
                return;
            }
            this.f27469b = billingClient;
            Function1 onComplete2 = new Function1() { // from class: yh.cc
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3304sh.a(this.f57647a, (AbstractC3175nh) obj);
                }
            };
            kotlin.jvm.internal.s.h(onComplete2, "onComplete");
            BillingClient billingClient2 = this.f27469b;
            if (billingClient2 != null) {
                billingClient2.i(new C3201oh(onComplete2, this));
            }
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
            e10.getMessage();
            a(new C3020hh((short) 2237), (C2968fh) null);
        }
    }

    public static final void b(final C3304sh c3304sh, final Function1 function1, com.android.billingclient.api.c cVar, List purchasesResult) {
        kotlin.jvm.internal.s.h(cVar, "<unused var>");
        kotlin.jvm.internal.s.h(purchasesResult, "purchasesResult");
        C2968fh c2968fh = c3304sh.f27471d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            l5.j jVar = (l5.j) obj;
            if (jVar.c() == 1 && jVar.f()) {
                arrayList.add(obj);
            }
        }
        c2968fh.f26560a = arrayList.size();
        Runnable runnable = new Runnable() { // from class: yh.bc
            @Override // java.lang.Runnable
            public final void run() {
                C3304sh.b(function1, c3304sh);
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public static final fl.g0 a(final C3304sh c3304sh, AbstractC3175nh result) {
        kotlin.jvm.internal.s.h(result, "result");
        if (result instanceof C3123lh) {
            c3304sh.a(new C2994gh(String.valueOf(((C3123lh) result).f26950a)), (C2968fh) null);
            return fl.g0.f38750a;
        }
        c3304sh.a(new Function1() { // from class: yh.wb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3304sh.a(this.f57993a, (C2968fh) obj);
            }
        });
        return fl.g0.f38750a;
    }

    public static final void b(Function1 function1, C3304sh c3304sh) {
        function1.invoke(c3304sh.f27471d);
    }

    public static final fl.g0 a(C3304sh c3304sh, C2968fh data) {
        kotlin.jvm.internal.s.h(data, "data");
        if (c3304sh.f27470c.incrementAndGet() != c3304sh.f27472e) {
            return fl.g0.f38750a;
        }
        int i10 = data.f26560a;
        if (i10 == 0 && data.f26561b == 0) {
            c3304sh.a(new C3020hh((short) 2234), (C2968fh) null);
            return fl.g0.f38750a;
        }
        bm.r.l("No of In-App Purchases: " + i10 + "\n                                    | and No of Subscriptions: " + data.f26561b + "\n                                ", null, 1, null);
        c3304sh.a(C3045ih.f26752a, data);
        return fl.g0.f38750a;
    }

    public final Function1 a(String str) {
        if (bm.r.N(str, "6", false, 2, null)) {
            return new C3227ph(this);
        }
        if (bm.r.N(str, "7", false, 2, null)) {
            return new C3253qh(this);
        }
        return new C3278rh(this);
    }

    public final void a(AbstractC3071jh abstractC3071jh, C2968fh c2968fh) {
        AbstractC3097kh.a(abstractC3071jh);
        Function1 function1 = this.f27468a;
        if (function1 != null) {
            function1.invoke(c2968fh);
        }
    }

    public static BillingClient a(Context context) {
        try {
            return BillingClient.e(context).enablePendingPurchases().c(new l5.l() { // from class: yh.ac
                @Override // l5.l
                public final void b(com.android.billingclient.api.c cVar, List list) {
                    C3304sh.a(cVar, list);
                }
            }).a();
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
            e10.getMessage();
            return null;
        } catch (NoClassDefFoundError e11) {
            fl.k kVar2 = W9.f25935a;
            W9.a(new M2(e11));
            e11.getMessage();
            return null;
        }
    }

    public final void a(final Function1 onComplete) {
        kotlin.jvm.internal.s.h(onComplete, "onComplete");
        l5.m.a aVarB = l5.m.b();
        kotlin.jvm.internal.s.g(aVarB, "newBuilder(...)");
        aVarB.b("inapp");
        l5.m.a aVarB2 = l5.m.b();
        kotlin.jvm.internal.s.g(aVarB2, "newBuilder(...)");
        aVarB2.b(SubSampleInformationBox.TYPE);
        BillingClient billingClient = this.f27469b;
        if (billingClient != null) {
            billingClient.g(aVarB.a(), new l5.k() { // from class: yh.yb
                @Override // l5.k
                public final void a(com.android.billingclient.api.c cVar, List list) {
                    C3304sh.b(this.f58028a, onComplete, cVar, list);
                }
            });
        }
        BillingClient billingClient2 = this.f27469b;
        if (billingClient2 != null) {
            billingClient2.g(aVarB2.a(), new l5.k() { // from class: yh.zb
                @Override // l5.k
                public final void a(com.android.billingclient.api.c cVar, List list) {
                    C3304sh.a(this.f58048a, onComplete, cVar, list);
                }
            });
        }
    }

    public static final void a(final C3304sh c3304sh, final Function1 function1, com.android.billingclient.api.c cVar, List purchasesResult) {
        kotlin.jvm.internal.s.h(cVar, "<unused var>");
        kotlin.jvm.internal.s.h(purchasesResult, "purchasesResult");
        C2968fh c2968fh = c3304sh.f27471d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            l5.j jVar = (l5.j) obj;
            if (jVar.c() == 1 && jVar.f()) {
                arrayList.add(obj);
            }
        }
        c2968fh.f26561b = arrayList.size();
        Runnable runnable = new Runnable() { // from class: yh.xb
            @Override // java.lang.Runnable
            public final void run() {
                C3304sh.a(function1, c3304sh);
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public static final void a(Function1 function1, C3304sh c3304sh) {
        function1.invoke(c3304sh.f27471d);
    }
}
