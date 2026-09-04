package kk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class m {
    public abstract m a(boolean z10);

    public abstract l b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends m {
        private a(String str) {
            jk.b.b(str, "name");
        }

        static a c(String str, l lVar) {
            return new a(str);
        }

        @Override // kk.m
        public l b() {
            return h.f43447e;
        }

        @Override // kk.m
        public m a(boolean z10) {
            return this;
        }
    }
}
