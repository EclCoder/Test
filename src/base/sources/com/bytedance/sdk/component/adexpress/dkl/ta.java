package com.bytedance.sdk.component.adexpress.dkl;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta extends com.bytedance.adsdk.hn.dkl {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f12503hn;
    private Map<String, Bitmap> hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements com.bytedance.sdk.component.sk.jip {
        private final Map<String, Bitmap> gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final com.bytedance.adsdk.hn.ta f12505hn;
        private final WeakReference<ta> hnj;
        private final String qor;

        public hnj(ta taVar, com.bytedance.adsdk.hn.ta taVar2, String str, Map<String, Bitmap> map) {
            this.hnj = new WeakReference<>(taVar);
            this.f12505hn = taVar2;
            this.qor = str;
            this.gjv = map;
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
            Object objHn = dnmVar.hn();
            if (objHn instanceof Bitmap) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objHn, this.f12505hn.hnj(), this.f12505hn.hn(), false);
                this.gjv.put(this.qor, bitmapCreateScaledBitmap);
                ta taVar = this.hnj.get();
                if (taVar != null) {
                    taVar.hnj(this.f12505hn.aq(), bitmapCreateScaledBitmap);
                }
            }
        }
    }

    public ta(Context context) {
        super(context);
        this.hnj = new HashMap();
    }

    public void aq() {
        if (TextUtils.isEmpty(this.f12503hn)) {
            return;
        }
        setProgress(0.0f);
        hnj(true);
        setAnimationFromUrl(this.f12503hn);
        setImageAssetDelegate(new com.bytedance.adsdk.hn.gjv() { // from class: com.bytedance.sdk.component.adexpress.dkl.ta.1
            @Override // com.bytedance.adsdk.hn.gjv
            public Bitmap hnj(final com.bytedance.adsdk.hn.ta taVar) {
                final String strAq = taVar.aq();
                String strTa = taVar.ta();
                String strOjm = taVar.ojm();
                if (TextUtils.equals(strAq, "image_0") && TextUtils.equals(strOjm, "Lark20201123-180048_2.png")) {
                    strOjm = "hand.png";
                }
                Bitmap bitmap = (Bitmap) ta.this.hnj.get(strAq);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(strTa) || !TextUtils.isEmpty(strOjm)) {
                    if (!TextUtils.isEmpty(strOjm) && TextUtils.isEmpty(strTa)) {
                        strTa = strOjm;
                    } else if (TextUtils.isEmpty(strOjm) || TextUtils.isEmpty(strTa)) {
                        strTa = "";
                    } else {
                        strTa = strTa + strOjm;
                    }
                }
                if (TextUtils.isEmpty(strTa)) {
                    return null;
                }
                com.bytedance.sdk.component.sk.ta taVarHnj = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().sk().hnj(strTa).qor(2).hnj(new com.bytedance.sdk.component.sk.aq() { // from class: com.bytedance.sdk.component.adexpress.dkl.ta.1.1
                    @Override // com.bytedance.sdk.component.sk.aq
                    public Bitmap hnj(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, taVar.hnj(), taVar.hn(), false);
                        ta.this.hnj.put(strAq, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                ta taVar2 = ta.this;
                taVarHnj.hnj(new hnj(taVar2, taVar, strAq, taVar2.hnj));
                return (Bitmap) ta.this.hnj.get(strAq);
            }
        });
        hnj();
    }

    public void setImageLottieTosPath(String str) {
        this.f12503hn = str;
    }

    public void setAnimationsLoop(boolean z10) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i10) {
    }

    public void setLottieAdTitleMaxLength(int i10) {
    }

    public void setLottieAppNameMaxLength(int i10) {
    }
}
