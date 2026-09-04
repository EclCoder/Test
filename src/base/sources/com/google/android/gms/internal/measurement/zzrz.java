package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.common.collect.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzrz {
    private final String zza;
    private String zzb = "files";
    private String zzc = "common";
    private final Account zzd = zzsa.zza;
    private String zze = "";
    private final c0.a zzf = c0.r();

    /* synthetic */ zzrz(Context context, byte[] bArr) {
        zzsq.zza(context != null, "Context cannot be null", new Object[0]);
        this.zza = context.getPackageName();
    }

    public final zzrz zza() {
        zzsa.zzb("directboot-files");
        this.zzb = "directboot-files";
        return this;
    }

    public final zzrz zzb(String str) {
        zzsa.zzc(str);
        this.zzc = str;
        return this;
    }

    public final zzrz zzc(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        int i10 = zzsa.zzb;
        this.zze = str;
        return this;
    }

    public final Uri zzd() {
        String string;
        String str = this.zzb;
        String str2 = this.zzc;
        Account account = zzrv.zza;
        Account account2 = this.zzd;
        zzsq.zza(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        zzsq.zza(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        zzsq.zza(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (zzrv.zza.equals(account2)) {
            string = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append(":");
            sb2.append(str4);
            string = sb2.toString();
        }
        String str5 = this.zze;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length() + 1 + string.length() + 1 + String.valueOf(str5).length());
        sb3.append("/");
        sb3.append(str);
        sb3.append("/");
        sb3.append(str2);
        sb3.append("/");
        sb3.append(string);
        sb3.append("/");
        sb3.append(str5);
        return new Uri.Builder().scheme("android").authority(this.zza).path(sb3.toString()).encodedFragment(zzsp.zzb(this.zzf.m())).build();
    }
}
