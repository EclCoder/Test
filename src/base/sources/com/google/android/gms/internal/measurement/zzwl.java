package com.google.android.gms.internal.measurement;

import androidx.collection.u;
import com.google.common.collect.g0;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzwl {
    private static final zzwj zza = zzwj.zza(Boolean.class);
    private final zzwl zzb;
    private final u zzc;
    private boolean zzd = false;

    /* synthetic */ zzwl(zzwl zzwlVar, u uVar, byte[] bArr) {
        if (zzwlVar != null) {
            p.d(zzwlVar.zzd);
        }
        this.zzb = zzwlVar;
        this.zzc = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static zzwl zza(zzwl zzwlVar, zzwl zzwlVar2) {
        if (zzwlVar.zzc()) {
            return zzwlVar2;
        }
        if (zzwlVar2.zzc()) {
            return zzwlVar;
        }
        g0<zzwl> g0VarB = g0.B(zzwlVar, zzwlVar2);
        if (g0VarB.isEmpty()) {
            return zzwk.zza;
        }
        if (g0VarB.size() == 1) {
            return (zzwl) g0VarB.iterator().next();
        }
        int size = 0;
        for (zzwl zzwlVar3 : g0VarB) {
            do {
                size += zzwlVar3.zzc.size();
                zzwlVar3 = zzwlVar3.zzb;
            } while (zzwlVar3 != null);
        }
        if (size == 0) {
            return zzwk.zza;
        }
        u uVar = new u(size);
        for (zzwl zzwlVar4 : g0VarB) {
            do {
                int i10 = 0;
                while (true) {
                    u uVar2 = zzwlVar4.zzc;
                    if (i10 >= uVar2.size()) {
                        break;
                    }
                    p.j(uVar.put((zzwj) uVar2.i(i10), uVar2.m(i10)) == null, "Duplicate bindings: %s", uVar2.i(i10));
                    i10++;
                }
                zzwlVar4 = zzwlVar4.zzb;
            } while (zzwlVar4 != null);
        }
        return new zzwk(null, uVar, 0 == true ? 1 : 0).zzb();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanExtras<");
        for (zzwl zzwlVar = this; zzwlVar != null; zzwlVar = zzwlVar.zzb) {
            for (int i10 = 0; i10 < zzwlVar.zzc.size(); i10++) {
                sb2.append("[");
                sb2.append(this.zzc.m(i10));
                sb2.append("], ");
            }
        }
        sb2.append(">");
        return sb2.toString();
    }

    final zzwl zzb() {
        if (this.zzd) {
            throw new IllegalStateException("Already frozen");
        }
        this.zzd = true;
        zzwl zzwlVar = this.zzb;
        return (zzwlVar == null || !this.zzc.isEmpty()) ? this : zzwlVar;
    }

    public final boolean zzc() {
        return this == zzwk.zza;
    }

    final boolean zzd(zzwj zzwjVar) {
        if (this.zzc.containsKey(zzwjVar)) {
            return true;
        }
        zzwl zzwlVar = this.zzb;
        return zzwlVar != null && zzwlVar.zzd(zzwjVar);
    }

    final boolean zze() {
        return this.zzd;
    }

    final /* synthetic */ u zzg() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzd;
    }
}
