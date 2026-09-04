package i2;

import android.net.Uri;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.media3.exoplayer.source.w;
import com.google.common.collect.c0;
import com.google.common.collect.l0;
import java.io.EOFException;
import java.util.Map;
import o2.i0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o2.u f40749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o2.p f40750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o2.q f40751c;

    public b(o2.u uVar) {
        this.f40749a = uVar;
    }

    @Override // androidx.media3.exoplayer.source.w
    public void a() {
        o2.p pVar = this.f40750b;
        if (pVar == null) {
            return;
        }
        o2.p pVarE = pVar.e();
        if (pVarE instanceof h3.f) {
            ((h3.f) pVarE).k();
        }
    }

    @Override // androidx.media3.exoplayer.source.w
    public long b() {
        o2.q qVar = this.f40751c;
        if (qVar != null) {
            return qVar.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.w
    public int c(i0 i0Var) {
        return ((o2.p) w1.a.e(this.f40750b)).b((o2.q) w1.a.e(this.f40751c), i0Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    @Override // androidx.media3.exoplayer.source.w
    public void d(t1.g gVar, Uri uri, Map map, long j10, long j11, o2.r rVar) throws UnrecognizedInputFormatException {
        o2.i iVar = new o2.i(gVar, j10, j11);
        this.f40751c = iVar;
        if (this.f40750b != null) {
            return;
        }
        o2.p[] pVarArrA = this.f40749a.a(uri, map);
        c0.a aVarU = c0.u(pVarArrA.length);
        if (pVarArrA.length == 1) {
            this.f40750b = pVarArrA[0];
        } else {
            for (o2.p pVar : pVarArrA) {
                try {
                    if (pVar.d(iVar)) {
                        this.f40750b = pVar;
                        w1.a.g(true);
                        iVar.resetPeekPosition();
                        break;
                    } else {
                        aVarU.k(pVar.f());
                        boolean z10 = this.f40750b != null || iVar.getPosition() == j10;
                        w1.a.g(z10);
                        iVar.resetPeekPosition();
                    }
                } catch (EOFException unused) {
                    if (this.f40750b != null || iVar.getPosition() == j10) {
                    }
                } catch (Throwable th2) {
                    w1.a.g(this.f40750b != null || iVar.getPosition() == j10);
                    iVar.resetPeekPosition();
                    throw th2;
                }
                w1.a.g(z10);
                iVar.resetPeekPosition();
            }
            if (this.f40750b == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + sc.i.g(", ").d(l0.m(c0.z(pVarArrA), new sc.g() { // from class: i2.a
                    @Override // sc.g
                    public final Object apply(Object obj) {
                        return ((o2.p) obj).e().getClass().getSimpleName();
                    }
                })) + ") could read the stream.", (Uri) w1.a.e(uri), aVarU.m());
            }
        }
        this.f40750b.c(rVar);
    }

    @Override // androidx.media3.exoplayer.source.w
    public void release() {
        o2.p pVar = this.f40750b;
        if (pVar != null) {
            pVar.release();
            this.f40750b = null;
        }
        this.f40751c = null;
    }

    @Override // androidx.media3.exoplayer.source.w
    public void seek(long j10, long j11) {
        ((o2.p) w1.a.e(this.f40750b)).seek(j10, j11);
    }
}
