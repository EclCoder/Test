package ra;

import android.net.Uri;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import java.io.EOFException;
import java.util.Map;
import ob.r0;
import u9.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements com.google.android.exoplayer2.source.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u9.p f51176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u9.k f51177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u9.l f51178c;

    public a(u9.p pVar) {
        this.f51176a = pVar;
    }

    @Override // com.google.android.exoplayer2.source.t
    public void a() {
        u9.k kVar = this.f51177b;
        if (kVar instanceof ba.f) {
            ((ba.f) kVar).i();
        }
    }

    @Override // com.google.android.exoplayer2.source.t
    public long b() {
        u9.l lVar = this.f51178c;
        if (lVar != null) {
            return lVar.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    @Override // com.google.android.exoplayer2.source.t
    public void c(nb.h hVar, Uri uri, Map map, long j10, long j11, u9.m mVar) throws UnrecognizedInputFormatException {
        u9.e eVar = new u9.e(hVar, j10, j11);
        this.f51178c = eVar;
        if (this.f51177b != null) {
            return;
        }
        u9.k[] kVarArrA = this.f51176a.a(uri, map);
        if (kVarArrA.length == 1) {
            this.f51177b = kVarArrA[0];
        } else {
            for (u9.k kVar : kVarArrA) {
                try {
                    if (kVar.d(eVar)) {
                        this.f51177b = kVar;
                        ob.a.g(true);
                        eVar.resetPeekPosition();
                        break;
                    } else {
                        boolean z10 = this.f51177b != null || eVar.getPosition() == j10;
                        ob.a.g(z10);
                        eVar.resetPeekPosition();
                    }
                } catch (EOFException unused) {
                    if (this.f51177b != null || eVar.getPosition() == j10) {
                    }
                } catch (Throwable th2) {
                    ob.a.g(this.f51177b != null || eVar.getPosition() == j10);
                    eVar.resetPeekPosition();
                    throw th2;
                }
                ob.a.g(z10);
                eVar.resetPeekPosition();
            }
            if (this.f51177b == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + r0.N(kVarArrA) + ") could read the stream.", (Uri) ob.a.e(uri));
            }
        }
        this.f51177b.b(mVar);
    }

    @Override // com.google.android.exoplayer2.source.t
    public int d(y yVar) {
        return ((u9.k) ob.a.e(this.f51177b)).c((u9.l) ob.a.e(this.f51178c), yVar);
    }

    @Override // com.google.android.exoplayer2.source.t
    public void release() {
        u9.k kVar = this.f51177b;
        if (kVar != null) {
            kVar.release();
            this.f51177b = null;
        }
        this.f51178c = null;
    }

    @Override // com.google.android.exoplayer2.source.t
    public void seek(long j10, long j11) {
        ((u9.k) ob.a.e(this.f51177b)).seek(j10, j11);
    }
}
