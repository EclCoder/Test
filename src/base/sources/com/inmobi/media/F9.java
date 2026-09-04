package com.inmobi.media;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class F9 extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f24761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SdkInitializationListener f24763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f24764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F9(Context context, String str, SdkInitializationListener sdkInitializationListener, long j10, kl.f fVar) {
        super(1, fVar);
        this.f24761b = context;
        this.f24762c = str;
        this.f24763d = sdkInitializationListener;
        this.f24764e = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new F9(this.f24761b, this.f24762c, this.f24763d, this.f24764e, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((F9) create((kl.f) obj)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f24760a;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                C3231pl.a(this.f24761b);
                Context context = Xi.f26021a;
                if (context != null) {
                    File file = new File(context.getFilesDir(), "im_cached_content");
                    if (file.mkdir() || !file.isDirectory()) {
                        kotlin.jvm.internal.s.g("Xi", "TAG");
                    } else {
                        kotlin.jvm.internal.s.g("Xi", "TAG");
                    }
                }
                em.j.b(null, new C3205ol(null), 1, null);
                String primaryAccountId = this.f24762c;
                kotlin.jvm.internal.s.h(primaryAccountId, "primaryAccountId");
                Context context2 = Xi.f26021a;
                if (context2 != null) {
                    ConcurrentHashMap concurrentHashMap = La.f25197b;
                    Ka.a(context2, "coppa_store").a("im_accid", primaryAccountId, false);
                }
                Context context3 = this.f24761b;
                this.f24760a = 1;
                if (em.j.b(null, new C3179nl(context3, null), 1, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            Xi.f26029i = 2;
            InMobiSdk inMobiSdk = InMobiSdk.INSTANCE;
            InMobiSdk.access$provideCallback(inMobiSdk, this.f24763d, null);
            Xg.f26013a.getClass();
            em.k.d(H9.f24932e, null, null, new Tg(null), 3, null);
            Map mapAccess$prepareTelemetryPayload = InMobiSdk.access$prepareTelemetryPayload(inMobiSdk, this.f24764e);
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("SdkInitialized", mapAccess$prepareTelemetryPayload, EnumC3281rk.SDK);
            InMobiUnifiedIdService.push(C2932e7.f26473b);
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g(InMobiSdk.access$getTAG$p(), "access$getTAG$p(...)");
            e10.getMessage();
            Xi.f26023c = null;
            Xi.f26021a = null;
            Xi.f26029i = 3;
            InMobiSdk.access$provideCallback(InMobiSdk.INSTANCE, this.f24763d, "SDK could not be initialized; an unexpected error was encountered.");
        }
        return fl.g0.f38750a;
    }
}
