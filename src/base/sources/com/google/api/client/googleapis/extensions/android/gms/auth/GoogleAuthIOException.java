package com.google.api.client.googleapis.extensions.android.gms.auth;

import com.google.android.gms.auth.GoogleAuthException;
import com.google.api.client.util.Preconditions;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class GoogleAuthIOException extends IOException {
    private static final long serialVersionUID = 1;

    public GoogleAuthIOException(GoogleAuthException googleAuthException) {
        initCause((Throwable) Preconditions.checkNotNull(googleAuthException));
    }

    @Override // java.lang.Throwable
    public GoogleAuthException getCause() {
        return (GoogleAuthException) super.getCause();
    }
}
