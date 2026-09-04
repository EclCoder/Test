package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.C3201oh;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.oh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3201oh implements l5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3304sh f27143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f27144b;

    public C3201oh(Function1 function1, C3304sh c3304sh) {
        this.f27143a = c3304sh;
        this.f27144b = function1;
    }

    public static final void a(Function1 function1, AbstractC3175nh abstractC3175nh) {
        function1.invoke(abstractC3175nh);
    }

    @Override // l5.c
    public final void onBillingServiceDisconnected() {
        this.f27143a.getClass();
        final Function1 function1 = this.f27144b;
        final C3304sh c3304sh = this.f27143a;
        Runnable runnable = new Runnable() { // from class: yh.da
            @Override // java.lang.Runnable
            public final void run() {
                C3201oh.a(function1, c3304sh);
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    @Override // l5.c
    public final void onBillingSetupFinished(com.android.billingclient.api.c billingResult) {
        final AbstractC3175nh c3123lh;
        kotlin.jvm.internal.s.h(billingResult, "billingResult");
        this.f27143a.getClass();
        Objects.toString(billingResult);
        if (billingResult.c() == 0) {
            c3123lh = C3149mh.f27001a;
        } else {
            int iC = billingResult.c();
            String strA = billingResult.a();
            kotlin.jvm.internal.s.g(strA, "getDebugMessage(...)");
            c3123lh = new C3123lh(strA, iC);
        }
        final Function1 function1 = this.f27144b;
        Runnable runnable = new Runnable() { // from class: yh.ca
            @Override // java.lang.Runnable
            public final void run() {
                C3201oh.a(function1, c3123lh);
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public static final void a(Function1 function1, C3304sh c3304sh) {
        c3304sh.getClass();
        function1.invoke(new C3123lh("Billing Service Disconnected", -1));
    }
}
