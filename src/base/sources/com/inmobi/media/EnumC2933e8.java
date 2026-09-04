package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.e8[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.e8[]) from 0x0038: INVOKE (r0v1 com.inmobi.media.e8[]) STATIC call: ml.b.a(java.lang.Enum[]):ml.a A[MD:(java.lang.Enum[]):ml.a (m)] (LINE:57)
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
/* JADX INFO: renamed from: com.inmobi.media.e8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC2933e8 {
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_VIDEO_PLAYER("createVideoPlayer"),
    /* JADX INFO: Fake field, exist only in values array */
    EXECUTE_VIDEO_PLAYER_ACTION("executeVideoPlayerActions"),
    /* JADX INFO: Fake field, exist only in values array */
    UPDATE_VIDEO_PLAYER_POSITION("updateVideoPlayerPosition"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_VIDEO_PLAYER_STATE("getVideoPlayerState"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown");

    static {
        ml.b.a(enumC2933e8Arr);
    }

    public EnumC2933e8(String str) {
        super(str, i);
    }

    public static EnumC2933e8 valueOf(String str) {
        return (EnumC2933e8) Enum.valueOf(EnumC2933e8.class, str);
    }

    public static EnumC2933e8[] values() {
        return (EnumC2933e8[]) f26475a.clone();
    }
}
