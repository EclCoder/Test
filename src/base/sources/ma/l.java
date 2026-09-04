package ma;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f45403c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.f45402b = str;
        this.f45403c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (r0.c(this.f45402b, lVar.f45402b) && Arrays.equals(this.f45403c, lVar.f45403c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f45402b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f45403c);
    }

    @Override // ma.i
    public String toString() {
        return this.f45393a + ": owner=" + this.f45402b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45402b);
        parcel.writeByteArray(this.f45403c);
    }

    l(Parcel parcel) {
        super(PrivFrame.ID);
        this.f45402b = (String) r0.j(parcel.readString());
        this.f45403c = (byte[]) r0.j(parcel.createByteArray());
    }
}
