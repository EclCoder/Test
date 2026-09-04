package rm;

import java.util.Iterator;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f51414b;

        a(f fVar) {
            this.f51414b = fVar;
            this.f51413a = fVar.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f51414b;
            int iE = fVar.e();
            int i10 = this.f51413a;
            this.f51413a = i10 - 1;
            return fVar.h(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f51413a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f51416b;

        b(f fVar) {
            this.f51416b = fVar;
            this.f51415a = fVar.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f51416b;
            int iE = fVar.e();
            int i10 = this.f51415a;
            this.f51415a = i10 - 1;
            return fVar.f(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f51415a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements Iterable, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f51417a;

        public c(f fVar) {
            this.f51417a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f51417a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements Iterable, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f51418a;

        public d(f fVar) {
            this.f51418a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f51418a);
        }
    }

    public static final Iterable a(f fVar) {
        s.h(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable b(f fVar) {
        s.h(fVar, "<this>");
        return new d(fVar);
    }
}
