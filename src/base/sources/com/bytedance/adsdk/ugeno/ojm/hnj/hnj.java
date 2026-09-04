package com.bytedance.adsdk.ugeno.ojm.hnj;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dse.aq;
import com.bytedance.adsdk.ugeno.dse.gjv;
import com.bytedance.adsdk.ugeno.hn.qor;
import com.bytedance.adsdk.ugeno.ojm.dkl.hn;
import com.bytedance.adsdk.ugeno.sk;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hnj extends hn {
    private String dlk;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private String f12373lf;
    private com.bytedance.adsdk.ugeno.dse.hnj.C0167hnj mw;
    private int pwt;

    /* JADX INFO: renamed from: rg, reason: collision with root package name */
    private boolean f12374rg;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private int f12375sg;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private String f12376vk;
    private boolean wxi;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private String f12377yo;

    public hnj(Context context) {
        super(context);
        this.f12376vk = "row";
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    protected void cm() {
        super.cm();
        if (this.f12374rg) {
            ((com.bytedance.adsdk.ugeno.ojm.dkl.hnj) this.f12293sk).setTextColor(((hn) this).iwu);
        }
        if (this.wxi) {
            if (this.f12273af) {
                hnj(this.f12310zd);
            } else {
                gjv(this.orp);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ojm.dkl.hn, com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
        gjv();
        ((com.bytedance.adsdk.ugeno.ojm.dkl.hnj) this.f12293sk).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    protected void xad() {
        super.xad();
        if (this.f12374rg) {
            ((com.bytedance.adsdk.ugeno.ojm.dkl.hnj) this.f12293sk).setTextColor(this.f12375sg);
        }
        if (this.wxi) {
            if (this.f12273af) {
                hnj(this.mw);
            } else {
                gjv(this.pwt);
            }
        }
    }

    private void gjv() {
        if (TextUtils.isEmpty(this.dlk)) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ojm.dkl.hnj) this.f12293sk).setCompoundDrawables(null, null, null, null);
        if (!this.dlk.startsWith("local://")) {
            sk.hnj().hn().hnj(this.ojm, this.dlk, new com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj() { // from class: com.bytedance.adsdk.ugeno.ojm.hnj.hnj.1
                @Override // com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj
                public void hnj(final Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    aq.hnj(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ojm.hnj.hnj.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            hnj.this.hn(new BitmapDrawable(((qor) hnj.this).f12280hn.getResources(), bitmap));
                        }
                    });
                }
            });
            return;
        }
        try {
            String strReplace = this.dlk.replace("local://", NpmRNZ.GYSsXnpia);
            Context context = this.f12280hn;
            hn(aq.hnj(context, gjv.hn(context, strReplace)));
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ojm.dkl.hn, com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(String str, String str2) {
        super.hnj(str, str2);
        str.getClass();
        switch (str) {
            case "direction":
                this.f12376vk = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.f12375sg = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
                this.f12374rg = true;
                break;
            case "image":
                this.dlk = str2;
                break;
            case "highlightImage":
                this.f12373lf = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.dse.hnj.qor(str2)) {
                    this.f12273af = true;
                    this.mw = com.bytedance.adsdk.ugeno.dse.hnj.hn(str2);
                } else {
                    this.pwt = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
                    this.f12273af = false;
                }
                this.wxi = true;
                break;
            case "highlightBackgroundImage":
                this.f12377yo = str2;
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        String str = this.f12376vk;
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    ((com.bytedance.adsdk.ugeno.ojm.dkl.hnj) this.f12293sk).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
                    return;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    ((com.bytedance.adsdk.ugeno.ojm.dkl.hnj) this.f12293sk).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
                    return;
                }
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    ((com.bytedance.adsdk.ugeno.ojm.dkl.hnj) this.f12293sk).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                    return;
                }
                break;
            case 113114:
                str.equals("row");
                break;
        }
        ((com.bytedance.adsdk.ugeno.ojm.dkl.hnj) this.f12293sk).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
