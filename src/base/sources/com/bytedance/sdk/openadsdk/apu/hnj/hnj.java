package com.bytedance.sdk.openadsdk.apu.hnj;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.sk.aq;
import com.bytedance.sdk.component.sk.dnm;
import com.bytedance.sdk.component.sk.jip;
import com.bytedance.sdk.component.sk.ta;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.ta.gjv;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.apu.hnj.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0200hnj {
        void hnj(int i10, String str, Throwable th2);

        void hnj(String str, hn hnVar);
    }

    public void hnj(com.bytedance.sdk.openadsdk.apu.hnj hnjVar, final InterfaceC0200hnj interfaceC0200hnj, int i10, int i11, ImageView.ScaleType scaleType, String str, final int i12, as asVar) {
        ta taVarHnj = gjv.hnj(hnjVar.hnj).hnj(hnjVar.f13245hn).hnj(i10).hn(i11).sk(sq.sk(oj.hnj())).gjv(sq.qor(oj.hnj())).hn(str).hnj(scaleType).hnj(!TextUtils.isEmpty(str));
        if (i12 <= 0 || Build.VERSION.SDK_INT < 26) {
            taVarHnj.qor(1);
        } else {
            taVarHnj.qor(2).hnj(new aq() { // from class: com.bytedance.sdk.openadsdk.apu.hnj.hnj.1
                @Override // com.bytedance.sdk.component.sk.aq
                public Bitmap hnj(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.gjv.hnj.hnj(oj.hnj(), bitmap, i12);
                }
            });
        }
        taVarHnj.hnj(new com.bytedance.sdk.openadsdk.ta.hn(asVar, hnjVar.hnj, new jip() { // from class: com.bytedance.sdk.openadsdk.apu.hnj.hnj.2
            @Override // com.bytedance.sdk.component.sk.jip
            public void hnj(dnm dnmVar) {
                hnj.this.hnj(dnmVar, interfaceC0200hnj);
            }

            @Override // com.bytedance.sdk.component.sk.jip
            public void hnj(int i13, String str2, Throwable th2) {
                hnj.this.hnj(i13, str2, th2, interfaceC0200hnj);
            }
        }));
    }

    protected void hnj(dnm dnmVar, InterfaceC0200hnj interfaceC0200hnj) {
        if (interfaceC0200hnj != null) {
            Object objHn = dnmVar.hn();
            int iHnj = hnj(dnmVar);
            if (objHn instanceof Drawable) {
                interfaceC0200hnj.hnj(dnmVar.hnj(), new hn((Drawable) objHn, iHnj));
                return;
            }
            if (objHn instanceof byte[]) {
                interfaceC0200hnj.hnj(dnmVar.hnj(), new hn((byte[]) objHn, iHnj));
                return;
            }
            if (objHn instanceof Bitmap) {
                interfaceC0200hnj.hnj(dnmVar.hnj(), new hn((Bitmap) objHn, dnmVar.qor() instanceof Bitmap ? (Bitmap) dnmVar.qor() : null, iHnj));
            } else {
                interfaceC0200hnj.hnj(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int hnj(dnm dnmVar) {
        Object obj;
        Map<String, String> mapGjv = dnmVar.gjv();
        if (mapGjv == null || (obj = mapGjv.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    protected void hnj(int i10, String str, Throwable th2, InterfaceC0200hnj interfaceC0200hnj) {
        if (interfaceC0200hnj != null) {
            interfaceC0200hnj.hnj(i10, str, th2);
        }
    }
}
