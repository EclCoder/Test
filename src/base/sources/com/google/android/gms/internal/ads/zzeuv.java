package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeuv implements zzfck {
    private final zzfck zza;
    private final zzfky zzb;
    private final Context zzc;
    private final zzcfd zzd;

    zzeuv(zzewy zzewyVar, zzfky zzfkyVar, Context context, zzcfd zzcfdVar) {
        this.zza = zzewyVar;
        this.zzb = zzfkyVar;
        this.zzc = context;
        this.zzd = zzcfdVar;
    }

    private static final int zzd(WindowInsets windowInsets, int i10) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private static final int zze(int i10, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i10 / f10);
    }

    private static final e0.b zzf(e0.b bVar, float f10) {
        return f10 == 0.0f ? e0.b.f36999e : e0.b.c((int) Math.ceil(bVar.f37000a / f10), (int) Math.ceil(bVar.f37001b / f10), (int) Math.ceil(bVar.f37002c / f10), (int) Math.ceil(bVar.f37003d / f10));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return zzhbw.zzk(this.zza.zza(), new zzgta() { // from class: com.google.android.gms.internal.ads.zzeuu
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((zzfct) obj);
            }
        }, zzcfr.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 com.google.android.gms.internal.ads.zzeuw, still in use, count: 4, list:
          (r3v1 com.google.android.gms.internal.ads.zzeuw) from 0x02d9: MOVE (r19v0 com.google.android.gms.internal.ads.zzeuw) = (r3v1 com.google.android.gms.internal.ads.zzeuw) (LINE:730)
          (r3v1 com.google.android.gms.internal.ads.zzeuw) from 0x01a5: MOVE (r19v4 com.google.android.gms.internal.ads.zzeuw) = (r3v1 com.google.android.gms.internal.ads.zzeuw) (LINE:422)
          (r3v1 com.google.android.gms.internal.ads.zzeuw) from 0x01ce: MOVE (r19v5 com.google.android.gms.internal.ads.zzeuw) = (r3v1 com.google.android.gms.internal.ads.zzeuw) (LINE:463)
          (r3v1 com.google.android.gms.internal.ads.zzeuw) from 0x0180: MOVE (r19v7 com.google.android.gms.internal.ads.zzeuw) = (r3v1 com.google.android.gms.internal.ads.zzeuw) (LINE:385)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    final /* synthetic */ com.google.android.gms.internal.ads.zzeuw zzc(com.google.android.gms.internal.ads.zzfct r22) {
        /*
            Method dump skipped, instruction units count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuv.zzc(com.google.android.gms.internal.ads.zzfct):com.google.android.gms.internal.ads.zzeuw");
    }
}
