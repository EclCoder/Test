package c3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9537c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public m(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.f9536b = str;
        this.f9537c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (c0.c(this.f9536b, mVar.f9536b) && Arrays.equals(this.f9537c, mVar.f9537c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9536b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f9537c);
    }

    @Override // c3.i
    public String toString() {
        return this.f9526a + ": owner=" + this.f9536b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9536b);
        parcel.writeByteArray(this.f9537c);
    }

    m(Parcel parcel) {
        super(PrivFrame.ID);
        this.f9536b = (String) c0.h(parcel.readString());
        this.f9537c = (byte[]) c0.h(parcel.createByteArray());
    }
}
