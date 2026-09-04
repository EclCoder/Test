package j2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.f1;
import androidx.media3.exoplayer.g2;
import androidx.media3.exoplayer.source.r;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Objects;
import l3.l;
import l3.p;
import t1.o;
import t1.v;
import w1.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i extends androidx.media3.exoplayer.h implements Handler.Callback {
    private p A;
    private int B;
    private final Handler C;
    private final h D;
    private final f1 E;
    private boolean F;
    private boolean G;
    private o H;
    private long I;
    private long J;
    private long K;
    private boolean L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final l3.b f41919r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final DecoderInputBuffer f41920s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a f41921t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final g f41922u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f41923v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f41924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private l f41925x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private l3.o f41926y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p f41927z;

    public i(h hVar, Looper looper) {
        this(hVar, looper, g.f41917a);
    }

    private void Z() {
        w1.a.h(this.L || Objects.equals(this.H.f52757n, MimeTypes.APPLICATION_CEA608) || Objects.equals(this.H.f52757n, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(this.H.f52757n, MimeTypes.APPLICATION_CEA708), "Legacy decoding is disabled, can't handle " + this.H.f52757n + " samples (expected application/x-media3-cues).");
    }

    private void a0() {
        p0(new v1.b(c0.C(), d0(this.J)));
    }

    private long b0(long j10) {
        int nextEventTimeIndex = this.f41927z.getNextEventTimeIndex(j10);
        if (nextEventTimeIndex == 0 || this.f41927z.getEventTimeCount() == 0) {
            return this.f41927z.f8288b;
        }
        if (nextEventTimeIndex != -1) {
            return this.f41927z.getEventTime(nextEventTimeIndex - 1);
        }
        p pVar = this.f41927z;
        return pVar.getEventTime(pVar.getEventTimeCount() - 1);
    }

    private long c0() {
        if (this.B == -1) {
            return Long.MAX_VALUE;
        }
        w1.a.e(this.f41927z);
        if (this.B >= this.f41927z.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.f41927z.getEventTime(this.B);
    }

    private long d0(long j10) {
        w1.a.g(j10 != C.TIME_UNSET);
        w1.a.g(this.I != C.TIME_UNSET);
        return j10 - this.I;
    }

    private void e0(SubtitleDecoderException subtitleDecoderException) {
        n.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.H, subtitleDecoderException);
        a0();
        n0();
    }

    private void f0() {
        this.f41923v = true;
        l lVarB = this.f41922u.b((o) w1.a.e(this.H));
        this.f41925x = lVarB;
        lVarB.a(H());
    }

    private void g0(v1.b bVar) {
        this.D.onCues(bVar.f55095a);
        this.D.onCues(bVar);
    }

    private static boolean h0(o oVar) {
        return Objects.equals(oVar.f52757n, "application/x-media3-cues");
    }

    private boolean i0(long j10) {
        if (this.F || W(this.E, this.f41920s, 0) != -4) {
            return false;
        }
        if (this.f41920s.e()) {
            this.F = true;
            return false;
        }
        this.f41920s.l();
        ByteBuffer byteBuffer = (ByteBuffer) w1.a.e(this.f41920s.f4864d);
        l3.e eVarA = this.f41919r.a(this.f41920s.f4866f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f41920s.b();
        return this.f41921t.c(eVarA, j10);
    }

    private void j0() {
        this.f41926y = null;
        this.B = -1;
        p pVar = this.f41927z;
        if (pVar != null) {
            pVar.j();
            this.f41927z = null;
        }
        p pVar2 = this.A;
        if (pVar2 != null) {
            pVar2.j();
            this.A = null;
        }
    }

    private void k0() {
        j0();
        ((l) w1.a.e(this.f41925x)).release();
        this.f41925x = null;
        this.f41924w = 0;
    }

    private void l0(long j10) {
        boolean zI0 = i0(j10);
        long jD = this.f41921t.d(this.J);
        if (jD == Long.MIN_VALUE && this.F && !zI0) {
            this.G = true;
        }
        if (jD != Long.MIN_VALUE && jD <= j10) {
            zI0 = true;
        }
        if (zI0) {
            c0 c0VarA = this.f41921t.a(j10);
            long jB = this.f41921t.b(j10);
            p0(new v1.b(c0VarA, d0(jB)));
            this.f41921t.e(jB);
        }
        this.J = j10;
    }

    private void m0(long j10) {
        boolean z10;
        this.J = j10;
        if (this.A == null) {
            ((l) w1.a.e(this.f41925x)).setPositionUs(j10);
            try {
                this.A = (p) ((l) w1.a.e(this.f41925x)).dequeueOutputBuffer();
            } catch (SubtitleDecoderException e10) {
                e0(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f41927z != null) {
            long jC0 = c0();
            z10 = false;
            while (jC0 <= j10) {
                this.B++;
                jC0 = c0();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        p pVar = this.A;
        if (pVar != null) {
            if (pVar.e()) {
                if (!z10 && c0() == Long.MAX_VALUE) {
                    if (this.f41924w == 2) {
                        n0();
                    } else {
                        j0();
                        this.G = true;
                    }
                }
            } else if (pVar.f8288b <= j10) {
                p pVar2 = this.f41927z;
                if (pVar2 != null) {
                    pVar2.j();
                }
                this.B = pVar.getNextEventTimeIndex(j10);
                this.f41927z = pVar;
                this.A = null;
                z10 = true;
            }
        }
        if (z10) {
            w1.a.e(this.f41927z);
            p0(new v1.b(this.f41927z.getCues(j10), d0(b0(j10))));
        }
        if (this.f41924w == 2) {
            return;
        }
        while (!this.F) {
            try {
                l3.o oVar = this.f41926y;
                if (oVar == null) {
                    oVar = (l3.o) ((l) w1.a.e(this.f41925x)).dequeueInputBuffer();
                    if (oVar == null) {
                        return;
                    } else {
                        this.f41926y = oVar;
                    }
                }
                if (this.f41924w == 1) {
                    oVar.i(4);
                    ((l) w1.a.e(this.f41925x)).queueInputBuffer(oVar);
                    this.f41926y = null;
                    this.f41924w = 2;
                    return;
                }
                int iW = W(this.E, oVar, 0);
                if (iW == -4) {
                    if (oVar.e()) {
                        this.F = true;
                        this.f41923v = false;
                    } else {
                        o oVar2 = this.E.f5339b;
                        if (oVar2 == null) {
                            return;
                        }
                        oVar.f43869j = oVar2.f52762s;
                        oVar.l();
                        this.f41923v &= !oVar.g();
                    }
                    if (!this.f41923v) {
                        ((l) w1.a.e(this.f41925x)).queueInputBuffer(oVar);
                        this.f41926y = null;
                    }
                } else if (iW == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e11) {
                e0(e11);
                return;
            }
        }
    }

    private void n0() {
        k0();
        f0();
    }

    private void p0(v1.b bVar) {
        Handler handler = this.C;
        if (handler != null) {
            handler.obtainMessage(1, bVar).sendToTarget();
        } else {
            g0(bVar);
        }
    }

    @Override // androidx.media3.exoplayer.h
    protected void L() {
        this.H = null;
        this.K = C.TIME_UNSET;
        a0();
        this.I = C.TIME_UNSET;
        this.J = C.TIME_UNSET;
        if (this.f41925x != null) {
            k0();
        }
    }

    @Override // androidx.media3.exoplayer.h
    protected void O(long j10, boolean z10) {
        this.J = j10;
        a aVar = this.f41921t;
        if (aVar != null) {
            aVar.clear();
        }
        a0();
        this.F = false;
        this.G = false;
        this.K = C.TIME_UNSET;
        o oVar = this.H;
        if (oVar == null || h0(oVar)) {
            return;
        }
        if (this.f41924w != 0) {
            n0();
            return;
        }
        j0();
        l lVar = (l) w1.a.e(this.f41925x);
        lVar.flush();
        lVar.a(H());
    }

    @Override // androidx.media3.exoplayer.h
    protected void U(o[] oVarArr, long j10, long j11, r.b bVar) {
        this.I = j11;
        o oVar = oVarArr[0];
        this.H = oVar;
        if (h0(oVar)) {
            this.f41921t = this.H.H == 1 ? new e() : new f();
            return;
        }
        Z();
        if (this.f41925x != null) {
            this.f41924w = 1;
        } else {
            f0();
        }
    }

    @Override // androidx.media3.exoplayer.g2
    public int a(o oVar) {
        if (h0(oVar) || this.f41922u.a(oVar)) {
            return g2.h(oVar.K == 0 ? 4 : 2);
        }
        return v.j(oVar.f52757n) ? g2.h(1) : g2.h(0);
    }

    @Override // androidx.media3.exoplayer.f2, androidx.media3.exoplayer.g2
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        g0((v1.b) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.f2
    public boolean isEnded() {
        return this.G;
    }

    @Override // androidx.media3.exoplayer.f2
    public boolean isReady() {
        return true;
    }

    public void o0(long j10) {
        w1.a.g(isCurrentStreamFinal());
        this.K = j10;
    }

    @Override // androidx.media3.exoplayer.f2
    public void render(long j10, long j11) {
        if (isCurrentStreamFinal()) {
            long j12 = this.K;
            if (j12 != C.TIME_UNSET && j10 >= j12) {
                j0();
                this.G = true;
            }
        }
        if (this.G) {
            return;
        }
        if (h0((o) w1.a.e(this.H))) {
            w1.a.e(this.f41921t);
            l0(j10);
        } else {
            Z();
            m0(j10);
        }
    }

    public i(h hVar, Looper looper, g gVar) {
        super(3);
        this.D = (h) w1.a.e(hVar);
        this.C = looper == null ? null : w1.c0.y(looper, this);
        this.f41922u = gVar;
        this.f41919r = new l3.b();
        this.f41920s = new DecoderInputBuffer(1);
        this.E = new f1();
        this.K = C.TIME_UNSET;
        this.I = C.TIME_UNSET;
        this.J = C.TIME_UNSET;
        this.L = false;
    }
}
