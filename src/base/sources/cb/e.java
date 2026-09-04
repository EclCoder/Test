package cb;

import bb.i;
import bb.j;
import bb.m;
import bb.n;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f9941a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f9942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityQueue f9943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f9944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f9945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9946f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends m implements Comparable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f9947j;

        private b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (g() != bVar.g()) {
                return g() ? 1 : -1;
            }
            long j10 = this.f16756e - bVar.f16756e;
            if (j10 == 0) {
                j10 = this.f9947j - bVar.f9947j;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private s9.f.a f9948f;

        public c(s9.f.a aVar) {
            this.f9948f = aVar;
        }

        @Override // s9.f
        public final void l() {
            this.f9948f.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f9941a.add(new b());
        }
        this.f9942b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f9942b.add(new c(new s9.f.a() { // from class: cb.d
                @Override // s9.f.a
                public final void a(s9.f fVar) {
                    this.f9940a.j((e.c) fVar);
                }
            }));
        }
        this.f9943c = new PriorityQueue();
    }

    private void i(b bVar) {
        bVar.b();
        this.f9941a.add(bVar);
    }

    protected abstract i a();

    protected abstract void b(m mVar);

    @Override // s9.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m dequeueInputBuffer() {
        ob.a.g(this.f9944d == null);
        if (this.f9941a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f9941a.pollFirst();
        this.f9944d = bVar;
        return bVar;
    }

    @Override // s9.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public n dequeueOutputBuffer() {
        if (this.f9942b.isEmpty()) {
            return null;
        }
        while (!this.f9943c.isEmpty() && ((b) r0.j((b) this.f9943c.peek())).f16756e <= this.f9945e) {
            b bVar = (b) r0.j((b) this.f9943c.poll());
            if (bVar.g()) {
                n nVar = (n) r0.j((n) this.f9942b.pollFirst());
                nVar.a(4);
                i(bVar);
                return nVar;
            }
            b(bVar);
            if (g()) {
                i iVarA = a();
                n nVar2 = (n) r0.j((n) this.f9942b.pollFirst());
                nVar2.m(bVar.f16756e, iVarA, Long.MAX_VALUE);
                i(bVar);
                return nVar2;
            }
            i(bVar);
        }
        return null;
    }

    protected final n e() {
        return (n) this.f9942b.pollFirst();
    }

    protected final long f() {
        return this.f9945e;
    }

    @Override // s9.d
    public void flush() {
        this.f9946f = 0L;
        this.f9945e = 0L;
        while (!this.f9943c.isEmpty()) {
            i((b) r0.j((b) this.f9943c.poll()));
        }
        b bVar = this.f9944d;
        if (bVar != null) {
            i(bVar);
            this.f9944d = null;
        }
    }

    protected abstract boolean g();

    @Override // s9.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void queueInputBuffer(m mVar) {
        ob.a.a(mVar == this.f9944d);
        b bVar = (b) mVar;
        if (bVar.f()) {
            i(bVar);
        } else {
            long j10 = this.f9946f;
            this.f9946f = 1 + j10;
            bVar.f9947j = j10;
            this.f9943c.add(bVar);
        }
        this.f9944d = null;
    }

    protected void j(n nVar) {
        nVar.b();
        this.f9942b.add(nVar);
    }

    @Override // bb.j
    public void setPositionUs(long j10) {
        this.f9945e = j10;
    }

    @Override // s9.d
    public void release() {
    }
}
