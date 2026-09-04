package com.bytedance.sdk.openadsdk.core.bug.hn.hn;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.hn.gjv;
import com.bytedance.adsdk.hn.ta;
import com.bytedance.adsdk.ugeno.dse.aq;
import com.bytedance.adsdk.ugeno.hn.qor;
import com.bytedance.adsdk.ugeno.sk;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hnj extends qor<hn> {
    protected ImageView.ScaleType dlk;
    protected String hnj;
    private float hw;
    protected HashMap<String, Bitmap> iwu;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private String f13639lf;
    private int mw;
    private boolean pwt;

    /* JADX INFO: renamed from: rg, reason: collision with root package name */
    private boolean f13640rg;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private boolean f13641sg;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    protected ImageView.ScaleType f13642vk;
    private float wxi;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private boolean f13643yo;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bug.hn.hn.hnj$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class AnonymousClass1 implements gjv {
        AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.hn.gjv
        public Bitmap hnj(final ta taVar) {
            final String strHnj;
            if (taVar == null) {
                return null;
            }
            String strTa = taVar.ta();
            String strOjm = taVar.ojm();
            if (!TextUtils.isEmpty(strTa) && TextUtils.isEmpty(strOjm)) {
                strHnj = com.bytedance.adsdk.ugeno.qor.hn.hnj(strTa, ((qor) hnj.this).gjv);
            } else if (!TextUtils.isEmpty(strOjm) && TextUtils.isEmpty(strTa)) {
                strHnj = com.bytedance.adsdk.ugeno.qor.hn.hnj(strOjm, ((qor) hnj.this).gjv);
            } else if (TextUtils.isEmpty(strOjm) || TextUtils.isEmpty(strTa)) {
                strHnj = null;
            } else {
                strHnj = com.bytedance.adsdk.ugeno.qor.hn.hnj(strTa, ((qor) hnj.this).gjv) + com.bytedance.adsdk.ugeno.qor.hn.hnj(strOjm, ((qor) hnj.this).gjv);
            }
            if (TextUtils.isEmpty(strHnj)) {
                return null;
            }
            Bitmap bitmap = hnj.this.iwu.get(strHnj);
            if (bitmap != null) {
                return bitmap;
            }
            sk.hnj().hn().hnj(((qor) hnj.this).ojm, strHnj, new com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj() { // from class: com.bytedance.sdk.openadsdk.core.bug.hn.hn.hnj.1.1
                @Override // com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj
                public void hnj(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, taVar.hnj(), taVar.hn(), false);
                        hnj.this.iwu.put(strHnj, bitmapCreateScaledBitmap);
                        aq.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bug.hn.hn.hnj.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((hn) ((qor) hnj.this).f12293sk).hnj(taVar.aq(), bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return hnj.this.iwu.get(strHnj);
        }
    }

    public hnj(Context context) {
        super(context);
        this.f13639lf = "images";
        this.f13640rg = true;
        this.hw = 1.0f;
        this.dlk = ImageView.ScaleType.FIT_CENTER;
        this.f13642vk = ImageView.ScaleType.FIT_XY;
        this.iwu = new HashMap<>();
    }

    private ImageView.ScaleType fc(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
            case "none":
                return ImageView.ScaleType.CENTER;
            case "fit":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private ImageView.ScaleType mjg(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    public void gjv() {
        T t10 = this.f12293sk;
        if (t10 != 0) {
            ((hn) t10).hnj();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
        ((hn) this.f12293sk).setProgress(this.wxi);
        if (this.hw <= 0.0f) {
            this.hw = 1.0f;
        }
        ((hn) this.f12293sk).setSpeed(this.hw);
        if (this.hnj.startsWith(ImagesContract.LOCAL)) {
            ((hn) this.f12293sk).setAnimation(orl(this.hnj));
            ((hn) this.f12293sk).setImageAssetsFolder(this.f13639lf);
        } else {
            ((hn) this.f12293sk).setAnimationFromUrl(this.hnj);
        }
        ((hn) this.f12293sk).setImageAssetDelegate(new AnonymousClass1());
        if (pty()) {
            ((hn) this.f12293sk).setScaleType(this.f13642vk);
        } else {
            ((hn) this.f12293sk).setScaleType(this.dlk);
        }
        if (pty()) {
            ((hn) this.f12293sk).setRepeatCount(this.mw);
        } else {
            ((hn) this.f12293sk).hnj(this.pwt);
        }
        if (!pty()) {
            T t10 = this.f12293sk;
            if (t10 != 0) {
                ((hn) t10).hnj();
                return;
            }
            return;
        }
        T t11 = this.f12293sk;
        if (t11 == 0 || !this.f13640rg) {
            return;
        }
        ((hn) t11).hnj();
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    /* JADX INFO: renamed from: qor, reason: merged with bridge method [inline-methods] */
    public hn hnj() {
        hn hnVar = new hn(this.f12280hn);
        hnVar.hnj(this);
        return hnVar;
    }

    private String orl(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(NhHRaDJCHtCTJR.oOFYZ)) {
            return "";
        }
        if (str.contains("shake_phone")) {
            return "lottie_json/shake_phone.json";
        }
        if (!str.contains("swipe_right")) {
            return "";
        }
        return "lottie_json/swipe_right.json";
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.hnj(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
                this.f13642vk = fc(str2);
                break;
            case "scaleType":
                this.dlk = mjg(str2);
                break;
            case "progress":
                this.wxi = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case "imagePath":
                this.f13639lf = str2;
                break;
            case "autoReverse":
                this.f13643yo = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, false);
                break;
            case "src":
                this.hnj = com.bytedance.sdk.openadsdk.core.bug.gjv.hnj(str2);
                break;
            case "loop":
                if (pty()) {
                    this.mw = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0);
                    break;
                } else {
                    this.pwt = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, false);
                    break;
                }
                break;
            case "speed":
                this.hw = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 1.0f);
                break;
            case "autoPlay":
                this.f13641sg = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, false);
                break;
            case "autoplay":
                this.f13640rg = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, true);
                break;
        }
    }

    public void hnj(AnimatorListenerAdapter animatorListenerAdapter) {
        ((hn) this.f12293sk).hnj(animatorListenerAdapter);
    }
}
