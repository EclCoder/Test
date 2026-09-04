package com.inmobi.media;

import com.coremedia.iso.boxes.FreeSpaceBox;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.gn[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.gn[]) from 0x004c: INVOKE (r0v1 com.inmobi.media.gn[]) STATIC call: ml.b.a(java.lang.Enum[]):ml.a A[MD:(java.lang.Enum[]):ml.a (m), WRAPPED] (LINE:77)
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
/* JADX INFO: renamed from: com.inmobi.media.gn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC3000gn {
    /* JADX INFO: Fake field, exist only in values array */
    SHOW_VIDEO("show"),
    /* JADX INFO: Fake field, exist only in values array */
    HIDE_VIDEO("hide"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAY_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_RESUME),
    /* JADX INFO: Fake field, exist only in values array */
    PAUSE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_PAUSE),
    /* JADX INFO: Fake field, exist only in values array */
    MUTE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_MUTE),
    /* JADX INFO: Fake field, exist only in values array */
    UNMUTE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE),
    /* JADX INFO: Fake field, exist only in values array */
    SKIP_VIDEO(FreeSpaceBox.TYPE);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ml.a f26637c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26638a;

    static {
        f26637c = ml.b.a(enumC3000gnArr);
    }

    public EnumC3000gn(String str) {
        super(str, i);
        this.f26638a = str;
    }

    public static EnumC3000gn valueOf(String str) {
        return (EnumC3000gn) Enum.valueOf(EnumC3000gn.class, str);
    }

    public static EnumC3000gn[] values() {
        return (EnumC3000gn[]) f26636b.clone();
    }
}
