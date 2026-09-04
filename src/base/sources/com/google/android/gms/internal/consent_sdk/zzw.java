package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;
import rc.a;
import rc.c;
import rc.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzw {
    private final Application zza;
    private final Handler zzb;
    private final Executor zzc;
    private final zzaq zzd;
    private final zzbq zze;
    private final zzn zzf;
    private final zzz zzg;
    private final zze zzh;
    private final zzcr zzi;

    zzw(Application application, zzad zzadVar, Handler handler, Executor executor, zzaq zzaqVar, zzbq zzbqVar, zzn zznVar, zzz zzzVar, zze zzeVar, zzcr zzcrVar) {
        this.zza = application;
        this.zzb = handler;
        this.zzc = executor;
        this.zzd = zzaqVar;
        this.zze = zzbqVar;
        this.zzf = zznVar;
        this.zzg = zzzVar;
        this.zzh = zzeVar;
        this.zzi = zzcrVar;
    }

    public static /* synthetic */ void zza(final zzw zzwVar, Activity activity, d dVar, final c.b bVar, final c.a aVar) {
        try {
            a aVarA = dVar.a();
            if (aVarA == null || !aVarA.b()) {
                Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zzct.zza(zzwVar.zza) + "\") to set this as a debug device.");
            }
            final zzab zzabVarZzb = zzwVar.zzg.zzb(zzwVar.zzd(zzwVar.zzf.zzc(activity, dVar)));
            zzaq zzaqVar = zzwVar.zzd;
            zzaqVar.zzg(zzabVarZzb.zza);
            zzaqVar.zzi(zzabVarZzb.zzb);
            zzwVar.zze.zzd(zzabVarZzb.zzc);
            zzwVar.zzi.zzg(null);
            zzwVar.zzh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    zzw.zzb(this.zza, bVar, zzabVarZzb);
                }
            });
        } catch (zzg e10) {
            zzwVar.zzi.zzg("RequestConsentUpdate exception. Error: " + e10.getMessage() + ", cause: " + String.valueOf(e10.getCause()));
            zzwVar.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.onConsentInfoUpdateFailure(e10.zza());
                }
            });
        } catch (RuntimeException e11) {
            zzwVar.zzi.zzg("RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e11.getMessage())));
            final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e11))));
            zzwVar.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.onConsentInfoUpdateFailure(zzgVar.zza());
                }
            });
        }
    }

    public static /* synthetic */ void zzb(zzw zzwVar, final c.b bVar, zzab zzabVar) {
        Objects.requireNonNull(bVar);
        zzwVar.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
            @Override // java.lang.Runnable
            public final void run() {
                bVar.onConsentInfoUpdateSuccess();
            }
        });
        if (zzabVar.zzb != c.EnumC0792c.NOT_REQUIRED) {
            zzwVar.zze.zzc();
        }
    }

    private final zzcn zzd(zzcl zzclVar) throws zzg {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod(HttpMethods.POST);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), C.UTF8_NAME);
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = zzclVar.zza;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    String str2 = zzclVar.zzb;
                    if (str2 != null) {
                        jsonWriter.name("consent_syncing_id");
                        jsonWriter.value(str2);
                    }
                    zzch zzchVar = zzclVar.zzc;
                    if (zzchVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i10 = zzchVar.zzc;
                        if (i10 != 1) {
                            jsonWriter.name("os_type");
                            int i11 = i10 - 1;
                            if (i11 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i11 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str3 = zzchVar.zza;
                        if (str3 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str3);
                        }
                        Integer num = zzchVar.zzb;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str4 = zzclVar.zzd;
                    if (str4 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str4);
                    }
                    Boolean bool = zzclVar.zze;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = zzclVar.zzf;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    zzcj zzcjVar = zzclVar.zzg;
                    if (zzcjVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = zzcjVar.zza;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = zzcjVar.zzb;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d10 = zzcjVar.zzc;
                        if (d10 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d10);
                        }
                        List<zzci> list = zzcjVar.zzd;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (zzci zzciVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zzciVar.zza;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zzciVar.zzb;
                                if (num5 != null) {
                                    jsonWriter.name(TtmlNode.LEFT);
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zzciVar.zzc;
                                if (num6 != null) {
                                    jsonWriter.name(TtmlNode.RIGHT);
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zzciVar.zzd;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    zzcf zzcfVar = zzclVar.zzh;
                    if (zzcfVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str5 = zzcfVar.zza;
                        if (str5 != null) {
                            jsonWriter.name(CampaignEx.JSON_KEY_PACKAGE_NAME);
                            jsonWriter.value(str5);
                        }
                        String str6 = zzcfVar.zzb;
                        if (str6 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str6);
                        }
                        String str7 = zzcfVar.zzc;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    zzck zzckVar = zzclVar.zzi;
                    if (zzckVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str8 = zzckVar.zza;
                        if (str8 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str8);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = zzclVar.zzj;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch ((zzcg) it.next()) {
                                case DEBUG_PARAM_UNKNOWN:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case ALWAYS_SHOW:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case GEO_OVERRIDE_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case GEO_OVERRIDE_REGULATED_US_STATE:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case GEO_OVERRIDE_OTHER:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case GEO_OVERRIDE_NON_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case PREVIEWING_DEBUG_MESSAGES:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                                case GEO_OVERRIDE_USFL:
                                    jsonWriter.value("GEO_OVERRIDE_USFL");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzcn zzcnVarZza = zzcn.zza(new JsonReader(new StringReader(headerField)));
                        zzcnVarZza.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return zzcnVarZza;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), C.UTF8_NAME));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            zzcn zzcnVarZza2 = zzcn.zza(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return zzcnVarZza2;
                        } catch (Throwable th2) {
                            try {
                                jsonReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        jsonWriter.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                }
                throw th8;
            }
        } catch (SocketTimeoutException e10) {
            throw new zzg(4, "The server timed out.", e10);
        } catch (IOException e11) {
            throw new zzg(2, "Error making request.", e11);
        }
    }

    final void zzc(final Activity activity, final d dVar, final c.b bVar, final c.a aVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzv
            @Override // java.lang.Runnable
            public final void run() {
                zzw.zza(this.zza, activity, dVar, bVar, aVar);
            }
        });
    }
}
