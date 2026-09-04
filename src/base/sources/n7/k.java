package n7;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.o0;
import com.facebook.appevents.p0;
import com.facebook.appevents.q0;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.v;
import com.facebook.internal.w;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import fl.q;
import gl.r;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import l7.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f46895a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f46896b = k.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o0 f46897c = new o0(h0.m());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BigDecimal f46898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Currency f46899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bundle f46900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p0 f46901d;

        public a(BigDecimal purchaseAmount, Currency currency, Bundle param, p0 operationalData) {
            s.h(purchaseAmount, "purchaseAmount");
            s.h(currency, "currency");
            s.h(param, "param");
            s.h(operationalData, "operationalData");
            this.f46898a = purchaseAmount;
            this.f46899b = currency;
            this.f46900c = param;
            this.f46901d = operationalData;
        }

        public final Currency a() {
            return this.f46899b;
        }

        public final p0 b() {
            return this.f46901d;
        }

        public final Bundle c() {
            return this.f46900c;
        }

        public final BigDecimal d() {
            return this.f46898a;
        }
    }

    private k() {
    }

    public static final synchronized Bundle a(List purchaseLoggingParametersList) {
        a aVar;
        s.h(purchaseLoggingParametersList, "purchaseLoggingParametersList");
        aVar = (a) purchaseLoggingParametersList.get(0);
        return l7.s.f(r.e(new l7.a("fb_mobile_purchase", aVar.d().doubleValue(), aVar.a())), System.currentTimeMillis(), true, r.e(new q(aVar.c(), aVar.b())));
    }

    private final List c(String str, String str2, u.a aVar) {
        return b(str, str2, new HashMap(), aVar);
    }

    private final a d(String str, Bundle bundle, p0 p0Var, JSONObject jSONObject, JSONObject jSONObject2) {
        Bundle bundle2;
        p0 p0Var2;
        if (s.c(str, u.b.SUBS.g())) {
            p0.a aVar = p0.f14972b;
            q0 q0Var = q0.IAPParameters;
            String string = Boolean.toString(jSONObject.optBoolean("autoRenewing", false));
            s.g(string, "toString(\n              …      )\n                )");
            bundle2 = bundle;
            p0Var2 = p0Var;
            aVar.a(q0Var, "fb_iap_subs_auto_renewing", string, bundle2, p0Var2);
            String strOptString = jSONObject2.optString("subscriptionPeriod");
            s.g(strOptString, "skuDetailsJSON.optString…_IAP_SUBSCRIPTION_PERIOD)");
            aVar.a(q0Var, "fb_iap_subs_period", strOptString, bundle2, p0Var2);
            String strOptString2 = jSONObject2.optString("freeTrialPeriod");
            s.g(strOptString2, "skuDetailsJSON.optString…GP_IAP_FREE_TRIAL_PERIOD)");
            aVar.a(q0Var, "fb_free_trial_period", strOptString2, bundle2, p0Var2);
            String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
            s.g(introductoryPriceCycles, "introductoryPriceCycles");
            if (introductoryPriceCycles.length() > 0) {
                aVar.a(q0Var, "fb_intro_price_cycles", introductoryPriceCycles, bundle2, p0Var2);
            }
            String introductoryPricePeriod = jSONObject2.optString("introductoryPricePeriod");
            s.g(introductoryPricePeriod, "introductoryPricePeriod");
            if (introductoryPricePeriod.length() > 0) {
                aVar.a(q0Var, "fb_intro_period", introductoryPricePeriod, bundle2, p0Var2);
            }
            String introductoryPriceAmountMicros = jSONObject2.optString("introductoryPriceAmountMicros");
            s.g(introductoryPriceAmountMicros, "introductoryPriceAmountMicros");
            if (introductoryPriceAmountMicros.length() > 0) {
                aVar.a(q0Var, "fb_intro_price_amount_micros", introductoryPriceAmountMicros, bundle2, p0Var2);
            }
        } else {
            bundle2 = bundle;
            p0Var2 = p0Var;
        }
        BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
        Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
        s.g(currency, "getInstance(skuDetailsJS…RICE_CURRENCY_CODE_V2V4))");
        return new a(bigDecimal, currency, bundle2, p0Var2);
    }

    private final List e(String str, Bundle bundle, p0 p0Var, JSONObject jSONObject) throws JSONException {
        if (!s.c(str, u.b.SUBS.g())) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("oneTimePurchaseOfferDetails");
            if (jSONObject2 == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("priceCurrencyCode"));
            s.g(currency, "getInstance(oneTimePurch…RICE_CURRENCY_CODE_V5V7))");
            return r.q(new a(bigDecimal, currency, bundle, p0Var));
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("subscriptionOfferDetails");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject3 = jSONObject.getJSONArray("subscriptionOfferDetails").getJSONObject(i10);
            if (jSONObject3 == null) {
                return null;
            }
            Bundle bundle2 = new Bundle(bundle);
            p0 p0VarC = p0Var.c();
            String basePlanId = jSONObject3.getString("basePlanId");
            p0.a aVar = p0.f14972b;
            q0 q0Var = q0.IAPParameters;
            s.g(basePlanId, "basePlanId");
            aVar.a(q0Var, "fb_iap_base_plan", basePlanId, bundle2, p0VarC);
            JSONArray jSONArray2 = jSONObject3.getJSONArray("pricingPhases");
            JSONObject jSONObject4 = jSONArray2.getJSONObject(jSONArray2.length() - 1);
            if (jSONObject4 == null) {
                return null;
            }
            String strOptString = jSONObject4.optString("billingPeriod");
            s.g(strOptString, "subscriptionJSON.optStri…IOD\n                    )");
            aVar.a(q0Var, "fb_iap_subs_period", strOptString, bundle2, p0VarC);
            if (!jSONObject4.has("recurrenceMode") || jSONObject4.getInt("recurrenceMode") == 3) {
                aVar.a(q0Var, "fb_iap_subs_auto_renewing", "false", bundle2, p0VarC);
            } else {
                aVar.a(q0Var, "fb_iap_subs_auto_renewing", "true", bundle2, p0VarC);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject4.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject4.getString("priceCurrencyCode"));
            s.g(currency2, "getInstance(subscription…RICE_CURRENCY_CODE_V5V7))");
            arrayList.add(new a(bigDecimal2, currency2, bundle2, p0VarC));
        }
        return arrayList;
    }

    public static final synchronized Bundle f(List purchaseLoggingParametersList, String eventName) {
        ArrayList arrayList;
        long jCurrentTimeMillis;
        ArrayList arrayList2;
        try {
            s.h(purchaseLoggingParametersList, "purchaseLoggingParametersList");
            s.h(eventName, "eventName");
            arrayList = new ArrayList();
            Iterator it = purchaseLoggingParametersList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                arrayList.add(new l7.a(eventName, aVar.d().doubleValue(), aVar.a()));
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            List<a> list = purchaseLoggingParametersList;
            arrayList2 = new ArrayList(r.v(list, 10));
            for (a aVar2 : list) {
                arrayList2.add(new q(aVar2.c(), aVar2.b()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return l7.s.f(arrayList, jCurrentTimeMillis, true, arrayList2);
    }

    public static final boolean g() {
        w wVarF = a0.f(h0.n());
        return wVarF != null && h0.q() && wVarF.j();
    }

    public static final void h() {
        Context contextM = h0.m();
        String strN = h0.n();
        if (h0.q()) {
            if (contextM instanceof Application) {
                com.facebook.appevents.o.f14964b.a((Application) contextM, strN);
            } else {
                Log.w(f46896b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static final void i(String str, long j10) {
        Context contextM = h0.m();
        w wVarV = a0.v(h0.n(), false);
        if (wVarV == null || !wVarV.a() || j10 <= 0) {
            return;
        }
        o0 o0Var = new o0(contextM);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        o0Var.c("fb_aa_time_spent_on_view", j10, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    public static final void j(String purchase, String skuDetails, boolean z10, u.a aVar, boolean z11) {
        List listC;
        String str;
        String str2;
        Bundle bundleA;
        s.h(purchase, "purchase");
        s.h(skuDetails, "skuDetails");
        if (!g() || (listC = f46895a.c(purchase, skuDetails, aVar)) == null || listC.isEmpty()) {
            return;
        }
        if (!z10 || !v.d("app_events_if_auto_log_subs", h0.n(), false)) {
            if (z11) {
                str2 = "fb_mobile_purchase_restored";
            } else {
                str = "fb_mobile_purchase";
            }
            if (!z10 && com.facebook.internal.s.g(com.facebook.internal.s.b.AndroidManualImplicitSubsDedupe)) {
                bundleA = f(listC, str);
            } else if (z10 && com.facebook.internal.s.g(com.facebook.internal.s.b.AndroidManualImplicitPurchaseDedupe)) {
                bundleA = a(listC);
            } else {
                bundleA = null;
            }
            l7.p.f44021a.a(bundleA, ((a) listC.get(0)).c(), ((a) listC.get(0)).b());
            if (s.c(str, "fb_mobile_purchase")) {
                f46897c.j(((a) listC.get(0)).d(), ((a) listC.get(0)).a(), ((a) listC.get(0)).c(), ((a) listC.get(0)).b());
            } else {
                f46897c.i(str, ((a) listC.get(0)).d(), ((a) listC.get(0)).a(), ((a) listC.get(0)).c(), ((a) listC.get(0)).b());
            }
        }
        if (z11) {
            str2 = "SubscriptionRestore";
        } else {
            str2 = l7.q.f44026a.m(skuDetails) ? "StartTrial" : "Subscribe";
        }
        str = str2;
        if (!z10) {
            if (z10) {
                bundleA = null;
            } else {
                bundleA = null;
            }
        } else if (z10) {
            bundleA = null;
        } else {
            bundleA = null;
        }
        l7.p.f44021a.a(bundleA, ((a) listC.get(0)).c(), ((a) listC.get(0)).b());
        if (s.c(str, "fb_mobile_purchase")) {
            f46897c.i(str, ((a) listC.get(0)).d(), ((a) listC.get(0)).a(), ((a) listC.get(0)).c(), ((a) listC.get(0)).b());
        } else {
            f46897c.j(((a) listC.get(0)).d(), ((a) listC.get(0)).a(), ((a) listC.get(0)).c(), ((a) listC.get(0)).b());
        }
    }

    public static /* synthetic */ void k(String str, String str2, boolean z10, u.a aVar, boolean z11, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        j(str, str2, z10, aVar, z11);
    }

    private final List b(String str, String str2, Map map, u.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            p0 p0Var = new p0();
            if (aVar != null) {
                p0.f14972b.a(q0.IAPParameters, "fb_iap_sdk_supported_library_versions", aVar.g(), bundle, p0Var);
            }
            p0.a aVar2 = p0.f14972b;
            q0 q0Var = q0.IAPParameters;
            String string = jSONObject.getString("productId");
            s.g(string, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            aVar2.a(q0Var, "fb_iap_product_id", string, bundle, p0Var);
            String string2 = jSONObject.getString("productId");
            s.g(string2, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            aVar2.a(q0Var, "fb_content_id", string2, bundle, p0Var);
            aVar2.a(q0Var, "android_dynamic_ads_content_id", "client_implicit", bundle, p0Var);
            String string3 = jSONObject.getString("purchaseTime");
            s.g(string3, "purchaseJSON.getString(C…nts.GP_IAP_PURCHASE_TIME)");
            aVar2.a(q0Var, "fb_iap_purchase_time", string3, bundle, p0Var);
            String string4 = jSONObject.getString("purchaseToken");
            s.g(string4, "purchaseJSON.getString(C…ts.GP_IAP_PURCHASE_TOKEN)");
            aVar2.a(q0Var, "fb_iap_purchase_token", string4, bundle, p0Var);
            String strOptString = jSONObject.optString("packageName");
            s.g(strOptString, "purchaseJSON.optString(C…ants.GP_IAP_PACKAGE_NAME)");
            aVar2.a(q0Var, "fb_iap_package_name", strOptString, bundle, p0Var);
            String strOptString2 = jSONObject2.optString(CampaignEx.JSON_KEY_TITLE);
            s.g(strOptString2, qnwOeeQSSWa.EOhugSS);
            aVar2.a(q0Var, "fb_iap_product_title", strOptString2, bundle, p0Var);
            String strOptString3 = jSONObject2.optString("description");
            s.g(strOptString3, "skuDetailsJSON.optString…tants.GP_IAP_DESCRIPTION)");
            aVar2.a(q0Var, "fb_iap_product_description", strOptString3, bundle, p0Var);
            String type = jSONObject2.optString("type");
            s.g(type, "type");
            aVar2.a(q0Var, "fb_iap_product_type", type, bundle, p0Var);
            String strE = l7.s.e();
            if (strE != null) {
                aVar2.a(q0Var, "fb_iap_client_library_version", strE, bundle, p0Var);
            }
            for (Map.Entry entry : map.entrySet()) {
                p0.f14972b.a(q0.IAPParameters, (String) entry.getKey(), (String) entry.getValue(), bundle, p0Var);
            }
            if (jSONObject2.has("price_amount_micros")) {
                return r.q(d(type, bundle, p0Var, jSONObject, jSONObject2));
            }
            if (!jSONObject2.has("subscriptionOfferDetails") && !jSONObject2.has("oneTimePurchaseOfferDetails")) {
                return null;
            }
            try {
                return e(type, bundle, p0Var, jSONObject2);
            } catch (JSONException e10) {
                e = e10;
                Log.e(f46896b, "Error parsing in-app purchase/subscription data.", e);
                return null;
            } catch (Exception e11) {
                e = e11;
                Log.e(f46896b, "Failed to get purchase logging parameters,", e);
                return null;
            }
        } catch (JSONException e12) {
            e = e12;
        } catch (Exception e13) {
            e = e13;
        }
    }
}
