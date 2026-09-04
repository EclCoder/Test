package t1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparator, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f52712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52715d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f52716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f52717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f52718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f52719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f52720e;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public b a(byte[] bArr) {
            return new b(this.f52717b, this.f52718c, this.f52719d, bArr);
        }

        public boolean b(UUID uuid) {
            return e.f52663a.equals(this.f52717b) || uuid.equals(this.f52717b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return w1.c0.c(this.f52718c, bVar.f52718c) && w1.c0.c(this.f52719d, bVar.f52719d) && w1.c0.c(this.f52717b, bVar.f52717b) && Arrays.equals(this.f52720e, bVar.f52720e);
        }

        public int hashCode() {
            if (this.f52716a == 0) {
                int iHashCode = this.f52717b.hashCode() * 31;
                String str = this.f52718c;
                this.f52716a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f52719d.hashCode()) * 31) + Arrays.hashCode(this.f52720e);
            }
            return this.f52716a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f52717b.getMostSignificantBits());
            parcel.writeLong(this.f52717b.getLeastSignificantBits());
            parcel.writeString(this.f52718c);
            parcel.writeString(this.f52719d);
            parcel.writeByteArray(this.f52720e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f52717b = (UUID) w1.a.e(uuid);
            this.f52718c = str;
            this.f52719d = v.l((String) w1.a.e(str2));
            this.f52720e = bArr;
        }

        b(Parcel parcel) {
            this.f52717b = new UUID(parcel.readLong(), parcel.readLong());
            this.f52718c = parcel.readString();
            this.f52719d = (String) w1.c0.h(parcel.readString());
            this.f52720e = parcel.createByteArray();
        }
    }

    public k(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = e.f52663a;
        if (uuid.equals(bVar.f52717b)) {
            return uuid.equals(bVar2.f52717b) ? 0 : 1;
        }
        return bVar.f52717b.compareTo(bVar2.f52717b);
    }

    public k b(String str) {
        return w1.c0.c(this.f52714c, str) ? this : new k(str, false, this.f52712a);
    }

    public b c(int i10) {
        return this.f52712a[i10];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (w1.c0.c(this.f52714c, kVar.f52714c) && Arrays.equals(this.f52712a, kVar.f52712a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f52713b == 0) {
            String str = this.f52714c;
            this.f52713b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f52712a);
        }
        return this.f52713b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f52714c);
        parcel.writeTypedArray(this.f52712a, 0);
    }

    public k(b... bVarArr) {
        this(null, bVarArr);
    }

    public k(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private k(String str, boolean z10, b... bVarArr) {
        this.f52714c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f52712a = bVarArr;
        this.f52715d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    k(Parcel parcel) {
        this.f52714c = parcel.readString();
        b[] bVarArr = (b[]) w1.c0.h((b[]) parcel.createTypedArray(b.CREATOR));
        this.f52712a = bVarArr;
        this.f52715d = bVarArr.length;
    }
}
