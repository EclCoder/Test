package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.c8[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.c8[]) from 0x004e: INVOKE (r0v1 com.inmobi.media.c8[]) STATIC call: ml.b.a(java.lang.Enum[]):ml.a A[MD:(java.lang.Enum[]):ml.a (m)] (LINE:79)
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
/* JADX INFO: renamed from: com.inmobi.media.c8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC2882c8 {
    UNDEFINED_ERROR((short) 10001),
    INVALID_STATE((short) 10002),
    MALFORMED_URL((short) 10003),
    TIMEOUT((short) 10004),
    NETWORK((short) 10005),
    NO_URL_FOUND((short) 10006);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f26312a;

    static {
        ml.b.a(enumC2882c8Arr);
    }

    public EnumC2882c8(short s10) {
        super(str, i);
        this.f26312a = s10;
    }

    public static EnumC2882c8 valueOf(String str) {
        return (EnumC2882c8) Enum.valueOf(EnumC2882c8.class, str);
    }

    public static EnumC2882c8[] values() {
        return (EnumC2882c8[]) f26311h.clone();
    }
}
