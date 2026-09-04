package ha;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.c2;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o9.p;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends com.google.android.exoplayer2.f implements Handler.Callback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c f40307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final e f40308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Handler f40309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final d f40310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f40311t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b f40312u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f40313v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f40314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f40315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private a f40316y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f40317z;

    public f(e eVar, Looper looper) {
        this(eVar, looper, c.f40305a);
    }

    private void L(a aVar, List list) {
        for (int i10 = 0; i10 < aVar.f(); i10++) {
            v0 v0VarK = aVar.e(i10).k();
            if (v0VarK == null || !this.f40307p.a(v0VarK)) {
                list.add(aVar.e(i10));
            } else {
                b bVarB = this.f40307p.b(v0VarK);
                byte[] bArr = (byte[]) ob.a.e(aVar.e(i10).m());
                this.f40310s.b();
                this.f40310s.m(bArr.length);
                ((ByteBuffer) r0.j(this.f40310s.f16754c)).put(bArr);
                this.f40310s.n();
                a aVarA = bVarB.a(this.f40310s);
                if (aVarA != null) {
                    L(aVarA, list);
                }
            }
        }
    }

    private long M(long j10) {
        ob.a.g(j10 != C.TIME_UNSET);
        ob.a.g(this.f40317z != C.TIME_UNSET);
        return j10 - this.f40317z;
    }

    private void N(a aVar) {
        Handler handler = this.f40309r;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            O(aVar);
        }
    }

    private void O(a aVar) {
        this.f40308q.p(aVar);
    }

    private boolean P(long j10) {
        boolean z10;
        a aVar = this.f40316y;
        if (aVar == null || (!this.f40311t && aVar.f40304b > M(j10))) {
            z10 = false;
        } else {
            N(this.f40316y);
            this.f40316y = null;
            z10 = true;
        }
        if (this.f40313v && this.f40316y == null) {
            this.f40314w = true;
        }
        return z10;
    }

    private void Q() {
        if (this.f40313v || this.f40316y != null) {
            return;
        }
        this.f40310s.b();
        p pVarU = u();
        int I = I(pVarU, this.f40310s, 0);
        if (I != -4) {
            if (I == -5) {
                this.f40315x = ((v0) ob.a.e(pVarU.f48303b)).f18872p;
            }
        } else {
            if (this.f40310s.g()) {
                this.f40313v = true;
                return;
            }
            d dVar = this.f40310s;
            dVar.f40306i = this.f40315x;
            dVar.n();
            a aVarA = ((b) r0.j(this.f40312u)).a(this.f40310s);
            if (aVarA != null) {
                ArrayList arrayList = new ArrayList(aVarA.f());
                L(aVarA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f40316y = new a(M(this.f40310s.f16756e), arrayList);
            }
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void B(long j10, boolean z10) {
        this.f40316y = null;
        this.f40313v = false;
        this.f40314w = false;
    }

    @Override // com.google.android.exoplayer2.f
    protected void H(v0[] v0VarArr, long j10, long j11) {
        this.f40312u = this.f40307p.b(v0VarArr[0]);
        a aVar = this.f40316y;
        if (aVar != null) {
            this.f40316y = aVar.c((aVar.f40304b + this.f40317z) - j11);
        }
        this.f40317z = j11;
    }

    @Override // com.google.android.exoplayer2.c2
    public int a(v0 v0Var) {
        if (this.f40307p.a(v0Var)) {
            return c2.h(v0Var.G == 0 ? 4 : 2);
        }
        return c2.h(0);
    }

    @Override // com.google.android.exoplayer2.b2, com.google.android.exoplayer2.c2
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        O((a) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.b2
    public boolean isEnded() {
        return this.f40314w;
    }

    @Override // com.google.android.exoplayer2.b2
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.b2
    public void render(long j10, long j11) {
        boolean zP = true;
        while (zP) {
            Q();
            zP = P(j10);
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void z() {
        this.f40316y = null;
        this.f40312u = null;
        this.f40317z = C.TIME_UNSET;
    }

    public f(e eVar, Looper looper, c cVar) {
        this(eVar, looper, cVar, false);
    }

    public f(e eVar, Looper looper, c cVar, boolean z10) {
        super(5);
        this.f40308q = (e) ob.a.e(eVar);
        this.f40309r = looper == null ? null : r0.v(looper, this);
        this.f40307p = (c) ob.a.e(cVar);
        this.f40311t = z10;
        this.f40310s = new d();
        this.f40317z = C.TIME_UNSET;
    }
}
