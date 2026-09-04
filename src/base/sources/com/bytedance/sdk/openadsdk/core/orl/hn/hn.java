package com.bytedance.sdk.openadsdk.core.orl.hn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends qor implements Comparable<hn> {
    private final float hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final float f14110hn;
        private final String hnj;
        private qor.EnumC0230qor qor = qor.EnumC0230qor.TRACKING_URL;
        private boolean gjv = false;

        public hnj(String str, float f10) {
            this.hnj = str;
            this.f14110hn = f10;
        }

        public hn hnj() {
            return new hn(this.f14110hn, this.hnj, this.qor, Boolean.valueOf(this.gjv));
        }
    }

    public boolean hnj(float f10) {
        return this.hnj <= f10 && !gjv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.orl.hn.qor
    public void l_() {
        super.l_();
    }

    public String toString() {
        return super.toString();
    }

    private hn(float f10, String str, qor.EnumC0230qor enumC0230qor, Boolean bool) {
        super(str, enumC0230qor, bool);
        this.hnj = f10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public int compareTo(hn hnVar) {
        if (hnVar == null) {
            return 1;
        }
        float f10 = this.hnj;
        float f11 = hnVar.hnj;
        if (f10 > f11) {
            return 1;
        }
        return f10 < f11 ? -1 : 0;
    }
}
