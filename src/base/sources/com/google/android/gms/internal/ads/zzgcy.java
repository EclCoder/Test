package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgcy {
    private final zzgff zza;
    private final zzggc zzb;
    private final zzgpc zzc;
    private final zzgqh zzd;
    private final zzgel zze;
    private final long zzf;
    private final zzimo zzg;
    private final long zzh;
    private final long zzi = System.currentTimeMillis();
    private final boolean zzj;
    private final long zzk;

    zzgcy(zzgff zzgffVar, zzggc zzggcVar, zzgpc zzgpcVar, zzgqh zzgqhVar, zzgel zzgelVar, zzimo zzimoVar, zzgdf zzgdfVar) {
        this.zza = zzgffVar;
        this.zzb = zzggcVar;
        this.zzc = zzgpcVar;
        this.zzd = zzgqhVar;
        this.zze = zzgelVar;
        this.zzf = zzgdfVar.zzj();
        this.zzg = zzimoVar;
        this.zzh = zzgdfVar.zzi();
        this.zzj = zzgdfVar.zzs();
        this.zzk = zzgdfVar.zzr();
    }

    public final ListenableFuture zza() {
        return this.zza.zza();
    }

    public final String zzb(final Context context) {
        String string;
        boolean z10 = false;
        if (this.zzj) {
            if (System.currentTimeMillis() - this.zzi <= this.zzk) {
                z10 = true;
            }
        }
        zzgqf zzgqfVarZza = this.zzd.zza(3);
        try {
            try {
                try {
                    zzgqfVarZza.zza();
                    string = (String) zzhbw.zzj(this.zza.zzb(), new zzhbe() { // from class: com.google.android.gms.internal.ads.zzgcx
                        @Override // com.google.android.gms.internal.ads.zzhbe
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzg(context, (Void) obj);
                        }
                    }, zzhcn.zza()).get(z10 ? this.zzh : this.zzf, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    if (z10) {
                        string = ((zzgje) this.zzg.zzb()).zza(true, this.zzi);
                    } else {
                        this.zzd.zzb(56);
                        string = Integer.toString(17);
                    }
                } catch (Throwable th2) {
                    zzgqfVarZza.zzb(th2);
                    throw th2;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                zzgqfVarZza.zzb(e10);
                string = "";
            } catch (ExecutionException e11) {
                e = e11;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                zzgqfVarZza.zzb(e);
                string = Integer.toString(3);
            }
            zzgqfVarZza.zzc();
            this.zze.zzb();
            return string;
        } catch (Throwable th3) {
            zzgqfVarZza.zzc();
            this.zze.zzb();
            throw th3;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x007e: IGET (r9 I:com.google.android.gms.internal.ads.zzgel) = (r2 I:com.google.android.gms.internal.ads.zzgcy) (LINE:127) com.google.android.gms.internal.ads.zzgcy.zze com.google.android.gms.internal.ads.zzgel, block:B:32:0x007b */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzgcy] */
    public final String zzc(final Context context, String str, final View view, final Activity activity) {
        final zzgcy zzgcyVar;
        ?? r10;
        String string;
        zzgqf zzgqfVarZza = this.zzd.zza(4);
        try {
            try {
                zzgqfVarZza.zza();
                final String str2 = null;
                zzgcyVar = this;
                try {
                    string = (String) zzhbw.zzj(this.zza.zzb(), new zzhbe(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgcv
                        private final /* synthetic */ Context zzb;
                        private final /* synthetic */ View zzc;
                        private final /* synthetic */ Activity zzd;

                        {
                            this.zzc = view;
                            this.zzd = activity;
                        }

                        @Override // com.google.android.gms.internal.ads.zzhbe
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzh(this.zzb, null, this.zzc, this.zzd, (Void) obj);
                        }
                    }, zzhcn.zza()).get(zzgcyVar.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    e = e10;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgqfVarZza.zzb(interruptedException);
                    string = "";
                } catch (ExecutionException e11) {
                    e = e11;
                    Throwable th2 = e;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    zzgqfVarZza.zzb(th2);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    zzgcyVar.zzd.zzb(57);
                    string = Integer.toString(17);
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    zzgqfVarZza.zzb(th4);
                    throw th4;
                }
            } catch (Throwable th5) {
                zzgqfVarZza.zzc();
                r10.zze.zzb();
                throw th5;
            }
        } catch (InterruptedException e12) {
            e = e12;
            zzgcyVar = this;
        } catch (ExecutionException e13) {
            e = e13;
            zzgcyVar = this;
        } catch (TimeoutException unused2) {
            zzgcyVar = this;
        } catch (Throwable th6) {
            th = th6;
        }
        zzgqfVarZza.zzc();
        zzgcyVar.zze.zzb();
        return string;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x007e: IGET (r9 I:com.google.android.gms.internal.ads.zzgel) = (r2 I:com.google.android.gms.internal.ads.zzgcy) (LINE:127) com.google.android.gms.internal.ads.zzgcy.zze com.google.android.gms.internal.ads.zzgel, block:B:32:0x007b */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzgcy] */
    public final String zzd(final Context context, final String str, final View view, Activity activity) {
        final zzgcy zzgcyVar;
        ?? r10;
        String string;
        zzgqf zzgqfVarZza = this.zzd.zza(5);
        try {
            try {
                zzgqfVarZza.zza();
                final Activity activity2 = null;
                zzgcyVar = this;
                try {
                    string = (String) zzhbw.zzj(this.zza.zzb(), new zzhbe(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgcw
                        private final /* synthetic */ Context zzb;
                        private final /* synthetic */ String zzc;
                        private final /* synthetic */ View zzd;

                        @Override // com.google.android.gms.internal.ads.zzhbe
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzi(this.zzb, this.zzc, this.zzd, null, (Void) obj);
                        }
                    }, zzhcn.zza()).get(zzgcyVar.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    e = e10;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgqfVarZza.zzb(interruptedException);
                    string = "";
                } catch (ExecutionException e11) {
                    e = e11;
                    Throwable th2 = e;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    zzgqfVarZza.zzb(th2);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    zzgcyVar.zzd.zzb(58);
                    string = Integer.toString(17);
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    zzgqfVarZza.zzb(th4);
                    throw th4;
                }
            } catch (Throwable th5) {
                zzgqfVarZza.zzc();
                r10.zze.zzb();
                throw th5;
            }
        } catch (InterruptedException e12) {
            e = e12;
            zzgcyVar = this;
        } catch (ExecutionException e13) {
            e = e13;
            zzgcyVar = this;
        } catch (TimeoutException unused2) {
            zzgcyVar = this;
        } catch (Throwable th6) {
            th = th6;
        }
        zzgqfVarZza.zzc();
        zzgcyVar.zze.zzb();
        return string;
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    final /* synthetic */ ListenableFuture zzg(Context context, Void r10) {
        return this.zzb.zzb(context);
    }

    final /* synthetic */ ListenableFuture zzh(Context context, String str, View view, Activity activity, Void r10) {
        return this.zzb.zzc(context, null, view, activity);
    }

    final /* synthetic */ ListenableFuture zzi(Context context, String str, View view, Activity activity, Void r10) {
        return this.zzb.zzd(context, str, view, null);
    }

    public final int zzj() {
        return this.zzb.zzh();
    }
}
