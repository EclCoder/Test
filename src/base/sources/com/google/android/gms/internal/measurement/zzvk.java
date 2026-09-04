package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.b;
import com.google.common.util.concurrent.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzvk extends b {
    private zzvm zza;
    private final int zzb;

    /* synthetic */ zzvk(zzvm zzvmVar, int i10, byte[] bArr) {
        this.zza = zzvmVar;
        this.zzb = i10;
    }

    @Override // com.google.common.util.concurrent.b
    protected final void afterDone() {
        zzvl zzvlVar;
        zzvm zzvmVar = this.zza;
        this.zza = null;
        if (zzvmVar != null && zzvmVar.zze()) {
            do {
                zzvlVar = (zzvl) zzvmVar.zzg().get();
                if (zzvlVar == null) {
                    return;
                }
                if (zzvlVar.zza() > this.zzb) {
                    return;
                } else {
                    zzvlVar.cancel(true);
                }
            } while (!androidx.lifecycle.b.a(zzvmVar.zzg(), zzvlVar, null));
        }
    }

    @Override // com.google.common.util.concurrent.b
    protected final String pendingToString() {
        i iVarZza;
        zzvm zzvmVar = this.zza;
        if (zzvmVar == null || (iVarZza = zzvmVar.zzf().zza()) == null) {
            return null;
        }
        String string = iVarZza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 11);
        sb2.append("callable=[");
        sb2.append(string);
        sb2.append("]");
        String string2 = sb2.toString();
        zzvl zzvlVar = (zzvl) this.zza.zzg().get();
        if (zzvlVar == null) {
            return string2;
        }
        int length = string2.length();
        String string3 = zzvlVar.toString();
        StringBuilder sb3 = new StringBuilder(length + 9 + string3.length() + 1);
        sb3.append(string2);
        sb3.append(", trial=[");
        sb3.append(string3);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // com.google.common.util.concurrent.b
    protected final boolean setFuture(ListenableFuture listenableFuture) {
        return super.setFuture(listenableFuture);
    }
}
