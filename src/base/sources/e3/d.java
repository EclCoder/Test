package e3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w1.u;
import w1.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e3.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f37069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f37070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f37071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f37072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f37073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f37074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f37075k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f37076l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f37077m;

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
        public final int f37078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f37079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f37080c;

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f37078a);
            parcel.writeLong(this.f37079b);
            parcel.writeLong(this.f37080c);
        }

        private b(int i10, long j10, long j11) {
            this.f37078a = i10;
            this.f37079b = j10;
            this.f37080c = j11;
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    static d a(u uVar, long j10, z zVar) {
        List list;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int iG;
        int iG2;
        boolean z14;
        long jI = uVar.I();
        boolean z15 = (uVar.G() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jI2 = C.TIME_UNSET;
        if (z15) {
            list = list2;
            j11 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            iG = 0;
            iG2 = 0;
        } else {
            int iG3 = uVar.G();
            boolean z16 = (iG3 & 128) != 0;
            boolean z17 = (iG3 & 64) != 0;
            boolean z18 = (iG3 & 32) != 0;
            boolean z19 = (iG3 & 16) != 0;
            long jB = (!z17 || z19) ? -9223372036854775807L : g.b(uVar, j10);
            if (!z17) {
                int iG4 = uVar.G();
                ArrayList arrayList = new ArrayList(iG4);
                int i11 = 0;
                while (i11 < iG4) {
                    int iG5 = uVar.G();
                    long jB2 = !z19 ? g.b(uVar, j10) : -9223372036854775807L;
                    arrayList.add(new b(iG5, jB2, zVar.b(jB2), null));
                    i11++;
                    iG4 = iG4;
                }
                list2 = arrayList;
            }
            if (z18) {
                long jG = uVar.G();
                boolean z20 = (128 & jG) != 0;
                jI2 = ((((jG & 1) << 32) | uVar.I()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int iM = uVar.M();
            long j12 = jB;
            j11 = jI2;
            jI2 = j12;
            iG = uVar.G();
            iG2 = uVar.G();
            i10 = iM;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new d(jI, z15, z10, z11, z12, jI2, zVar.b(jI2), list, z13, j11, i10, iG, iG2);
    }

    @Override // e3.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f37070f + ", programSplicePlaybackPositionUs= " + this.f37071g + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f37065a);
        parcel.writeByte(this.f37066b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f37067c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f37068d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f37069e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f37070f);
        parcel.writeLong(this.f37071g);
        int size = this.f37072h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((b) this.f37072h.get(i11)).b(parcel);
        }
        parcel.writeByte(this.f37073i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f37074j);
        parcel.writeInt(this.f37075k);
        parcel.writeInt(this.f37076l);
        parcel.writeInt(this.f37077m);
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f37065a = j10;
        this.f37066b = z10;
        this.f37067c = z11;
        this.f37068d = z12;
        this.f37069e = z13;
        this.f37070f = j11;
        this.f37071g = j12;
        this.f37072h = Collections.unmodifiableList(list);
        this.f37073i = z14;
        this.f37074j = j13;
        this.f37075k = i10;
        this.f37076l = i11;
        this.f37077m = i12;
    }

    private d(Parcel parcel) {
        this.f37065a = parcel.readLong();
        this.f37066b = parcel.readByte() == 1;
        this.f37067c = parcel.readByte() == 1;
        this.f37068d = parcel.readByte() == 1;
        this.f37069e = parcel.readByte() == 1;
        this.f37070f = parcel.readLong();
        this.f37071g = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b.a(parcel));
        }
        this.f37072h = Collections.unmodifiableList(arrayList);
        this.f37073i = parcel.readByte() == 1;
        this.f37074j = parcel.readLong();
        this.f37075k = parcel.readInt();
        this.f37076l = parcel.readInt();
        this.f37077m = parcel.readInt();
    }
}
