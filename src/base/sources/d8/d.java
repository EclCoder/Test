package d8;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum d implements com.facebook.internal.h {
    MESSAGE_DIALOG(20140204),
    PHOTOS(20140324),
    VIDEO(20141218),
    MESSENGER_GENERIC_TEMPLATE(20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(20171115),
    MESSENGER_MEDIA_TEMPLATE(20171115);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36426a;

    d(int i10) {
        this.f36426a = i10;
    }

    @Override // com.facebook.internal.h
    public int d() {
        return this.f36426a;
    }

    @Override // com.facebook.internal.h
    public String g() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }
}
