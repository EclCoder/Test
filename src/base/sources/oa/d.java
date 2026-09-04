package oa;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ob.d0;
import ob.n0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends oa.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f48315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f48316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f48317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f48318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f48319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f48320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f48321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f48322m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f48325c;

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f48323a);
            parcel.writeLong(this.f48324b);
            parcel.writeLong(this.f48325c);
        }

        private b(int i10, long j10, long j11) {
            this.f48323a = i10;
            this.f48324b = j10;
            this.f48325c = j11;
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    static d a(d0 d0Var, long j10, n0 n0Var) {
        List list;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int iH;
        int iH2;
        boolean z14;
        long J = d0Var.J();
        boolean z15 = (d0Var.H() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long J2 = C.TIME_UNSET;
        if (z15) {
            list = list2;
            j11 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            iH = 0;
            iH2 = 0;
        } else {
            int iH3 = d0Var.H();
            boolean z16 = (iH3 & 128) != 0;
            boolean z17 = (iH3 & 64) != 0;
            boolean z18 = (iH3 & 32) != 0;
            boolean z19 = (iH3 & 16) != 0;
            long jB = (!z17 || z19) ? -9223372036854775807L : g.b(d0Var, j10);
            if (!z17) {
                int iH4 = d0Var.H();
                ArrayList arrayList = new ArrayList(iH4);
                int i11 = 0;
                while (i11 < iH4) {
                    int iH5 = d0Var.H();
                    long jB2 = !z19 ? g.b(d0Var, j10) : -9223372036854775807L;
                    arrayList.add(new b(iH5, jB2, n0Var.b(jB2), null));
                    i11++;
                    iH4 = iH4;
                }
                list2 = arrayList;
            }
            if (z18) {
                long jH = d0Var.H();
                boolean z20 = (128 & jH) != 0;
                J2 = ((((jH & 1) << 32) | d0Var.J()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int iN = d0Var.N();
            long j12 = jB;
            j11 = J2;
            J2 = j12;
            iH = d0Var.H();
            iH2 = d0Var.H();
            i10 = iN;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new d(J, z15, z10, z11, z12, J2, n0Var.b(J2), list, z13, j11, i10, iH, iH2);
    }

    @Override // oa.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f48315f + ", programSplicePlaybackPositionUs= " + this.f48316g + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f48310a);
        parcel.writeByte(this.f48311b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f48312c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f48313d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f48314e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f48315f);
        parcel.writeLong(this.f48316g);
        int size = this.f48317h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((b) this.f48317h.get(i11)).b(parcel);
        }
        parcel.writeByte(this.f48318i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f48319j);
        parcel.writeInt(this.f48320k);
        parcel.writeInt(this.f48321l);
        parcel.writeInt(this.f48322m);
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f48310a = j10;
        this.f48311b = z10;
        this.f48312c = z11;
        this.f48313d = z12;
        this.f48314e = z13;
        this.f48315f = j11;
        this.f48316g = j12;
        this.f48317h = Collections.unmodifiableList(list);
        this.f48318i = z14;
        this.f48319j = j13;
        this.f48320k = i10;
        this.f48321l = i11;
        this.f48322m = i12;
    }

    private d(Parcel parcel) {
        this.f48310a = parcel.readLong();
        this.f48311b = parcel.readByte() == 1;
        this.f48312c = parcel.readByte() == 1;
        this.f48313d = parcel.readByte() == 1;
        this.f48314e = parcel.readByte() == 1;
        this.f48315f = parcel.readLong();
        this.f48316g = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b.a(parcel));
        }
        this.f48317h = Collections.unmodifiableList(arrayList);
        this.f48318i = parcel.readByte() == 1;
        this.f48319j = parcel.readLong();
        this.f48320k = parcel.readInt();
        this.f48321l = parcel.readInt();
        this.f48322m = parcel.readInt();
    }
}
