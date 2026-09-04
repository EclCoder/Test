package z9;

import u9.a0;
import u9.b0;
import u9.m;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f58681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f58682b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f58683a;

        a(z zVar) {
            this.f58683a = zVar;
        }

        @Override // u9.z
        public long getDurationUs() {
            return this.f58683a.getDurationUs();
        }

        @Override // u9.z
        public z.a getSeekPoints(long j10) {
            z.a seekPoints = this.f58683a.getSeekPoints(j10);
            a0 a0Var = seekPoints.f54334a;
            a0 a0Var2 = new a0(a0Var.f54231a, a0Var.f54232b + d.this.f58681a);
            a0 a0Var3 = seekPoints.f54335b;
            return new z.a(a0Var2, new a0(a0Var3.f54231a, a0Var3.f54232b + d.this.f58681a));
        }

        @Override // u9.z
        public boolean isSeekable() {
            return this.f58683a.isSeekable();
        }
    }

    public d(long j10, m mVar) {
        this.f58681a = j10;
        this.f58682b = mVar;
    }

    @Override // u9.m
    public void c(z zVar) {
        this.f58682b.c(new a(zVar));
    }

    @Override // u9.m
    public void endTracks() {
        this.f58682b.endTracks();
    }

    @Override // u9.m
    public b0 track(int i10, int i11) {
        return this.f58682b.track(i10, i11);
    }
}
