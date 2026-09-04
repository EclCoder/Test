package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.CommonStatusCodes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class GoogleSignInStatusCodes extends CommonStatusCodes {
    public static final int SIGN_IN_CANCELLED = 12501;
    public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 12502;
    public static final int SIGN_IN_FAILED = 12500;

    public static String getStatusCodeString(int i10) {
        switch (i10) {
            case SIGN_IN_FAILED /* 12500 */:
                return "A non-recoverable sign in failure occurred";
            case SIGN_IN_CANCELLED /* 12501 */:
                return "Sign in action cancelled";
            case SIGN_IN_CURRENTLY_IN_PROGRESS /* 12502 */:
                return "Sign-in in progress";
            default:
                return CommonStatusCodes.getStatusCodeString(i10);
        }
    }
}
