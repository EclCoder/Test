package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.Xe[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.Xe[]) from 0x002e: INVOKE (r0v1 com.inmobi.media.Xe[]) STATIC call: ml.b.a(java.lang.Enum[]):ml.a A[MD:(java.lang.Enum[]):ml.a (m)] (LINE:47)
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
public final class Xe {
    UNAVAILABLE,
    SLOW,
    MEDIUM,
    FAST;

    static {
        ml.b.a(xeArr);
    }

    public Xe() {
        super(str, i);
    }

    public static Xe valueOf(String str) {
        return (Xe) Enum.valueOf(Xe.class, str);
    }

    public static Xe[] values() {
        return (Xe[]) f26012e.clone();
    }
}
