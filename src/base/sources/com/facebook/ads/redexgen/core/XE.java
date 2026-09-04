package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class XE {
    public static AdError A00(C1670Vm c1670Vm) {
        if (c1670Vm.A03().isPublicError()) {
            return new AdError(c1670Vm.A03().getErrorCode(), c1670Vm.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
