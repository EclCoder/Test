package wa;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements ha.a.b {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f56148c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    public q(String str, String str2, List list) {
        this.f56146a = str;
        this.f56147b = str2;
        this.f56148c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (TextUtils.equals(this.f56146a, qVar.f56146a) && TextUtils.equals(this.f56147b, qVar.f56147b) && this.f56148c.equals(qVar.f56148c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f56146a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f56147b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f56148c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f56146a != null) {
            str = " [" + this.f56146a + ", " + this.f56147b + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f56146a);
        parcel.writeString(this.f56147b);
        int size = this.f56148c.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable((Parcelable) this.f56148c.get(i11), 0);
        }
    }

    q(Parcel parcel) {
        this.f56146a = parcel.readString();
        this.f56147b = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f56148c = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f56151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f56152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f56153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f56154f;

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

        public b(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f56149a = i10;
            this.f56150b = i11;
            this.f56151c = str;
            this.f56152d = str2;
            this.f56153e = str3;
            this.f56154f = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f56149a == bVar.f56149a && this.f56150b == bVar.f56150b && TextUtils.equals(this.f56151c, bVar.f56151c) && TextUtils.equals(this.f56152d, bVar.f56152d) && TextUtils.equals(this.f56153e, bVar.f56153e) && TextUtils.equals(this.f56154f, bVar.f56154f)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f56149a * 31) + this.f56150b) * 31;
            String str = this.f56151c;
            int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f56152d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f56153e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f56154f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f56149a);
            parcel.writeInt(this.f56150b);
            parcel.writeString(this.f56151c);
            parcel.writeString(this.f56152d);
            parcel.writeString(this.f56153e);
            parcel.writeString(this.f56154f);
        }

        b(Parcel parcel) {
            this.f56149a = parcel.readInt();
            this.f56150b = parcel.readInt();
            this.f56151c = parcel.readString();
            this.f56152d = parcel.readString();
            this.f56153e = parcel.readString();
            this.f56154f = parcel.readString();
        }
    }
}
