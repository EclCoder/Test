package com.vungle.ads.internal.bidding;

import android.content.Context;
import com.vungle.ads.GzipEncodeError;
import com.vungle.ads.JsonEncodeError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.d0;
import com.vungle.ads.g;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.RtbRequest;
import com.vungle.ads.internal.model.RtbToken;
import com.vungle.ads.internal.network.k;
import com.vungle.ads.internal.network.m;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import fl.g0;
import fl.l;
import fl.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static final c Companion = new c(null);
    private static final String TAG = "BidTokenEncoder";
    public static final int TOKEN_VERSION = 6;
    private d0 bidTokenRequestedMetric;
    private final Context context;
    private long enterBackgroundTime;
    private final kotlinx.serialization.json.b json;
    private int ordinalView;

    /* JADX INFO: renamed from: com.vungle.ads.internal.bidding.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0498a extends com.vungle.ads.internal.util.a.b {
        C0498a() {
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onBackground() {
            a.this.onPause$vungle_ads_release();
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onForeground() {
            a.this.onResume$vungle_ads_release();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        private final String bidToken;
        private final String errorMessage;

        public b(String bidToken, String errorMessage) {
            s.h(bidToken, "bidToken");
            s.h(errorMessage, "errorMessage");
            this.bidToken = bidToken;
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ b copy$default(b bVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.bidToken;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.errorMessage;
            }
            return bVar.copy(str, str2);
        }

        public final String component1() {
            return this.bidToken;
        }

        public final String component2() {
            return this.errorMessage;
        }

        public final b copy(String bidToken, String errorMessage) {
            s.h(bidToken, "bidToken");
            s.h(errorMessage, "errorMessage");
            return new b(bidToken, errorMessage);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.c(this.bidToken, bVar.bidToken) && s.c(this.errorMessage, bVar.errorMessage);
        }

        public final String getBidToken() {
            return this.bidToken;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return (this.bidToken.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public String toString() {
            return "BiddingTokenInfo(bidToken=" + this.bidToken + ", errorMessage=" + this.errorMessage + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.k, java.lang.Object] */
        @Override // tl.a
        public final k invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(k.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends t implements Function1 {
        public static final e INSTANCE = new e();

        e() {
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
        }
    }

    public a(Context context) {
        s.h(context, "context");
        this.context = context;
        this.bidTokenRequestedMetric = new d0(Sdk$SDKMetric.b.BID_TOKEN_REQUESTED);
        this.json = v.b(null, e.INSTANCE, 1, null);
        com.vungle.ads.internal.util.a.Companion.addLifecycleListener(new C0498a());
    }

    /* JADX INFO: renamed from: constructV6Token$lambda-0, reason: not valid java name */
    private static final k m80constructV6Token$lambda0(fl.k kVar) {
        return (k) kVar.getValue();
    }

    private final b generateBidToken() throws Throwable {
        g.logMetric$vungle_ads_release$default(g.INSTANCE, this.bidTokenRequestedMetric, (p) null, (String) null, 6, (Object) null);
        try {
            String strConstructV6Token$vungle_ads_release = constructV6Token$vungle_ads_release();
            q.a aVar = q.Companion;
            aVar.d(TAG, "BidToken: " + strConstructV6Token$vungle_ads_release);
            try {
                String str = "6:" + n.INSTANCE.convertForSending(strConstructV6Token$vungle_ads_release);
                aVar.d(TAG, "After conversion: " + str);
                return new b(str, "");
            } catch (Throwable th2) {
                String str2 = "Fail to gzip token data. " + th2.getLocalizedMessage();
                new GzipEncodeError(str2).logErrorNoReturnValue$vungle_ads_release();
                return new b("", str2);
            }
        } catch (Throwable th3) {
            String str3 = "Failed to encode TokenParameters. " + th3.getLocalizedMessage();
            new JsonEncodeError(str3).logErrorNoReturnValue$vungle_ads_release();
            return new b("", str3);
        }
    }

    public final String constructV6Token$vungle_ads_release() {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        k kVarM80constructV6Token$lambda0 = m80constructV6Token$lambda0(l.a(o.SYNCHRONIZED, new d(this.context)));
        com.vungle.ads.internal.e eVar = com.vungle.ads.internal.e.INSTANCE;
        CommonRequestBody commonRequestBodyRequestBody = kVarM80constructV6Token$lambda0.requestBody(!eVar.signalsDisabled(), eVar.fpdEnabled());
        RtbToken mVar = new RtbToken(commonRequestBodyRequestBody.getDevice(), commonRequestBodyRequestBody.getUser(), commonRequestBodyRequestBody.getExt(), new RtbRequest(m.INSTANCE.getHeaderUa()), this.ordinalView);
        kotlinx.serialization.json.b bVar = this.json;
        pm.d dVarB = pm.t.b(bVar.a(), l0.k(RtbToken.class));
        s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return bVar.c(dVarB, mVar);
    }

    public final b encode() {
        this.ordinalView++;
        return generateBidToken();
    }

    public final long getEnterBackgroundTime$vungle_ads_release() {
        return this.enterBackgroundTime;
    }

    public final int getOrdinalView$vungle_ads_release() {
        return this.ordinalView;
    }

    public final void onPause$vungle_ads_release() {
        q.Companion.d(TAG, "BidTokenEncoder#onBackground()");
        this.enterBackgroundTime = System.currentTimeMillis();
    }

    public final void onResume$vungle_ads_release() {
        q.Companion.d(TAG, "BidTokenEncoder#onForeground()");
        if (System.currentTimeMillis() > this.enterBackgroundTime + com.vungle.ads.internal.e.INSTANCE.getSessionTimeout()) {
            this.ordinalView = 0;
            this.enterBackgroundTime = 0L;
        }
    }

    public final void setEnterBackgroundTime$vungle_ads_release(long j10) {
        this.enterBackgroundTime = j10;
    }

    public final void setOrdinalView$vungle_ads_release(int i10) {
        this.ordinalView = i10;
    }

    public static /* synthetic */ void getEnterBackgroundTime$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    public static /* synthetic */ void getOrdinalView$vungle_ads_release$annotations() {
    }
}
