package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzui {
    public final int zza;
    public final zzxk zzb;
    private final CopyOnWriteArrayList zzc;

    private zzui(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzxk zzxkVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzxkVar;
    }

    public final zzui zza(int i10, zzxk zzxkVar) {
        return new zzui(this.zzc, 0, zzxkVar);
    }

    public final void zzb(Handler handler, zzuj zzujVar) {
        this.zzc.add(new zzuh(handler, zzujVar));
    }

    public final void zzc(zzuj zzujVar) {
        CopyOnWriteArrayList<zzuh> copyOnWriteArrayList = this.zzc;
        for (zzuh zzuhVar : copyOnWriteArrayList) {
            if (zzuhVar.zza == zzujVar) {
                copyOnWriteArrayList.remove(zzuhVar);
            }
        }
    }

    public zzui() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
