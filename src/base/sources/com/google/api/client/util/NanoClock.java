package com.google.api.client.util;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface NanoClock {
    public static final NanoClock SYSTEM = new NanoClock() { // from class: com.google.api.client.util.NanoClock.1
        @Override // com.google.api.client.util.NanoClock
        public long nanoTime() {
            return System.nanoTime();
        }
    };

    long nanoTime();
}
