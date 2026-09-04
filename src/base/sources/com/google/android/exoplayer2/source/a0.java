package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nb.b f17401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ob.d0 f17403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f17404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f17405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f17406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f17407g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements nb.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f17408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f17409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public nb.a f17410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f17411d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override // nb.b.a
        public nb.a a() {
            return (nb.a) ob.a.e(this.f17410c);
        }

        public a b() {
            this.f17410c = null;
            a aVar = this.f17411d;
            this.f17411d = null;
            return aVar;
        }

        public void c(nb.a aVar, a aVar2) {
            this.f17410c = aVar;
            this.f17411d = aVar2;
        }

        public void d(long j10, int i10) {
            ob.a.g(this.f17410c == null);
            this.f17408a = j10;
            this.f17409b = j10 + ((long) i10);
        }

        public int e(long j10) {
            return ((int) (j10 - this.f17408a)) + this.f17410c.f46961b;
        }

        @Override // nb.b.a
        public nb.b.a next() {
            a aVar = this.f17411d;
            if (aVar == null || aVar.f17410c == null) {
                return null;
            }
            return aVar;
        }
    }

    public a0(nb.b bVar) {
        this.f17401a = bVar;
        int individualAllocationLength = bVar.getIndividualAllocationLength();
        this.f17402b = individualAllocationLength;
        this.f17403c = new ob.d0(32);
        a aVar = new a(0L, individualAllocationLength);
        this.f17404d = aVar;
        this.f17405e = aVar;
        this.f17406f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f17410c == null) {
            return;
        }
        this.f17401a.a(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f17409b) {
            aVar = aVar.f17411d;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f17407g + ((long) i10);
        this.f17407g = j10;
        a aVar = this.f17406f;
        if (j10 == aVar.f17409b) {
            this.f17406f = aVar.f17411d;
        }
    }

    private int h(int i10) {
        a aVar = this.f17406f;
        if (aVar.f17410c == null) {
            aVar.c(this.f17401a.allocate(), new a(this.f17406f.f17409b, this.f17402b));
        }
        return Math.min(i10, (int) (this.f17406f.f17409b - this.f17407g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarD = d(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarD.f17409b - j10));
            byteBuffer.put(aVarD.f17410c.f46960a, aVarD.e(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f17409b) {
                aVarD = aVarD.f17411d;
            }
        }
        return aVarD;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a aVarD = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarD.f17409b - j10));
            System.arraycopy(aVarD.f17410c.f46960a, aVarD.e(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f17409b) {
                aVarD = aVarD.f17411d;
            }
        }
        return aVarD;
    }

    private static a k(a aVar, DecoderInputBuffer decoderInputBuffer, c0.b bVar, ob.d0 d0Var) {
        long j10 = bVar.f17459b;
        int iN = 1;
        d0Var.Q(1);
        a aVarJ = j(aVar, j10, d0Var.e(), 1);
        long j11 = j10 + 1;
        byte b10 = d0Var.e()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        s9.c cVar = decoderInputBuffer.f16753b;
        byte[] bArr = cVar.f51509a;
        if (bArr == null) {
            cVar.f51509a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarJ2 = j(aVarJ, j11, cVar.f51509a, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            d0Var.Q(2);
            aVarJ2 = j(aVarJ2, j12, d0Var.e(), 2);
            j12 += 2;
            iN = d0Var.N();
        }
        int i11 = iN;
        int[] iArr = cVar.f51512d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f51513e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            d0Var.Q(i12);
            aVarJ2 = j(aVarJ2, j12, d0Var.e(), i12);
            j12 += (long) i12;
            d0Var.U(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = d0Var.N();
                iArr4[i13] = d0Var.L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f17458a - ((int) (j12 - bVar.f17459b));
        }
        u9.b0.a aVar2 = (u9.b0.a) r0.j(bVar.f17460c);
        cVar.c(i11, iArr2, iArr4, aVar2.f54234b, cVar.f51509a, aVar2.f54233a, aVar2.f54235c, aVar2.f54236d);
        long j13 = bVar.f17459b;
        int i14 = (int) (j12 - j13);
        bVar.f17459b = j13 + ((long) i14);
        bVar.f17458a -= i14;
        return aVarJ2;
    }

    private static a l(a aVar, DecoderInputBuffer decoderInputBuffer, c0.b bVar, ob.d0 d0Var) {
        if (decoderInputBuffer.o()) {
            aVar = k(aVar, decoderInputBuffer, bVar, d0Var);
        }
        if (!decoderInputBuffer.e()) {
            decoderInputBuffer.m(bVar.f17458a);
            return i(aVar, bVar.f17459b, decoderInputBuffer.f16754c, bVar.f17458a);
        }
        d0Var.Q(4);
        a aVarJ = j(aVar, bVar.f17459b, d0Var.e(), 4);
        int iL = d0Var.L();
        bVar.f17459b += 4;
        bVar.f17458a -= 4;
        decoderInputBuffer.m(iL);
        a aVarI = i(aVarJ, bVar.f17459b, decoderInputBuffer.f16754c, iL);
        bVar.f17459b += (long) iL;
        int i10 = bVar.f17458a - iL;
        bVar.f17458a = i10;
        decoderInputBuffer.q(i10);
        return i(aVarI, bVar.f17459b, decoderInputBuffer.f16757f, bVar.f17458a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f17404d;
            if (j10 < aVar.f17409b) {
                break;
            }
            this.f17401a.b(aVar.f17410c);
            this.f17404d = this.f17404d.b();
        }
        if (this.f17405e.f17408a < aVar.f17408a) {
            this.f17405e = aVar;
        }
    }

    public void c(long j10) {
        ob.a.a(j10 <= this.f17407g);
        this.f17407g = j10;
        if (j10 != 0) {
            a aVar = this.f17404d;
            if (j10 != aVar.f17408a) {
                while (this.f17407g > aVar.f17409b) {
                    aVar = aVar.f17411d;
                }
                a aVar2 = (a) ob.a.e(aVar.f17411d);
                a(aVar2);
                a aVar3 = new a(aVar.f17409b, this.f17402b);
                aVar.f17411d = aVar3;
                if (this.f17407g == aVar.f17409b) {
                    aVar = aVar3;
                }
                this.f17406f = aVar;
                if (this.f17405e == aVar2) {
                    this.f17405e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f17404d);
        a aVar4 = new a(this.f17407g, this.f17402b);
        this.f17404d = aVar4;
        this.f17405e = aVar4;
        this.f17406f = aVar4;
    }

    public long e() {
        return this.f17407g;
    }

    public void f(DecoderInputBuffer decoderInputBuffer, c0.b bVar) {
        l(this.f17405e, decoderInputBuffer, bVar, this.f17403c);
    }

    public void m(DecoderInputBuffer decoderInputBuffer, c0.b bVar) {
        this.f17405e = l(this.f17405e, decoderInputBuffer, bVar, this.f17403c);
    }

    public void n() {
        a(this.f17404d);
        this.f17404d.d(0L, this.f17402b);
        a aVar = this.f17404d;
        this.f17405e = aVar;
        this.f17406f = aVar;
        this.f17407g = 0L;
        this.f17401a.trim();
    }

    public void o() {
        this.f17405e = this.f17404d;
    }

    public int p(nb.h hVar, int i10, boolean z10) throws EOFException {
        int iH = h(i10);
        a aVar = this.f17406f;
        int i11 = hVar.read(aVar.f17410c.f46960a, aVar.e(this.f17407g), iH);
        if (i11 != -1) {
            g(i11);
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(ob.d0 d0Var, int i10) {
        while (i10 > 0) {
            int iH = h(i10);
            a aVar = this.f17406f;
            d0Var.l(aVar.f17410c.f46960a, aVar.e(this.f17407g), iH);
            i10 -= iH;
            g(iH);
        }
    }
}
