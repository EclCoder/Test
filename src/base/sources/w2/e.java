package w2;

import o2.a0;
import o2.j0;
import o2.k0;
import o2.o0;
import o2.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f55881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f55882b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f55883b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j0 j0Var, j0 j0Var2) {
            super(j0Var);
            this.f55883b = j0Var2;
        }

        @Override // o2.a0, o2.j0
        public j0.a getSeekPoints(long j10) {
            j0.a seekPoints = this.f55883b.getSeekPoints(j10);
            k0 k0Var = seekPoints.f48077a;
            k0 k0Var2 = new k0(k0Var.f48082a, k0Var.f48083b + e.this.f55881a);
            k0 k0Var3 = seekPoints.f48078b;
            return new j0.a(k0Var2, new k0(k0Var3.f48082a, k0Var3.f48083b + e.this.f55881a));
        }
    }

    public e(long j10, r rVar) {
        this.f55881a = j10;
        this.f55882b = rVar;
    }

    @Override // o2.r
    public void d(j0 j0Var) {
        this.f55882b.d(new a(j0Var, j0Var));
    }

    @Override // o2.r
    public void endTracks() {
        this.f55882b.endTracks();
    }

    @Override // o2.r
    public o0 track(int i10, int i11) {
        return this.f55882b.track(i10, i11);
    }
}
