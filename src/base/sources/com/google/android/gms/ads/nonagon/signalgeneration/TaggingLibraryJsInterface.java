package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbap;
import com.google.android.gms.internal.ads.zzbaq;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzcfr;
import com.google.android.gms.internal.ads.zzdzq;
import com.google.android.gms.internal.ads.zzflc;
import com.google.android.gms.internal.ads.zzfsc;
import com.google.android.gms.internal.ads.zzhcg;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzbap zzc;
    private final zzflc zzd;
    private final int zze;
    private final zzdzq zzf;
    private final boolean zzg;
    private final zzhcg zzh = zzcfr.zzf;
    private final zzfsc zzi;
    private final zzj zzj;
    private final zza zzk;
    private final zze zzl;

    TaggingLibraryJsInterface(WebView webView, zzbap zzbapVar, zzdzq zzdzqVar, zzfsc zzfscVar, zzflc zzflcVar, zzj zzjVar, zza zzaVar, zze zzeVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzbapVar;
        this.zzf = zzdzqVar;
        zzbiq.zza(context);
        this.zze = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkY)).intValue();
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkZ)).booleanValue();
        this.zzi = zzfscVar;
        this.zzd = zzflcVar;
        this.zzj = zzjVar;
        this.zzk = zzaVar;
        this.zzl = zzeVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            String strZzg = this.zzc.zzb().zzg(this.zza, str, this.zzb);
            if (!this.zzg) {
                return strZzg;
            }
            zzv.zze(this.zzf, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jCurrentTimeMillis)));
            return strZzg;
        } catch (RuntimeException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(final String str, int i10) {
        if (i10 <= 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 51);
            sb2.append("Invalid timeout for getting click signals. Timeout=");
            sb2.append(i10);
            String string = sb2.toString();
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
            return "";
        }
        try {
            return (String) zzcfr.zza.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i10, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals with timeout. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbf zzbfVar = new zzbf(this, string);
        if (((Boolean) zzbkv.zze.zze()).booleanValue()) {
            this.zzj.zzb(this.zzb, zzbfVar);
            return string;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzlb)).booleanValue()) {
            this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza(bundle, zzbfVar);
                }
            });
            return string;
        }
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbfVar);
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            String strZzj = this.zzc.zzb().zzj(this.zza, this.zzb, null);
            if (!this.zzg) {
                return strZzj;
            }
            zzv.zze(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jCurrentTimeMillis)));
            return strZzj;
        } catch (RuntimeException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzld)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcfr.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb(str);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i10;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i11 = jSONObject.getInt("x");
            int i12 = jSONObject.getInt("y");
            int i13 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i14 = jSONObject.getInt("type");
            if (i14 != 0) {
                i10 = 1;
                if (i14 != 1) {
                    i10 = 2;
                    if (i14 != 2) {
                        i10 = 3;
                        if (i14 != 3) {
                            i10 = -1;
                        }
                    }
                }
            } else {
                i10 = 0;
            }
            try {
                this.zzc.zzc(MotionEvent.obtain(0L, i13, i10, i11, i12, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e10) {
                e = e10;
                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (JSONException e11) {
                e = e11;
                int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e12) {
            e = e12;
        }
    }

    final /* synthetic */ void zza(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.util.zzz zzzVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.zza;
        CookieManager cookieManagerZza = zzzVarZzf.zza(context);
        bundle.putBoolean("accept_3p_cookie", cookieManagerZza != null ? cookieManagerZza.acceptThirdPartyCookies(this.zzb) : false);
        QueryInfo.generate(context, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    final /* synthetic */ void zzb(String str) {
        zzflc zzflcVar;
        Uri uriZzd = Uri.parse(str);
        try {
            uriZzd = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zznw)).booleanValue() || (zzflcVar = this.zzd) == null) ? this.zzc.zzd(uriZzd, this.zza, this.zzb, null) : zzflcVar.zza(uriZzd, this.zza, this.zzb, null);
        } catch (zzbaq e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to append the click signal to URL: ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzb(uriZzd.toString(), null, null, null);
    }

    final /* synthetic */ WebView zzc() {
        return this.zzb;
    }

    final /* synthetic */ zzhcg zzd() {
        return this.zzh;
    }

    final /* synthetic */ zza zze() {
        return this.zzk;
    }

    final /* synthetic */ zze zzf() {
        return this.zzl;
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 50);
            sb2.append("Invalid timeout for getting view signals. Timeout=");
            sb2.append(i10);
            String string = sb2.toString();
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
            return "";
        }
        try {
            return (String) zzcfr.zza.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbg
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i10, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals with timeout. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, HqKnbV.stA);
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }
}
