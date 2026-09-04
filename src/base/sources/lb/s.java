package lb;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f44222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f44223i;

    public s(ra.v vVar, int i10, int i11) {
        this(vVar, i10, i11, 0, null);
    }

    @Override // lb.r
    public int getSelectedIndex() {
        return 0;
    }

    @Override // lb.r
    public Object getSelectionData() {
        return this.f44223i;
    }

    @Override // lb.r
    public int getSelectionReason() {
        return this.f44222h;
    }

    public s(ra.v vVar, int i10, int i11, int i12, Object obj) {
        super(vVar, new int[]{i10}, i11);
        this.f44222h = i12;
        this.f44223i = obj;
    }

    @Override // lb.r
    public void e(long j10, long j11, long j12, List list, ta.o[] oVarArr) {
    }
}
