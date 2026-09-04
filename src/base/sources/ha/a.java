package ha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.z0;
import com.google.common.primitives.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0607a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f40303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40304b;

    /* JADX INFO: renamed from: ha.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0607a implements Parcelable.Creator {
        C0607a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(b... bVarArr) {
        this(C.TIME_UNSET, bVarArr);
    }

    public a a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new a(this.f40304b, (b[]) r0.L0(this.f40303a, bVarArr));
    }

    public a b(a aVar) {
        return aVar == null ? this : a(aVar.f40303a);
    }

    public a c(long j10) {
        return this.f40304b == j10 ? this : new a(j10, this.f40303a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i10) {
        return this.f40303a[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (Arrays.equals(this.f40303a, aVar.f40303a) && this.f40304b == aVar.f40304b) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f40303a.length;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f40303a) * 31) + i.b(this.f40304b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f40303a));
        if (this.f40304b == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f40304b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f40303a.length);
        for (b bVar : this.f40303a) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f40304b);
    }

    public a(long j10, b... bVarArr) {
        this.f40304b = j10;
        this.f40303a = bVarArr;
    }

    public a(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public a(long j10, List list) {
        this(j10, (b[]) list.toArray(new b[0]));
    }

    a(Parcel parcel) {
        this.f40303a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f40303a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                this.f40304b = parcel.readLong();
                return;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b extends Parcelable {
        default v0 k() {
            return null;
        }

        default byte[] m() {
            return null;
        }

        default void r(z0.b bVar) {
        }
    }
}
