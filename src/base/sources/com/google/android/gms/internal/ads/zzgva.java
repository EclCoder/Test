package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgva extends zzguy implements ListIterator {
    final /* synthetic */ zzgvb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgva(zzgvb zzgvbVar) {
        super(zzgvbVar);
        Objects.requireNonNull(zzgvbVar);
        this.zzd = zzgvbVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzgvb zzgvbVar = this.zzd;
        boolean zIsEmpty = zzgvbVar.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzgvc zzgvcVar = zzgvbVar.zzf;
        zzgvcVar.zzq(zzgvcVar.zzp() + 1);
        if (zIsEmpty) {
            zzgvbVar.zzc();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgva(zzgvb zzgvbVar, int i10) {
        super(zzgvbVar, ((List) zzgvbVar.zzb).listIterator(i10));
        Objects.requireNonNull(zzgvbVar);
        this.zzd = zzgvbVar;
    }
}
