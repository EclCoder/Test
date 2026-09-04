package com.bytedance.adsdk.hn.qor.hn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm implements qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final hnj f12076hn;
    private final String hnj;
    private final boolean qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hnj {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static hnj hnj(int i10) {
            if (i10 == 1) {
                return MERGE;
            }
            if (i10 == 2) {
                return ADD;
            }
            if (i10 == 3) {
                return SUBTRACT;
            }
            if (i10 != 4) {
                return i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public ojm(String str, hnj hnjVar, boolean z10) {
        this.hnj = str;
        this.f12076hn = hnjVar;
        this.qor = z10;
    }

    public hnj hn() {
        return this.f12076hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public boolean qor() {
        return this.qor;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f12076hn + '}';
    }

    @Override // com.bytedance.adsdk.hn.qor.hn.qor
    public com.bytedance.adsdk.hn.hnj.hnj.qor hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar) {
        return new com.bytedance.adsdk.hn.hnj.hnj.bug(this);
    }
}
