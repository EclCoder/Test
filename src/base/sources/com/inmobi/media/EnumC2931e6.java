package com.inmobi.media;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v39 com.inmobi.media.e6[], still in use, count: 1, list:
  (r0v39 com.inmobi.media.e6[]) from 0x0235: INVOKE (r0v40 ml.a) = (r0v39 com.inmobi.media.e6[]) STATIC call: ml.b.a(java.lang.Enum[]):ml.a A[MD:(java.lang.Enum[]):ml.a (m)] (LINE:566)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.inmobi.media.e6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC2931e6 {
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NETWORK_UNAVAILABLE_ERROR"),
    f26453d("UNKNOWN_ERROR"),
    f26454e("NETWORK_IO_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("OUT_OF_MEMORY_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("INVALID_ENCRYPTED_RESPONSE_RECEIVED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("RESPONSE_EXCEEDS_SPECIFIED_SIZE_LIMIT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("GZIP_DECOMPRESSION_FAILED"),
    f26455f("BAD_REQUEST"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("GDPR_COMPLIANCE_ENFORCED"),
    f26456g("GENERIC_HTTP_2XX"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("RESPONSE_PARSING_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("RETRY_ATTEMPTED"),
    f26457h("NETWORK_UNAVAILABLE_CONTEXT_LOSS"),
    f26458i("NETWORK_UNAVAILABLE_IDLE_MODE"),
    f26459j("NETWORK_UNAVAILABLE_NO_CONNECTION_M_OR_ABOVE"),
    f26460k("NETWORK_UNAVAILABLE_NO_CONNECTION_BELOW_M"),
    f26461l("NETWORK_UNAVAILABLE_EXCEPTION"),
    f26462m("NETWORK_PREPARE_FAIL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NETWORK_REQUEST_GENERIC_DROPPED_BY_INTERCEPTOR"),
    f26463n("NETWORK_REQUEST_CANCELLED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NETWORK_REQUEST_EXCEPTION"),
    f26464o("NETWORK_UNAVAILABLE_CUSTOM_VALIDATOR"),
    f26465p("NETWORK_REDIRECT_MALFORMED"),
    f26466q("NO_SUCH_ELEMENT_EXCEPTION"),
    f26467r("COROUTINE_TIMEOUT"),
    f26468s("INVALID_URL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_NO_CONTENT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_NOT_MODIFIED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_SEE_OTHER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_SERVER_NOT_FOUND"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_MOVED_TEMP"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_INTERNAL_SERVER_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_NOT_IMPLEMENTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_BAD_GATEWAY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_SERVER_NOT_AVAILABLE"),
    f26469t("HTTP_GATEWAY_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF476("HTTP_VERSION_NOT_SUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF489("HTTP_UNAUTHORISED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF502("SERVER_ERROR_END_CODE");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2880c6 f26451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f26452c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26471a;

    static {
        ml.a<EnumC2931e6> aVarA = ml.b.a(enumC2931e6Arr);
        f26451b = new C2880c6();
        f26452c = new SparseArray();
        for (EnumC2931e6 enumC2931e6 : aVarA) {
            f26452c.put(enumC2931e6.f26471a, enumC2931e6);
        }
    }

    public EnumC2931e6(String str) {
        super(str, i);
        this.f26471a = i;
    }

    public static EnumC2931e6 valueOf(String str) {
        return (EnumC2931e6) Enum.valueOf(EnumC2931e6.class, str);
    }

    public static EnumC2931e6[] values() {
        return (EnumC2931e6[]) f26470u.clone();
    }
}
