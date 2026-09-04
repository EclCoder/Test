package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import sc.m;
import sc.p;
import sc.x;
import sc.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzlj {
    private Context zza;
    private x zzb;
    private x zzc;
    private x zzd;
    private x zze;
    private x zzf;

    private zzlj() {
        throw null;
    }

    public final zzlj zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzlk zzb() {
        p.o(this.zza);
        if (this.zzb == null) {
            this.zzb = zzlk.zzf;
        }
        if (this.zzc == null) {
            final Context context = this.zza;
            int i10 = zzlk.zza;
            this.zzc = y.a(new x() { // from class: com.google.android.gms.internal.measurement.zzln
                @Override // sc.x
                public final /* synthetic */ Object get() {
                    int i11 = zzlk.zza;
                    return new zzmn(zzjx.zza(context));
                }
            });
        }
        if (this.zzd == null) {
            this.zzd = new x() { // from class: com.google.android.gms.internal.measurement.zzli
                @Override // sc.x
                public final /* synthetic */ Object get() {
                    return this.zza.zzc();
                }
            };
        }
        if (this.zze == null) {
            Context context2 = this.zza;
            int i11 = zzlk.zza;
            final ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, zzrx.zza(context2).zza(), new zzsd());
            this.zze = y.a(new x() { // from class: com.google.android.gms.internal.measurement.zzlm
                @Override // sc.x
                public final /* synthetic */ Object get() {
                    int i12 = zzlk.zza;
                    return new zzru(arrayList);
                }
            });
        }
        if (this.zzf == null) {
            this.zzf = new x() { // from class: com.google.android.gms.internal.measurement.zzlh
                @Override // sc.x
                public final /* synthetic */ Object get() {
                    return this.zza.zzd();
                }
            };
        }
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }

    final /* synthetic */ m zzc() {
        return m.i(new zzqi(this.zzb, 10));
    }

    final /* synthetic */ m zzd() {
        Context context = this.zza;
        int i10 = zzlk.zza;
        try {
            return m.i(context.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
        } catch (PackageManager.NameNotFoundException unused) {
            return m.d();
        }
    }

    /* synthetic */ zzlj(byte[] bArr) {
    }
}
