package h2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.f1;
import androidx.media3.exoplayer.g2;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.source.r;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import t1.o;
import t1.u;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h implements Handler.Callback {
    private u A;
    private long B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final a f40163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final b f40164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f40165t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final x2.b f40166u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f40167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private x2.a f40168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f40169x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f40170y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f40171z;

    public c(b bVar, Looper looper) {
        this(bVar, looper, a.f40162a);
    }

    private void Z(u uVar, List list) {
        for (int i10 = 0; i10 < uVar.f(); i10++) {
            o oVarK = uVar.e(i10).k();
            if (oVarK == null || !this.f40163r.a(oVarK)) {
                list.add(uVar.e(i10));
            } else {
                x2.a aVarB = this.f40163r.b(oVarK);
                byte[] bArr = (byte[]) w1.a.e(uVar.e(i10).m());
                this.f40166u.b();
                this.f40166u.k(bArr.length);
                ((ByteBuffer) c0.h(this.f40166u.f4864d)).put(bArr);
                this.f40166u.l();
                u uVarA = aVarB.a(this.f40166u);
                if (uVarA != null) {
                    Z(uVarA, list);
                }
            }
        }
    }

    private long a0(long j10) {
        w1.a.g(j10 != C.TIME_UNSET);
        w1.a.g(this.B != C.TIME_UNSET);
        return j10 - this.B;
    }

    private void b0(u uVar) {
        Handler handler = this.f40165t;
        if (handler != null) {
            handler.obtainMessage(1, uVar).sendToTarget();
        } else {
            c0(uVar);
        }
    }

    private void c0(u uVar) {
        this.f40164s.onMetadata(uVar);
    }

    private boolean d0(long j10) {
        boolean z10;
        u uVar = this.A;
        if (uVar == null || (!this.f40167v && uVar.f53022b > a0(j10))) {
            z10 = false;
        } else {
            b0(this.A);
            this.A = null;
            z10 = true;
        }
        if (this.f40169x && this.A == null) {
            this.f40170y = true;
        }
        return z10;
    }

    private void e0() {
        if (this.f40169x || this.A != null) {
            return;
        }
        this.f40166u.b();
        f1 f1VarF = F();
        int iW = W(f1VarF, this.f40166u, 0);
        if (iW != -4) {
            if (iW == -5) {
                this.f40171z = ((o) w1.a.e(f1VarF.f5339b)).f52762s;
                return;
            }
            return;
        }
        if (this.f40166u.e()) {
            this.f40169x = true;
            return;
        }
        if (this.f40166u.f4866f >= H()) {
            x2.b bVar = this.f40166u;
            bVar.f56622j = this.f40171z;
            bVar.l();
            u uVarA = ((x2.a) c0.h(this.f40168w)).a(this.f40166u);
            if (uVarA != null) {
                ArrayList arrayList = new ArrayList(uVarA.f());
                Z(uVarA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.A = new u(a0(this.f40166u.f4866f), arrayList);
            }
        }
    }

    @Override // androidx.media3.exoplayer.h
    protected void L() {
        this.A = null;
        this.f40168w = null;
        this.B = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.h
    protected void O(long j10, boolean z10) {
        this.A = null;
        this.f40169x = false;
        this.f40170y = false;
    }

    @Override // androidx.media3.exoplayer.h
    protected void U(o[] oVarArr, long j10, long j11, r.b bVar) {
        this.f40168w = this.f40163r.b(oVarArr[0]);
        u uVar = this.A;
        if (uVar != null) {
            this.A = uVar.c((uVar.f53022b + this.B) - j11);
        }
        this.B = j11;
    }

    @Override // androidx.media3.exoplayer.g2
    public int a(o oVar) {
        if (this.f40163r.a(oVar)) {
            return g2.h(oVar.K == 0 ? 4 : 2);
        }
        return g2.h(0);
    }

    @Override // androidx.media3.exoplayer.f2, androidx.media3.exoplayer.g2
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        c0((u) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.f2
    public boolean isEnded() {
        return this.f40170y;
    }

    @Override // androidx.media3.exoplayer.f2
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.f2
    public void render(long j10, long j11) {
        boolean zD0 = true;
        while (zD0) {
            e0();
            zD0 = d0(j10);
        }
    }

    public c(b bVar, Looper looper, a aVar) {
        this(bVar, looper, aVar, false);
    }

    public c(b bVar, Looper looper, a aVar, boolean z10) {
        super(5);
        this.f40164s = (b) w1.a.e(bVar);
        this.f40165t = looper == null ? null : c0.y(looper, this);
        this.f40163r = (a) w1.a.e(aVar);
        this.f40167v = z10;
        this.f40166u = new x2.b();
        this.B = C.TIME_UNSET;
    }
}
