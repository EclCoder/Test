package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgd extends com.google.android.gms.internal.measurement.zzbm implements zzge {
    public zzgd() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
        zze(arrayListCreateTypedArrayList);
        return true;
    }
}
