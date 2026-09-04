package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.Ua[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.Ua[]) from 0x006f: INVOKE (r0v1 com.inmobi.media.Ua[]) STATIC call: ml.b.a(java.lang.Enum[]):ml.a A[MD:(java.lang.Enum[]):ml.a (m)] (LINE:112)
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
public final class Ua {
    LPClickStart("clickStartCalled", "sdk_click_detected", 0),
    LPStartFailed("landingsStartFailed", "valid_click_failed", 1),
    LPStartSuccess("landingsStartSuccess", "browser_open_success", 2),
    LPBrowserOpenFailed("browserOpenFailed", "browser_open_failed", 2),
    LPPageStart("landingsPageStarted", "on_page_started", 3),
    LPCompleteSuccess("landingsCompleteSuccess", "landing_success", 4),
    LPCompleteFailed("landingsCompleteFailed", "landing_failed", 4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25827c;

    static {
        ml.b.a(uaArr);
    }

    public Ua(String str, String str2, int i10) {
        super(str, i);
        this.f25825a = str;
        this.f25826b = str2;
        this.f25827c = i10;
    }

    public static Ua valueOf(String str) {
        return (Ua) Enum.valueOf(Ua.class, str);
    }

    public static Ua[] values() {
        return (Ua[]) f25824k.clone();
    }
}
