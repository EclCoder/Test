package m3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import l3.k;
import l3.l;
import l3.o;
import l3.p;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f45221a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f45222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityQueue f45223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f45224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f45225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f45226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f45227g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends o implements Comparable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f45228k;

        private b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (e() != bVar.e()) {
                return e() ? 1 : -1;
            }
            long j10 = this.f4866f - bVar.f4866f;
            if (j10 == 0) {
                j10 = this.f45228k - bVar.f45228k;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends p {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b2.e.a f45229g;

        public c(b2.e.a aVar) {
            this.f45229g = aVar;
        }

        @Override // b2.e
        public final void j() {
            this.f45229g.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f45221a.add(new b());
        }
        this.f45222b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f45222b.add(new c(new b2.e.a() { // from class: m3.d
                @Override // b2.e.a
                public final void a(b2.e eVar) {
                    this.f45220a.l((e.c) eVar);
                }
            }));
        }
        this.f45223c = new PriorityQueue();
        this.f45227g = C.TIME_UNSET;
    }

    private void k(b bVar) {
        bVar.b();
        this.f45221a.add(bVar);
    }

    @Override // b2.d
    public final void a(long j10) {
        this.f45227g = j10;
    }

    protected abstract k c();

    protected abstract void d(o oVar);

    @Override // b2.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public o dequeueInputBuffer() {
        w1.a.g(this.f45224d == null);
        if (this.f45221a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f45221a.pollFirst();
        this.f45224d = bVar;
        return bVar;
    }

    @Override // b2.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p dequeueOutputBuffer() {
        if (this.f45222b.isEmpty()) {
            return null;
        }
        while (!this.f45223c.isEmpty() && ((b) c0.h((b) this.f45223c.peek())).f4866f <= this.f45225e) {
            b bVar = (b) c0.h((b) this.f45223c.poll());
            if (bVar.e()) {
                p pVar = (p) c0.h((p) this.f45222b.pollFirst());
                pVar.a(4);
                k(bVar);
                return pVar;
            }
            d(bVar);
            if (i()) {
                k kVarC = c();
                p pVar2 = (p) c0.h((p) this.f45222b.pollFirst());
                pVar2.k(bVar.f4866f, kVarC, Long.MAX_VALUE);
                k(bVar);
                return pVar2;
            }
            k(bVar);
        }
        return null;
    }

    @Override // b2.d
    public void flush() {
        this.f45226f = 0L;
        this.f45225e = 0L;
        while (!this.f45223c.isEmpty()) {
            k((b) c0.h((b) this.f45223c.poll()));
        }
        b bVar = this.f45224d;
        if (bVar != null) {
            k(bVar);
            this.f45224d = null;
        }
    }

    protected final p g() {
        return (p) this.f45222b.pollFirst();
    }

    protected final long h() {
        return this.f45225e;
    }

    protected abstract boolean i();

    @Override // b2.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void queueInputBuffer(o oVar) {
        w1.a.a(oVar == this.f45224d);
        b bVar = (b) oVar;
        long j10 = this.f45227g;
        if (j10 == C.TIME_UNSET || bVar.f4866f >= j10) {
            long j11 = this.f45226f;
            this.f45226f = 1 + j11;
            bVar.f45228k = j11;
            this.f45223c.add(bVar);
        } else {
            k(bVar);
        }
        this.f45224d = null;
    }

    protected void l(p pVar) {
        pVar.b();
        this.f45222b.add(pVar);
    }

    @Override // l3.l
    public void setPositionUs(long j10) {
        this.f45225e = j10;
    }

    @Override // b2.d
    public void release() {
    }
}
