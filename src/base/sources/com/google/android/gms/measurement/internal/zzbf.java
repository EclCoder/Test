package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbf extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbf> CREATOR = new zzbg();
    private final Bundle zza;

    zzbf(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzbe(this);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzf(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final Object zza(String str) {
        return this.zza.get(str);
    }

    final Long zzb(String str) {
        return Long.valueOf(this.zza.getLong(str));
    }

    final Double zzc(String str) {
        return Double.valueOf(this.zza.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    final String zzd(String str) {
        return this.zza.getString(str);
    }

    public final int zze() {
        return this.zza.size();
    }

    public final Bundle zzf() {
        return new Bundle(this.zza);
    }

    final /* synthetic */ Bundle zzg() {
        return this.zza;
    }
}
