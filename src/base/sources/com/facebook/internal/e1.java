package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import com.facebook.FacebookException;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile int f15202b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile Locale f15210j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f15201a = new e1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile long f15203c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile long f15204d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile long f15205e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile String f15206f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile String f15207g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile String f15208h = "NoCarrier";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile String f15209i = "";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(JSONObject jSONObject);

        void b(FacebookException facebookException);
    }

    private e1() {
    }

    public static final long A(Uri contentUri) {
        kotlin.jvm.internal.s.h(contentUri, "contentUri");
        Cursor cursorQuery = null;
        try {
            cursorQuery = com.facebook.h0.m().getContentResolver().query(contentUri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j10 = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j10;
        } catch (Throwable th2) {
            if (cursorQuery == null) {
                throw th2;
            }
            cursorQuery.close();
            throw th2;
        }
    }

    private final void A0(Context context) {
        if (kotlin.jvm.internal.s.c(f15208h, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                kotlin.jvm.internal.s.g(networkOperatorName, "telephonyManager.networkOperatorName");
                f15208h = networkOperatorName;
            } catch (Exception e10) {
                m0("FacebookSDK", "Failed to refresh carrier name", e10);
            }
        }
    }

    public static final Locale B() {
        Locale localeO = O();
        if (localeO != null) {
            return localeO;
        }
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.s.g(locale, "getDefault()");
        return locale;
    }

    private final void B0(Context context) {
        if (f15203c == -1 || System.currentTimeMillis() - f15203c >= 1800000) {
            f15203c = System.currentTimeMillis();
            C0();
            A0(context);
            D0();
            x0();
        }
    }

    private final String C() {
        com.facebook.a aVarE = com.facebook.a.f14853l.e();
        return (aVarE == null || aVarE.j() == null) ? "facebook" : aVarE.j();
    }

    private final void C0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            kotlin.jvm.internal.s.g(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
            f15206f = displayName;
            String id2 = timeZone.getID();
            kotlin.jvm.internal.s.g(id2, "tz.id");
            f15207g = id2;
        } catch (AssertionError unused) {
        } catch (Exception e10) {
            m0("FacebookSDK", "Failed to refresh timezone", e10);
        }
    }

    public static final JSONObject D() {
        if (x7.a.c(e1.class)) {
            return null;
        }
        try {
            String string = com.facebook.h0.m().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException e10) {
                    m0("FacebookSDK", "Failed to parse data processing options", e10);
                }
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, e1.class);
            return null;
        }
    }

    private final void D0() {
        try {
            if (s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f15204d = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f15204d = l(f15204d);
        } catch (Exception unused) {
        }
    }

    public static final void E0(Runnable runnable) {
        try {
            com.facebook.h0.v().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final String F(String str) {
        String strW = com.facebook.h0.w();
        if (str != null) {
            if (kotlin.jvm.internal.s.c(str, "gaming")) {
                return bm.r.I(strW, "facebook.com", "fb.gg", false, 4, null);
            }
            if (kotlin.jvm.internal.s.c(str, "instagram")) {
                return bm.r.I(strW, "facebook.com", "instagram.com", false, 4, null);
            }
        }
        return strW;
    }

    public static final void F0(JSONObject params, b bVar, String str, boolean z10, Context context) throws JSONException {
        kotlin.jvm.internal.s.h(params, "params");
        kotlin.jvm.internal.s.h(context, "context");
        s.b bVar2 = s.b.ServiceUpdateCompliance;
        if (!s.g(bVar2)) {
            params.put("anon_id", str);
        }
        params.put("application_tracking_enabled", !z10);
        params.put("advertiser_id_collection_enabled", com.facebook.h0.l());
        Boolean boolK = com.facebook.h0.k();
        if (boolK != null) {
            params.put("add_to_messaging_customer_base_for_whatsapp", boolK.booleanValue() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        }
        if (bVar != null) {
            if (s.g(bVar2)) {
                f15201a.c(params, bVar, str, context);
            }
            if (bVar.j() != null) {
                if (s.g(bVar2)) {
                    f15201a.d(params, bVar, context);
                } else {
                    params.put("attribution", bVar.j());
                }
            }
            if (bVar.h() != null) {
                params.put("advertiser_id", bVar.h());
                params.put("advertiser_tracking_enabled", !bVar.k());
            }
            if (!bVar.k()) {
                String strB = com.facebook.appevents.v0.b();
                if (strB.length() != 0) {
                    params.put("ud", strB);
                }
            }
            if (bVar.i() != null) {
                params.put("installer_package", bVar.i());
            }
        }
        n7.j.a aVar = n7.j.f46891b;
        n7.j jVarA = aVar.a();
        Object objE = jVarA != null ? jVarA.e("campaign_ids") : null;
        if (objE != null) {
            params.put("campaign_ids", objE);
        }
        n7.j jVarA2 = aVar.a();
        Object objE2 = jVarA2 != null ? jVarA2.e("click_id") : null;
        if (objE2 != null) {
            params.put("click_id", objE2);
        }
    }

    public static final void G0(JSONObject params, Context appContext) throws JSONException {
        Locale locale;
        int i10;
        kotlin.jvm.internal.s.h(params, "params");
        kotlin.jvm.internal.s.h(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f15201a.B0(appContext);
        String packageName = appContext.getPackageName();
        int i11 = 0;
        int i12 = -1;
        try {
            PackageInfo packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i12 = packageInfo.versionCode;
            f15209i = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i12);
        jSONArray.put(f15209i);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = appContext.getResources().getConfiguration().getLocales().get(0);
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        f15210j = locale;
        StringBuilder sb2 = new StringBuilder();
        Locale locale2 = f15210j;
        String language = locale2 != null ? locale2.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        sb2.append(language);
        sb2.append('_');
        Locale locale3 = f15210j;
        String country = locale3 != null ? locale3.getCountry() : null;
        sb2.append(country != null ? country : "");
        jSONArray.put(sb2.toString());
        jSONArray.put(f15206f);
        jSONArray.put(f15208h);
        double d10 = 0.0d;
        try {
            Object systemService = appContext.getSystemService("display");
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i13 = displayMetrics.widthPixels;
                try {
                    i11 = displayMetrics.heightPixels;
                    d10 = displayMetrics.density;
                } catch (Exception unused3) {
                }
                i10 = i11;
                i11 = i13;
            } else {
                i10 = 0;
            }
        } catch (Exception unused4) {
        }
        jSONArray.put(i11);
        jSONArray.put(i10);
        jSONArray.put(new DecimalFormat("#.##").format(d10));
        jSONArray.put(f15201a.y0());
        jSONArray.put(f15204d);
        jSONArray.put(f15205e);
        jSONArray.put(f15207g);
        params.put("extinfo", jSONArray.toString());
    }

    public static final void H(final String accessToken, final a callback) {
        kotlin.jvm.internal.s.h(accessToken, "accessToken");
        kotlin.jvm.internal.s.h(callback, "callback");
        JSONObject jSONObjectA = w0.a(accessToken);
        if (jSONObjectA != null) {
            callback.a(jSONObjectA);
            return;
        }
        com.facebook.j0.b bVar = new com.facebook.j0.b() { // from class: com.facebook.internal.c1
            @Override // com.facebook.j0.b
            public final void a(com.facebook.o0 o0Var) {
                e1.I(callback, accessToken, o0Var);
            }
        };
        com.facebook.j0 j0VarG = f15201a.G(accessToken);
        j0VarG.C(bVar);
        j0VarG.l();
    }

    public static final String H0(byte[] bytes) {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        return f15201a.U("SHA-1", bytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(a callback, String accessToken, com.facebook.o0 response) {
        kotlin.jvm.internal.s.h(callback, "$callback");
        kotlin.jvm.internal.s.h(accessToken, "$accessToken");
        kotlin.jvm.internal.s.h(response, "response");
        if (response.b() != null) {
            callback.b(response.b().f());
            return;
        }
        JSONObject jSONObjectD = response.d();
        if (jSONObjectD == null) {
            throw new IllegalStateException("Required value was null.");
        }
        w0.b(accessToken, jSONObjectD);
        callback.a(response.d());
    }

    public static final String I0(String str) {
        if (str == null) {
            return null;
        }
        return f15201a.T("SHA-256", str);
    }

    public static final void J0(Parcel parcel, Map map) {
        kotlin.jvm.internal.s.h(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final String K(Context context) {
        f1.m(context, "context");
        return com.facebook.h0.n();
    }

    public static final void K0(Parcel parcel, Map map) {
        kotlin.jvm.internal.s.h(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final Method L(Class clazz, String methodName, Class... parameterTypes) {
        kotlin.jvm.internal.s.h(clazz, "clazz");
        kotlin.jvm.internal.s.h(methodName, "methodName");
        kotlin.jvm.internal.s.h(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method M(String className, String methodName, Class... parameterTypes) {
        kotlin.jvm.internal.s.h(className, "className");
        kotlin.jvm.internal.s.h(methodName, "methodName");
        kotlin.jvm.internal.s.h(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            kotlin.jvm.internal.s.g(clazz, "clazz");
            return L(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final String N(String str) {
        return kotlin.jvm.internal.s.c(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    public static final Locale O() {
        try {
            return com.facebook.h0.m().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object P(JSONObject jsonObject, String str, String str2) throws JSONException {
        kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
        Object objOpt = jsonObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(str2, objOpt);
        return jSONObject;
    }

    public static final String Q(Uri uri) {
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    private final String S(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        kotlin.jvm.internal.s.g(digest, "digest");
        for (byte b10 : digest) {
            sb2.append(Integer.toHexString((b10 >> 4) & 15));
            sb2.append(Integer.toHexString(b10 & 15));
        }
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "builder.toString()");
        return string;
    }

    private final String T(String str, String str2) {
        byte[] bytes = str2.getBytes(bm.d.f9079b);
        kotlin.jvm.internal.s.g(bytes, "this as java.lang.String).getBytes(charset)");
        return U(str, bytes);
    }

    private final String U(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            kotlin.jvm.internal.s.g(hash, "hash");
            return S(hash, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object V(Object obj, Method method, Object... args) {
        kotlin.jvm.internal.s.h(method, "method");
        kotlin.jvm.internal.s.h(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean W() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            String str = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{com.facebook.h0.n()}, 1));
            kotlin.jvm.internal.s.g(str, "format(format, *args)");
            intent.setData(Uri.parse(str));
            Context contextM = com.facebook.h0.m();
            PackageManager packageManager = contextM.getPackageManager();
            String packageName = contextM.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            kotlin.jvm.internal.s.g(listQueryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.s.c(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean X(Context context) {
        AutofillManager autofillManagerA;
        kotlin.jvm.internal.s.h(context, "context");
        return Build.VERSION.SDK_INT >= 26 && (autofillManagerA = b1.a(context.getSystemService(a1.a()))) != null && autofillManagerA.isAutofillSupported() && autofillManagerA.isEnabled();
    }

    public static final boolean Y(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String DEVICE = Build.DEVICE;
        if (DEVICE == null) {
            return false;
        }
        kotlin.jvm.internal.s.g(DEVICE, "DEVICE");
        return new bm.o(".+_cheets|cheets_.+").h(DEVICE);
    }

    public static final boolean Z(Uri uri) {
        return uri != null && bm.r.A("content", uri.getScheme(), true);
    }

    public static final boolean a0(com.facebook.a aVar) {
        return aVar != null && kotlin.jvm.internal.s.c(aVar, com.facebook.a.f14853l.e());
    }

    public static final boolean b0() {
        if (x7.a.c(e1.class)) {
            return false;
        }
        try {
            JSONObject jSONObjectD = D();
            if (jSONObjectD == null) {
                return false;
            }
            try {
                JSONArray jSONArray = jSONObjectD.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArray.getString(i10);
                    kotlin.jvm.internal.s.g(string, "options.getString(i)");
                    String lowerCase = string.toLowerCase();
                    kotlin.jvm.internal.s.g(lowerCase, "this as java.lang.String).toLowerCase()");
                    if (kotlin.jvm.internal.s.c(lowerCase, "ldu")) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                m0("FacebookSDK", "Failed to check data processing restriction", e10);
            }
            return false;
        } catch (Throwable th2) {
            x7.a.b(th2, e1.class);
            return false;
        }
    }

    private final void c(JSONObject jSONObject, b bVar, String str, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !d0(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (bVar.k()) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    public static final boolean c0(Uri uri) {
        return uri != null && bm.r.A("file", uri.getScheme(), true);
    }

    private final void d(JSONObject jSONObject, b bVar, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !d0(context)) {
            jSONObject.put("attribution", bVar.j());
        } else {
            if (bVar.k()) {
                return;
            }
            jSONObject.put("attribution", bVar.j());
        }
    }

    private final boolean d0(Context context) {
        Method methodM = M("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodM == null) {
            return false;
        }
        Object objV = V(null, methodM, context);
        return (objV instanceof Integer) && kotlin.jvm.internal.s.c(objV, 0);
    }

    public static final boolean e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return kotlin.jvm.internal.s.c(obj, obj2);
    }

    public static final boolean e0(String str) {
        return str == null || str.length() == 0;
    }

    public static final JSONObject f(String accessToken) {
        kotlin.jvm.internal.s.h(accessToken, "accessToken");
        JSONObject jSONObjectA = w0.a(accessToken);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        com.facebook.o0 o0VarK = f15201a.G(accessToken).k();
        if (o0VarK.b() != null) {
            return null;
        }
        return o0VarK.d();
    }

    public static final boolean f0(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static final Uri g(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        kotlin.jvm.internal.s.g(uriBuild, "builder.build()");
        return uriBuild;
    }

    public static final boolean g0(Uri uri) {
        if (uri != null) {
            return bm.r.A("http", uri.getScheme(), true) || bm.r.A("https", uri.getScheme(), true) || bm.r.A("fbstaging", uri.getScheme(), true);
        }
        return false;
    }

    private final void h(Context context, String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) bm.r.F0(cookie, new String[]{";"}, false, 0, 6, null).toArray(new String[0])) {
            String[] strArr = (String[]) bm.r.F0(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb2 = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = kotlin.jvm.internal.s.i(str3.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                sb2.append(str3.subSequence(i10, length + 1).toString());
                sb2.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb2.toString());
            }
        }
        cookieManager.flush();
    }

    public static final Set h0(JSONArray jsonArray) throws JSONException {
        kotlin.jvm.internal.s.h(jsonArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jsonArray.getString(i10);
            kotlin.jvm.internal.s.g(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final void i(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        try {
            e1 e1Var = f15201a;
            e1Var.h(context, "facebook.com");
            e1Var.h(context, ".facebook.com");
            e1Var.h(context, "https://facebook.com");
            e1Var.h(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final List i0(JSONArray jsonArray) {
        kotlin.jvm.internal.s.h(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jsonArray.getString(i10));
        }
        return arrayList;
    }

    public static final void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Map j0(String str) {
        kotlin.jvm.internal.s.h(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                kotlin.jvm.internal.s.g(key, "key");
                String string = jSONObject.getString(key);
                kotlin.jvm.internal.s.g(string, "jsonObject.getString(key)");
                map.put(key, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String k(String str, String str2) {
        return e0(str) ? str2 : str;
    }

    public static final void k0(String str, Exception exc) {
        if (!com.facebook.h0.H() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
    }

    private final long l(double d10) {
        return Math.round(d10 / 1.073741824E9d);
    }

    public static final void l0(String str, String str2) {
        if (!com.facebook.h0.H() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    public static final HashSet m(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jSONArray.getString(i10);
            kotlin.jvm.internal.s.g(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final void m0(String str, String str2, Throwable th2) {
        if (!com.facebook.h0.H() || e0(str)) {
            return;
        }
        Log.d(str, str2, th2);
    }

    public static final List n(JSONArray jsonArray) {
        kotlin.jvm.internal.s.h(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jsonArray.getString(i10);
                kotlin.jvm.internal.s.g(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final String n0(Map map) {
        kotlin.jvm.internal.s.h(map, "map");
        String string = "";
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
        }
        kotlin.jvm.internal.s.g(string, "{\n      try {\n        va…\n        \"\"\n      }\n    }");
        return string;
    }

    public static final Map o(JSONObject jsonObject) {
        kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    String string = jSONArrayNames.getString(i10);
                    kotlin.jvm.internal.s.g(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = o((JSONObject) value);
                    }
                    kotlin.jvm.internal.s.g(value, "value");
                    map.put(string, value);
                } catch (JSONException e10) {
                    m0("FacebookSDK", "Failed to convert JSONObject to HashMap", e10);
                }
            }
        }
        return map;
    }

    public static final String o0(String key) {
        kotlin.jvm.internal.s.h(key, "key");
        return f15201a.T(SameMD5.TAG, key);
    }

    public static final Map p(JSONObject jsonObject) {
        kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            String strOptString = jsonObject.optString(key);
            if (strOptString != null) {
                kotlin.jvm.internal.s.g(key, "key");
                map.put(key, strOptString);
            }
        }
        return map;
    }

    public static final boolean p0(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        return X(context);
    }

    public static final int q(InputStream inputStream, OutputStream outputStream) throws IOException {
        kotlin.jvm.internal.s.h(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byte[] bArr = new byte[8192];
            int i10 = 0;
            while (true) {
                int i11 = bufferedInputStream.read(bArr);
                if (i11 == -1) {
                    fl.g0 g0Var = fl.g0.f38750a;
                    ql.b.a(bufferedInputStream, null);
                    return i10;
                }
                outputStream.write(bArr, 0, i11);
                i10 += i11;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.b.a(bufferedInputStream, th2);
                throw th3;
            }
        }
    }

    public static final Bundle q0(String str) {
        Bundle bundle = new Bundle();
        if (!e0(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            for (String str2 : (String[]) bm.r.F0(str, new String[]{"&"}, false, 0, 6, null).toArray(new String[0])) {
                String[] strArr = (String[]) bm.r.F0(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], C.UTF8_NAME), URLDecoder.decode(strArr[1], C.UTF8_NAME));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], C.UTF8_NAME), "");
                    }
                } catch (UnsupportedEncodingException e10) {
                    k0("FacebookSDK", e10);
                }
            }
        }
        return bundle;
    }

    public static final void r(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final boolean r0(Bundle bundle, String str, Object obj) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
            return true;
        }
        if (!(obj instanceof JSONObject)) {
            return false;
        }
        bundle.putString(str, ((JSONObject) obj).toString());
        return true;
    }

    private final boolean s() {
        return kotlin.jvm.internal.s.c("mounted", Environment.getExternalStorageState());
    }

    public static final void s0(Bundle b10, String str, String str2) {
        kotlin.jvm.internal.s.h(b10, "b");
        if (e0(str2)) {
            return;
        }
        b10.putString(str, str2);
    }

    public static final String t(int i10) {
        String string = new BigInteger(i10 * 5, new SecureRandom()).toString(32);
        kotlin.jvm.internal.s.g(string, "BigInteger(length * 5, r).toString(32)");
        return string;
    }

    public static final void t0(Bundle b10, String str, Uri uri) {
        kotlin.jvm.internal.s.h(b10, "b");
        if (uri != null) {
            s0(b10, str, uri.toString());
        }
    }

    public static final String u(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        kotlin.jvm.internal.s.g(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static final Map u0(Parcel parcel) {
        kotlin.jvm.internal.s.h(parcel, "parcel");
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (string != null && string2 != null) {
                map.put(string, string2);
            }
        }
        return map;
    }

    public static final String v(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        try {
            String strO = com.facebook.h0.o();
            if (strO != null) {
                return strO;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i10);
            kotlin.jvm.internal.s.g(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String v0(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(inputStream));
        try {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    String string = sb2.toString();
                    ql.b.a(inputStreamReader, null);
                    kotlin.jvm.internal.s.g(string, "InputStreamReader(buffer…gBuilder.toString()\n    }");
                    return string;
                }
                sb2.append(cArr, 0, i10);
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.b.a(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static final String w() {
        Context contextM = com.facebook.h0.m();
        if (contextM == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = contextM.getPackageManager().getPackageInfo(contextM.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final Map w0(Parcel parcel) {
        kotlin.jvm.internal.s.h(parcel, "parcel");
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            map.put(parcel.readString(), parcel.readString());
        }
        return map;
    }

    private final void x0() {
        try {
            if (s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f15205e = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f15205e = l(f15205e);
        } catch (Exception unused) {
        }
    }

    public static final Date y(Bundle bundle, String str, Date dateBase) {
        long jLongValue;
        kotlin.jvm.internal.s.h(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                jLongValue = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return jLongValue == 0 ? new Date(Long.MAX_VALUE) : new Date(dateBase.getTime() + (jLongValue * 1000));
    }

    private final int y0() {
        if (f15202b > 0) {
            return f15202b;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: com.facebook.internal.d1
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return e1.z0(file, str);
                }
            });
            if (fileArrListFiles != null) {
                f15202b = fileArrListFiles.length;
            }
        } catch (Exception e10) {
            m0("FacebookSDK", "Failed to enumerate CPU cores", e10);
        }
        if (f15202b <= 0) {
            f15202b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f15202b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    public final String E() {
        return f15207g;
    }

    public final Locale J() {
        return f15210j;
    }

    public final String R() {
        return f15209i;
    }

    public final long x() {
        return f15205e;
    }

    public final String z() {
        return f15208h;
    }

    private final com.facebook.j0 G(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", N(C()));
        bundle.putString(KPtaxpyICj.WYcjosGYDgw, str);
        com.facebook.j0 j0VarY = com.facebook.j0.f15486n.y(null, null);
        j0VarY.G(bundle);
        j0VarY.F(com.facebook.p0.GET);
        return j0VarY;
    }
}
