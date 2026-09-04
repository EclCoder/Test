package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.RuleController;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.ml, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3153ml extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f27009b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3153ml(Context context, kl.f fVar) {
        super(1, fVar);
        this.f27009b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3153ml(this.f27009b, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3153ml(this.f27009b, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String string;
        ?? L;
        Object objF = ll.b.f();
        int i10 = this.f27008a;
        if (i10 == 0) {
            fl.s.b(obj);
            fl.k kVar = AbstractC3193o9.f27128a;
            Context context = Xi.f26021a;
            if (context != null) {
                String[] strArrDatabaseList = context.databaseList();
                if (strArrDatabaseList != null) {
                    L = new ArrayList();
                    for (String str : strArrDatabaseList) {
                        kotlin.jvm.internal.s.e(str);
                        if (new bm.o("com\\.im_([0-9]+\\.){2}[0-9]+([-.\\w]*).db(-wal)?(-shm)?").h(str) && !kotlin.jvm.internal.s.c(str, "com.im_11.2.0.db")) {
                            L.add(str);
                        }
                    }
                } else {
                    L = gl.r.l();
                }
                for (String str2 : L) {
                    File databasePath = context.getDatabasePath(str2);
                    if (databasePath != null && databasePath.exists()) {
                        context.deleteDatabase(str2);
                    }
                }
            }
            O4 o10 = O4.f25393a;
            kotlin.jvm.internal.s.g("O4", "TAG");
            em.j.b(null, new J4(null), 1, null);
            if (E0.f24684b == null) {
                E0.f24684b = new A0();
            }
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            AbstractC2878c4.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, E0.f24686d);
            A0 a10 = E0.f24684b;
            if (a10 == null) {
                kotlin.jvm.internal.s.w("executor");
                a10 = null;
            }
            if (!a10.f24425a.get()) {
                A0 a11 = E0.f24684b;
                if (a11 == null) {
                    kotlin.jvm.internal.s.w("executor");
                    a11 = null;
                }
                if (!a11.f24425a.get()) {
                    kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
                    if (((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                        a11.a();
                    }
                }
            }
            M9.b();
            M9.a();
            P5 p10 = N5.f25313a;
            kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class);
            N0 adReqDeprecateChecker = adConfig.getAdReqDeprecateChecker();
            boolean zA = adReqDeprecateChecker != null ? adReqDeprecateChecker.a(true) : true;
            N5.f25317e = zA;
            if (!zA && N5.f25315c == null) {
                Context context2 = Xi.f26021a;
                if (context2 == null) {
                    string = null;
                } else {
                    ConcurrentHashMap concurrentHashMap = La.f25197b;
                    La laA = Ka.a(context2, "display_info_store");
                    kotlin.jvm.internal.s.h("gesture_margin", "key");
                    string = laA.f25198a.getString("gesture_margin", null);
                }
                N5.f25315c = string;
            }
            if (adConfig.getRendering().getEnableImmersive()) {
                N5.j();
                N5.i();
            }
            AbstractC2942eh.b();
            C3231pl c3231pl = C3231pl.f27278a;
            this.f27008a = 1;
            if (c3231pl.b(this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        Context context3 = this.f27009b;
        kotlin.jvm.internal.s.h(context3, "context");
        try {
            kotlin.jvm.internal.l0.b(a5.a.class).k();
            kotlin.jvm.internal.l0.b(ActivityRule.class).k();
            kotlin.jvm.internal.l0.b(RuleController.class).k();
            RuleController.Companion.getInstance(context3).addRule(new ActivityRule.Builder(gl.s0.c(new a5.a(new ComponentName(context3, (Class<?>) InMobiAdActivity.class), null))).setAlwaysExpand(true).build());
        } catch (NoClassDefFoundError unused) {
        }
        Context context4 = this.f27009b;
        kotlin.jvm.internal.s.h(context4, "context");
        ConcurrentHashMap concurrentHashMap2 = La.f25197b;
        Ka.a(context4, "sdk_version_store").a("sdk_version", "11.2.0", false);
        C3231pl.f27279b = true;
        return fl.g0.f38750a;
    }
}
