package oa;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ob.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends oa.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f48326a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48328b;

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f48327a);
            parcel.writeLong(this.f48328b);
        }

        private b(int i10, long j10) {
            this.f48327a = i10;
            this.f48328b = j10;
        }
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    static f a(d0 d0Var) {
        int iH = d0Var.H();
        ArrayList arrayList = new ArrayList(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            arrayList.add(c.e(d0Var));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f48326a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((c) this.f48326a.get(i11)).f(parcel);
        }
    }

    private f(List list) {
        this.f48326a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(c.d(parcel));
        }
        this.f48326a = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f48330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f48331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f48332d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f48333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f48334f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f48335g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f48336h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f48337i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f48338j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f48339k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f48329a = j10;
            this.f48330b = z10;
            this.f48331c = z11;
            this.f48332d = z12;
            this.f48334f = Collections.unmodifiableList(list);
            this.f48333e = j11;
            this.f48335g = z13;
            this.f48336h = j12;
            this.f48337i = i10;
            this.f48338j = i11;
            this.f48339k = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(d0 d0Var) {
            ArrayList arrayList;
            boolean z10;
            boolean z11;
            long j10;
            boolean z12;
            long j11;
            int i10;
            int i11;
            int iH;
            boolean z13;
            long J;
            long J2 = d0Var.J();
            boolean z14 = true;
            if ((d0Var.H() & 128) == 0) {
                z14 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                z11 = false;
                j10 = C.TIME_UNSET;
                z12 = false;
                j11 = C.TIME_UNSET;
                i10 = 0;
                i11 = 0;
                iH = 0;
            } else {
                int iH2 = d0Var.H();
                boolean z15 = (iH2 & 128) != 0;
                boolean z16 = (iH2 & 64) != 0 ? z14 : false;
                boolean z17 = (iH2 & 32) != 0 ? z14 : false;
                long J3 = z16 ? d0Var.J() : C.TIME_UNSET;
                if (!z16) {
                    int iH3 = d0Var.H();
                    ArrayList arrayList3 = new ArrayList(iH3);
                    int i12 = 0;
                    while (i12 < iH3) {
                        arrayList3.add(new b(d0Var.H(), d0Var.J(), null));
                        i12++;
                        iH3 = iH3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long jH = d0Var.H();
                    boolean z18 = (128 & jH) != 0;
                    J = ((((jH & 1) << 32) | d0Var.J()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    J = C.TIME_UNSET;
                }
                int iN = d0Var.N();
                int iH4 = d0Var.H();
                boolean z19 = z15;
                z12 = z13;
                z10 = z19;
                iH = d0Var.H();
                long j12 = J3;
                i10 = iN;
                i11 = iH4;
                long j13 = J;
                arrayList = arrayList2;
                z11 = z16;
                j10 = j12;
                j11 = j13;
            }
            return new c(J2, z14, z10, z11, arrayList, j10, z12, j11, i10, i11, iH);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f48329a);
            parcel.writeByte(this.f48330b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f48331c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f48332d ? (byte) 1 : (byte) 0);
            int size = this.f48334f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f48334f.get(i10)).d(parcel);
            }
            parcel.writeLong(this.f48333e);
            parcel.writeByte(this.f48335g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f48336h);
            parcel.writeInt(this.f48337i);
            parcel.writeInt(this.f48338j);
            parcel.writeInt(this.f48339k);
        }

        private c(Parcel parcel) {
            this.f48329a = parcel.readLong();
            this.f48330b = parcel.readByte() == 1;
            this.f48331c = parcel.readByte() == 1;
            this.f48332d = parcel.readByte() == 1;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(b.c(parcel));
            }
            this.f48334f = Collections.unmodifiableList(arrayList);
            this.f48333e = parcel.readLong();
            this.f48335g = parcel.readByte() == 1;
            this.f48336h = parcel.readLong();
            this.f48337i = parcel.readInt();
            this.f48338j = parcel.readInt();
            this.f48339k = parcel.readInt();
        }
    }
}
