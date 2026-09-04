package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbe {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbe zza(String str, double d10, double d11) {
        List list;
        int i10 = 0;
        while (true) {
            list = this.zza;
            if (i10 >= list.size()) {
                break;
            }
            double dDoubleValue = ((Double) this.zzc.get(i10)).doubleValue();
            double dDoubleValue2 = ((Double) this.zzb.get(i10)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            }
            i10++;
        }
        list.add(i10, str);
        this.zzc.add(i10, Double.valueOf(d10));
        this.zzb.add(i10, Double.valueOf(d11));
        return this;
    }

    public final zzbf zzb() {
        return new zzbf(this, null);
    }

    final /* synthetic */ List zzc() {
        return this.zza;
    }

    final /* synthetic */ List zzd() {
        return this.zzb;
    }

    final /* synthetic */ List zze() {
        return this.zzc;
    }
}
