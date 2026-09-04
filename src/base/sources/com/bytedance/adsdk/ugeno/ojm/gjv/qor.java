package com.bytedance.adsdk.ugeno.ojm.gjv;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import b6.a;
import b6.b;
import com.bytedance.adsdk.ugeno.core.dkl;
import com.bytedance.adsdk.ugeno.core.dnm;
import com.bytedance.adsdk.ugeno.dse.aq;
import com.bytedance.adsdk.ugeno.dse.gjv;
import com.bytedance.adsdk.ugeno.sk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends com.bytedance.adsdk.ugeno.hn.qor<hnj> {
    protected boolean dlk;
    protected String hnj;
    protected ImageView.ScaleType iwu;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private int f12366lf;
    private float pwt;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    protected String f12367vk;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private float f12368yo;

    public qor(Context context) {
        super(context);
        this.iwu = ImageView.ScaleType.FIT_XY;
        this.f12366lf = -1;
        this.f12368yo = -1.0f;
        this.pwt = -1.0f;
    }

    private void ojm() {
        if (TextUtils.isEmpty(this.hnj)) {
            return;
        }
        ((hnj) this.f12293sk).setImageDrawable(null);
        if (!this.hnj.startsWith("local://")) {
            if (!this.hnj.startsWith("@")) {
                ta();
                return;
            } else {
                ((hnj) this.f12293sk).setImageResource(Integer.parseInt(this.hnj.substring(1)));
                return;
            }
        }
        try {
            String strReplace = this.hnj.replace("local://", "");
            if (TextUtils.equals(qor(), "raw")) {
                ((hnj) this.f12293sk).setImageResource(gjv.hnj(this.f12280hn, strReplace));
            } else {
                ((hnj) this.f12293sk).setImageResource(gjv.hn(this.f12280hn, strReplace));
            }
        } catch (Exception unused) {
        }
    }

    private ImageView.ScaleType orl(String str) {
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
            case "fit":
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private void ta() {
        if (this.f12368yo > 0.0f) {
            sk.hnj().hn().hnj(this.ojm, this.hnj, new com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj() { // from class: com.bytedance.adsdk.ugeno.ojm.gjv.qor.1
                @Override // com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj
                public void hnj(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.hn.qor) qor.this).xw != null) {
                            dkl unused = ((com.bytedance.adsdk.ugeno.hn.qor) qor.this).xw;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.hn.qor) qor.this).xw != null) {
                        dkl unused2 = ((com.bytedance.adsdk.ugeno.hn.qor) qor.this).xw;
                    }
                    final Bitmap bitmapHnj = aq.hnj(((com.bytedance.adsdk.ugeno.hn.qor) qor.this).f12280hn, bitmap, (int) qor.this.f12368yo);
                    if (bitmapHnj != null) {
                        aq.hnj(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ojm.gjv.qor.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((hnj) ((com.bytedance.adsdk.ugeno.hn.qor) qor.this).f12293sk).setImageBitmap(bitmapHnj);
                            }
                        });
                    }
                    qor qorVar = qor.this;
                    if (qorVar.dlk || qorVar.pwt > 0.0f) {
                        Bitmap bitmapHnj2 = aq.hnj(((com.bytedance.adsdk.ugeno.hn.qor) qor.this).f12280hn, bitmap, qor.this.pwt > 0.0f ? (int) qor.this.pwt : 10);
                        if (bitmapHnj2 != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(((com.bytedance.adsdk.ugeno.hn.qor) qor.this).f12280hn.getResources(), bitmapHnj2);
                            aq.hnj(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ojm.gjv.qor.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((hnj) ((com.bytedance.adsdk.ugeno.hn.qor) qor.this).f12293sk).setBackground(bitmapDrawable);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.hnj hnjVarHn = sk.hnj().hn();
        dnm dnmVar = this.ojm;
        String str = this.hnj;
        T t10 = this.f12293sk;
        hnjVarHn.hnj(dnmVar, str, (ImageView) t10, ((hnj) t10).getWidth(), ((hnj) this.f12293sk).getHeight(), new com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj() { // from class: com.bytedance.adsdk.ugeno.ojm.gjv.qor.2
            @Override // com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj
            public void hnj(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.hn.qor) qor.this).xw != null) {
                        dkl unused = ((com.bytedance.adsdk.ugeno.hn.qor) qor.this).xw;
                    }
                } else if (((com.bytedance.adsdk.ugeno.hn.qor) qor.this).xw != null) {
                    dkl unused2 = ((com.bytedance.adsdk.ugeno.hn.qor) qor.this).xw;
                }
            }
        });
        if (this.dlk || this.pwt > 0.0f) {
            sk.hnj().hn().hnj(this.ojm, this.hnj, new com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj() { // from class: com.bytedance.adsdk.ugeno.ojm.gjv.qor.3
                @Override // com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj
                public void hnj(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap bitmapHnj = aq.hnj(((com.bytedance.adsdk.ugeno.hn.qor) qor.this).f12280hn, bitmap, qor.this.pwt > 0.0f ? (int) qor.this.pwt : 10);
                    aq.hnj(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ojm.gjv.qor.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (bitmapHnj != null) {
                                ((hnj) ((com.bytedance.adsdk.ugeno.hn.qor) qor.this).f12293sk).setBackground(new BitmapDrawable(((com.bytedance.adsdk.ugeno.hn.qor) qor.this).f12280hn.getResources(), bitmapHnj));
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor, com.bytedance.adsdk.ugeno.gjv
    public void aq() {
        super.aq();
        Drawable drawable = ((hnj) this.f12293sk).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !a.a(drawable)) {
            return;
        }
        b.a(drawable).stop();
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor, com.bytedance.adsdk.ugeno.gjv
    public void dse() {
        super.dse();
        ((hnj) this.f12293sk).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ojm.gjv.qor.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = ((hnj) ((com.bytedance.adsdk.ugeno.hn.qor) qor.this).f12293sk).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !a.a(drawable)) {
                    return;
                }
                b.a(drawable).start();
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    /* JADX INFO: renamed from: gjv, reason: merged with bridge method [inline-methods] */
    public hnj hnj() {
        hnj hnjVar = new hnj(this.f12280hn);
        hnjVar.hnj(this);
        return hnjVar;
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
        ojm();
        ((hnj) this.f12293sk).setScaleType(this.iwu);
        ((hnj) this.f12293sk).setBorderColor(this.mkl);
        ((hnj) this.f12293sk).setCornerRadius(this.dzo);
        ((hnj) this.f12293sk).setBorderWidth(this.izk);
        int i10 = this.f12366lf;
        if (i10 != -1) {
            ((hnj) this.f12293sk).setColorFilter(i10);
        }
    }

    public void mjg(String str) {
        this.hnj = str;
    }

    protected String qor() {
        return this.f12367vk;
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
            case "scaleType":
                this.iwu = orl(str2);
                break;
            case "imageBlur":
                this.f12368yo = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, -1.0f);
                break;
            case "isBgGaussianBlur":
                this.dlk = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, false);
                break;
            case "src":
                this.hnj = str2;
                break;
            case "tintColor":
                this.f12366lf = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
                break;
            case "imageBgBlur":
                this.pwt = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, -1.0f);
                break;
        }
    }
}
