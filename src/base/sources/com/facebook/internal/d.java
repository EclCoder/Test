package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f15149a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f15150b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements h {
        a() {
        }

        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String key, Object value) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(value, "value");
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements h {
        b() {
        }

        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String key, Object value) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(value, "value");
            bundle.putInt(key, ((Integer) value).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements h {
        c() {
        }

        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String key, Object value) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(value, "value");
            bundle.putLong(key, ((Long) value).longValue());
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0267d implements h {
        C0267d() {
        }

        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String key, Object value) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(value, "value");
            bundle.putDouble(key, ((Double) value).doubleValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements h {
        e() {
        }

        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String key, Object value) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(value, "value");
            bundle.putString(key, (String) value);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f implements h {
        f() {
        }

        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String key, Object value) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(value, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g implements h {
        g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String key, Object value) throws JSONException {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            kotlin.jvm.internal.s.h(key, "key");
            kotlin.jvm.internal.s.h(value, "value");
            JSONArray jSONArray = (JSONArray) value;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(key, arrayList);
                return;
            }
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = jSONArray.get(i10);
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj.getClass());
                }
                arrayList.add(obj);
            }
            bundle.putStringArrayList(key, arrayList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface h {
        void a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap map = new HashMap();
        f15150b = map;
        map.put(Boolean.class, new a());
        map.put(Integer.class, new b());
        map.put(Long.class, new c());
        map.put(Double.class, new C0267d());
        map.put(String.class, new e());
        map.put(String[].class, new f());
        map.put(JSONArray.class, new g());
    }

    private d() {
    }

    public static final Bundle a(JSONObject jsonObject) throws JSONException {
        kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object value = jsonObject.get(key);
            if (value != JSONObject.NULL) {
                if (value instanceof JSONObject) {
                    bundle.putBundle(key, a((JSONObject) value));
                } else {
                    h hVar = (h) f15150b.get(value.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException("Unsupported type: " + value.getClass());
                    }
                    kotlin.jvm.internal.s.g(key, "key");
                    kotlin.jvm.internal.s.g(value, "value");
                    hVar.a(bundle, key, value);
                }
            }
        }
        return bundle;
    }
}
