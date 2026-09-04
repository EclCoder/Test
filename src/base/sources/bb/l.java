package bb;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import ob.d0;
import ob.r0;
import u9.b0;
import u9.x;
import u9.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class l implements u9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f8792a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v0 f8795d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u9.m f8798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b0 f8799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8800i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f8793b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f8794c = new d0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f8796e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f8797f = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8801j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f8802k = C.TIME_UNSET;

    public l(j jVar, v0 v0Var) {
        this.f8792a = jVar;
        this.f8795d = v0Var.b().g0("text/x-exoplayer-cues").K(v0Var.f18868l).G();
    }

    private void a() throws ParserException, InterruptedIOException {
        try {
            m mVar = (m) this.f8792a.dequeueInputBuffer();
            while (mVar == null) {
                Thread.sleep(5L);
                mVar = (m) this.f8792a.dequeueInputBuffer();
            }
            mVar.m(this.f8800i);
            mVar.f16754c.put(this.f8794c.e(), 0, this.f8800i);
            mVar.f16754c.limit(this.f8800i);
            this.f8792a.queueInputBuffer(mVar);
            n nVar = (n) this.f8792a.dequeueOutputBuffer();
            while (nVar == null) {
                Thread.sleep(5L);
                nVar = (n) this.f8792a.dequeueOutputBuffer();
            }
            for (int i10 = 0; i10 < nVar.getEventTimeCount(); i10++) {
                byte[] bArrA = this.f8793b.a(nVar.getCues(nVar.getEventTime(i10)));
                this.f8796e.add(Long.valueOf(nVar.getEventTime(i10)));
                this.f8797f.add(new d0(bArrA));
            }
            nVar.l();
        } catch (SubtitleDecoderException e10) {
            throw ParserException.a("SubtitleDecoder failed.", e10);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    private boolean e(u9.l lVar) {
        int iB = this.f8794c.b();
        int i10 = this.f8800i;
        if (iB == i10) {
            this.f8794c.c(i10 + UserVerificationMethods.USER_VERIFY_ALL);
        }
        int i11 = lVar.read(this.f8794c.e(), this.f8800i, this.f8794c.b() - this.f8800i);
        if (i11 != -1) {
            this.f8800i += i11;
        }
        long length = lVar.getLength();
        return (length != -1 && ((long) this.f8800i) == length) || i11 == -1;
    }

    private boolean f(u9.l lVar) {
        return lVar.skip((lVar.getLength() > (-1L) ? 1 : (lVar.getLength() == (-1L) ? 0 : -1)) != 0 ? com.google.common.primitives.g.d(lVar.getLength()) : UserVerificationMethods.USER_VERIFY_ALL) == -1;
    }

    private void g() {
        ob.a.i(this.f8799h);
        ob.a.g(this.f8796e.size() == this.f8797f.size());
        long j10 = this.f8802k;
        for (int iF = j10 == C.TIME_UNSET ? 0 : r0.f(this.f8796e, Long.valueOf(j10), true, true); iF < this.f8797f.size(); iF++) {
            d0 d0Var = (d0) this.f8797f.get(iF);
            d0Var.U(0);
            int length = d0Var.e().length;
            this.f8799h.c(d0Var, length);
            this.f8799h.f(((Long) this.f8796e.get(iF)).longValue(), 1, length, 0, null);
        }
    }

    @Override // u9.k
    public void b(u9.m mVar) {
        ob.a.g(this.f8801j == 0);
        this.f8798g = mVar;
        this.f8799h = mVar.track(0, 3);
        this.f8798g.endTracks();
        this.f8798g.c(new x(new long[]{0}, new long[]{0}, C.TIME_UNSET));
        this.f8799h.e(this.f8795d);
        this.f8801j = 1;
    }

    @Override // u9.k
    public int c(u9.l lVar, y yVar) throws ParserException, InterruptedIOException {
        int i10 = this.f8801j;
        ob.a.g((i10 == 0 || i10 == 5) ? false : true);
        if (this.f8801j == 1) {
            this.f8794c.Q(lVar.getLength() != -1 ? com.google.common.primitives.g.d(lVar.getLength()) : UserVerificationMethods.USER_VERIFY_ALL);
            this.f8800i = 0;
            this.f8801j = 2;
        }
        if (this.f8801j == 2 && e(lVar)) {
            a();
            g();
            this.f8801j = 4;
        }
        if (this.f8801j == 3 && f(lVar)) {
            g();
            this.f8801j = 4;
        }
        return this.f8801j == 4 ? -1 : 0;
    }

    @Override // u9.k
    public boolean d(u9.l lVar) {
        return true;
    }

    @Override // u9.k
    public void release() {
        if (this.f8801j == 5) {
            return;
        }
        this.f8792a.release();
        this.f8801j = 5;
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        int i10 = this.f8801j;
        ob.a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f8802k = j11;
        if (this.f8801j == 2) {
            this.f8801j = 1;
        }
        if (this.f8801j == 4) {
            this.f8801j = 3;
        }
    }
}
