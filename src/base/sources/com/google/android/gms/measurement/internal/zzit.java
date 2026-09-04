package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzit implements Callable {
    final /* synthetic */ zzbh zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjd zzc;

    zzit(zzjd zzjdVar, zzbh zzbhVar, String str) {
        this.zza = zzbhVar;
        this.zzb = str;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Throwable {
        zzlp zzlpVar;
        byte[] bArr;
        zzpg zzpgVar;
        zzpn zzpnVar;
        zzpg zzpgVar2;
        com.google.android.gms.internal.measurement.zzhz zzhzVar;
        Bundle bundle;
        String str;
        boolean z10;
        Object obj;
        long j10;
        zzbd zzbdVarZza;
        byte[] bArr2;
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzL().zzaa();
        zzlp zzlpVarZzn = zzjdVar.zzL().zzn();
        zzlpVarZzn.zzg();
        zzic zzicVar = zzlpVarZzn.zzu;
        zzic.zzL();
        zzbh zzbhVar = this.zza;
        Preconditions.checkNotNull(zzbhVar);
        String str2 = this.zzb;
        Preconditions.checkNotEmpty(str2);
        String str3 = zzbhVar.zza;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            zzlpVarZzn.zzu.zzaW().zzj().zzc("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        zzpg zzpgVar3 = zzlpVarZzn.zzg;
        com.google.android.gms.internal.measurement.zzhz zzhzVarZzi = com.google.android.gms.internal.measurement.zzib.zzi();
        zzpgVar3.zzj().zzb();
        try {
            zzh zzhVarZzu = zzpgVar3.zzj().zzu(str2);
            if (zzhVarZzu != null) {
                if (zzhVarZzu.zzD()) {
                    com.google.android.gms.internal.measurement.zzic zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                    zzicVarZzaE.zza(1);
                    zzicVarZzaE.zzC("android");
                    if (!TextUtils.isEmpty(zzhVarZzu.zzc())) {
                        zzicVarZzaE.zzL(zzhVarZzu.zzc());
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzv())) {
                        zzicVarZzaE.zzJ((String) Preconditions.checkNotNull(zzhVarZzu.zzv()));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzr())) {
                        zzicVarZzaE.zzM((String) Preconditions.checkNotNull(zzhVarZzu.zzr()));
                    }
                    if (zzhVarZzu.zzt() != -2147483648L) {
                        zzicVarZzaE.zzaj((int) zzhVarZzu.zzt());
                    }
                    zzicVarZzaE.zzN(zzhVarZzu.zzx());
                    zzicVarZzaE.zzar(zzhVarZzu.zzB());
                    String strZzf = zzhVarZzu.zzf();
                    if (!TextUtils.isEmpty(strZzf)) {
                        zzicVarZzaE.zzad(strZzf);
                    }
                    zzicVarZzaE.zzay(zzhVarZzu.zzak());
                    zzjl zzjlVarZzB = zzlpVarZzn.zzg.zzB(str2);
                    zzicVarZzaE.zzY(zzhVarZzu.zzz());
                    if (zzicVar.zzB() && zzlpVarZzn.zzu.zzc().zzC(zzicVarZzaE.zzK()) && zzjlVarZzB.zzo(zzjk.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzicVarZzaE.zzam(null);
                    }
                    zzicVarZzaE.zzat(zzjlVarZzB.zzk());
                    zzjk zzjkVar = zzjk.AD_STORAGE;
                    if (zzjlVarZzB.zzo(zzjkVar) && zzhVarZzu.zzac()) {
                        Pair pairZzd = (zzjlVarZzB.zzo(zzjkVar) && zzhVarZzu.zzac()) ? zzpgVar3.zzq().zzd(zzhVarZzu.zzc()) : new Pair("", Boolean.FALSE);
                        if (zzhVarZzu.zzac() && !TextUtils.isEmpty((CharSequence) pairZzd.first)) {
                            try {
                                zzicVarZzaE.zzQ(zzlp.zzc((String) pairZzd.first, Long.toString(zzbhVar.zzd)));
                                Object obj2 = pairZzd.second;
                                if (obj2 != null) {
                                    zzicVarZzaE.zzT(((Boolean) obj2).booleanValue());
                                }
                            } catch (SecurityException e10) {
                                zzlpVarZzn.zzu.zzaW().zzj().zzb("Resettable device id encryption failed", e10.getMessage());
                                bArr = new byte[0];
                                zzpgVar = zzlpVarZzn.zzg;
                                zzpgVar.zzj().zzd();
                                return bArr;
                            }
                        }
                    }
                    zzic zzicVar2 = zzlpVarZzn.zzu;
                    zzicVar2.zzu().zzw();
                    zzicVarZzaE.zzF(Build.MODEL);
                    zzicVar2.zzu().zzw();
                    zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                    zzicVarZzaE.zzI((int) zzicVar2.zzu().zzb());
                    zzicVarZzaE.zzH(zzicVar2.zzu().zzc());
                    try {
                        if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE) && zzhVarZzu.zzd() != null) {
                            zzicVarZzaE.zzW(zzlp.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbhVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                            zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                        }
                        String strZzc = zzhVarZzu.zzc();
                        zzpg zzpgVar4 = zzlpVarZzn.zzg;
                        List listZzn = zzpgVar4.zzj().zzn(strZzc);
                        Iterator it = listZzn.iterator();
                        do {
                            if (!it.hasNext()) {
                                zzpnVar = null;
                                break;
                            }
                            zzpnVar = (zzpn) it.next();
                        } while (!"_lte".equals(zzpnVar.zzc));
                        if (zzpnVar == null || zzpnVar.zze == null) {
                            zzpn zzpnVar2 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                            listZzn.add(zzpnVar2);
                            zzpgVar4.zzj().zzl(zzpnVar2);
                        }
                        com.google.android.gms.internal.measurement.zziu[] zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                        for (int i10 = 0; i10 < listZzn.size(); i10++) {
                            com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
                            zzitVarZzm.zzb(((zzpn) listZzn.get(i10)).zzc);
                            zzitVarZzm.zza(((zzpn) listZzn.get(i10)).zzd);
                            zzpgVar4.zzp().zzc(zzitVarZzm, ((zzpn) listZzn.get(i10)).zze);
                            zziuVarArr[i10] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbd();
                        }
                        zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                        zzpg zzpgVar5 = zzlpVarZzn.zzg;
                        zzpgVar5.zzI(zzhVarZzu, zzicVarZzaE);
                        zzpgVar5.zzJ(zzhVarZzu, zzicVarZzaE);
                        zzgv zzgvVarZza = zzgv.zza(zzbhVar);
                        zzic zzicVar3 = zzlpVarZzn.zzu;
                        zzpp zzppVarZzk = zzicVar3.zzk();
                        Bundle bundle2 = zzgvVarZza.zze;
                        zzppVarZzk.zzK(bundle2, zzpgVar4.zzj().zzV(str2));
                        zzicVar3.zzk().zzI(zzgvVarZza, zzicVar3.zzc().zzd(str2));
                        bundle2.putLong("_c", 1L);
                        zzicVar3.zzaW().zzj().zza("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        String str4 = zzbhVar.zzc;
                        bundle2.putString("_o", str4);
                        if (zzicVar3.zzk().zzad(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                            zzicVar3.zzk().zzO(bundle2, "_dbg", 1L);
                            zzicVar3.zzk().zzO(bundle2, "_r", 1L);
                        }
                        zzaw zzawVarZzj = zzpgVar4.zzj();
                        String str5 = zzbhVar.zza;
                        zzbd zzbdVarZzf = zzawVarZzj.zzf(str2, str5);
                        if (zzbdVarZzf == null) {
                            zzpgVar2 = zzpgVar5;
                            obj = null;
                            zzhzVar = zzhzVarZzi;
                            bundle = bundle2;
                            str = str4;
                            zzbdVarZza = new zzbd(str2, str5, 0L, 0L, 0L, zzbhVar.zzd, 0L, null, null, null, null);
                            z10 = true;
                            j10 = 0;
                        } else {
                            zzpgVar2 = zzpgVar5;
                            zzhzVar = zzhzVarZzi;
                            bundle = bundle2;
                            str = str4;
                            z10 = true;
                            obj = null;
                            j10 = zzbdVarZzf.zzf;
                            zzbdVarZza = zzbdVarZzf.zza(zzbhVar.zzd);
                        }
                        zzbd zzbdVar = zzbdVarZza;
                        zzpgVar4.zzj().zzh(zzbdVar);
                        boolean z11 = z10;
                        long j11 = j10;
                        zzic zzicVar4 = zzlpVarZzn.zzu;
                        long j12 = zzbhVar.zzd;
                        zzpg zzpgVar6 = zzpgVar2;
                        com.google.android.gms.internal.measurement.zzhz zzhzVar2 = zzhzVar;
                        try {
                            zzbc zzbcVar = new zzbc(zzicVar4, str, str2, str5, j12, 0L, j11, bundle);
                            com.google.android.gms.internal.measurement.zzhr zzhrVarZzp = com.google.android.gms.internal.measurement.zzhs.zzp();
                            zzhrVarZzp.zzo(zzbcVar.zzd);
                            zzhrVarZzp.zzl(zzbcVar.zzb);
                            zzhrVarZzp.zzq(zzbcVar.zzf);
                            zzbf zzbfVar = zzbcVar.zzg;
                            zzbe zzbeVar = new zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                String next = zzbeVar.next();
                                com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next);
                                Object objZza = zzbfVar.zza(next);
                                if (objZza != null) {
                                    zzpgVar4.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzp.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzp);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza.zzb(zzbdVar.zzc);
                            zzhtVarZza.zza(str5);
                            zzieVarZza.zza(zzhtVarZza);
                            zzicVarZzaE.zzap(zzieVarZza);
                            zzicVarZzaE.zzaf(zzpgVar4.zzm().zzb(zzhVarZzu.zzc(), Collections.EMPTY_LIST, zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzp.zzn()), Long.valueOf(zzhrVarZzp.zzn()), false));
                            if (zzhrVarZzp.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzp.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzp.zzn());
                            }
                            long jZzp = zzhVarZzu.zzp();
                            if (jZzp != 0) {
                                zzicVarZzaE.zzA(jZzp);
                            }
                            long jZzn = zzhVarZzu.zzn();
                            if (jZzn != 0) {
                                zzicVarZzaE.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarZzaE.zzy(jZzp);
                            }
                            String strZzh = zzhVarZzu.zzh();
                            zzair.zza();
                            if (zzicVar3.zzc().zzp(str2, zzfy.zzaM) && strZzh != null) {
                                zzicVarZzaE.zzau(strZzh);
                            }
                            zzhVarZzu.zzL();
                            zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                            zzicVar3.zzc().zzi();
                            zzicVarZzaE.zzO(161000L);
                            zzicVarZzaE.zzs(zzicVar3.zzba().currentTimeMillis());
                            zzicVarZzaE.zzae(z11);
                            zzpgVar6.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVar2.zze(zzicVarZzaE);
                            zzhVarZzu.zzo(zzicVarZzaE.zzu());
                            zzhVarZzu.zzq(zzicVarZzaE.zzw());
                            zzpgVar4.zzj().zzv(zzhVarZzu, false, false);
                            zzpgVar4.zzj().zzc();
                            zzpgVar4.zzj().zzd();
                            try {
                                return zzpgVar4.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar2.zzbd()).zzcd());
                            } catch (IOException e11) {
                                zzlpVarZzn.zzu.zzaW().zzb().zzc("Data loss. Failed to bundle and serialize. appId", zzgu.zzl(str2), e11);
                                return obj;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            zzlpVar = zzlpVarZzn;
                        }
                    } catch (SecurityException e12) {
                        zzlpVar = zzlpVarZzn;
                        try {
                            zzlpVar.zzu.zzaW().zzj().zzb("app instance id encryption failed", e12.getMessage());
                            bArr = new byte[0];
                            zzpgVar = zzlpVar.zzg;
                            zzpgVar.zzj().zzd();
                            return bArr;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } else {
                    zzlpVarZzn.zzu.zzaW().zzj().zzb("Log and bundle disabled. package_name", str2);
                    bArr2 = new byte[0];
                }
                zzlpVar.zzg.zzj().zzd();
                throw th;
            }
            zzlpVarZzn.zzu.zzaW().zzj().zzb("Log and bundle not available. package_name", str2);
            bArr2 = new byte[0];
            zzpgVar3.zzj().zzd();
            return bArr2;
        } catch (Throwable th4) {
            th = th4;
            zzlpVar = zzlpVarZzn;
        }
    }
}
