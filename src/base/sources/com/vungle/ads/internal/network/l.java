package com.vungle.ads.internal.network;

import com.mbridge.msdk.foundation.download.Command;
import com.vungle.ads.internal.model.CommonRequestBody;
import fl.g0;
import gl.r;
import gn.d0;
import gn.e0;
import gn.x;
import gn.y;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class l implements VungleApi {
    private static final String VUNGLE_VERSION = "7.1.0";
    private final com.vungle.ads.internal.network.converters.b emptyResponseConverter;
    private final gn.e.a okHttpClient;
    public static final b Companion = new b(null);
    private static final kotlinx.serialization.json.b json = v.b(null, a.INSTANCE, 1, null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends t implements Function1 {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((kotlinx.serialization.json.e) obj);
            return g0.f38750a;
        }

        public final void invoke(kotlinx.serialization.json.e Json) {
            s.h(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
            Json.c(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.GET.ordinal()] = 1;
            iArr[d.POST.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public l(gn.e.a okHttpClient) {
        s.h(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
        this.emptyResponseConverter = new com.vungle.ads.internal.network.converters.b();
    }

    private final d0.a defaultBuilder(String str, String str2, String str3, Map<String, String> map) {
        d0.a aVarA = new d0.a().v(str2).a(Command.HTTP_HEADER_USER_AGENT, str).a("Vungle-Version", VUNGLE_VERSION).a("Content-Type", "application/json");
        if (map != null) {
            aVarA.o(x.f39772b.a(map));
        }
        if (str3 != null) {
            aVarA.a("X-Vungle-Placement-Ref-Id", str3);
        }
        m mVar = m.INSTANCE;
        String appVersion = mVar.getAppVersion();
        if (appVersion != null) {
            aVarA.a("X-VUNGLE-APP-VERSION", appVersion);
        }
        String appId = mVar.getAppId();
        if (appId != null) {
            aVarA.a("X-Vungle-App-Id", appId);
        }
        return aVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ d0.a defaultBuilder$default(l lVar, String str, String str2, String str3, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            map = null;
        }
        return lVar.defaultBuilder(str, str2, str3, map);
    }

    private final d0.a defaultProtoBufBuilder(String str, y yVar) {
        d0.a aVarA = new d0.a().u(yVar).a(Command.HTTP_HEADER_USER_AGENT, str).a("Vungle-Version", VUNGLE_VERSION).a("Content-Type", "application/x-protobuf");
        m mVar = m.INSTANCE;
        String appId = mVar.getAppId();
        if (appId != null) {
            aVarA.a("X-Vungle-App-Id", appId);
        }
        String appVersion = mVar.getAppVersion();
        if (appVersion != null) {
            aVarA.a("X-VUNGLE-APP-VERSION", appVersion);
        }
        return aVarA;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a ads(String ua2, String path, CommonRequestBody body) {
        List<String> placements;
        s.h(ua2, "ua");
        s.h(path, "path");
        s.h(body, "body");
        try {
            kotlinx.serialization.json.b bVar = json;
            pm.d dVarB = pm.t.b(bVar.a(), l0.k(CommonRequestBody.class));
            s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String strC = bVar.c(dVarB, body);
            CommonRequestBody.RequestParam request = body.getRequest();
            try {
                return new e(this.okHttpClient.a(defaultBuilder$default(this, ua2, path, (request == null || (placements = request.getPlacements()) == null) ? null : (String) r.d0(placements), null, 8, null).q(e0.Companion.i(strC, null)).b()), new com.vungle.ads.internal.network.converters.c(l0.k(com.vungle.ads.internal.model.b.class)));
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a config(String ua2, String path, CommonRequestBody body) {
        s.h(ua2, "ua");
        s.h(path, "path");
        s.h(body, "body");
        try {
            kotlinx.serialization.json.b bVar = json;
            pm.d dVarB = pm.t.b(bVar.a(), l0.k(CommonRequestBody.class));
            s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            try {
                return new e(this.okHttpClient.a(defaultBuilder$default(this, ua2, path, null, null, 12, null).q(e0.Companion.i(bVar.c(dVarB, body), null)).b()), new com.vungle.ads.internal.network.converters.c(l0.k(com.vungle.ads.internal.model.g.class)));
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    public final gn.e.a getOkHttpClient$vungle_ads_release() {
        return this.okHttpClient;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a pingTPAT(String ua2, String url, d requestType, Map<String, String> map, e0 e0Var) {
        d0 d0VarB;
        s.h(ua2, "ua");
        s.h(url, "url");
        s.h(requestType, "requestType");
        d0.a aVarDefaultBuilder$default = defaultBuilder$default(this, ua2, url, null, map, 4, null);
        int i10 = c.$EnumSwitchMapping$0[requestType.ordinal()];
        if (i10 == 1) {
            d0VarB = aVarDefaultBuilder$default.f().b();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (e0Var == null) {
                e0Var = e0.a.r(e0.Companion, new byte[0], null, 0, 0, 6, null);
            }
            d0VarB = aVarDefaultBuilder$default.q(e0Var).b();
        }
        return new e(this.okHttpClient.a(d0VarB), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a ri(String ua2, String path, CommonRequestBody body) {
        s.h(ua2, "ua");
        s.h(path, "path");
        s.h(body, "body");
        try {
            kotlinx.serialization.json.b bVar = json;
            pm.d dVarB = pm.t.b(bVar.a(), l0.k(CommonRequestBody.class));
            s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            try {
                return new e(this.okHttpClient.a(defaultBuilder$default(this, ua2, path, null, null, 12, null).q(e0.Companion.i(bVar.c(dVarB, body), null)).b()), this.emptyResponseConverter);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a sendAdMarkup(String path, e0 requestBody) {
        s.h(path, "path");
        s.h(requestBody, "requestBody");
        return new e(this.okHttpClient.a(defaultBuilder$default(this, "debug", y.f39776j.c(path).i().a().toString(), null, null, 12, null).q(requestBody).b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a sendErrors(String ua2, String path, e0 requestBody) {
        s.h(ua2, "ua");
        s.h(path, "path");
        s.h(requestBody, "requestBody");
        return new e(this.okHttpClient.a(defaultProtoBufBuilder(ua2, y.f39776j.c(path).i().a()).q(requestBody).b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a sendMetrics(String ua2, String path, e0 requestBody) {
        s.h(ua2, "ua");
        s.h(path, "path");
        s.h(requestBody, "requestBody");
        return new e(this.okHttpClient.a(defaultProtoBufBuilder(ua2, y.f39776j.c(path).i().a()).q(requestBody).b()), this.emptyResponseConverter);
    }
}
