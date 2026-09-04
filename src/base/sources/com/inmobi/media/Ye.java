package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ye {
    public a others;
    public a wifi;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        private int maxBatchSize;
        private int minBatchSize;
        private long retryInterval;

        public final void a(long j10) {
            this.retryInterval = j10;
        }

        public final int b() {
            return this.minBatchSize;
        }

        public final long c() {
            return this.retryInterval;
        }

        public final int a() {
            return this.maxBatchSize;
        }

        public final void b(int i10) {
            this.maxBatchSize = i10;
        }

        public final void c(int i10) {
            this.minBatchSize = i10;
        }

        public final boolean a(int i10) {
            int i11;
            int i12 = this.maxBatchSize;
            return i12 <= i10 && this.retryInterval > 0 && i12 > 0 && (i11 = this.minBatchSize) > 0 && i11 <= i12;
        }
    }
}
