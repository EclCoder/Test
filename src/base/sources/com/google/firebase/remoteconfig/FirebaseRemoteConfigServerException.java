package com.google.firebase.remoteconfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22231b;

    public FirebaseRemoteConfigServerException(int i10, String str) {
        super(str);
        this.f22231b = i10;
    }

    public int d() {
        return this.f22231b;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f22231b = i10;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f22231b = -1;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f22231b = i10;
    }
}
