package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2.b f5901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.u f5903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f5904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f5905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f5906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f5907g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements l2.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f5908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f5909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public l2.a f5910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f5911d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override // l2.b.a
        public l2.a a() {
            return (l2.a) w1.a.e(this.f5910c);
        }

        public a b() {
            this.f5910c = null;
            a aVar = this.f5911d;
            this.f5911d = null;
            return aVar;
        }

        public void c(l2.a aVar, a aVar2) {
            this.f5910c = aVar;
            this.f5911d = aVar2;
        }

        public void d(long j10, int i10) {
            w1.a.g(this.f5910c == null);
            this.f5908a = j10;
            this.f5909b = j10 + ((long) i10);
        }

        public int e(long j10) {
            return ((int) (j10 - this.f5908a)) + this.f5910c.f43790b;
        }

        @Override // l2.b.a
        public l2.b.a next() {
            a aVar = this.f5911d;
            if (aVar == null || aVar.f5910c == null) {
                return null;
            }
            return aVar;
        }
    }

    public d0(l2.b bVar) {
        this.f5901a = bVar;
        int individualAllocationLength = bVar.getIndividualAllocationLength();
        this.f5902b = individualAllocationLength;
        this.f5903c = new w1.u(32);
        a aVar = new a(0L, individualAllocationLength);
        this.f5904d = aVar;
        this.f5905e = aVar;
        this.f5906f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f5910c == null) {
            return;
        }
        this.f5901a.b(aVar);
        aVar.b();
    }

    private static a c(a aVar, long j10) {
        while (j10 >= aVar.f5909b) {
            aVar = aVar.f5911d;
        }
        return aVar;
    }

    private void f(int i10) {
        long j10 = this.f5907g + ((long) i10);
        this.f5907g = j10;
        a aVar = this.f5906f;
        if (j10 == aVar.f5909b) {
            this.f5906f = aVar.f5911d;
        }
    }

    private int g(int i10) {
        a aVar = this.f5906f;
        if (aVar.f5910c == null) {
            aVar.c(this.f5901a.allocate(), new a(this.f5906f.f5909b, this.f5902b));
        }
        return Math.min(i10, (int) (this.f5906f.f5909b - this.f5907g));
    }

    private static a h(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarC = c(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarC.f5909b - j10));
            byteBuffer.put(aVarC.f5910c.f43789a, aVarC.e(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarC.f5909b) {
                aVarC = aVarC.f5911d;
            }
        }
        return aVarC;
    }

    private static a i(a aVar, long j10, byte[] bArr, int i10) {
        a aVarC = c(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarC.f5909b - j10));
            System.arraycopy(aVarC.f5910c.f43789a, aVarC.e(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarC.f5909b) {
                aVarC = aVarC.f5911d;
            }
        }
        return aVarC;
    }

    private static a j(a aVar, DecoderInputBuffer decoderInputBuffer, f0.b bVar, w1.u uVar) {
        long j10 = bVar.f5943b;
        int iM = 1;
        uVar.P(1);
        a aVarI = i(aVar, j10, uVar.e(), 1);
        long j11 = j10 + 1;
        byte b10 = uVar.e()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        b2.c cVar = decoderInputBuffer.f4863c;
        byte[] bArr = cVar.f8276a;
        if (bArr == null) {
            cVar.f8276a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarI2 = i(aVarI, j11, cVar.f8276a, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            uVar.P(2);
            aVarI2 = i(aVarI2, j12, uVar.e(), 2);
            j12 += 2;
            iM = uVar.M();
        }
        int i11 = iM;
        int[] iArr = cVar.f8279d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f8280e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            uVar.P(i12);
            aVarI2 = i(aVarI2, j12, uVar.e(), i12);
            j12 += (long) i12;
            uVar.T(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = uVar.M();
                iArr4[i13] = uVar.K();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f5942a - ((int) (j12 - bVar.f5943b));
        }
        o0.a aVar2 = (o0.a) w1.c0.h(bVar.f5944c);
        cVar.c(i11, iArr2, iArr4, aVar2.f48135b, cVar.f8276a, aVar2.f48134a, aVar2.f48136c, aVar2.f48137d);
        long j13 = bVar.f5943b;
        int i14 = (int) (j12 - j13);
        bVar.f5943b = j13 + ((long) i14);
        bVar.f5942a -= i14;
        return aVarI2;
    }

    private static a k(a aVar, DecoderInputBuffer decoderInputBuffer, f0.b bVar, w1.u uVar) {
        if (decoderInputBuffer.m()) {
            aVar = j(aVar, decoderInputBuffer, bVar, uVar);
        }
        if (!decoderInputBuffer.d()) {
            decoderInputBuffer.k(bVar.f5942a);
            return h(aVar, bVar.f5943b, decoderInputBuffer.f4864d, bVar.f5942a);
        }
        uVar.P(4);
        a aVarI = i(aVar, bVar.f5943b, uVar.e(), 4);
        int iK = uVar.K();
        bVar.f5943b += 4;
        bVar.f5942a -= 4;
        decoderInputBuffer.k(iK);
        a aVarH = h(aVarI, bVar.f5943b, decoderInputBuffer.f4864d, iK);
        bVar.f5943b += (long) iK;
        int i10 = bVar.f5942a - iK;
        bVar.f5942a = i10;
        decoderInputBuffer.o(i10);
        return h(aVarH, bVar.f5943b, decoderInputBuffer.f4867g, bVar.f5942a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f5904d;
            if (j10 < aVar.f5909b) {
                break;
            }
            this.f5901a.a(aVar.f5910c);
            this.f5904d = this.f5904d.b();
        }
        if (this.f5905e.f5908a < aVar.f5908a) {
            this.f5905e = aVar;
        }
    }

    public long d() {
        return this.f5907g;
    }

    public void e(DecoderInputBuffer decoderInputBuffer, f0.b bVar) {
        k(this.f5905e, decoderInputBuffer, bVar, this.f5903c);
    }

    public void l(DecoderInputBuffer decoderInputBuffer, f0.b bVar) {
        this.f5905e = k(this.f5905e, decoderInputBuffer, bVar, this.f5903c);
    }

    public void m() {
        a(this.f5904d);
        this.f5904d.d(0L, this.f5902b);
        a aVar = this.f5904d;
        this.f5905e = aVar;
        this.f5906f = aVar;
        this.f5907g = 0L;
        this.f5901a.trim();
    }

    public void n() {
        this.f5905e = this.f5904d;
    }

    public int o(t1.g gVar, int i10, boolean z10) throws EOFException {
        int iG = g(i10);
        a aVar = this.f5906f;
        int i11 = gVar.read(aVar.f5910c.f43789a, aVar.e(this.f5907g), iG);
        if (i11 != -1) {
            f(i11);
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void p(w1.u uVar, int i10) {
        while (i10 > 0) {
            int iG = g(i10);
            a aVar = this.f5906f;
            uVar.l(aVar.f5910c.f43789a, aVar.e(this.f5907g), iG);
            i10 -= iG;
            f(iG);
        }
    }
}
