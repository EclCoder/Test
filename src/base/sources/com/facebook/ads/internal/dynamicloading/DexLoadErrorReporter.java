package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tn.xQIL.Saucuwx;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f14879a = new AtomicBoolean();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f14880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14881b;

        a(Context context, String str) {
            this.f14880a = context;
            this.f14881b = str;
        }

        /* JADX WARN: Code duplicated, block: B:71:0x0177 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x016d A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            DataOutputStream dataOutputStream;
            InputStream inputStream;
            HttpURLConnection httpURLConnection;
            String str = NpmRNZ.WhWjRbzZ;
            super.run();
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL("https://www.facebook.com/adnw_logging/").openConnection();
                try {
                    httpURLConnection2.setRequestMethod(HttpMethods.POST);
                    httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                    httpURLConnection2.setRequestProperty("Accept", "application/json");
                    httpURLConnection2.setRequestProperty(Saucuwx.GmLgA, C.UTF8_NAME);
                    httpURLConnection2.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.connect();
                    String string = UUID.randomUUID().toString();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("attempt", MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    DexLoadErrorReporter.b(this.f14880a, jSONObject, string);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("subtype", "generic");
                    jSONObject2.put("subtype_code", "1320");
                    jSONObject2.put("caught_exception", "1");
                    jSONObject2.put("stacktrace", this.f14881b);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", UUID.randomUUID().toString());
                    jSONObject3.put("type", "debug");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    httpURLConnection = httpURLConnection2;
                    try {
                        sb2.append(System.currentTimeMillis() / 1000);
                        jSONObject3.put("session_time", sb2.toString());
                        jSONObject3.put("time", "" + (System.currentTimeMillis() / 1000));
                        jSONObject3.put("session_id", string);
                        jSONObject3.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        jSONObject3.put("attempt", MBridgeConstans.ENDCARD_URL_TYPE_PL);
                        DexLoadErrorReporter.b(this.f14880a, jSONObject2, string);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(jSONObject3);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
                        jSONObject4.put("events", jSONArray);
                        String string2 = jSONObject4.toString();
                        DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                        try {
                            dataOutputStream2.writeBytes("payload=" + URLEncoder.encode(string2, C.UTF8_NAME));
                            dataOutputStream2.flush();
                            byte[] bArr = new byte[16384];
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            InputStream inputStream2 = httpURLConnection.getInputStream();
                            while (true) {
                                try {
                                    int i10 = inputStream2.read(bArr);
                                    if (i10 == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i10);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStream = inputStream2;
                                    dataOutputStream = dataOutputStream2;
                                    try {
                                        Log.e(str, "Can't send error.", th);
                                    } finally {
                                        if (dataOutputStream != null) {
                                            try {
                                                dataOutputStream.close();
                                            } catch (Exception e10) {
                                                Log.e(str, "Can't close connection.", e10);
                                            }
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception e11) {
                                                Log.e(str, "Can't close connection.", e11);
                                            }
                                        }
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                    }
                                }
                            }
                            byteArrayOutputStream.flush();
                            try {
                                dataOutputStream2.close();
                            } catch (Exception e12) {
                                Log.e(str, "Can't close connection.", e12);
                            }
                            try {
                                inputStream2.close();
                            } catch (Exception e13) {
                                Log.e(str, "Can't close connection.", e13);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            dataOutputStream = dataOutputStream2;
                            inputStream = null;
                            Log.e(str, "Can't send error.", th);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        dataOutputStream = null;
                        inputStream = null;
                        Log.e(str, "Can't send error.", th);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection = httpURLConnection2;
                }
            } catch (Throwable th6) {
                th = th6;
                dataOutputStream = null;
                inputStream = null;
                httpURLConnection = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }

    public static void reportDexLoadingIssue(Context context, String str, double d10) {
        AtomicBoolean atomicBoolean = f14879a;
        if (atomicBoolean.get() || Math.random() >= d10) {
            return;
        }
        atomicBoolean.set(true);
        new a(context, str).start();
    }
}
