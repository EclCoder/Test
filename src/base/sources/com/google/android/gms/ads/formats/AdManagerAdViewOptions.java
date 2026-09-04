package com.google.android.gms.ads.formats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzb();
    private final boolean zza;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Builder {
        private boolean zza = false;

        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, null);
        }

        public Builder setManualImpressionsEnabled(boolean z10) {
            this.zza = z10;
            return this;
        }

        final /* synthetic */ boolean zza() {
            return this.zza;
        }
    }

    /* synthetic */ AdManagerAdViewOptions(Builder builder, byte[] bArr) {
        this.zza = builder.zza();
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    AdManagerAdViewOptions(boolean z10) {
        this.zza = z10;
    }
}
