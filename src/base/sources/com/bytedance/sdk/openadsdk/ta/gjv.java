package com.bytedance.sdk.openadsdk.ta;

import android.content.Context;
import com.bytedance.sdk.component.hn.hnj.bug;
import com.bytedance.sdk.component.hn.hnj.dkl;
import com.bytedance.sdk.component.hn.hnj.dnm;
import com.bytedance.sdk.component.hn.hnj.mjg;
import com.bytedance.sdk.component.sk.apu;
import com.bytedance.sdk.component.sk.eum;
import com.bytedance.sdk.component.sk.fc;
import com.bytedance.sdk.component.utils.ta;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.bytedance.sdk.openadsdk.utils.ul;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private static final fc f14610hn = hnj(oj.hnj());
        private static int qor = 10;
        private static int gjv = 15;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private static int f14611sk = 30;
        public static boolean hnj = false;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ta.gjv$hnj$hnj, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class C0254hnj implements com.bytedance.sdk.component.sk.gjv {
            private C0254hnj() {
            }

            @Override // com.bytedance.sdk.component.sk.gjv
            /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.component.sk.hnj.qor hnj(com.bytedance.sdk.component.sk.sk skVar) {
                dnm dnmVarDse = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().dse();
                bug bugVarHn = new bug.hnj().hn(skVar.hnj()).hnj().hn();
                mjg mjgVarHn = null;
                com.bytedance.sdk.component.sk.hnj.gjv gjvVar = skVar.qor() ? new com.bytedance.sdk.component.sk.hnj.gjv() : null;
                if (gjvVar != null) {
                    gjvVar.hnj(System.currentTimeMillis());
                }
                try {
                    mjgVarHn = dnmVarDse.hnj(bugVarHn).hn();
                    if (gjvVar != null) {
                        gjvVar.hn(System.currentTimeMillis());
                    }
                    com.bytedance.sdk.component.sk.hnj.qor qorVar = new com.bytedance.sdk.component.sk.hnj.qor(mjgVarHn.qor(), mjgVarHn.dkl().gjv(), "", hnj(skVar, mjgVarHn));
                    ta.hnj(mjgVarHn);
                    return qorVar;
                } catch (Throwable th2) {
                    try {
                        return hnj(gjvVar, th2);
                    } finally {
                        ta.hnj(mjgVarHn);
                    }
                }
            }

            private Map<String, String> hnj(com.bytedance.sdk.component.sk.sk skVar, mjg mjgVar) {
                if (!skVar.hn()) {
                    return null;
                }
                dkl dklVarDse = mjgVar.dse();
                HashMap map = new HashMap();
                int iHnj = dklVarDse.hnj();
                for (int i10 = 0; i10 < iHnj; i10++) {
                    String strHnj = dklVarDse.hnj(i10);
                    String strHn = dklVarDse.hn(i10);
                    if (strHnj != null) {
                        map.put(strHnj, strHn);
                    }
                }
                return map;
            }

            private com.bytedance.sdk.component.sk.hnj.qor hnj(com.bytedance.sdk.component.sk.hnj.gjv gjvVar, Throwable th2) {
                th2.getMessage();
                if (gjvVar != null) {
                    gjvVar.qor(System.currentTimeMillis());
                }
                com.bytedance.sdk.component.sk.hnj.qor qorVar = new com.bytedance.sdk.component.sk.hnj.qor(98765, th2, "net failed");
                qorVar.hnj(gjvVar);
                return qorVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.sk.ta hn(String str) {
            return hnj(f14610hn.hnj(str).sk(sq.sk(oj.hnj())).gjv(sq.qor(oj.hnj())));
        }

        public static void hnj() {
            qor = com.bytedance.sdk.openadsdk.as.sk.hnj("image_config", "bitmap_cache_count", 10);
            gjv = com.bytedance.sdk.openadsdk.as.sk.hnj("image_config", "data_cache_count", 15);
            f14611sk = com.bytedance.sdk.openadsdk.as.sk.hnj("image_config", "disk_cache_count", 30);
            hnj = com.bytedance.sdk.openadsdk.as.sk.hnj("img_need_scale", 0) == 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.sk.ta hn(com.bytedance.sdk.openadsdk.core.model.oj ojVar) {
            return hnj(f14610hn.hnj(ojVar.hnj()).hnj(ojVar.hn()).hn(ojVar.qor()).sk(sq.sk(oj.hnj())).gjv(sq.qor(oj.hnj())).hnj(ojVar.dse()));
        }

        private static fc hnj(Context context) {
            hnj();
            return com.bytedance.sdk.component.sk.hn.qor.hn.hnj(context, new com.bytedance.sdk.component.sk.hn.qor.sk.hnj().hnj(new com.bytedance.sdk.component.sk.hn.qor.hnj.hn(0, qor, gjv, f14611sk, new File(CacheDirFactory.getImageCacheDir("image_p")))).hnj(hnj).hnj(new apu() { // from class: com.bytedance.sdk.openadsdk.ta.gjv.hnj.2
                @Override // com.bytedance.sdk.component.sk.apu
                public ExecutorService hn() {
                    return ua.qor();
                }

                @Override // com.bytedance.sdk.component.sk.apu
                public ExecutorService hnj() {
                    return ua.hn();
                }
            }).hnj(new eum() { // from class: com.bytedance.sdk.openadsdk.ta.gjv.hnj.1
                @Override // com.bytedance.sdk.component.sk.eum
                public void hnj(int i10, String str) {
                    com.bytedance.sdk.openadsdk.jip.gjv.hnj(str, true);
                }
            }).hnj(new C0254hnj()).hnj());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream hn(String str, String str2) {
            return f14610hn.hnj(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean hn(String str, String str2, String str3) {
            return f14610hn.hnj(str, str2, str3);
        }

        private static com.bytedance.sdk.component.sk.ta hnj(com.bytedance.sdk.component.sk.ta taVar) {
            return ul.hnj() ? taVar.hnj(new sk()) : taVar;
        }
    }

    public static boolean hn() {
        return hnj.hnj;
    }

    public static com.bytedance.sdk.component.sk.ta hnj(String str) {
        return hnj.hn(str);
    }

    public static com.bytedance.sdk.component.sk.ta hnj(com.bytedance.sdk.openadsdk.core.model.oj ojVar) {
        return hnj.hn(ojVar);
    }

    public static InputStream hnj(String str, String str2) {
        return hnj.hn(str, str2);
    }

    public static boolean hnj(String str, String str2, String str3) {
        return hnj.hn(str, str2, str3);
    }

    public static fc hnj() {
        return hnj.f14610hn;
    }
}
