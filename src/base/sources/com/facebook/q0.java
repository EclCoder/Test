package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.facebook.internal.e1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15985c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f15986d = q0.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f15988b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Date b(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j10 = bundle.getLong(str, Long.MIN_VALUE);
            if (j10 == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j10);
        }

        public final String a(Bundle bundle) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        public final Date c(Bundle bundle) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        public final Date d(Bundle bundle) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        public final l e(Bundle bundle) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                return (l) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            }
            return bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? l.FACEBOOK_APPLICATION_WEB : l.WEB_VIEW;
        }

        public final String f(Bundle bundle) {
            kotlin.jvm.internal.s.h(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        public final boolean g(Bundle bundle) {
            String string;
            return (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null || string.length() == 0 || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0) ? false : true;
        }

        public a() {
        }
    }

    public q0(Context context, String str) {
        kotlin.jvm.internal.s.h(context, "context");
        str = (str == null || str.length() == 0) ? "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY" : str;
        this.f15987a = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        kotlin.jvm.internal.s.g(sharedPreferences, "effectiveContext.getShar…ey, Context.MODE_PRIVATE)");
        this.f15988b = sharedPreferences;
    }

    public final void a() {
        this.f15988b.edit().clear().apply();
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        for (String key : this.f15988b.getAll().keySet()) {
            try {
                kotlin.jvm.internal.s.g(key, "key");
                b(key, bundle);
            } catch (JSONException e10) {
                com.facebook.internal.r0.a aVar = com.facebook.internal.r0.f15352e;
                r0 r0Var = r0.CACHE;
                String TAG = f15986d;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                aVar.a(r0Var, 5, TAG, "Error reading cached value for key: '" + key + "' -- " + e10);
                return null;
            }
        }
        return bundle;
    }

    private final void b(String str, Bundle bundle) throws JSONException {
        String str2;
        String string;
        String string2 = this.f15988b.getString(str, "{}");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        kotlin.jvm.internal.s.g(string2, "checkNotNull(cache.getString(key, \"{}\"))");
        JSONObject jSONObject = new JSONObject(string2);
        String string3 = jSONObject.getString("valueType");
        if (string3 != null) {
            int i10 = 0;
            switch (string3.hashCode()) {
                case -1573317553:
                    if (string3.equals(dOIDCKnIR.HXjbFZnzp)) {
                        JSONArray jSONArray = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        int length = jSONArray.length();
                        ArrayList<String> arrayList = new ArrayList<>(length);
                        while (i10 < length) {
                            Object obj = jSONArray.get(i10);
                            if (obj == JSONObject.NULL) {
                                str2 = null;
                            } else {
                                kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlin.String");
                                str2 = (String) obj;
                            }
                            arrayList.add(i10, str2);
                            i10++;
                        }
                        bundle.putStringArrayList(str, arrayList);
                        return;
                    }
                    return;
                case -1383386164:
                    if (string3.equals("bool[]")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        int length2 = jSONArray2.length();
                        boolean[] zArr = new boolean[length2];
                        while (i10 < length2) {
                            zArr[i10] = jSONArray2.getBoolean(i10);
                            i10++;
                        }
                        bundle.putBooleanArray(str, zArr);
                        return;
                    }
                    return;
                case -1374008726:
                    if (string3.equals("byte[]")) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        int length3 = jSONArray3.length();
                        byte[] bArr = new byte[length3];
                        while (i10 < length3) {
                            bArr[i10] = (byte) jSONArray3.getInt(i10);
                            i10++;
                        }
                        bundle.putByteArray(str, bArr);
                        return;
                    }
                    return;
                case -1361632968:
                    if (string3.equals("char[]")) {
                        JSONArray jSONArray4 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        int length4 = jSONArray4.length();
                        char[] cArr = new char[length4];
                        for (int i11 = 0; i11 < length4; i11++) {
                            String string4 = jSONArray4.getString(i11);
                            if (string4 != null && string4.length() == 1) {
                                cArr[i11] = string4.charAt(0);
                            }
                        }
                        bundle.putCharArray(str, cArr);
                        return;
                    }
                    return;
                case -1325958191:
                    if (string3.equals("double")) {
                        bundle.putDouble(str, jSONObject.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        return;
                    }
                    return;
                case -1097129250:
                    if (string3.equals("long[]")) {
                        JSONArray jSONArray5 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        int length5 = jSONArray5.length();
                        long[] jArr = new long[length5];
                        while (i10 < length5) {
                            jArr[i10] = jSONArray5.getLong(i10);
                            i10++;
                        }
                        bundle.putLongArray(str, jArr);
                        return;
                    }
                    return;
                case -891985903:
                    if (string3.equals("string")) {
                        bundle.putString(str, jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        return;
                    }
                    return;
                case -766441794:
                    if (string3.equals("float[]")) {
                        JSONArray jSONArray6 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        int length6 = jSONArray6.length();
                        float[] fArr = new float[length6];
                        while (i10 < length6) {
                            fArr[i10] = (float) jSONArray6.getDouble(i10);
                            i10++;
                        }
                        bundle.putFloatArray(str, fArr);
                        return;
                    }
                    return;
                case 104431:
                    if (string3.equals("int")) {
                        bundle.putInt(str, jSONObject.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        return;
                    }
                    return;
                case 3029738:
                    if (string3.equals("bool")) {
                        bundle.putBoolean(str, jSONObject.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        return;
                    }
                    return;
                case 3039496:
                    if (string3.equals("byte")) {
                        bundle.putByte(str, (byte) jSONObject.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        return;
                    }
                    return;
                case 3052374:
                    if (string3.equals("char") && (string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE)) != null && string.length() == 1) {
                        bundle.putChar(str, string.charAt(0));
                        return;
                    }
                    return;
                case 3118337:
                    if (string3.equals("enum")) {
                        try {
                            Class<?> cls = Class.forName(jSONObject.getString("enumType"));
                            kotlin.jvm.internal.s.f(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Enum<*>>");
                            bundle.putSerializable(str, Enum.valueOf(cls, jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE)));
                            return;
                        } catch (ClassNotFoundException e10) {
                            e1.m0(f15986d, "Failed to deserialize enum type", e10);
                            return;
                        } catch (IllegalArgumentException e11) {
                            e1.m0(f15986d, "Failed to deserialize enum value", e11);
                            return;
                        }
                    }
                    return;
                case 3327612:
                    if (string3.equals("long")) {
                        bundle.putLong(str, jSONObject.getLong(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        return;
                    }
                    return;
                case 97526364:
                    if (string3.equals("float")) {
                        bundle.putFloat(str, (float) jSONObject.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        return;
                    }
                    return;
                case 100361105:
                    if (string3.equals("int[]")) {
                        JSONArray jSONArray7 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        int length7 = jSONArray7.length();
                        int[] iArr = new int[length7];
                        while (i10 < length7) {
                            iArr[i10] = jSONArray7.getInt(i10);
                            i10++;
                        }
                        bundle.putIntArray(str, iArr);
                        return;
                    }
                    return;
                case 109413500:
                    if (string3.equals("short")) {
                        bundle.putShort(str, (short) jSONObject.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        return;
                    }
                    return;
                case 1359468275:
                    if (string3.equals("double[]")) {
                        JSONArray jSONArray8 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        int length8 = jSONArray8.length();
                        double[] dArr = new double[length8];
                        while (i10 < length8) {
                            dArr[i10] = jSONArray8.getDouble(i10);
                            i10++;
                        }
                        bundle.putDoubleArray(str, dArr);
                        return;
                    }
                    return;
                case 2067161310:
                    if (string3.equals("short[]")) {
                        JSONArray jSONArray9 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        int length9 = jSONArray9.length();
                        short[] sArr = new short[length9];
                        while (i10 < length9) {
                            sArr[i10] = (short) jSONArray9.getInt(i10);
                            i10++;
                        }
                        bundle.putShortArray(str, sArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public /* synthetic */ q0(Context context, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : str);
    }
}
