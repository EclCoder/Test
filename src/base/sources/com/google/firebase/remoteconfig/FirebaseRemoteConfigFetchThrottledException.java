package com.google.firebase.remoteconfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22230b;

    public FirebaseRemoteConfigFetchThrottledException(long j10) {
        this("Fetch was throttled.", j10);
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j10) {
        super(str);
        this.f22230b = j10;
    }
}
