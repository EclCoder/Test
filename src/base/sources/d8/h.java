package d8;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum h implements com.facebook.internal.h {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36441a;

    h(int i10) {
        this.f36441a = i10;
    }

    @Override // com.facebook.internal.h
    public int d() {
        return this.f36441a;
    }

    @Override // com.facebook.internal.h
    public String g() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }
}
