package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ClearTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ClearTokenRequest> CREATOR = new zbh();
    private final String zba;
    private final String zbb;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Builder {
        private String zba;
        private String zbb;

        private Builder() {
            throw null;
        }

        public ClearTokenRequest build() {
            return new ClearTokenRequest(this.zba, this.zbb);
        }

        public Builder setToken(String str) {
            this.zba = str;
            return this;
        }

        public final Builder zba(String str) {
            this.zbb = str;
            return this;
        }

        /* synthetic */ Builder(ClearTokenRequest clearTokenRequest, byte[] bArr) {
            this.zba = clearTokenRequest.zbb();
            this.zbb = clearTokenRequest.zbc();
        }

        /* synthetic */ Builder(byte[] bArr) {
        }
    }

    ClearTokenRequest(String str, String str2) {
        this.zba = str;
        this.zbb = str2;
    }

    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClearTokenRequest) {
            ClearTokenRequest clearTokenRequest = (ClearTokenRequest) obj;
            if (Objects.equal(this.zba, clearTokenRequest.zba) && Objects.equal(this.zbb, clearTokenRequest.zbb)) {
                return true;
            }
        }
        return false;
    }

    public String getToken() {
        return this.zba;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getToken(), false);
        SafeParcelWriter.writeString(parcel, 2, this.zbb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Builder zba() {
        return new Builder(this, null);
    }

    final /* synthetic */ String zbb() {
        return this.zba;
    }

    final /* synthetic */ String zbc() {
        return this.zbb;
    }
}
