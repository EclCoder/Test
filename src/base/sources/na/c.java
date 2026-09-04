package na;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ob.r0;
import sc.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements ha.a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46953a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f46956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f46957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Comparator f46954d = new Comparator() { // from class: na.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                c.b bVar = (c.b) obj;
                c.b bVar2 = (c.b) obj2;
                return q.j().e(bVar.f46955a, bVar2.f46955a).e(bVar.f46956b, bVar2.f46956b).d(bVar.f46957c, bVar2.f46957c).i();
            }
        };
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(long j10, long j11, int i10) {
            ob.a.a(j10 < j11);
            this.f46955a = j10;
            this.f46956b = j11;
            this.f46957c = i10;
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
                if (this.f46955a == bVar.f46955a && this.f46956b == bVar.f46956b && this.f46957c == bVar.f46957c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return l.b(Long.valueOf(this.f46955a), Long.valueOf(this.f46956b), Integer.valueOf(this.f46957c));
        }

        public String toString() {
            return r0.D("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f46955a), Long.valueOf(this.f46956b), Integer.valueOf(this.f46957c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f46955a);
            parcel.writeLong(this.f46956b);
            parcel.writeInt(this.f46957c);
        }
    }

    public c(List list) {
        this.f46953a = list;
        ob.a.a(!a(list));
    }

    private static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = ((b) list.get(0)).f46956b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (((b) list.get(i10)).f46955a < j10) {
                return true;
            }
            j10 = ((b) list.get(i10)).f46956b;
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
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f46953a.equals(((c) obj).f46953a);
    }

    public int hashCode() {
        return this.f46953a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f46953a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f46953a);
    }
}
