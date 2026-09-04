package t1;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f53021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f53022b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u createFromParcel(Parcel parcel) {
            return new u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u[] newArray(int i10) {
            return new u[i10];
        }
    }

    public u(b... bVarArr) {
        this(C.TIME_UNSET, bVarArr);
    }

    public u a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new u(this.f53022b, (b[]) w1.c0.H0(this.f53021a, bVarArr));
    }

    public u b(u uVar) {
        return uVar == null ? this : a(uVar.f53021a);
    }

    public u c(long j10) {
        return this.f53022b == j10 ? this : new u(j10, this.f53021a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i10) {
        return this.f53021a[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (Arrays.equals(this.f53021a, uVar.f53021a) && this.f53022b == uVar.f53022b) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f53021a.length;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f53021a) * 31) + com.google.common.primitives.i.b(this.f53022b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f53021a));
        if (this.f53022b == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f53022b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f53021a.length);
        for (b bVar : this.f53021a) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f53022b);
    }

    public u(long j10, b... bVarArr) {
        this.f53022b = j10;
        this.f53021a = bVarArr;
    }

    public u(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public u(long j10, List list) {
        this(j10, (b[]) list.toArray(new b[0]));
    }

    u(Parcel parcel) {
        this.f53021a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f53021a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                this.f53022b = parcel.readLong();
                return;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b extends Parcelable {
        default o k() {
            return null;
        }

        default byte[] m() {
            return null;
        }

        default void d(t.b bVar) {
        }
    }
}
