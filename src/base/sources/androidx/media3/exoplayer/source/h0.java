package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.f1;
import androidx.media3.exoplayer.i1;
import androidx.media3.exoplayer.j2;
import androidx.media3.exoplayer.upstream.Loader;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class h0 implements q, Loader.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z1.g f5950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.a.InterfaceC0055a f5951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z1.m f5952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f5953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s.a f5954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i2.v f5955f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f5957h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final t1.o f5959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f5960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f5961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    byte[] f5962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f5963n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f5956g = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Loader f5958i = new Loader("SingleSampleMediaPeriod");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements i2.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f5964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5965b;

        private b() {
        }

        private void b() {
            if (this.f5965b) {
                return;
            }
            h0.this.f5954e.g(t1.v.f(h0.this.f5959j.f52757n), h0.this.f5959j, 0, null, 0L);
            this.f5965b = true;
        }

        @Override // i2.q
        public int a(f1 f1Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            b();
            h0 h0Var = h0.this;
            boolean z10 = h0Var.f5961l;
            if (z10 && h0Var.f5962m == null) {
                this.f5964a = 2;
            }
            int i11 = this.f5964a;
            if (i11 == 2) {
                decoderInputBuffer.a(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                f1Var.f5339b = h0Var.f5959j;
                this.f5964a = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            w1.a.e(h0Var.f5962m);
            decoderInputBuffer.a(1);
            decoderInputBuffer.f4866f = 0L;
            if ((i10 & 4) == 0) {
                decoderInputBuffer.k(h0.this.f5963n);
                ByteBuffer byteBuffer = decoderInputBuffer.f4864d;
                h0 h0Var2 = h0.this;
                byteBuffer.put(h0Var2.f5962m, 0, h0Var2.f5963n);
            }
            if ((i10 & 1) == 0) {
                this.f5964a = 2;
            }
            return -4;
        }

        public void c() {
            if (this.f5964a == 2) {
                this.f5964a = 1;
            }
        }

        @Override // i2.q
        public boolean isReady() {
            return h0.this.f5961l;
        }

        @Override // i2.q
        public void maybeThrowError() throws IOException {
            h0 h0Var = h0.this;
            if (h0Var.f5960k) {
                return;
            }
            h0Var.f5958i.j();
        }

        @Override // i2.q
        public int skipData(long j10) {
            b();
            if (j10 <= 0 || this.f5964a == 2) {
                return 0;
            }
            this.f5964a = 2;
            return 1;
        }
    }

    public h0(z1.g gVar, androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a, z1.m mVar, t1.o oVar, long j10, androidx.media3.exoplayer.upstream.b bVar, s.a aVar, boolean z10) {
        this.f5950a = gVar;
        this.f5951b = interfaceC0055a;
        this.f5952c = mVar;
        this.f5959j = oVar;
        this.f5957h = j10;
        this.f5953d = bVar;
        this.f5954e = aVar;
        this.f5960k = z10;
        this.f5955f = new i2.v(new t1.b0(oVar));
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean a(i1 i1Var) {
        if (this.f5961l || this.f5958i.i() || this.f5958i.h()) {
            return false;
        }
        androidx.media3.datasource.a aVarCreateDataSource = this.f5951b.createDataSource();
        z1.m mVar = this.f5952c;
        if (mVar != null) {
            aVarCreateDataSource.c(mVar);
        }
        c cVar = new c(this.f5950a, aVarCreateDataSource);
        this.f5954e.o(new i2.i(cVar.f5967a, this.f5950a, this.f5958i.n(cVar, this, this.f5953d.a(1))), 1, -1, this.f5959j, 0, null, 0L, this.f5957h);
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void i(c cVar, long j10, long j11, boolean z10) {
        z1.k kVar = cVar.f5969c;
        i2.i iVar = new i2.i(cVar.f5967a, cVar.f5968b, kVar.e(), kVar.f(), j10, j11, kVar.d());
        this.f5953d.b(cVar.f5967a);
        this.f5954e.i(iVar, 1, -1, null, 0, null, 0L, this.f5957h);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long f(k2.q[] qVarArr, boolean[] zArr, i2.q[] qVarArr2, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            i2.q qVar = qVarArr2[i10];
            if (qVar != null && (qVarArr[i10] == null || !zArr[i10])) {
                this.f5956g.remove(qVar);
                qVarArr2[i10] = null;
            }
            if (qVarArr2[i10] == null && qVarArr[i10] != null) {
                b bVar = new b();
                this.f5956g.add(bVar);
                qVarArr2[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void g(q.a aVar, long j10) {
        aVar.d(this);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getBufferedPositionUs() {
        return this.f5961l ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getNextLoadPositionUs() {
        return (this.f5961l || this.f5958i.i()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public i2.v getTrackGroups() {
        return this.f5955f;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f5958i.i();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void h(c cVar, long j10, long j11) {
        this.f5963n = (int) cVar.f5969c.d();
        this.f5962m = (byte[]) w1.a.e(cVar.f5970d);
        this.f5961l = true;
        z1.k kVar = cVar.f5969c;
        i2.i iVar = new i2.i(cVar.f5967a, cVar.f5968b, kVar.e(), kVar.f(), j10, j11, this.f5963n);
        this.f5953d.b(cVar.f5967a);
        this.f5954e.k(iVar, 1, -1, this.f5959j, 0, null, 0L, this.f5957h);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Loader.c b(c cVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarG;
        z1.k kVar = cVar.f5969c;
        i2.i iVar = new i2.i(cVar.f5967a, cVar.f5968b, kVar.e(), kVar.f(), j10, j11, kVar.d());
        long jC = this.f5953d.c(new androidx.media3.exoplayer.upstream.b.a(iVar, new i2.j(1, -1, this.f5959j, 0, null, 0L, w1.c0.c1(this.f5957h)), iOException, i10));
        boolean z10 = jC == C.TIME_UNSET || i10 >= this.f5953d.a(1);
        if (this.f5960k && z10) {
            w1.n.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f5961l = true;
            cVarG = Loader.f6092f;
        } else {
            cVarG = jC != C.TIME_UNSET ? Loader.g(false, jC) : Loader.f6093g;
        }
        Loader.c cVar2 = cVarG;
        boolean zC = cVar2.c();
        this.f5954e.m(iVar, 1, -1, this.f5959j, 0, null, 0L, this.f5957h, iOException, !zC);
        if (!zC) {
            this.f5953d.b(cVar.f5967a);
        }
        return cVar2;
    }

    public void l() {
        this.f5958i.l();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long seekToUs(long j10) {
        for (int i10 = 0; i10 < this.f5956g.size(); i10++) {
            ((b) this.f5956g.get(i10)).c();
        }
        return j10;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c implements Loader.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5967a = i2.i.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z1.g f5968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z1.k f5969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f5970d;

        public c(z1.g gVar, androidx.media3.datasource.a aVar) {
            this.f5968b = gVar;
            this.f5969c = new z1.k(aVar);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void load() {
            this.f5969c.g();
            try {
                this.f5969c.a(this.f5968b);
                int i10 = 0;
                while (i10 != -1) {
                    int iD = (int) this.f5969c.d();
                    byte[] bArr = this.f5970d;
                    if (bArr == null) {
                        this.f5970d = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                    } else if (iD == bArr.length) {
                        this.f5970d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    z1.k kVar = this.f5969c;
                    byte[] bArr2 = this.f5970d;
                    i10 = kVar.read(bArr2, iD, bArr2.length - iD);
                }
            } finally {
                z1.f.a(this.f5969c);
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void cancelLoad() {
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public void maybeThrowPrepareError() {
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void reevaluateBuffer(long j10) {
    }

    @Override // androidx.media3.exoplayer.source.q
    public long c(long j10, j2 j2Var) {
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void discardBuffer(long j10, boolean z10) {
    }
}
