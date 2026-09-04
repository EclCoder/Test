package e3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e3.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37081a;

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
        public final int f37082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f37083b;

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f37082a);
            parcel.writeLong(this.f37083b);
        }

        private b(int i10, long j10) {
            this.f37082a = i10;
            this.f37083b = j10;
        }
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    static f a(u uVar) {
        int iG = uVar.G();
        ArrayList arrayList = new ArrayList(iG);
        for (int i10 = 0; i10 < iG; i10++) {
            arrayList.add(c.e(uVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f37081a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((c) this.f37081a.get(i11)).f(parcel);
        }
    }

    private f(List list) {
        this.f37081a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(c.d(parcel));
        }
        this.f37081a = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f37084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f37085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f37086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f37087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f37088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f37089f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f37090g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f37091h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f37092i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f37093j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f37094k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f37084a = j10;
            this.f37085b = z10;
            this.f37086c = z11;
            this.f37087d = z12;
            this.f37089f = Collections.unmodifiableList(list);
            this.f37088e = j11;
            this.f37090g = z13;
            this.f37091h = j12;
            this.f37092i = i10;
            this.f37093j = i11;
            this.f37094k = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(u uVar) {
            ArrayList arrayList;
            boolean z10;
            boolean z11;
            long j10;
            boolean z12;
            long j11;
            int i10;
            int i11;
            int iG;
            boolean z13;
            long jI;
            long jI2 = uVar.I();
            boolean z14 = true;
            if ((uVar.G() & 128) == 0) {
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
                iG = 0;
            } else {
                int iG2 = uVar.G();
                boolean z15 = (iG2 & 128) != 0;
                boolean z16 = (iG2 & 64) != 0 ? z14 : false;
                boolean z17 = (iG2 & 32) != 0 ? z14 : false;
                long jI3 = z16 ? uVar.I() : C.TIME_UNSET;
                if (!z16) {
                    int iG3 = uVar.G();
                    ArrayList arrayList3 = new ArrayList(iG3);
                    int i12 = 0;
                    while (i12 < iG3) {
                        arrayList3.add(new b(uVar.G(), uVar.I(), null));
                        i12++;
                        iG3 = iG3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long jG = uVar.G();
                    boolean z18 = (128 & jG) != 0;
                    jI = ((((jG & 1) << 32) | uVar.I()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    jI = C.TIME_UNSET;
                }
                int iM = uVar.M();
                int iG4 = uVar.G();
                boolean z19 = z15;
                z12 = z13;
                z10 = z19;
                iG = uVar.G();
                long j12 = jI3;
                i10 = iM;
                i11 = iG4;
                long j13 = jI;
                arrayList = arrayList2;
                z11 = z16;
                j10 = j12;
                j11 = j13;
            }
            return new c(jI2, z14, z10, z11, arrayList, j10, z12, j11, i10, i11, iG);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f37084a);
            parcel.writeByte(this.f37085b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f37086c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f37087d ? (byte) 1 : (byte) 0);
            int size = this.f37089f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f37089f.get(i10)).d(parcel);
            }
            parcel.writeLong(this.f37088e);
            parcel.writeByte(this.f37090g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f37091h);
            parcel.writeInt(this.f37092i);
            parcel.writeInt(this.f37093j);
            parcel.writeInt(this.f37094k);
        }

        private c(Parcel parcel) {
            this.f37084a = parcel.readLong();
            this.f37085b = parcel.readByte() == 1;
            this.f37086c = parcel.readByte() == 1;
            this.f37087d = parcel.readByte() == 1;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(b.c(parcel));
            }
            this.f37089f = Collections.unmodifiableList(arrayList);
            this.f37088e = parcel.readLong();
            this.f37090g = parcel.readByte() == 1;
            this.f37091h = parcel.readLong();
            this.f37092i = parcel.readInt();
            this.f37093j = parcel.readInt();
            this.f37094k = parcel.readInt();
        }
    }
}
