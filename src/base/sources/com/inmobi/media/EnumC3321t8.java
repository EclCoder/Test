package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 com.inmobi.media.t8[], still in use, count: 1, list:
  (r0v3 com.inmobi.media.t8[]) from 0x00b8: INVOKE (r0v3 com.inmobi.media.t8[]) STATIC call: ml.b.a(java.lang.Enum[]):ml.a A[MD:(java.lang.Enum[]):ml.a (m)] (LINE:185)
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
/* JADX INFO: renamed from: com.inmobi.media.t8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC3321t8 {
    VIDEO_READY("VideoReady"),
    VIDEO_COMPLETE("VideoComplete"),
    VIDEO_PLAYBACK_ERROR("VideoPlaybackError"),
    VIDEO_COMMAND_ERROR("VideoCommandError"),
    VIDEO_PLAYBACK_STATE("VideoPlaybackState"),
    VIDEO_PLAYBACK_UPDATE("VideoPlaybackUpdate"),
    VIDEO_QUARTILES_EVENT("VideoQuartilesEvent"),
    VIDEO_PLAYER_CREATED("VideoPlayerCreated"),
    VIDEO_PLAYER_POSITION_UPDATED("VideoPlayerPositionUpdated"),
    VIDEO_PLAYER_DESTROYED("VideoPlayerDestroyed"),
    VIDEO_PLAYER_ACTION_EXECUTED("VideoPlayerActionExecuted"),
    VIDEO_PLAYER_POSITION("VideoPlayerPosition"),
    VIDEO_CAN_PLAY_THROUGH("VideoCanPlayThrough"),
    VIDEO_LOADED_METADATA("VideoLoadedMetadata");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27535a;

    static {
        ml.b.a(enumC3321t8Arr);
    }

    public EnumC3321t8(String str) {
        super(str, i);
        this.f27535a = str;
    }

    public static EnumC3321t8 valueOf(String str) {
        return (EnumC3321t8) Enum.valueOf(EnumC3321t8.class, str);
    }

    public static EnumC3321t8[] values() {
        return (EnumC3321t8[]) f27534p.clone();
    }
}
