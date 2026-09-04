package d3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import sc.l;
import t1.u;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements u.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36170a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C0543b.class.getClassLoader());
            return new b(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* JADX INFO: renamed from: d3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0543b implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f36172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f36173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Comparator f36171d = new Comparator() { // from class: d3.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                b.C0543b c0543b = (b.C0543b) obj;
                b.C0543b c0543b2 = (b.C0543b) obj2;
                return q.j().e(c0543b.f36172a, c0543b2.f36172a).e(c0543b.f36173b, c0543b2.f36173b).d(c0543b.f36174c, c0543b2.f36174c).i();
            }
        };
        public static final Parcelable.Creator<C0543b> CREATOR = new a();

        /* JADX INFO: renamed from: d3.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0543b createFromParcel(Parcel parcel) {
                return new C0543b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0543b[] newArray(int i10) {
                return new C0543b[i10];
            }
        }

        public C0543b(long j10, long j11, int i10) {
            w1.a.a(j10 < j11);
            this.f36172a = j10;
            this.f36173b = j11;
            this.f36174c = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0543b.class == obj.getClass()) {
                C0543b c0543b = (C0543b) obj;
                if (this.f36172a == c0543b.f36172a && this.f36173b == c0543b.f36173b && this.f36174c == c0543b.f36174c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return l.b(Long.valueOf(this.f36172a), Long.valueOf(this.f36173b), Integer.valueOf(this.f36174c));
        }

        public String toString() {
            return c0.F("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f36172a), Long.valueOf(this.f36173b), Integer.valueOf(this.f36174c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f36172a);
            parcel.writeLong(this.f36173b);
            parcel.writeInt(this.f36174c);
        }
    }

    public b(List list) {
        this.f36170a = list;
        w1.a.a(!a(list));
    }

    private static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = ((C0543b) list.get(0)).f36173b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (((C0543b) list.get(i10)).f36172a < j10) {
                return true;
            }
            j10 = ((C0543b) list.get(i10)).f36173b;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f36170a.equals(((b) obj).f36170a);
    }

    public int hashCode() {
        return this.f36170a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f36170a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f36170a);
    }
}
