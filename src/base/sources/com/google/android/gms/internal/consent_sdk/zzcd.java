package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcd implements zzd {
    private final Application zza;
    private final zzbz zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzao zzf;
    private final zzbe zzg;
    private final zzaq zzh;

    zzcd(Application application, zzbz zzbzVar, Handler handler, Executor executor, zze zzeVar, zzao zzaoVar, zzbe zzbeVar, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzbzVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzaoVar;
        this.zzg = zzbeVar;
        this.zzh = zzaqVar;
    }

    public static /* synthetic */ void zzc(zzcd zzcdVar) {
        JSONObject jSONObject = new JSONObject();
        Application application = zzcdVar.zza;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            String strConcat = null;
            if (applicationIcon != null && applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", strConcat);
            JSONObject jSONObject2 = new JSONObject();
            zzaq zzaqVar = zzcdVar.zzh;
            for (String str : zzaqVar.zzc().keySet()) {
                jSONObject2.put(str, zzaqVar.zzc().get(str));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        zzcdVar.zzg.zzc().zzd("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    private final void zzg(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri uri = Uri.parse(strOptString);
        if (uri.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(strOptString)));
        }
        try {
            this.zzb.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e10) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(strOptString)), e10);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        final Handler handler = this.zzc;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzcb
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(String str, JSONObject jSONObject) {
        int i10;
        switch (str) {
            case "load_complete":
                this.zzg.zzi();
                return true;
            case "configure_app_assets":
                zzd();
                return true;
            case "browser":
                zzg(jSONObject);
                return true;
            case "dismiss":
                switch (jSONObject.optString(NotificationCompat.CATEGORY_STATUS)) {
                    case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                    case "personalized":
                    case "CONSENT_SIGNAL_SUFFICIENT":
                    case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                    case "non_personalized":
                        i10 = 3;
                        this.zzg.zzg(i10);
                    case "CONSENT_SIGNAL_NOT_REQUIRED":
                        i10 = 1;
                        this.zzg.zzg(i10);
                    default:
                        this.zzg.zzh(new zzg(1, "We are getting something wrong with the webview."));
                }
            default:
                return false;
        }
    }

    public final void zzd() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzcc
            @Override // java.lang.Runnable
            public final void run() {
                zzcd.zzc(this.zza);
            }
        });
    }

    final void zzf(int i10, String str, String str2) {
        this.zzg.zzj(new zzg(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i10), str2, str)));
    }

    final void zze(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        this.zze.zzb(uri.getQueryParameter(lkCBSIFlvmyGX.tskHjwtTRU), uri.getQueryParameter("args"), this, this.zzf);
    }
}
