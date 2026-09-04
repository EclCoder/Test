package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new zzan();
    private final PublicKeyCredentialType zza;
    private final COSEAlgorithmIdentifier zzb;

    public PublicKeyCredentialParameters(String str, int i10) {
        Preconditions.checkNotNull(str);
        try {
            this.zza = PublicKeyCredentialType.fromString(str);
            Preconditions.checkNotNull(Integer.valueOf(i10));
            try {
                this.zzb = COSEAlgorithmIdentifier.fromCoseValue(i10);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.zza.equals(publicKeyCredentialParameters.zza) && this.zzb.equals(publicKeyCredentialParameters.zzb);
    }

    public COSEAlgorithmIdentifier getAlgorithm() {
        return this.zzb;
    }

    public int getAlgorithmIdAsInteger() {
        return this.zzb.toCoseValue();
    }

    public PublicKeyCredentialType getType() {
        return this.zza;
    }

    public String getTypeAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getTypeAsString(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 3, Integer.valueOf(getAlgorithmIdAsInteger()), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
