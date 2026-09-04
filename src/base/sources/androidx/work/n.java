package androidx.work;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class n extends w {
    n(a aVar) {
        super(aVar.f8016b, aVar.f8017c, aVar.f8018d);
    }

    public static n d(Class cls) {
        return (n) new a(cls).b();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends w.a {
        public a(Class cls) {
            super(cls);
            this.f8017c.f41043d = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.w.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public n c() {
            if (this.f8015a && this.f8017c.f41049j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new n(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.w.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }
}
