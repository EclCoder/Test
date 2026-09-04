package l2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        l2.a a();

        a next();
    }

    void a(l2.a aVar);

    l2.a allocate();

    void b(a aVar);

    int getIndividualAllocationLength();

    void trim();
}
