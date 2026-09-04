package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f22176a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(a aVar) {
        this.f22176a = aVar;
    }

    public FirebaseInstallationsException(String str, a aVar) {
        super(str);
        this.f22176a = aVar;
    }
}
