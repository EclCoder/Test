package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface Cache {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th2) {
            super(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface Listener {
        void onSpanAdded(Cache cache, CacheSpan cacheSpan);

        void onSpanRemoved(Cache cache, CacheSpan cacheSpan);

        void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2);
    }

    NavigableSet<CacheSpan> addListener(String str, Listener listener);

    void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations);

    void commitFile(File file);

    long getCacheSpace();

    long getCachedLength(String str, long j10, long j11);

    NavigableSet<CacheSpan> getCachedSpans(String str);

    long getContentLength(String str);

    ContentMetadata getContentMetadata(String str);

    Set<String> getKeys();

    boolean isCached(String str, long j10, long j11);

    void release();

    void releaseHoleSpan(CacheSpan cacheSpan);

    void removeListener(String str, Listener listener);

    void removeSpan(CacheSpan cacheSpan);

    void setContentLength(String str, long j10);

    File startFile(String str, long j10, long j11);

    CacheSpan startReadWrite(String str, long j10);

    CacheSpan startReadWriteNonBlocking(String str, long j10);
}
