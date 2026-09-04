package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.e0;
import com.vungle.ads.g0;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.z;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.bidding.a, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.bidding.a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.bidding.a.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.d, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.executor.d invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.d.class);
        }
    }

    /* JADX INFO: renamed from: getAvailableBidTokensAsync$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.bidding.a m138getAvailableBidTokensAsync$lambda0(fl.k kVar) {
        return (com.vungle.ads.internal.bidding.a) kVar.getValue();
    }

    /* JADX INFO: renamed from: getAvailableBidTokensAsync$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.d m139getAvailableBidTokensAsync$lambda1(fl.k kVar) {
        return (com.vungle.ads.internal.executor.d) kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAvailableBidTokensAsync$lambda-2, reason: not valid java name */
    public static final void m140getAvailableBidTokensAsync$lambda2(com.vungle.ads.l callback, fl.k bidTokenEncoder$delegate) throws Throwable {
        s.h(callback, "$callback");
        s.h(bidTokenEncoder$delegate, "$bidTokenEncoder$delegate");
        e0 e0Var = new e0(Sdk$SDKMetric.b.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
        e0Var.markStart();
        com.vungle.ads.internal.bidding.a.b bVarEncode = m138getAvailableBidTokensAsync$lambda0(bidTokenEncoder$delegate).encode();
        e0Var.markEnd();
        if (bVarEncode.getBidToken().length() > 0) {
            callback.onBidTokenCollected(bVarEncode.getBidToken());
        } else {
            e0Var.setMetricType(Sdk$SDKMetric.b.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
            e0Var.setMeta(bVarEncode.getErrorMessage());
            callback.onBidTokenError(bVarEncode.getErrorMessage());
        }
        com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, e0Var, (com.vungle.ads.internal.util.p) null, (String) null, 6, (Object) null);
    }

    public final void getAvailableBidTokensAsync(Context context, final com.vungle.ads.l callback) throws Throwable {
        s.h(context, "context");
        s.h(callback, "callback");
        if (z.INSTANCE.isOSVersionInvalid()) {
            new SdkVersionTooLow("RTB: SDK is supported only for API versions 25 and above.").logErrorNoReturnValue$vungle_ads_release();
            callback.onBidTokenError("RTB: SDK is supported only for API versions 25 and above.");
            return;
        }
        if (!g0.Companion.isInitialized()) {
            yj.c cVar = yj.c.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            s.g(applicationContext, "context.applicationContext");
            cVar.init(applicationContext);
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        fl.o oVar = fl.o.SYNCHRONIZED;
        final fl.k kVarA = fl.l.a(oVar, new a(context));
        m139getAvailableBidTokensAsync$lambda1(fl.l.a(oVar, new b(context))).getApiExecutor().execute(new Runnable() { // from class: com.vungle.ads.internal.q
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                r.m140getAvailableBidTokensAsync$lambda2(callback, kVarA);
            }
        });
    }

    public final String getSdkVersion() {
        return "7.7.2";
    }
}
