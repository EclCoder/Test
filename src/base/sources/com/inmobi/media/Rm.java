package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.Rm[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.Rm[]) from 0x004c: INVOKE (r0v1 com.inmobi.media.Rm[]) STATIC call: ml.b.a(java.lang.Enum[]):ml.a A[MD:(java.lang.Enum[]):ml.a (m)] (LINE:77)
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
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Rm {
    UNKNOWN(EnumC2882c8.UNDEFINED_ERROR),
    MALFORMED_URL(EnumC2882c8.MALFORMED_URL),
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT(EnumC2882c8.TIMEOUT),
    NETWORK(EnumC2882c8.NETWORK),
    NO_URL_FOUND(EnumC2882c8.NO_URL_FOUND),
    INVALID_STATE(EnumC2882c8.INVALID_STATE);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC2882c8 f25659a;

    static {
        ml.b.a(rmArr);
    }

    public Rm(EnumC2882c8 enumC2882c8) {
        super(str, i);
        this.f25659a = enumC2882c8;
    }

    public static Rm valueOf(String str) {
        return (Rm) Enum.valueOf(Rm.class, str);
    }

    public static Rm[] values() {
        return (Rm[]) f25658g.clone();
    }
}
