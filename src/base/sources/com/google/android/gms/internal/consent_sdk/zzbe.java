package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n0.e1;
import rc.b;
import rc.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbe implements b {
    private final Application zzc;
    private final zzbz zzd;
    private final zzaq zze;
    private final zzbs zzf;
    private final zztm zzg;
    private final zzcr zzh;
    private Dialog zzi;
    private zzbx zzj;
    private final AtomicBoolean zzk = new AtomicBoolean();
    private final AtomicReference zzl = new AtomicReference();
    private final AtomicReference zzm = new AtomicReference();
    private final AtomicReference zzn = new AtomicReference();
    boolean zza = false;
    boolean zzb = false;

    zzbe(Application application, zzad zzadVar, zzbz zzbzVar, zzaq zzaqVar, zzbs zzbsVar, zztm zztmVar, zzcr zzcrVar) {
        this.zzc = application;
        this.zzd = zzbzVar;
        this.zze = zzaqVar;
        this.zzf = zzbsVar;
        this.zzg = zztmVar;
        this.zzh = zzcrVar;
    }

    private final void zzk() {
        Dialog dialog = this.zzi;
        if (dialog != null) {
            dialog.dismiss();
            this.zzi = null;
        }
        this.zzd.zza(null);
        zzbb zzbbVar = (zzbb) this.zzn.getAndSet(null);
        if (zzbbVar != null) {
            zzbbVar.zzb();
        }
    }

    private final void zzl(zzg zzgVar) {
        if (this.zza) {
            return;
        }
        String message = zzgVar == null ? null : zzgVar.getMessage();
        if (this.zzb) {
            this.zzh.zzb(message);
        } else {
            this.zzh.zze(message);
        }
    }

    @Override // rc.b
    public final void show(Activity activity, b.a aVar) {
        zzcz.zza();
        this.zzh.zzf();
        if (!this.zzk.compareAndSet(false, true)) {
            zzg zzgVar = new zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            zzl(zzgVar);
            aVar.a(zzgVar.zza());
            return;
        }
        this.zzj.zzc();
        zzbb zzbbVar = new zzbb(this, activity);
        this.zzc.registerActivityLifecycleCallbacks(zzbbVar);
        this.zzn.set(zzbbVar);
        this.zzd.zza(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzj);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            zzg zzgVar2 = new zzg(3, "Activity with null windows is passed in.");
            zzl(zzgVar2);
            aVar.a(zzgVar2.zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(C.DEFAULT_MUXED_BUFFER_SIZE, C.DEFAULT_MUXED_BUFFER_SIZE);
        e1.b(window, false);
        this.zzm.set(aVar);
        dialog.show();
        this.zzi = dialog;
        this.zzj.zzd("UMP_messagePresented", "");
        zzl(null);
    }

    final zzbx zzc() {
        return this.zzj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzf(f.b bVar, f.a aVar) {
        this.zzj = ((zzby) this.zzg).zzb();
        if (!this.zza) {
            this.zzh.zzi();
        }
        zzbx zzbxVar = this.zzj;
        zzbxVar.setBackgroundColor(0);
        zzbxVar.getSettings().setJavaScriptEnabled(true);
        zzbxVar.getSettings().setAllowFileAccess(false);
        zzbxVar.getSettings().setAllowContentAccess(false);
        Object[] objArr = 0;
        zzbxVar.setWebViewClient(new zzbv(zzbxVar, null));
        if (!this.zza) {
            this.zzh.zzj();
        }
        this.zzl.set(new zzbc(bVar, aVar, objArr == true ? 1 : 0));
        zzbx zzbxVar2 = this.zzj;
        zzbs zzbsVar = this.zzf;
        zzbxVar2.loadDataWithBaseURL(zzbsVar.zza(), zzbsVar.zzb(), "text/html", C.UTF8_NAME, null);
        zzcz.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzba
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    final void zzg(int i10) {
        zzk();
        b.a aVar = (b.a) this.zzm.getAndSet(null);
        if (aVar == null) {
            return;
        }
        this.zze.zzg(i10);
        aVar.a(null);
    }

    final void zzh(zzg zzgVar) {
        zzk();
        b.a aVar = (b.a) this.zzm.getAndSet(null);
        if (aVar == null) {
            return;
        }
        zzl(zzgVar);
        aVar.a(zzgVar.zza());
    }

    final void zzi() {
        zzbc zzbcVar = (zzbc) this.zzl.getAndSet(null);
        if (zzbcVar == null) {
            return;
        }
        if (!this.zza && !this.zzb) {
            this.zzh.zzd(null);
        }
        zzbcVar.onConsentFormLoadSuccess(this);
    }

    final void zzj(zzg zzgVar) {
        zzbc zzbcVar = (zzbc) this.zzl.getAndSet(null);
        if (zzbcVar == null) {
            return;
        }
        if (!this.zza) {
            String message = zzgVar.getMessage();
            if (this.zzb) {
                this.zzh.zzb(message);
            } else {
                this.zzh.zzd(message);
            }
        }
        zzbcVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
