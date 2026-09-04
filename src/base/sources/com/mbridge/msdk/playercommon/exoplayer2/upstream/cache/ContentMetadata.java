package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface ContentMetadata {
    public static final String INTERNAL_METADATA_NAME_PREFIX = "exo_";

    boolean contains(String str);

    long get(String str, long j10);

    String get(String str, String str2);

    byte[] get(String str, byte[] bArr);
}
