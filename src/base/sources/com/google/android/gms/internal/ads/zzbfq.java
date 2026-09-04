package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbfq extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbfh zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzbfq() {
        zzbfh zzbfhVar = new zzbfh();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbfhVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbkh.zzd.zze()).intValue();
        this.zzg = ((Long) zzbkh.zza.zze()).intValue();
        this.zzh = ((Long) zzbkh.zze.zze()).intValue();
        this.zzi = ((Long) zzbkh.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzaG)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzaH)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzaI)).intValue();
        this.zze = ((Long) zzbkh.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzaK);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzaL)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzaM)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzaN)).getClass();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00f7 */
    /* JADX WARN: Code duplicated, block: B:64:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:64:0x00e8->B:73:0x00e8, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfq.run():void");
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void zzb(View view) {
        try {
            zzbfg zzbfgVar = new zzbfg(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZze = com.google.android.gms.ads.internal.zzt.zzg().zze();
            if (contextZze != null) {
                String str = this.zzm;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(contextZze.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzaJ), "id", contextZze.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzbfp zzbfpVarZzc = zzc(view, zzbfgVar);
            zzbfgVar.zzi();
            if (zzbfpVarZzc.zza == 0 && zzbfpVarZzc.zzb == 0) {
                return;
            }
            int i10 = zzbfpVarZzc.zzb;
            if (i10 == 0 && zzbfgVar.zzl() == 0) {
                return;
            }
            if (i10 == 0 && this.zzd.zza(zzbfgVar)) {
                return;
            }
            this.zzd.zzc(zzbfgVar);
        } catch (Exception e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception in fetchContentOnUIThread", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "ContentFetchTask.fetchContent");
        }
    }

    final zzbfp zzc(View view, zzbfg zzbfgVar) {
        if (view == null) {
            return new zzbfp(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbfp(this, 0, 0);
            }
            zzbfgVar.zzg(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbfp(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcku)) {
            WebView webView = (WebView) view;
            zzbfgVar.zze();
            webView.post(new zzbfo(this, zzbfgVar, webView, globalVisibleRect));
            return new zzbfp(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzbfp(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            zzbfp zzbfpVarZzc = zzc(viewGroup.getChildAt(i12), zzbfgVar);
            i10 += zzbfpVarZzc.zza;
            i11 += zzbfpVarZzc.zzb;
        }
        return new zzbfp(this, i10, i11);
    }

    final void zzd(zzbfg zzbfgVar, WebView webView, String str, boolean z10) {
        zzbfg zzbfgVar2;
        zzbfgVar.zzd();
        try {
            if (TextUtils.isEmpty(str)) {
                zzbfgVar2 = zzbfgVar;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzbfgVar2 = zzbfgVar;
                    zzbfgVar2.zzf(strOptString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb2.append(title);
                    sb2.append("\n");
                    sb2.append(strOptString);
                    zzbfgVar.zzf(sb2.toString(), z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzbfgVar2 = zzbfgVar;
                }
            }
            if (zzbfgVar2.zza()) {
                this.zzd.zzb(zzbfgVar2);
            }
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Json string may be malformed.");
        } catch (Throwable th2) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get webview content.", th2);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("ContentFetchThread: paused, pause = ");
            sb2.append(true);
            String string = sb2.toString();
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }
}
