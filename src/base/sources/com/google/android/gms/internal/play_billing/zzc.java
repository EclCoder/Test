package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.b;
import com.android.billingclient.api.c;
import com.android.billingclient.api.h;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l5.j;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzc {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzn(str, "Unexpected null bundle received!");
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzm(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        zzn(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle zzc(Bundle bundle, String str, String str2, long j10) {
        bundle.putString("playBillingLibraryVersion", "9.1.0");
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j10);
        return bundle;
    }

    public static Bundle zzd(c cVar, zzjs zzjsVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", cVar.c());
        bundle.putString("DEBUG_MESSAGE", cVar.a());
        bundle.putInt("LOG_REASON", zzjsVar.zza());
        return bundle;
    }

    public static Bundle zze(c cVar, zzjs zzjsVar, String str) {
        Bundle bundleZzd = zzd(cVar, zzjsVar);
        if (str != null) {
            bundleZzd.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleZzd;
    }

    public static Bundle zzf(b bVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str, String str2, long j10, String str3, long j11) {
        Bundle bundle = new Bundle();
        zzc(bundle, "9.1.0", str2, j10);
        bundle.putLong("billingClientTransactionId", j11);
        if (bVar.d() != 0) {
            bundle.putInt("prorationMode", bVar.d());
        }
        if (!TextUtils.isEmpty(bVar.g())) {
            bundle.putString("accountId", bVar.g());
        }
        if (!TextUtils.isEmpty(bVar.h())) {
            bundle.putString("obfuscatedProfileId", bVar.h());
        }
        if (bVar.v()) {
            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(bVar.j())) {
            bundle.putString("oldSkuPurchaseToken", bVar.j());
        }
        bVar.i();
        if (!TextUtils.isEmpty(null)) {
            bVar.i();
            bundle.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(bVar.k())) {
            bundle.putString("originalExternalTransactionId", bVar.k());
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z10 && z12) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z11 && z13) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        if (z14) {
            bundle.putBoolean("enableAlternativeBilling", true);
        } else {
            bVar.a();
        }
        bVar.e();
        bVar.c();
        bVar.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = bVar.m().iterator();
        while (it.hasNext()) {
            ((b.C0141b) it.next()).a();
        }
        if (!arrayList.isEmpty()) {
            zzem zzemVarZza = zzen.zza();
            zzemVarZza.zza(arrayList);
            bundle.putByteArray("subscriptionProductReplacementParamsList", ((zzen) zzemVarZza.zzi()).zzQ());
        }
        return bundle;
    }

    public static Bundle zzg(String str, String str2, ArrayList arrayList, String str3, String str4, zza zzaVar, long j10) {
        Bundle bundle = new Bundle();
        zzc(bundle, "9.1.0", str2, j10);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(zzca.zzm(SubSampleInformationBox.TYPE, "inapp")));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(zzca.zzl("inapp")));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(zzca.zzl("inapp")));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (zzaVar.zza) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            h.b bVar = (h.b) arrayList.get(i10);
            arrayList2.add(null);
            z10 |= !TextUtils.isEmpty(null);
            arrayList4.add(bVar.a());
            z11 |= !TextUtils.isEmpty(bVar.a());
            if (bVar.d().equals("first_party")) {
                zzbl.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                arrayList3.add(null);
            }
        }
        if (z10) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z11) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static Bundle zzh(String str, String str2, long j10) {
        Bundle bundle = new Bundle();
        zzc(bundle, "9.1.0", str2, j10);
        return bundle;
    }

    public static c zzi(Intent intent, String str) {
        if (intent != null) {
            c.a aVarD = c.d();
            aVarD.d(zzb(intent.getExtras(), str));
            aVarD.b(zzj(intent.getExtras(), str));
            return aVarD.a();
        }
        zzn("BillingHelper", "Got null intent!");
        c.a aVarD2 = c.d();
        aVarD2.d(6);
        aVarD2.b("An internal error occurred.");
        return aVarD2.a();
    }

    public static String zzj(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzm(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        zzn(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String zzk(int i10) {
        return zzb.zza(i10).toString();
    }

    public static List zzl(Bundle bundle, Set set) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            j jVarZzp = zzp(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"), set);
            if (jVarZzp == null) {
                zzm("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(jVarZzp);
            return arrayList;
        }
        zzm("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
            j jVarZzp2 = zzp(stringArrayList.get(i10), stringArrayList2.get(i10), set);
            if (jVarZzp2 != null) {
                arrayList.add(jVarZzp2);
            }
        }
        return arrayList;
    }

    public static void zzm(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i10 = 40000;
            while (!str2.isEmpty() && i10 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i10));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i10 -= iMin;
            }
        }
    }

    public static void zzn(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzo(String str, String str2, Throwable th2) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th2 == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static j zzp(String str, String str2, Set set) {
        j jVar = null;
        if (str == null || str2 == null) {
            zzm("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            j jVar2 = new j(str, str2);
            try {
                set.isEmpty();
                return jVar2;
            } catch (JSONException e10) {
                e = e10;
                jVar = jVar2;
                zzn("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
                return jVar;
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }

    private static String zzq(String str, String str2, String str3) {
        return "subs:" + str3 + ":" + str;
    }
}
