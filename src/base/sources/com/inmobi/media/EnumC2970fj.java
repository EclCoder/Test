package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.fj[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.fj[]) from 0x0042: INVOKE (r0v1 com.inmobi.media.fj[]) STATIC call: ml.b.a(java.lang.Enum[]):ml.a A[MD:(java.lang.Enum[]):ml.a (m)] (LINE:67)
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
/* JADX INFO: renamed from: com.inmobi.media.fj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC2970fj {
    IDLE,
    LOADING,
    REDIRECTING,
    RESOLVE_IN_WEB_VIEW,
    EXTERNAL,
    DONE;

    static {
        ml.b.a(enumC2970fjArr);
    }

    public EnumC2970fj() {
        super(str, i);
    }

    public static EnumC2970fj valueOf(String str) {
        return (EnumC2970fj) Enum.valueOf(EnumC2970fj.class, str);
    }

    public static EnumC2970fj[] values() {
        return (EnumC2970fj[]) f26573g.clone();
    }
}
