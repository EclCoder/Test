package rl;

import com.inmobi.media.core.config.models.AdConfig;
import gl.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0793a f51358f = new C0793a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f51359g = {13, 10};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f51360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f51361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f51362j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f51363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f51364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f51366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f51367e;

    /* JADX INFO: renamed from: rl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0793a extends a {
        public /* synthetic */ C0793a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0793a() {
            super(false, false, -1, b.PRESENT, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        ABSENT_OPTIONAL;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ ml.a f51373f = ml.b.a(d());
    }

    static {
        b bVar = b.PRESENT;
        f51360h = new a(true, false, -1, bVar);
        f51361i = new a(false, true, 76, bVar);
        f51362j = new a(false, true, 64, bVar);
    }

    public /* synthetic */ a(boolean z10, boolean z11, int i10, b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, i10, bVar);
    }

    private final void a(int i10, int i11, int i12) {
        if (i11 < 0 || i11 > i10) {
            throw new IndexOutOfBoundsException("destination offset: " + i11 + ", destination size: " + i10);
        }
        int i13 = i11 + i12;
        if (i13 < 0 || i13 > i10) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i11 + ", destination size: " + i10 + ", capacity needed: " + i12);
        }
    }

    public static /* synthetic */ String d(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return aVar.c(bArr, i10, i11);
    }

    private final boolean h() {
        b bVar = this.f51366d;
        return bVar == b.PRESENT || bVar == b.PRESENT_OPTIONAL;
    }

    public final void b(int i10, int i11, int i12) {
        d.f39316a.a(i11, i12, i10);
    }

    public final String c(byte[] source, int i10, int i11) {
        s.h(source, "source");
        return new String(g(source, i10, i11), bm.d.f9084g);
    }

    public final int e(byte[] source, byte[] destination, int i10, int i11, int i12) {
        int i13 = i11;
        s.h(source, "source");
        s.h(destination, "destination");
        b(source.length, i13, i12);
        a(destination.length, i10, f(i12 - i13));
        byte[] bArr = this.f51363a ? rl.b.f51376c : rl.b.f51374a;
        int i14 = this.f51364b ? this.f51367e : Integer.MAX_VALUE;
        int i15 = i10;
        while (i13 + 2 < i12) {
            int iMin = Math.min((i12 - i13) / 3, i14);
            for (int i16 = 0; i16 < iMin; i16++) {
                int i17 = source[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i18 = i13 + 2;
                int i19 = source[i13 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i13 += 3;
                int i20 = (i19 << 8) | (i17 << 16) | (source[i18] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                destination[i15] = bArr[i20 >>> 18];
                destination[i15 + 1] = bArr[(i20 >>> 12) & 63];
                int i21 = i15 + 3;
                destination[i15 + 2] = bArr[(i20 >>> 6) & 63];
                i15 += 4;
                destination[i21] = bArr[i20 & 63];
            }
            if (iMin == i14 && i13 != i12) {
                int i22 = i15 + 1;
                byte[] bArr2 = f51359g;
                destination[i15] = bArr2[0];
                i15 += 2;
                destination[i22] = bArr2[1];
            }
        }
        int i23 = i12 - i13;
        if (i23 == 1) {
            int i24 = i13 + 1;
            int i25 = (source[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
            destination[i15] = bArr[i25 >>> 6];
            int i26 = i15 + 2;
            destination[i15 + 1] = bArr[i25 & 63];
            if (h()) {
                int i27 = i15 + 3;
                destination[i26] = 61;
                i15 += 4;
                destination[i27] = 61;
                i13 = i24;
            } else {
                i13 = i24;
                i15 = i26;
            }
        } else if (i23 == 2) {
            int i28 = i13 + 1;
            int i29 = source[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            i13 += 2;
            int i30 = ((source[i28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 2) | (i29 << 10);
            destination[i15] = bArr[i30 >>> 12];
            destination[i15 + 1] = bArr[(i30 >>> 6) & 63];
            int i31 = i15 + 3;
            destination[i15 + 2] = bArr[i30 & 63];
            if (h()) {
                i15 += 4;
                destination[i31] = 61;
            } else {
                i15 = i31;
            }
        }
        if (i13 == i12) {
            return i15 - i10;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int f(int i10) {
        int i11 = i10 / 3;
        int i12 = i10 % 3;
        int i13 = i11 * 4;
        if (i12 != 0) {
            i13 += h() ? 4 : i12 + 1;
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.f51364b) {
            i13 += ((i13 - 1) / this.f51365c) * 2;
        }
        if (i13 >= 0) {
            return i13;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public final byte[] g(byte[] source, int i10, int i11) {
        s.h(source, "source");
        b(source.length, i10, i11);
        byte[] bArr = new byte[f(i11 - i10)];
        e(source, bArr, 0, i10, i11);
        return bArr;
    }

    private a(boolean z10, boolean z11, int i10, b bVar) {
        this.f51363a = z10;
        this.f51364b = z11;
        this.f51365c = i10;
        this.f51366d = bVar;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f51367e = i10 / 4;
    }
}
