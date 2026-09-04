package bb;

import com.google.common.collect.c0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f8781a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f8782b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque f8783c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8785e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends n {
        a() {
        }

        @Override // s9.f
        public void l() {
            g.this.e(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f8787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c0 f8788b;

        public b(long j10, c0 c0Var) {
            this.f8787a = j10;
            this.f8788b = c0Var;
        }

        @Override // bb.i
        public List getCues(long j10) {
            return j10 >= this.f8787a ? this.f8788b : c0.C();
        }

        @Override // bb.i
        public long getEventTime(int i10) {
            ob.a.a(i10 == 0);
            return this.f8787a;
        }

        @Override // bb.i
        public int getEventTimeCount() {
            return 1;
        }

        @Override // bb.i
        public int getNextEventTimeIndex(long j10) {
            return this.f8787a > j10 ? 0 : -1;
        }
    }

    public g() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f8783c.addFirst(new a());
        }
        this.f8784d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(n nVar) {
        ob.a.g(this.f8783c.size() < 2);
        ob.a.a(!this.f8783c.contains(nVar));
        nVar.b();
        this.f8783c.addFirst(nVar);
    }

    @Override // s9.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m dequeueInputBuffer() {
        ob.a.g(!this.f8785e);
        if (this.f8784d != 0) {
            return null;
        }
        this.f8784d = 1;
        return this.f8782b;
    }

    @Override // s9.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n dequeueOutputBuffer() {
        ob.a.g(!this.f8785e);
        if (this.f8784d != 2 || this.f8783c.isEmpty()) {
            return null;
        }
        n nVar = (n) this.f8783c.removeFirst();
        if (this.f8782b.g()) {
            nVar.a(4);
        } else {
            m mVar = this.f8782b;
            nVar.m(this.f8782b.f16756e, new b(mVar.f16756e, this.f8781a.a(((ByteBuffer) ob.a.e(mVar.f16754c)).array())), 0L);
        }
        this.f8782b.b();
        this.f8784d = 0;
        return nVar;
    }

    @Override // s9.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void queueInputBuffer(m mVar) {
        ob.a.g(!this.f8785e);
        ob.a.g(this.f8784d == 1);
        ob.a.a(this.f8782b == mVar);
        this.f8784d = 2;
    }

    @Override // s9.d
    public void flush() {
        ob.a.g(!this.f8785e);
        this.f8782b.b();
        this.f8784d = 0;
    }

    @Override // s9.d
    public void release() {
        this.f8785e = true;
    }

    @Override // bb.j
    public void setPositionUs(long j10) {
    }
}
