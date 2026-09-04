package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbf> CREATOR = new zbg();
    private final String zba;
    private final boolean zbb;

    public zbf(String str, boolean z10) {
        this.zba = str;
        this.zbb = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zbf) {
            zbf zbfVar = (zbf) obj;
            if (this.zba.equals(zbfVar.zba) && this.zbb == zbfVar.zbb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zba, Boolean.valueOf(this.zbb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zba;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zbb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
