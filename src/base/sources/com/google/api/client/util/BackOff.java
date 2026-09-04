package com.google.api.client.util;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface BackOff {
    public static final long STOP = -1;
    public static final BackOff ZERO_BACKOFF = new BackOff() { // from class: com.google.api.client.util.BackOff.1
        @Override // com.google.api.client.util.BackOff
        public long nextBackOffMillis() {
            return 0L;
        }

        @Override // com.google.api.client.util.BackOff
        public void reset() {
        }
    };
    public static final BackOff STOP_BACKOFF = new BackOff() { // from class: com.google.api.client.util.BackOff.2
        @Override // com.google.api.client.util.BackOff
        public long nextBackOffMillis() {
            return -1L;
        }

        @Override // com.google.api.client.util.BackOff
        public void reset() {
        }
    };

    long nextBackOffMillis();

    void reset();
}
