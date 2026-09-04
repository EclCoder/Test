package com.bytedance.sdk.component.dse.qor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private hn f12840hn;
    private hnj hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hnj {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.dse.qor.qor$qor, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0189qor {
        private static final qor hnj = new qor();
    }

    public static void hnj(hnj hnjVar) {
        synchronized (qor.class) {
            C0189qor.hnj.hnj = hnjVar;
        }
    }

    private qor() {
        this.hnj = hnj.OFF;
        this.f12840hn = new com.bytedance.sdk.component.dse.qor.hn();
    }
}
