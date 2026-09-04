package f2;

import android.graphics.Bitmap;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.f1;
import androidx.media3.exoplayer.g2;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.image.ImageDecoderException;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import t1.o;
import w1.a0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f extends h {
    private int A;
    private o B;
    private c C;
    private DecoderInputBuffer D;
    private d E;
    private Bitmap F;
    private boolean G;
    private b H;
    private b I;
    private int J;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c.a f38225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final DecoderInputBuffer f38226s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayDeque f38227t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f38228u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f38229v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private a f38230w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f38231x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f38232y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f38233z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f38234c = new a(C.TIME_UNSET, C.TIME_UNSET);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f38235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f38236b;

        public a(long j10, long j11) {
            this.f38235a = j10;
            this.f38236b = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f38237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f38238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f38239c;

        public b(int i10, long j10) {
            this.f38237a = i10;
            this.f38238b = j10;
        }

        public long a() {
            return this.f38238b;
        }

        public Bitmap b() {
            return this.f38239c;
        }

        public int c() {
            return this.f38237a;
        }

        public boolean d() {
            return this.f38239c != null;
        }

        public void e(Bitmap bitmap) {
            this.f38239c = bitmap;
        }
    }

    public f(c.a aVar, d dVar) {
        super(4);
        this.f38225r = aVar;
        this.E = d0(dVar);
        this.f38226s = DecoderInputBuffer.n();
        this.f38230w = a.f38234c;
        this.f38227t = new ArrayDeque();
        this.f38232y = C.TIME_UNSET;
        this.f38231x = C.TIME_UNSET;
        this.f38233z = 0;
        this.A = 1;
    }

    private boolean Z(o oVar) {
        int iA = this.f38225r.a(oVar);
        return iA == g2.h(4) || iA == g2.h(3);
    }

    private Bitmap a0(int i10) {
        w1.a.i(this.F);
        int width = this.F.getWidth() / ((o) w1.a.i(this.B)).I;
        int height = this.F.getHeight() / ((o) w1.a.i(this.B)).J;
        int i11 = this.B.I;
        return Bitmap.createBitmap(this.F, (i10 % i11) * width, (i10 / i11) * height, width, height);
    }

    private boolean b0(long j10, long j11) throws ExoPlaybackException {
        if (this.F != null && this.H == null) {
            return false;
        }
        if (this.A == 0 && getState() != 2) {
            return false;
        }
        if (this.F == null) {
            w1.a.i(this.C);
            e eVarDequeueOutputBuffer = this.C.dequeueOutputBuffer();
            if (eVarDequeueOutputBuffer == null) {
                return false;
            }
            if (((e) w1.a.i(eVarDequeueOutputBuffer)).e()) {
                if (this.f38233z == 3) {
                    k0();
                    w1.a.i(this.B);
                    e0();
                } else {
                    ((e) w1.a.i(eVarDequeueOutputBuffer)).j();
                    if (this.f38227t.isEmpty()) {
                        this.f38229v = true;
                    }
                }
                return false;
            }
            w1.a.j(eVarDequeueOutputBuffer.f38224e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.F = eVarDequeueOutputBuffer.f38224e;
            ((e) w1.a.i(eVarDequeueOutputBuffer)).j();
        }
        if (!this.G || this.F == null || this.H == null) {
            return false;
        }
        w1.a.i(this.B);
        o oVar = this.B;
        int i10 = oVar.I;
        boolean z10 = ((i10 == 1 && oVar.J == 1) || i10 == -1 || oVar.J == -1) ? false : true;
        if (!this.H.d()) {
            b bVar = this.H;
            bVar.e(z10 ? a0(bVar.c()) : (Bitmap) w1.a.i(this.F));
        }
        if (!j0(j10, j11, (Bitmap) w1.a.i(this.H.b()), this.H.a())) {
            return false;
        }
        i0(((b) w1.a.i(this.H)).a());
        this.A = 3;
        if (!z10 || ((b) w1.a.i(this.H)).c() == (((o) w1.a.i(this.B)).J * ((o) w1.a.i(this.B)).I) - 1) {
            this.F = null;
        }
        this.H = this.I;
        this.I = null;
        return true;
    }

    private boolean c0(long j10) {
        if (this.G && this.H != null) {
            return false;
        }
        f1 f1VarF = F();
        c cVar = this.C;
        if (cVar == null || this.f38233z == 3 || this.f38228u) {
            return false;
        }
        if (this.D == null) {
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) cVar.dequeueInputBuffer();
            this.D = decoderInputBuffer;
            if (decoderInputBuffer == null) {
                return false;
            }
        }
        if (this.f38233z == 2) {
            w1.a.i(this.D);
            this.D.i(4);
            ((c) w1.a.i(this.C)).b(this.D);
            this.D = null;
            this.f38233z = 3;
            return false;
        }
        int iW = W(f1VarF, this.D, 0);
        if (iW == -5) {
            this.B = (o) w1.a.i(f1VarF.f5339b);
            this.f38233z = 2;
            return true;
        }
        if (iW != -4) {
            if (iW == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.D.l();
        boolean z10 = ((ByteBuffer) w1.a.i(this.D.f4864d)).remaining() > 0 || ((DecoderInputBuffer) w1.a.i(this.D)).e();
        if (z10) {
            ((c) w1.a.i(this.C)).b((DecoderInputBuffer) w1.a.i(this.D));
            this.J = 0;
        }
        h0(j10, (DecoderInputBuffer) w1.a.i(this.D));
        if (((DecoderInputBuffer) w1.a.i(this.D)).e()) {
            this.f38228u = true;
            this.D = null;
            return false;
        }
        this.f38232y = Math.max(this.f38232y, ((DecoderInputBuffer) w1.a.i(this.D)).f4866f);
        if (z10) {
            this.D = null;
        } else {
            ((DecoderInputBuffer) w1.a.i(this.D)).b();
        }
        return !this.G;
    }

    private static d d0(d dVar) {
        return dVar == null ? d.f38223a : dVar;
    }

    private void e0() throws ExoPlaybackException {
        if (!Z(this.B)) {
            throw B(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.B, 4005);
        }
        c cVar = this.C;
        if (cVar != null) {
            cVar.release();
        }
        this.C = this.f38225r.b();
    }

    private boolean f0(b bVar) {
        return ((o) w1.a.i(this.B)).I == -1 || this.B.J == -1 || bVar.c() == (((o) w1.a.i(this.B)).J * this.B.I) - 1;
    }

    private void g0(int i10) {
        this.A = Math.min(this.A, i10);
    }

    private void h0(long j10, DecoderInputBuffer decoderInputBuffer) {
        boolean z10 = true;
        if (decoderInputBuffer.e()) {
            this.G = true;
            return;
        }
        b bVar = new b(this.J, decoderInputBuffer.f4866f);
        this.I = bVar;
        this.J++;
        if (!this.G) {
            long jA = bVar.a();
            boolean z11 = jA - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL <= j10 && j10 <= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL + jA;
            b bVar2 = this.H;
            boolean z12 = bVar2 != null && bVar2.a() <= j10 && j10 < jA;
            boolean zF0 = f0((b) w1.a.i(this.I));
            if (!z11 && !z12 && !zF0) {
                z10 = false;
            }
            this.G = z10;
            if (z12 && !z11) {
                return;
            }
        }
        this.H = this.I;
        this.I = null;
    }

    private void i0(long j10) {
        this.f38231x = j10;
        while (!this.f38227t.isEmpty() && j10 >= ((a) this.f38227t.peek()).f38235a) {
            this.f38230w = (a) this.f38227t.removeFirst();
        }
    }

    private void k0() {
        this.D = null;
        this.f38233z = 0;
        this.f38232y = C.TIME_UNSET;
        c cVar = this.C;
        if (cVar != null) {
            cVar.release();
            this.C = null;
        }
    }

    private void l0(d dVar) {
        this.E = d0(dVar);
    }

    private boolean m0() {
        boolean z10 = getState() == 2;
        int i10 = this.A;
        if (i10 == 0) {
            return z10;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.h
    protected void L() {
        this.B = null;
        this.f38230w = a.f38234c;
        this.f38227t.clear();
        k0();
        this.E.a();
    }

    @Override // androidx.media3.exoplayer.h
    protected void M(boolean z10, boolean z11) {
        this.A = z11 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.h
    protected void O(long j10, boolean z10) {
        g0(1);
        this.f38229v = false;
        this.f38228u = false;
        this.F = null;
        this.H = null;
        this.I = null;
        this.G = false;
        this.D = null;
        c cVar = this.C;
        if (cVar != null) {
            cVar.flush();
        }
        this.f38227t.clear();
    }

    @Override // androidx.media3.exoplayer.h
    protected void P() {
        k0();
    }

    @Override // androidx.media3.exoplayer.h
    protected void R() {
        k0();
        g0(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void U(t1.o[] r5, long r6, long r8, androidx.media3.exoplayer.source.r.b r10) {
        /*
            r4 = this;
            super.U(r5, r6, r8, r10)
            r5 = r4
            f2.f$a r6 = r5.f38230w
            long r6 = r6.f38236b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L37
            java.util.ArrayDeque r6 = r5.f38227t
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L2a
            long r6 = r5.f38232y
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L37
            long r2 = r5.f38231x
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L2a
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L2a
            goto L37
        L2a:
            java.util.ArrayDeque r6 = r5.f38227t
            f2.f$a r7 = new f2.f$a
            long r0 = r5.f38232y
            r7.<init>(r0, r8)
            r6.add(r7)
            return
        L37:
            f2.f$a r6 = new f2.f$a
            r6.<init>(r0, r8)
            r5.f38230w = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.f.U(t1.o[], long, long, androidx.media3.exoplayer.source.r$b):void");
    }

    @Override // androidx.media3.exoplayer.g2
    public int a(o oVar) {
        return this.f38225r.a(oVar);
    }

    @Override // androidx.media3.exoplayer.f2, androidx.media3.exoplayer.g2
    public String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.h, androidx.media3.exoplayer.d2.b
    public void handleMessage(int i10, Object obj) {
        if (i10 != 15) {
            super.handleMessage(i10, obj);
        } else {
            l0(obj instanceof d ? (d) obj : null);
        }
    }

    @Override // androidx.media3.exoplayer.f2
    public boolean isEnded() {
        return this.f38229v;
    }

    @Override // androidx.media3.exoplayer.f2
    public boolean isReady() {
        int i10 = this.A;
        if (i10 != 3) {
            return i10 == 0 && this.G;
        }
        return true;
    }

    protected boolean j0(long j10, long j11, Bitmap bitmap, long j12) {
        long j13 = j12 - j10;
        if (!m0() && j13 >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            return false;
        }
        this.E.b(j12 - this.f38230w.f38236b, bitmap);
        return true;
    }

    @Override // androidx.media3.exoplayer.f2
    public void render(long j10, long j11) throws ExoPlaybackException {
        if (this.f38229v) {
            return;
        }
        if (this.B == null) {
            f1 f1VarF = F();
            this.f38226s.b();
            int iW = W(f1VarF, this.f38226s, 2);
            if (iW != -5) {
                if (iW == -4) {
                    w1.a.g(this.f38226s.e());
                    this.f38228u = true;
                    this.f38229v = true;
                    return;
                }
                return;
            }
            this.B = (o) w1.a.i(f1VarF.f5339b);
            e0();
        }
        try {
            a0.a("drainAndFeedDecoder");
            while (b0(j10, j11)) {
            }
            while (c0(j10)) {
            }
            a0.b();
        } catch (ImageDecoderException e10) {
            throw B(e10, null, 4003);
        }
    }
}
