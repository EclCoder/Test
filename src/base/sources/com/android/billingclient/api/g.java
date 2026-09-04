package com.android.billingclient.api;

import android.text.TextUtils;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f10279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f10282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f10283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f10284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f10285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f10286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f10287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f10288k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10290b;

        a(JSONObject jSONObject) {
            this.f10289a = jSONObject.getInt("commitmentPaymentsCount");
            this.f10290b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f10292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f10294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f10295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f10296f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f10297g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Long f10298h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final a f10299i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final e f10300j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final C0144b f10301k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f10302l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final c f10303m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final d f10304n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final a1 f10305o;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Integer f10306a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final C0143a f10307b;

            /* JADX INFO: renamed from: com.android.billingclient.api.g$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            public static final class C0143a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f10308a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final long f10309b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final String f10310c;

                C0143a(JSONObject jSONObject) {
                    this.f10308a = jSONObject.optString("formattedDiscountAmount");
                    this.f10309b = jSONObject.optLong("discountAmountMicros");
                    this.f10310c = jSONObject.optString("discountAmountCurrencyCode");
                }
            }

            a(JSONObject jSONObject) {
                this.f10306a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.f10307b = jSONObjectOptJSONObject != null ? new C0143a(jSONObjectOptJSONObject) : null;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.g$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0144b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f10311a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f10312b;

            C0144b(JSONObject jSONObject) {
                this.f10311a = jSONObject.getInt("maximumQuantity");
                this.f10312b = jSONObject.getInt("remainingQuantity");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f10313a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f10314b;

            c(JSONObject jSONObject) {
                this.f10313a = jSONObject.getLong("preorderReleaseTimeMillis");
                this.f10314b = jSONObject.getLong("preorderPresaleEndTimeMillis");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f10315a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f10316b;

            d(JSONObject jSONObject) {
                this.f10315a = jSONObject.getString("rentalPeriod");
                String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.f10316b = true == strOptString.isEmpty() ? null : strOptString;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Long f10317a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Long f10318b;

            e(JSONObject jSONObject) {
                this.f10317a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.f10318b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }
        }

        b(JSONObject jSONObject) {
            this.f10291a = jSONObject.optString("formattedPrice");
            this.f10292b = jSONObject.optLong("priceAmountMicros");
            this.f10293c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f10294d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f10295e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f10296f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f10297g = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f10297g.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f10298h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f10299i = jSONObjectOptJSONObject == null ? null : new a(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f10300j = jSONObjectOptJSONObject2 == null ? null : new e(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f10301k = jSONObjectOptJSONObject3 == null ? null : new C0144b(jSONObjectOptJSONObject3);
            this.f10302l = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f10303m = jSONObjectOptJSONObject4 == null ? null : new c(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f10304n = jSONObjectOptJSONObject5 == null ? null : new d(jSONObjectOptJSONObject5);
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f10305o = jSONObjectOptJSONObject6 != null ? new a1(jSONObjectOptJSONObject6) : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new d(jSONArrayOptJSONArray2);
        }

        public String a() {
            return this.f10291a;
        }

        public String b() {
            return this.f10294d;
        }

        public long c() {
            return this.f10292b;
        }

        public String d() {
            return this.f10293c;
        }

        public final a1 e() {
            return this.f10305o;
        }

        final String f() {
            return this.f10302l;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f10320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f10322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f10323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f10324f;

        c(JSONObject jSONObject) {
            this.f10322d = jSONObject.optString("billingPeriod");
            this.f10321c = jSONObject.optString("priceCurrencyCode");
            this.f10319a = jSONObject.optString("formattedPrice");
            this.f10320b = jSONObject.optLong("priceAmountMicros");
            this.f10324f = jSONObject.optInt("recurrenceMode");
            this.f10323e = jSONObject.optInt("billingCycleCount");
        }

        public String a() {
            return this.f10322d;
        }

        public String b() {
            return this.f10319a;
        }

        public long c() {
            return this.f10320b;
        }

        public String d() {
            return this.f10321c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f10325a;

        d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f10325a = arrayList;
        }

        public List a() {
            return this.f10325a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f10329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f10330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a f10331f;

        e(JSONObject jSONObject) throws JSONException {
            this.f10326a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f10327b = true == strOptString.isEmpty() ? null : strOptString;
            this.f10328c = jSONObject.getString("offerIdToken");
            this.f10329d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f10331f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString(CampaignEx.JSON_KEY_TITLE);
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new c(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f10330e = arrayList;
        }

        public String a() {
            return this.f10328c;
        }

        public d b() {
            return this.f10329d;
        }
    }

    g(String str) {
        this.f10278a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f10279b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f10280c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f10281d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f10282e = jSONObject.optString(CampaignEx.JSON_KEY_TITLE);
        this.f10283f = jSONObject.optString("name");
        this.f10284g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f10285h = jSONObject.optString("skuDetailsToken");
        this.f10286i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new e(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f10287j = arrayList;
        } else {
            this.f10287j = (strOptString2.equals(SubSampleInformationBox.TYPE) || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f10279b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f10279b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f10288k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f10288k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f10288k = arrayList2;
        }
    }

    public String a() {
        return this.f10284g;
    }

    public b b() {
        List list = this.f10288k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) list.get(0);
    }

    public List c() {
        return this.f10288k;
    }

    public String d() {
        return this.f10280c;
    }

    public String e() {
        return this.f10281d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return TextUtils.equals(this.f10278a, ((g) obj).f10278a);
        }
        return false;
    }

    public List f() {
        return this.f10287j;
    }

    public String g() {
        return this.f10282e;
    }

    public final String h() {
        return this.f10279b.optString("packageName");
    }

    public int hashCode() {
        return this.f10278a.hashCode();
    }

    final String i() {
        return this.f10285h;
    }

    final String j(String str) {
        List<b> list;
        if (!TextUtils.isEmpty(str) && (list = this.f10288k) != null && !list.isEmpty()) {
            for (b bVar : list) {
                if (!TextUtils.isEmpty(bVar.f()) && Objects.equals(bVar.b(), str)) {
                    return bVar.f();
                }
            }
        }
        return this.f10286i;
    }

    public String toString() {
        List list = this.f10287j;
        return "ProductDetails{jsonString='" + this.f10278a + "', parsedJson=" + this.f10279b.toString() + ", productId='" + this.f10280c + "', productType='" + this.f10281d + "', title='" + this.f10282e + "', productDetailsToken='" + this.f10285h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
