package x5;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m6.h f56695a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends m6.h {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m6.h
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void k(b bVar, Object obj) {
            bVar.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Queue f56697d = m6.l.f(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f56698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f56699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f56700c;

        private b() {
        }

        static b a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f56697d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i10, i11);
            return bVar;
        }

        private void b(Object obj, int i10, int i11) {
            this.f56700c = obj;
            this.f56699b = i10;
            this.f56698a = i11;
        }

        public void c() {
            Queue queue = f56697d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f56699b == bVar.f56699b && this.f56698a == bVar.f56698a && this.f56700c.equals(bVar.f56700c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f56698a * 31) + this.f56699b) * 31) + this.f56700c.hashCode();
        }
    }

    public m(long j10) {
        this.f56695a = new a(j10);
    }

    public Object a(Object obj, int i10, int i11) {
        b bVarA = b.a(obj, i10, i11);
        Object objH = this.f56695a.h(bVarA);
        bVarA.c();
        return objH;
    }

    public void b(Object obj, int i10, int i11, Object obj2) {
        this.f56695a.l(b.a(obj, i10, i11), obj2);
    }
}
