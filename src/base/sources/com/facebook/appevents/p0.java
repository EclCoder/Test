package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14972b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f14973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f14974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f14975e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f14976a = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: com.facebook.appevents.p0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public /* synthetic */ class C0263a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14977a;

            static {
                int[] iArr = new int[r0.values().length];
                try {
                    iArr[r0.CustomData.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r0.OperationalData.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[r0.CustomAndOperationalData.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f14977a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(q0 typeOfParameter, String key, String value, Bundle customEventsParams, p0 operationalData) {
            kotlin.jvm.internal.s.h(typeOfParameter, "typeOfParameter");
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(value, "value");
            kotlin.jvm.internal.s.h(customEventsParams, "customEventsParams");
            kotlin.jvm.internal.s.h(operationalData, "operationalData");
            int i10 = C0263a.f14977a[d(typeOfParameter, key).ordinal()];
            if (i10 == 1) {
                customEventsParams.putCharSequence(key, value);
                return;
            }
            if (i10 == 2) {
                operationalData.b(typeOfParameter, key, value);
            } else {
                if (i10 != 3) {
                    return;
                }
                operationalData.b(typeOfParameter, key, value);
                customEventsParams.putCharSequence(key, value);
            }
        }

        public final fl.q b(q0 typeOfParameter, String key, String value, Bundle bundle, p0 p0Var) {
            kotlin.jvm.internal.s.h(typeOfParameter, "typeOfParameter");
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(value, "value");
            int i10 = C0263a.f14977a[d(typeOfParameter, key).ordinal()];
            if (i10 == 1) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putCharSequence(key, value);
            } else if (i10 == 2) {
                if (p0Var == null) {
                    p0Var = new p0();
                }
                p0Var.b(typeOfParameter, key, value);
            } else if (i10 == 3) {
                if (p0Var == null) {
                    p0Var = new p0();
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                p0Var.b(typeOfParameter, key, value);
                bundle.putCharSequence(key, value);
            }
            return new fl.q(bundle, p0Var);
        }

        public final Object c(q0 typeOfParameter, String key, Bundle bundle, p0 p0Var) {
            kotlin.jvm.internal.s.h(typeOfParameter, "typeOfParameter");
            kotlin.jvm.internal.s.h(key, "key");
            Object objD = p0Var != null ? p0Var.d(typeOfParameter, key) : null;
            return objD == null ? bundle != null ? bundle.getCharSequence(key) : null : objD;
        }

        private a() {
        }

        public final r0 d(q0 typeOfParameter, String str) {
            kotlin.jvm.internal.s.h(typeOfParameter, "typeOfParameter");
            kotlin.jvm.internal.s.h(str, IAoPeRfJn.eWlcg);
            fl.q qVar = (fl.q) p0.f14975e.get(typeOfParameter);
            Set set = qVar != null ? (Set) qVar.h() : null;
            fl.q qVar2 = (fl.q) p0.f14975e.get(typeOfParameter);
            Set set2 = qVar2 != null ? (Set) qVar2.i() : null;
            if (set == null || !set.contains(str)) {
                return (set2 == null || !set2.contains(str)) ? r0.CustomData : r0.CustomAndOperationalData;
            }
            return r0.OperationalData;
        }
    }

    public final void b(q0 type, String key, Object value) {
        kotlin.jvm.internal.s.h(type, "type");
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(value, "value");
        try {
            d.f14915f.a(key);
            if (!(value instanceof String) && !(value instanceof Number)) {
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                String str = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{value, key}, 2));
                kotlin.jvm.internal.s.g(str, "format(format, *args)");
                throw new FacebookException(str);
            }
            if (!this.f14976a.containsKey(type)) {
                this.f14976a.put(type, new LinkedHashMap());
            }
            Map map = (Map) this.f14976a.get(type);
            if (map != null) {
                map.put(key, value);
            }
        } catch (Exception unused) {
        }
    }

    public final p0 c() {
        p0 p0Var = new p0();
        for (q0 q0Var : this.f14976a.keySet()) {
            Map map = (Map) this.f14976a.get(q0Var);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        p0Var.b(q0Var, str, obj);
                    }
                }
            }
        }
        return p0Var;
    }

    public final Object d(q0 type, String key) {
        Map map;
        kotlin.jvm.internal.s.h(type, "type");
        kotlin.jvm.internal.s.h(key, "key");
        if (this.f14976a.containsKey(type) && (map = (Map) this.f14976a.get(type)) != null) {
            return map.get(key);
        }
        return null;
    }

    public final JSONObject e() {
        JSONObject jSONObject;
        try {
            Map map = this.f14976a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gl.l0.e(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((q0) ((Map.Entry) obj).getKey()).g(), ((Map.Entry) obj).getValue());
            }
            jSONObject = new JSONObject(gl.l0.t(linkedHashMap));
        } catch (Exception unused) {
            jSONObject = null;
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    static {
        Set setH = gl.s0.h("fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used");
        f14973c = setH;
        Set setH2 = gl.s0.h(dmHT.suXOtofK, "fb_iap_product_type", "fb_iap_purchase_time");
        f14974d = setH2;
        f14975e = gl.l0.f(fl.w.a(q0.IAPParameters, new fl.q(setH, setH2)));
    }
}
