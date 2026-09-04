package ng;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c1.pGX.geAgcEazw;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends c implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f47693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f47694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f47695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f47696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f47697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f47698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f47699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f47700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f47701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f47702n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f47703o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f47704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f47705q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f47706r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f47707s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private qh.b f47708t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f47709u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private RectF f47710v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f47711w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f47712x;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            s.h(parcel, "parcel");
            return new d(parcel.readString(), (Uri) parcel.readParcelable(d.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readFloat(), parcel.readInt() == 0 ? null : qh.b.CREATOR.createFromParcel(parcel), parcel.readInt(), (RectF) parcel.readParcelable(d.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(String str, Uri uri, String str2, String str3, String str4, long j10, int i10, int i11, long j11, int i12, long j12, long j13, long j14, long j15, float f10, qh.b bVar, int i13, RectF rectF, int i14, boolean z10, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        String strL = (i15 & 1) != 0 ? sh.b.l() : str;
        long j16 = (i15 & 256) != 0 ? -1L : j11;
        int i16 = (i15 & 512) != 0 ? -1 : i12;
        long j17 = (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 0L : j12;
        long j18 = (i15 & 2048) != 0 ? j10 : j13;
        this(strL, uri, str2, str3, str4, j10, i10, i11, j16, i16, j17, j18, (i15 & 4096) != 0 ? j17 : j14, (i15 & 8192) != 0 ? j18 : j15, (i15 & 16384) != 0 ? 1.0f : f10, (32768 & i15) != 0 ? null : bVar, (65536 & i15) != 0 ? 0 : i13, (131072 & i15) != 0 ? null : rectF, (262144 & i15) != 0 ? 0 : i14, (i15 & 524288) != 0 ? false : z10);
    }

    public static /* synthetic */ d e(d dVar, String str, Uri uri, String str2, String str3, String str4, long j10, int i10, int i11, long j11, int i12, long j12, long j13, long j14, long j15, float f10, qh.b bVar, int i13, RectF rectF, int i14, boolean z10, int i15, Object obj) {
        boolean z11;
        int i16;
        String str5 = (i15 & 1) != 0 ? dVar.f47693e : str;
        Uri uri2 = (i15 & 2) != 0 ? dVar.f47694f : uri;
        String str6 = (i15 & 4) != 0 ? dVar.f47695g : str2;
        String str7 = (i15 & 8) != 0 ? dVar.f47696h : str3;
        String str8 = (i15 & 16) != 0 ? dVar.f47697i : str4;
        long j16 = (i15 & 32) != 0 ? dVar.f47698j : j10;
        int i17 = (i15 & 64) != 0 ? dVar.f47699k : i10;
        int i18 = (i15 & 128) != 0 ? dVar.f47700l : i11;
        long j17 = (i15 & 256) != 0 ? dVar.f47701m : j11;
        int i19 = (i15 & 512) != 0 ? dVar.f47702n : i12;
        long j18 = (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? dVar.f47703o : j12;
        String str9 = str5;
        Uri uri3 = uri2;
        long j19 = (i15 & 2048) != 0 ? dVar.f47704p : j13;
        long j20 = (i15 & 4096) != 0 ? dVar.f47705q : j14;
        long j21 = (i15 & 8192) != 0 ? dVar.f47706r : j15;
        float f11 = (i15 & 16384) != 0 ? dVar.f47707s : f10;
        qh.b bVar2 = (32768 & i15) != 0 ? dVar.f47708t : bVar;
        int i20 = (i15 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? dVar.f47709u : i13;
        RectF rectF2 = (i15 & 131072) != 0 ? dVar.f47710v : rectF;
        int i21 = (i15 & MediaHttpUploader.MINIMUM_CHUNK_SIZE) != 0 ? dVar.f47711w : i14;
        if ((i15 & 524288) != 0) {
            i16 = i21;
            z11 = dVar.f47712x;
        } else {
            z11 = z10;
            i16 = i21;
        }
        return dVar.c(str9, uri3, str6, str7, str8, j16, i17, i18, j17, i19, j18, j19, j20, j21, f11, bVar2, i20, rectF2, i16, z11);
    }

    public final int A() {
        return this.f47699k;
    }

    public final void B(qh.b bVar) {
        this.f47708t = bVar;
    }

    public final void C(int i10) {
        this.f47709u = i10;
    }

    public final void D(RectF rectF) {
        this.f47710v = rectF;
    }

    public final void E(long j10) {
        this.f47704p = j10;
    }

    public final void F(boolean z10) {
        this.f47712x = z10;
    }

    public final void G(int i10) {
        this.f47711w = i10;
    }

    public final void H(int i10) {
        this.f47702n = i10;
    }

    public final void I(long j10) {
        this.f47703o = j10;
    }

    public final void J(long j10) {
        this.f47706r = j10;
    }

    public final void K(long j10) {
        this.f47705q = j10;
    }

    @Override // ng.c
    public String a() {
        return this.f47696h;
    }

    @Override // ng.c
    public Uri b() {
        return this.f47694f;
    }

    public final d c(String id2, Uri uri, String path, String str, String name, long j10, int i10, int i11, long j11, int i12, long j12, long j13, long j14, long j15, float f10, qh.b bVar, int i13, RectF rectF, int i14, boolean z10) {
        s.h(id2, "id");
        s.h(uri, "uri");
        s.h(path, "path");
        s.h(name, "name");
        return new d(id2, uri, path, str, name, j10, i10, i11, j11, i12, j12, j13, j14, j15, f10, bVar, i13, rectF, i14, z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.c(this.f47693e, dVar.f47693e) && s.c(this.f47694f, dVar.f47694f) && s.c(this.f47695g, dVar.f47695g) && s.c(this.f47696h, dVar.f47696h) && s.c(this.f47697i, dVar.f47697i) && this.f47698j == dVar.f47698j && this.f47699k == dVar.f47699k && this.f47700l == dVar.f47700l && this.f47701m == dVar.f47701m && this.f47702n == dVar.f47702n && this.f47703o == dVar.f47703o && this.f47704p == dVar.f47704p && this.f47705q == dVar.f47705q && this.f47706r == dVar.f47706r && Float.compare(this.f47707s, dVar.f47707s) == 0 && s.c(this.f47708t, dVar.f47708t) && this.f47709u == dVar.f47709u && s.c(this.f47710v, dVar.f47710v) && this.f47711w == dVar.f47711w && this.f47712x == dVar.f47712x;
    }

    public final qh.b f() {
        return this.f47708t;
    }

    public final int g() {
        return this.f47709u;
    }

    public int hashCode() {
        int iHashCode = ((((this.f47693e.hashCode() * 31) + this.f47694f.hashCode()) * 31) + this.f47695g.hashCode()) * 31;
        String str = this.f47696h;
        int iHashCode2 = (((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f47697i.hashCode()) * 31) + Long.hashCode(this.f47698j)) * 31) + Integer.hashCode(this.f47699k)) * 31) + Integer.hashCode(this.f47700l)) * 31) + Long.hashCode(this.f47701m)) * 31) + Integer.hashCode(this.f47702n)) * 31) + Long.hashCode(this.f47703o)) * 31) + Long.hashCode(this.f47704p)) * 31) + Long.hashCode(this.f47705q)) * 31) + Long.hashCode(this.f47706r)) * 31) + Float.hashCode(this.f47707s)) * 31;
        qh.b bVar = this.f47708t;
        int iHashCode3 = (((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31) + Integer.hashCode(this.f47709u)) * 31;
        RectF rectF = this.f47710v;
        return ((((iHashCode3 + (rectF != null ? rectF.hashCode() : 0)) * 31) + Integer.hashCode(this.f47711w)) * 31) + Boolean.hashCode(this.f47712x);
    }

    public final RectF i() {
        return this.f47710v;
    }

    public final long j() {
        return this.f47698j;
    }

    public final String l() {
        long j10 = this.f47706r - this.f47705q;
        long j11 = 1000;
        long j12 = j10 / j11;
        long j13 = 60;
        long j14 = j12 % j13;
        long j15 = (j12 / j13) % j13;
        long j16 = j12 / ((long) 3600);
        int iB = vl.a.b((j10 % j11) / 100.0f);
        if (j16 > 0) {
            o0 o0Var = o0.f43602a;
            String str = String.format("%d:%02d:%02d.%d", Arrays.copyOf(new Object[]{Long.valueOf(j16), Long.valueOf(j15), Long.valueOf(j14), Integer.valueOf(iB)}, 4));
            s.g(str, "format(...)");
            return str;
        }
        o0 o0Var2 = o0.f43602a;
        String str2 = String.format("%02d:%02d.%d", Arrays.copyOf(new Object[]{Long.valueOf(j15), Long.valueOf(j14), Integer.valueOf(iB)}, 3));
        s.g(str2, "format(...)");
        return str2;
    }

    public final long n() {
        return this.f47704p;
    }

    public final boolean o() {
        return this.f47712x;
    }

    public final int p() {
        return this.f47700l;
    }

    public final String q() {
        return this.f47693e;
    }

    public String s() {
        return this.f47697i;
    }

    public String t() {
        return this.f47695g;
    }

    public final int u() {
        return this.f47711w;
    }

    public final int v() {
        return this.f47702n;
    }

    public final long w() {
        return this.f47701m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        s.h(dest, "dest");
        dest.writeString(this.f47693e);
        dest.writeParcelable(this.f47694f, i10);
        dest.writeString(this.f47695g);
        dest.writeString(this.f47696h);
        dest.writeString(this.f47697i);
        dest.writeLong(this.f47698j);
        dest.writeInt(this.f47699k);
        dest.writeInt(this.f47700l);
        dest.writeLong(this.f47701m);
        dest.writeInt(this.f47702n);
        dest.writeLong(this.f47703o);
        dest.writeLong(this.f47704p);
        dest.writeLong(this.f47705q);
        dest.writeLong(this.f47706r);
        dest.writeFloat(this.f47707s);
        qh.b bVar = this.f47708t;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bVar.writeToParcel(dest, i10);
        }
        dest.writeInt(this.f47709u);
        dest.writeParcelable(this.f47710v, i10);
        dest.writeInt(this.f47711w);
        dest.writeInt(this.f47712x ? 1 : 0);
    }

    public final long x() {
        return this.f47703o;
    }

    public final long y() {
        return this.f47706r;
    }

    public final long z() {
        return this.f47705q;
    }

    public String toString() {
        return "VideoItem(id=" + this.f47693e + ", uri=" + this.f47694f + ", path=" + this.f47695g + ", bucket=" + this.f47696h + ", name=" + this.f47697i + ", duration=" + this.f47698j + ", width=" + this.f47699k + ", height=" + this.f47700l + ", size=" + this.f47701m + ", selectedIndex=" + this.f47702n + ", startTime=" + this.f47703o + ", endTime=" + this.f47704p + ", trimStartTime=" + this.f47705q + ", trimEndTime=" + this.f47706r + ", speed=" + this.f47707s + ", backgroundItem=" + this.f47708t + ", cropId=" + this.f47709u + ", cropPercentRect=" + this.f47710v + ", rotateAngle=" + this.f47711w + geAgcEazw.bpLOnvCfWMHYal + this.f47712x + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String id2, Uri uri, String path, String str, String name, long j10, int i10, int i11, long j11, int i12, long j12, long j13, long j14, long j15, float f10, qh.b bVar, int i13, RectF rectF, int i14, boolean z10) {
        super(uri, path, str, name);
        s.h(id2, "id");
        s.h(uri, "uri");
        s.h(path, "path");
        s.h(name, "name");
        this.f47693e = id2;
        this.f47694f = uri;
        this.f47695g = path;
        this.f47696h = str;
        this.f47697i = name;
        this.f47698j = j10;
        this.f47699k = i10;
        this.f47700l = i11;
        this.f47701m = j11;
        this.f47702n = i12;
        this.f47703o = j12;
        this.f47704p = j13;
        this.f47705q = j14;
        this.f47706r = j15;
        this.f47707s = f10;
        this.f47708t = bVar;
        this.f47709u = i13;
        this.f47710v = rectF;
        this.f47711w = i14;
        this.f47712x = z10;
    }
}
