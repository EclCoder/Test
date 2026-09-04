package ra;

import com.google.android.exoplayer2.source.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final d0[] f51181a;

    public c(d0[] d0VarArr) {
        this.f51181a = d0VarArr;
    }

    @Override // com.google.android.exoplayer2.source.d0
    public boolean continueLoading(long j10) {
        boolean zContinueLoading;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z10;
            }
            zContinueLoading = false;
            for (d0 d0Var : this.f51181a) {
                long nextLoadPositionUs2 = d0Var.getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j10;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zContinueLoading |= d0Var.continueLoading(j10);
                }
            }
            z10 |= zContinueLoading;
        } while (zContinueLoading);
        return z10;
    }

    @Override // com.google.android.exoplayer2.source.d0
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (d0 d0Var : this.f51181a) {
            long bufferedPositionUs = d0Var.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.d0
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (d0 d0Var : this.f51181a) {
            long nextLoadPositionUs = d0Var.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.d0
    public boolean isLoading() {
        for (d0 d0Var : this.f51181a) {
            if (d0Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.d0
    public final void reevaluateBuffer(long j10) {
        for (d0 d0Var : this.f51181a) {
            d0Var.reevaluateBuffer(j10);
        }
    }
}
