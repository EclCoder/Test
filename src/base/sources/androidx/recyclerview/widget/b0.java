package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
interface b0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray f6841a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6842b = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.b0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0077a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private SparseIntArray f6843a = new SparseIntArray(1);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private SparseIntArray f6844b = new SparseIntArray(1);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final q f6845c;

            C0077a(q qVar) {
                this.f6845c = qVar;
            }

            @Override // androidx.recyclerview.widget.b0.c
            public void d() {
                a.this.d(this.f6845c);
            }

            @Override // androidx.recyclerview.widget.b0.c
            public int e(int i10) {
                int iIndexOfKey = this.f6844b.indexOfKey(i10);
                if (iIndexOfKey >= 0) {
                    return this.f6844b.valueAt(iIndexOfKey);
                }
                throw new IllegalStateException("requested global type " + i10 + " does not belong to the adapter:" + this.f6845c.f7042c);
            }

            @Override // androidx.recyclerview.widget.b0.c
            public int f(int i10) {
                int iIndexOfKey = this.f6843a.indexOfKey(i10);
                if (iIndexOfKey > -1) {
                    return this.f6843a.valueAt(iIndexOfKey);
                }
                int iC = a.this.c(this.f6845c);
                this.f6843a.put(i10, iC);
                this.f6844b.put(iC, i10);
                return iC;
            }
        }

        @Override // androidx.recyclerview.widget.b0
        public q a(int i10) {
            q qVar = (q) this.f6841a.get(i10);
            if (qVar != null) {
                return qVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i10);
        }

        @Override // androidx.recyclerview.widget.b0
        public c b(q qVar) {
            return new C0077a(qVar);
        }

        int c(q qVar) {
            int i10 = this.f6842b;
            this.f6842b = i10 + 1;
            this.f6841a.put(i10, qVar);
            return i10;
        }

        void d(q qVar) {
            for (int size = this.f6841a.size() - 1; size >= 0; size--) {
                if (((q) this.f6841a.valueAt(size)) == qVar) {
                    this.f6841a.removeAt(size);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void d();

        int e(int i10);

        int f(int i10);
    }

    q a(int i10);

    c b(q qVar);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray f6847a = new SparseArray();

        @Override // androidx.recyclerview.widget.b0
        public q a(int i10) {
            List list = (List) this.f6847a.get(i10);
            if (list != null && !list.isEmpty()) {
                return (q) list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i10);
        }

        @Override // androidx.recyclerview.widget.b0
        public c b(q qVar) {
            return new a(qVar);
        }

        void c(q qVar) {
            for (int size = this.f6847a.size() - 1; size >= 0; size--) {
                List list = (List) this.f6847a.valueAt(size);
                if (list.remove(qVar) && list.isEmpty()) {
                    this.f6847a.removeAt(size);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final q f6848a;

            a(q qVar) {
                this.f6848a = qVar;
            }

            @Override // androidx.recyclerview.widget.b0.c
            public void d() {
                b.this.c(this.f6848a);
            }

            @Override // androidx.recyclerview.widget.b0.c
            public int f(int i10) {
                List arrayList = (List) b.this.f6847a.get(i10);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    b.this.f6847a.put(i10, arrayList);
                }
                if (!arrayList.contains(this.f6848a)) {
                    arrayList.add(this.f6848a);
                }
                return i10;
            }

            @Override // androidx.recyclerview.widget.b0.c
            public int e(int i10) {
                return i10;
            }
        }
    }
}
