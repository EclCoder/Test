package bb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.c2;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.r0;
import ob.u;
import ob.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends com.google.android.exoplayer2.f implements Handler.Callback {
    private n A;
    private n B;
    private int C;
    private long D;
    private long E;
    private long F;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Handler f8806p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final o f8807q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final k f8808r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final o9.p f8809s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8810t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8811u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8812v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f8813w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private v0 f8814x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private j f8815y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private m f8816z;

    public p(o oVar, Looper looper) {
        this(oVar, looper, k.f8791a);
    }

    private void L() {
        W(new f(c0.C(), O(this.F)));
    }

    private long M(long j10) {
        int nextEventTimeIndex = this.A.getNextEventTimeIndex(j10);
        if (nextEventTimeIndex == 0 || this.A.getEventTimeCount() == 0) {
            return this.A.f51533b;
        }
        if (nextEventTimeIndex != -1) {
            return this.A.getEventTime(nextEventTimeIndex - 1);
        }
        n nVar = this.A;
        return nVar.getEventTime(nVar.getEventTimeCount() - 1);
    }

    private long N() {
        if (this.C == -1) {
            return Long.MAX_VALUE;
        }
        ob.a.e(this.A);
        if (this.C >= this.A.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.A.getEventTime(this.C);
    }

    private long O(long j10) {
        ob.a.g(j10 != C.TIME_UNSET);
        ob.a.g(this.E != C.TIME_UNSET);
        return j10 - this.E;
    }

    private void P(SubtitleDecoderException subtitleDecoderException) {
        u.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f8814x, subtitleDecoderException);
        L();
        U();
    }

    private void Q() {
        this.f8812v = true;
        this.f8815y = this.f8808r.b((v0) ob.a.e(this.f8814x));
    }

    private void R(f fVar) {
        this.f8807q.onCues(fVar.f8779a);
        this.f8807q.s(fVar);
    }

    private void S() {
        this.f8816z = null;
        this.C = -1;
        n nVar = this.A;
        if (nVar != null) {
            nVar.l();
            this.A = null;
        }
        n nVar2 = this.B;
        if (nVar2 != null) {
            nVar2.l();
            this.B = null;
        }
    }

    private void T() {
        S();
        ((j) ob.a.e(this.f8815y)).release();
        this.f8815y = null;
        this.f8813w = 0;
    }

    private void U() {
        T();
        Q();
    }

    private void W(f fVar) {
        Handler handler = this.f8806p;
        if (handler != null) {
            handler.obtainMessage(0, fVar).sendToTarget();
        } else {
            R(fVar);
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void B(long j10, boolean z10) {
        this.F = j10;
        L();
        this.f8810t = false;
        this.f8811u = false;
        this.D = C.TIME_UNSET;
        if (this.f8813w != 0) {
            U();
        } else {
            S();
            ((j) ob.a.e(this.f8815y)).flush();
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void H(v0[] v0VarArr, long j10, long j11) {
        this.E = j11;
        this.f8814x = v0VarArr[0];
        if (this.f8815y != null) {
            this.f8813w = 1;
        } else {
            Q();
        }
    }

    public void V(long j10) {
        ob.a.g(isCurrentStreamFinal());
        this.D = j10;
    }

    @Override // com.google.android.exoplayer2.c2
    public int a(v0 v0Var) {
        if (this.f8808r.a(v0Var)) {
            return c2.h(v0Var.G == 0 ? 4 : 2);
        }
        return y.r(v0Var.f18868l) ? c2.h(1) : c2.h(0);
    }

    @Override // com.google.android.exoplayer2.b2, com.google.android.exoplayer2.c2
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        R((f) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.b2
    public boolean isEnded() {
        return this.f8811u;
    }

    @Override // com.google.android.exoplayer2.b2
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.b2
    public void render(long j10, long j11) {
        boolean z10;
        this.F = j10;
        if (isCurrentStreamFinal()) {
            long j12 = this.D;
            if (j12 != C.TIME_UNSET && j10 >= j12) {
                S();
                this.f8811u = true;
            }
        }
        if (this.f8811u) {
            return;
        }
        if (this.B == null) {
            ((j) ob.a.e(this.f8815y)).setPositionUs(j10);
            try {
                this.B = (n) ((j) ob.a.e(this.f8815y)).dequeueOutputBuffer();
            } catch (SubtitleDecoderException e10) {
                P(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.A != null) {
            long jN = N();
            z10 = false;
            while (jN <= j10) {
                this.C++;
                jN = N();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        n nVar = this.B;
        if (nVar != null) {
            if (nVar.g()) {
                if (!z10 && N() == Long.MAX_VALUE) {
                    if (this.f8813w == 2) {
                        U();
                    } else {
                        S();
                        this.f8811u = true;
                    }
                }
            } else if (nVar.f51533b <= j10) {
                n nVar2 = this.A;
                if (nVar2 != null) {
                    nVar2.l();
                }
                this.C = nVar.getNextEventTimeIndex(j10);
                this.A = nVar;
                this.B = null;
                z10 = true;
            }
        }
        if (z10) {
            ob.a.e(this.A);
            W(new f(this.A.getCues(j10), O(M(j10))));
        }
        if (this.f8813w == 2) {
            return;
        }
        while (!this.f8810t) {
            try {
                m mVar = this.f8816z;
                if (mVar == null) {
                    mVar = (m) ((j) ob.a.e(this.f8815y)).dequeueInputBuffer();
                    if (mVar == null) {
                        return;
                    } else {
                        this.f8816z = mVar;
                    }
                }
                if (this.f8813w == 1) {
                    mVar.k(4);
                    ((j) ob.a.e(this.f8815y)).queueInputBuffer(mVar);
                    this.f8816z = null;
                    this.f8813w = 2;
                    return;
                }
                int I = I(this.f8809s, mVar, 0);
                if (I == -4) {
                    if (mVar.g()) {
                        this.f8810t = true;
                        this.f8812v = false;
                    } else {
                        v0 v0Var = this.f8809s.f48303b;
                        if (v0Var == null) {
                            return;
                        }
                        mVar.f8803i = v0Var.f18872p;
                        mVar.n();
                        this.f8812v &= !mVar.i();
                    }
                    if (!this.f8812v) {
                        ((j) ob.a.e(this.f8815y)).queueInputBuffer(mVar);
                        this.f8816z = null;
                    }
                } else if (I == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e11) {
                P(e11);
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void z() {
        this.f8814x = null;
        this.D = C.TIME_UNSET;
        L();
        this.E = C.TIME_UNSET;
        this.F = C.TIME_UNSET;
        T();
    }

    public p(o oVar, Looper looper, k kVar) {
        super(3);
        this.f8807q = (o) ob.a.e(oVar);
        this.f8806p = looper == null ? null : r0.v(looper, this);
        this.f8808r = kVar;
        this.f8809s = new o9.p();
        this.D = C.TIME_UNSET;
        this.E = C.TIME_UNSET;
        this.F = C.TIME_UNSET;
    }
}
