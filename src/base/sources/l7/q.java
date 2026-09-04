package l7;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.android.vending.billing.IInAppBillingService;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.facebook.h0;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f44026a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap f44027b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap f44028c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44029d = h0.m().getPackageName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final SharedPreferences f44030e = h0.m().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final SharedPreferences f44031f = h0.m().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    private q() {
    }

    public static final Object a(Context context, IBinder iBinder) {
        if (x7.a.c(q.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            return f44026a.n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th2) {
            x7.a.b(th2, q.class);
            return null;
        }
    }

    public static final void b() {
        if (x7.a.c(q.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f44030e;
            long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j10 == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            } else if (jCurrentTimeMillis - j10 > TelemetryConfig.DEFAULT_EVENT_TTL_SEC) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, q.class);
        }
    }

    private final ArrayList c(ArrayList arrayList) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor editorEdit = f44031f.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j10 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j10 / 1000) <= 86400 && !kotlin.jvm.internal.s.c(f44031f.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList2;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final Class d(Context context, String str) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            HashMap map = f44028c;
            Class cls = (Class) map.get(str);
            if (cls != null) {
                return cls;
            }
            Class clsB = u.b(context, str);
            if (clsB == null) {
                return clsB;
            }
            map.put(str, clsB);
            return clsB;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    private final Method e(Class cls, String str) {
        Class[] clsArr;
        if (x7.a.c(this)) {
            return null;
        }
        try {
            HashMap map = f44027b;
            Method method = (Method) map.get(str);
            if (method != null) {
                return method;
            }
            Class TYPE = Integer.TYPE;
            switch (str) {
                case "getPurchases":
                    kotlin.jvm.internal.s.g(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                    break;
                case "isBillingSupported":
                    kotlin.jvm.internal.s.g(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class};
                    break;
                case "asInterface":
                    clsArr = new Class[]{IBinder.class};
                    break;
                case "getPurchaseHistory":
                    kotlin.jvm.internal.s.g(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, String.class, Bundle.class};
                    break;
                case "getSkuDetails":
                    kotlin.jvm.internal.s.g(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, Bundle.class};
                    break;
                default:
                    clsArr = null;
                    break;
            }
            Method methodC = clsArr == null ? u.c(cls, str, null) : u.c(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (methodC != null) {
                map.put(str, methodC);
            }
            return methodC;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final ArrayList g(Context context, Object obj) {
        q qVar;
        Class clsD;
        if (x7.a.c(q.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            ArrayList arrayList = new ArrayList();
            if (obj != null && (clsD = (qVar = f44026a).d(context, IInAppBillingService.DESCRIPTOR)) != null && qVar.e(clsD, "getPurchaseHistory") != null) {
                return qVar.c(qVar.f(context, obj, "inapp"));
            }
            return arrayList;
        } catch (Throwable th2) {
            x7.a.b(th2, q.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    private final ArrayList h(Context context, Object obj, String str) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (obj != null && o(context, obj, str)) {
                int size = 0;
                String string = null;
                while (true) {
                    Context context2 = context;
                    Object obj2 = obj;
                    try {
                        Object objN = n(context2, IInAppBillingService.DESCRIPTOR, "getPurchases", obj2, new Object[]{3, f44029d, str, string});
                        if (objN == null) {
                            string = null;
                            if (size >= 30) {
                                break;
                            }
                            break;
                            break;
                        }
                        Bundle bundle = (Bundle) objN;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList == null) {
                                break;
                            }
                            size += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        } else {
                            string = null;
                        }
                        if (size >= 30 || string == null) {
                            break;
                        }
                        context = context2;
                        obj = obj2;
                    } catch (Throwable th2) {
                        th = th2;
                        x7.a.b(th, this);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final ArrayList i(Context context, Object obj) {
        if (x7.a.c(q.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            q qVar = f44026a;
            return qVar.c(qVar.h(context, obj, "inapp"));
        } catch (Throwable th2) {
            x7.a.b(th2, q.class);
            return null;
        }
    }

    public static final ArrayList j(Context context, Object obj) {
        if (x7.a.c(q.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            q qVar = f44026a;
            return qVar.c(qVar.h(context, obj, SubSampleInformationBox.TYPE));
        } catch (Throwable th2) {
            x7.a.b(th2, q.class);
            return null;
        }
    }

    public static final Map k(Context context, ArrayList skuList, Object obj, boolean z10) {
        if (x7.a.c(q.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(skuList, "skuList");
            Map mapP = f44026a.p(skuList);
            ArrayList arrayList = new ArrayList();
            int size = skuList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = skuList.get(i10);
                i10++;
                String str = (String) obj2;
                if (!mapP.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            mapP.putAll(f44026a.l(context, arrayList, obj, z10));
            return mapP;
        } catch (Throwable th2) {
            x7.a.b(th2, q.class);
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    private final Map l(Context context, ArrayList arrayList, Object obj, boolean z10) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                try {
                    Object objN = n(context, IInAppBillingService.DESCRIPTOR, "getSkuDetails", obj, new Object[]{3, f44029d, z10 ? SubSampleInformationBox.TYPE : "inapp", bundle});
                    if (objN != null) {
                        Bundle bundle2 = (Bundle) objN;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    Object obj2 = arrayList.get(i10);
                                    kotlin.jvm.internal.s.g(obj2, "skuList[i]");
                                    String str = stringArrayList.get(i10);
                                    kotlin.jvm.internal.s.g(str, "skuDetailsList[i]");
                                    linkedHashMap.put(obj2, str);
                                }
                            }
                            q(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    x7.a.b(th, this);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th3) {
            th = th3;
            x7.a.b(th, this);
            return null;
        }
    }

    private final Object n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodE;
        if (x7.a.c(this)) {
            return null;
        }
        try {
            Class clsD = d(context, str);
            if (clsD == null || (methodE = e(clsD, str2)) == null) {
                return null;
            }
            return u.e(clsD, methodE, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final boolean o(Context context, Object obj, String str) {
        if (x7.a.c(this) || obj == null) {
            return false;
        }
        try {
            try {
                Object objN = n(context, IInAppBillingService.DESCRIPTOR, "isBillingSupported", obj, new Object[]{3, f44029d, str});
                return objN != null && ((Integer) objN).intValue() == 0;
            } catch (Throwable th2) {
                th = th2;
                x7.a.b(th, this);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final Map p(ArrayList arrayList) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String sku = (String) obj;
                String string = f44030e.getString(sku, null);
                if (string != null) {
                    List listF0 = bm.r.F0(string, new String[]{";"}, false, 2, 2, null);
                    if (jCurrentTimeMillis - Long.parseLong((String) listF0.get(0)) < 43200) {
                        kotlin.jvm.internal.s.g(sku, "sku");
                        linkedHashMap.put(sku, listF0.get(1));
                    } else {
                        continue;
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final void q(Map map) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = f44030e.edit();
            for (Map.Entry entry : map.entrySet()) {
                editorEdit.putString((String) entry.getKey(), jCurrentTimeMillis + ';' + ((String) entry.getValue()));
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final boolean m(String skuDetail) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            kotlin.jvm.internal.s.h(skuDetail, "skuDetail");
            try {
                String strOptString = new JSONObject(skuDetail).optString("freeTrialPeriod");
                return strOptString != null && strOptString.length() > 0;
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    private final ArrayList f(Context context, Object obj, String str) {
        ArrayList arrayList;
        ArrayList<String> stringArrayList;
        ArrayList arrayList2 = null;
        if (x7.a.c(this)) {
            return null;
        }
        try {
            ArrayList arrayList3 = new ArrayList();
            if (o(context, obj, str)) {
                Object string = null;
                int i10 = 0;
                boolean z10 = false;
                while (true) {
                    Object objN = n(context, dOIDCKnIR.luQzRsGOOWsHdue, "getPurchaseHistory", obj, new Object[]{6, f44029d, str, string, new Bundle()});
                    if (objN != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objN;
                        if (bundle.getInt("RESPONSE_CODE") != 0 || (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) == null) {
                            arrayList = arrayList2;
                            string = arrayList;
                        } else {
                            int size = stringArrayList.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size) {
                                    String str2 = stringArrayList.get(i11);
                                    i11++;
                                    String str3 = str2;
                                    try {
                                        arrayList = arrayList2;
                                        try {
                                            try {
                                                if (jCurrentTimeMillis - (new JSONObject(str3).getLong("purchaseTime") / 1000) > 1200) {
                                                    z10 = true;
                                                    break;
                                                }
                                                arrayList3.add(str3);
                                                i10++;
                                            } catch (JSONException unused) {
                                                continue;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            x7.a.b(th, this);
                                            return arrayList;
                                        }
                                    } catch (JSONException unused2) {
                                        arrayList = arrayList2;
                                    }
                                    arrayList2 = arrayList;
                                } else {
                                    arrayList = arrayList2;
                                    break;
                                }
                            }
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        }
                    } else {
                        arrayList = arrayList2;
                        string = arrayList;
                    }
                    if (i10 >= 30 || string == null || z10) {
                        break;
                    }
                    arrayList2 = arrayList;
                }
            }
            return arrayList3;
        } catch (Throwable th3) {
            th = th3;
            arrayList = arrayList2;
        }
    }
}
