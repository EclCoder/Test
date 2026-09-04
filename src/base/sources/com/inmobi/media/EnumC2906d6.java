package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.d6[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.d6[]) from 0x0066: INVOKE (r0v1 com.inmobi.media.d6[]) STATIC call: ml.b.a(java.lang.Enum[]):ml.a A[MD:(java.lang.Enum[]):ml.a (m)] (LINE:103)
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
/* JADX INFO: renamed from: com.inmobi.media.d6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC2906d6 {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("PING_V2_DISABLED", "Ping V2 is disabled from SDK config"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("PING_ID_MISSING", "Ping ID is missing"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("PING_URL_INVALID", "Ping url is invalid"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("PING_URL_MISSING", "Ping URL is missing"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("PING_JSON_INVALID", "Ping JSON is invalid"),
    /* JADX INFO: Fake field, exist only in values array */
    EF69("PING_ARRAY_EMPTY", "Ping array is empty"),
    /* JADX INFO: Fake field, exist only in values array */
    EF81("PING_UNKNOWN_RESPONSE", "Ping response is unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    EF93("PING_EXCEPTION", "Ping exception occurred");

    static {
        ml.b.a(enumC2906d6Arr);
    }

    public EnumC2906d6(String str, String str2) {
        super(str, i);
    }

    public static EnumC2906d6 valueOf(String str) {
        return (EnumC2906d6) Enum.valueOf(EnumC2906d6.class, str);
    }

    public static EnumC2906d6[] values() {
        return (EnumC2906d6[]) f26393a.clone();
    }
}
