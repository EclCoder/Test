package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjj;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjq;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzka;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzko;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzkw;
import com.google.android.gms.internal.play_billing.zzld;
import com.google.android.gms.internal.play_billing.zzlg;
import com.google.android.gms.internal.play_billing.zzlk;
import f8.Ygx.FuoITeVPeXAj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
final class y0 implements v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zzkg f10467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0 f10468c;

    y0(Context context, zzkg zzkgVar) {
        this.f10468c = new z0(context);
        this.f10467b = zzkgVar;
    }

    private final void o(zzjl zzjlVar, zzkg zzkgVar) {
        if (zzjlVar == null) {
            return;
        }
        try {
            zzku zzkuVarZza = zzkw.zza();
            zzkuVarZza.zzp(zzkgVar);
            zzkuVarZza.zza(zzjlVar);
            this.f10468c.a((zzkw) zzkuVarZza.zzi());
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    private final void p(zzjp zzjpVar, zzkg zzkgVar) {
        if (zzjpVar == null) {
            return;
        }
        try {
            zzku zzkuVarZza = zzkw.zza();
            zzkuVarZza.zzp(zzkgVar);
            zzkuVarZza.zzb(zzjpVar);
            this.f10468c.a((zzkw) zzkuVarZza.zzi());
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void a(zzlg zzlgVar) {
        try {
            z0 z0Var = this.f10468c;
            zzku zzkuVarZza = zzkw.zza();
            zzkuVarZza.zzp(this.f10467b);
            zzkuVarZza.zzq(zzlgVar);
            z0Var.a((zzkw) zzkuVarZza.zzi());
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void c(zzjp zzjpVar, long j10, boolean z10) {
        zzkg zzkgVar;
        try {
            zzjn zzjnVar = (zzjn) zzjpVar.zzq();
            zzko zzkoVar = (zzko) zzjpVar.zzc().zzq();
            zzkoVar.zza(z10);
            zzjnVar.zzc(zzkoVar);
            zzjp zzjpVar2 = (zzjp) zzjnVar.zzi();
            if (j10 == 0) {
                zzkgVar = this.f10467b;
            } else {
                zzke zzkeVar = (zzke) this.f10467b.zzq();
                zzkeVar.zze(j10);
                zzkgVar = (zzkg) zzkeVar.zzi();
            }
            p(zzjpVar2, zzkgVar);
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void d(zzlk zzlkVar) {
        if (zzlkVar == null) {
            return;
        }
        try {
            zzku zzkuVarZza = zzkw.zza();
            zzkuVarZza.zzp(this.f10467b);
            zzkuVarZza.zzr(zzlkVar);
            this.f10468c.a((zzkw) zzkuVarZza.zzi());
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void e(c cVar, long j10) {
        zzkg zzkgVar;
        try {
            zzka zzkaVarZza = zzkd.zza();
            zzkaVarZza.zze(4);
            zzkaVarZza.zza(zzjz.IN_APP_BILLING_RESULT_UPDATE_ACTION);
            if (cVar != null) {
                zzjq zzjqVarZza = zzju.zza();
                zzjqVarZza.zzp(cVar.c());
                zzjqVarZza.zzb(cVar.a());
                zzkaVarZza.zzb(zzjqVarZza);
            }
            zzku zzkuVarZza = zzkw.zza();
            if (j10 == 0) {
                zzkgVar = this.f10467b;
            } else {
                zzke zzkeVar = (zzke) this.f10467b.zzq();
                zzkeVar.zze(j10);
                zzkgVar = (zzkg) zzkeVar.zzi();
            }
            zzkuVarZza.zzp(zzkgVar);
            zzkuVarZza.zzd(zzkaVarZza);
            this.f10468c.a((zzkw) zzkuVarZza.zzi());
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void f(zzjl zzjlVar, int i10, long j10, boolean z10) {
        zzkg zzkgVar;
        try {
            zzke zzkeVar = (zzke) this.f10467b.zzq();
            zzkeVar.zzc(i10);
            this.f10467b = (zzkg) zzkeVar.zzi();
            zzjj zzjjVar = (zzjj) zzjlVar.zzq();
            zzko zzkoVar = (zzko) zzjlVar.zze().zzq();
            zzkoVar.zza(z10);
            zzjjVar.zzd(zzkoVar);
            zzjl zzjlVar2 = (zzjl) zzjjVar.zzi();
            if (j10 == 0) {
                zzkgVar = this.f10467b;
            } else {
                zzke zzkeVar2 = (zzke) this.f10467b.zzq();
                zzkeVar2.zze(j10);
                zzkgVar = (zzkg) zzkeVar2.zzi();
            }
            o(zzjlVar2, zzkgVar);
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void g(zzjp zzjpVar, int i10) {
        try {
            zzke zzkeVar = (zzke) this.f10467b.zzq();
            zzkeVar.zzc(i10);
            this.f10467b = (zzkg) zzkeVar.zzi();
            h(zzjpVar);
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void h(zzjp zzjpVar) {
        try {
            p(zzjpVar, this.f10467b);
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void i(zzjl zzjlVar, int i10, long j10) {
        try {
            zzke zzkeVar = (zzke) this.f10467b.zzq();
            zzkeVar.zzc(i10);
            zzkg zzkgVar = (zzkg) zzkeVar.zzi();
            this.f10467b = zzkgVar;
            if (j10 != 0) {
                zzke zzkeVar2 = (zzke) zzkgVar.zzq();
                zzkeVar2.zze(j10);
                zzkgVar = (zzkg) zzkeVar2.zzi();
            }
            o(zzjlVar, zzkgVar);
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void j(long j10) {
        zzkg zzkgVar;
        try {
            zzka zzkaVarZza = zzkd.zza();
            zzkaVarZza.zze(4);
            zzkaVarZza.zza(zzjz.PLAY_BILLING_ACTIVITY_CREATED_ACTION);
            zzkd zzkdVar = (zzkd) zzkaVarZza.zzi();
            zzku zzkuVarZza = zzkw.zza();
            if (j10 == 0) {
                zzkgVar = this.f10467b;
            } else {
                zzke zzkeVar = (zzke) this.f10467b.zzq();
                zzkeVar.zze(j10);
                zzkgVar = (zzkg) zzkeVar.zzi();
            }
            zzkuVarZza.zzp(zzkgVar);
            zzkuVarZza.zze(zzkdVar);
            this.f10468c.a((zzkw) zzkuVarZza.zzi());
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void k(zzld zzldVar) {
        try {
            zzku zzkuVarZza = zzkw.zza();
            zzkuVarZza.zzp(this.f10467b);
            zzka zzkaVarZza = zzkd.zza();
            zzkaVarZza.zzc("ProxyBillingBroadcastReceiver");
            zzkaVarZza.zze(2);
            zzkaVarZza.zzd(zzldVar);
            zzkuVarZza.zzd(zzkaVarZza);
            this.f10468c.a((zzkw) zzkuVarZza.zzi());
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void l(zzjl zzjlVar, int i10) {
        try {
            zzke zzkeVar = (zzke) this.f10467b.zzq();
            zzkeVar.zzc(i10);
            this.f10467b = (zzkg) zzkeVar.zzi();
            m(zzjlVar);
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void m(zzjl zzjlVar) {
        try {
            o(zzjlVar, this.f10467b);
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void n(zzjl zzjlVar, long j10, boolean z10) {
        zzkg zzkgVar;
        try {
            zzjj zzjjVar = (zzjj) zzjlVar.zzq();
            zzko zzkoVar = (zzko) zzjlVar.zze().zzq();
            zzkoVar.zza(z10);
            zzjjVar.zzd(zzkoVar);
            zzjl zzjlVar2 = (zzjl) zzjjVar.zzi();
            if (j10 == 0) {
                zzkgVar = this.f10467b;
            } else {
                zzke zzkeVar = (zzke) this.f10467b.zzq();
                zzkeVar.zze(j10);
                zzkgVar = (zzkg) zzkeVar.zzi();
            }
            o(zzjlVar2, zzkgVar);
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.v0
    public final void b(zzjx zzjxVar) {
        try {
            zzku zzkuVarZza = zzkw.zza();
            zzkuVarZza.zzp(this.f10467b);
            zzkuVarZza.zzc(zzjxVar);
            this.f10468c.a((zzkw) zzkuVarZza.zzi());
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", FuoITeVPeXAj.vglvyomlY, th2);
        }
    }
}
