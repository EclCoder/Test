package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f22222a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f22229a;

        a(int i10) {
            this.f22229a = i10;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.f22222a = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Throwable th2) {
        super(str, th2);
        this.f22222a = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, a aVar) {
        super(str);
        this.f22222a = aVar;
    }

    public FirebaseRemoteConfigException(String str, Throwable th2, a aVar) {
        super(str, th2);
        this.f22222a = aVar;
    }
}
