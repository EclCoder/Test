package bm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e implements am.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f9089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final tl.o f9092d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9093a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private yl.f f9096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9097e;

        a() {
            int i10 = yl.g.i(e.this.f9090b, 0, e.this.f9089a.length());
            this.f9094b = i10;
            this.f9095c = i10;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:12:0x0030 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x0097  */
        private final void a() {
            fl.q qVar;
            if (this.f9095c < 0) {
                this.f9093a = 0;
                this.f9096d = null;
                return;
            }
            if (e.this.f9091c > 0) {
                int i10 = this.f9097e + 1;
                this.f9097e = i10;
                if (i10 >= e.this.f9091c) {
                    this.f9096d = new yl.f(this.f9094b, f0.Z(e.this.f9089a));
                    this.f9095c = -1;
                } else if (this.f9095c > e.this.f9089a.length() && (qVar = (fl.q) e.this.f9092d.invoke(e.this.f9089a, Integer.valueOf(this.f9095c))) != null) {
                    int iIntValue = ((Number) qVar.d()).intValue();
                    int iIntValue2 = ((Number) qVar.g()).intValue();
                    this.f9096d = yl.g.m(this.f9094b, iIntValue);
                    int i11 = iIntValue + iIntValue2;
                    this.f9094b = i11;
                    this.f9095c = i11 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f9096d = new yl.f(this.f9094b, f0.Z(e.this.f9089a));
                    this.f9095c = -1;
                }
            } else if (this.f9095c > e.this.f9089a.length()) {
                this.f9096d = new yl.f(this.f9094b, f0.Z(e.this.f9089a));
                this.f9095c = -1;
            } else {
                int iIntValue3 = ((Number) qVar.d()).intValue();
                int iIntValue4 = ((Number) qVar.g()).intValue();
                this.f9096d = yl.g.m(this.f9094b, iIntValue3);
                int i12 = iIntValue3 + iIntValue4;
                this.f9094b = i12;
                this.f9095c = i12 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f9093a = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public yl.f next() {
            if (this.f9093a == -1) {
                a();
            }
            if (this.f9093a == 0) {
                throw new NoSuchElementException();
            }
            yl.f fVar = this.f9096d;
            kotlin.jvm.internal.s.f(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f9096d = null;
            this.f9093a = -1;
            return fVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9093a == -1) {
                a();
            }
            return this.f9093a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(CharSequence input, int i10, int i11, tl.o getNextMatch) {
        kotlin.jvm.internal.s.h(input, "input");
        kotlin.jvm.internal.s.h(getNextMatch, "getNextMatch");
        this.f9089a = input;
        this.f9090b = i10;
        this.f9091c = i11;
        this.f9092d = getNextMatch;
    }

    @Override // am.g
    public Iterator iterator() {
        return new a();
    }
}
