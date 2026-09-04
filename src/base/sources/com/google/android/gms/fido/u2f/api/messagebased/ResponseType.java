package com.google.android.gms.fido.u2f.api.messagebased;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public enum ResponseType {
    REGISTER("u2f_register_response"),
    SIGN("u2f_sign_response");

    private final String zzb;

    ResponseType(String str) {
        this.zzb = str;
    }

    public static ResponseType getResponseTypeForRequestType(RequestType requestType) throws RequestType.UnsupportedRequestTypeException {
        if (requestType == null) {
            throw new RequestType.UnsupportedRequestTypeException(null);
        }
        int iOrdinal = requestType.ordinal();
        if (iOrdinal == 0) {
            return REGISTER;
        }
        if (iOrdinal == 1) {
            return SIGN;
        }
        throw new RequestType.UnsupportedRequestTypeException(requestType.toString());
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }
}
