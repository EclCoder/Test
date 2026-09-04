package com.bytedance.sdk.component.sk.hn.hn;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.sk.xn;
import com.bytedance.sdk.component.utils.dnm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv<T> implements dkl {
    private void hn(final com.bytedance.sdk.component.sk.hn.qor.qor qorVar, final byte[] bArr, final com.bytedance.sdk.component.sk.hn.qor.hnj hnjVar) {
        try {
            new com.bytedance.sdk.component.sk.hn.qor.hn.hnj().hnj(bArr, qorVar.jip(), new com.bytedance.sdk.component.sk.hn.qor.hn.hnj.InterfaceC0194hnj() { // from class: com.bytedance.sdk.component.sk.hn.hn.gjv.2
                @Override // com.bytedance.sdk.component.sk.hn.qor.hn.hnj.InterfaceC0194hnj
                public void hnj(Drawable drawable) {
                    hnjVar.hnj(new com.bytedance.sdk.component.sk.hn.qor.gjv().hnj(qorVar, drawable, null, true));
                }

                @Override // com.bytedance.sdk.component.sk.hn.qor.hn.hnj.InterfaceC0194hnj
                public void hnj() {
                    hnjVar.hnj(1002, "decode gif fail", new Exception("decode gif fail"));
                }

                @Override // com.bytedance.sdk.component.sk.hn.qor.hn.hnj.InterfaceC0194hnj
                public void hnj(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.dkl.hnj(bArr)) {
                        gjv.this.hnj(qorVar, bArr, true, hnjVar);
                    } else {
                        hnjVar.hnj(1001, "result type is gif but data not image", new Exception("gif not image format"));
                    }
                }
            });
        } catch (Throwable th2) {
            hnjVar.hnj(2000, "decode gif error", th2);
        }
    }

    @Override // com.bytedance.sdk.component.sk.hn.hn.dkl
    public boolean hnj(com.bytedance.sdk.component.sk.hn.qor.qor qorVar, xn xnVar, com.bytedance.sdk.component.sk.hn.qor.hnj hnjVar) {
        byte[] bArrOrl = qorVar.orl();
        if (bArrOrl == null) {
            hnjVar.hnj(2000, "imageData is empty", new Exception("imageData is empty"));
            return false;
        }
        int iDnm = qorVar.dnm();
        qorVar.hnj(bArrOrl.length);
        if (iDnm == 2) {
            boolean z10 = (com.bytedance.sdk.component.utils.dkl.hn(bArrOrl) || dnm.hnj(bArrOrl, 0)) ? false : true;
            if (com.bytedance.sdk.component.utils.dkl.hnj(bArrOrl)) {
                hnj(qorVar, bArrOrl, z10, hnjVar);
            } else {
                hnjVar.hnj(1001, "result type is bit but data not image", new Exception("not image format"));
            }
        } else if (iDnm == 3) {
            hnjVar.hnj(new com.bytedance.sdk.component.sk.hn.qor.gjv().hnj(qorVar, bArrOrl, null, com.bytedance.sdk.component.utils.dkl.hn(bArrOrl)));
        } else if (com.bytedance.sdk.component.utils.dkl.hn(bArrOrl)) {
            hn(qorVar, bArrOrl, hnjVar);
        } else if (dnm.hnj(bArrOrl, 0)) {
            hnj(qorVar, bArrOrl, hnjVar);
        } else if (com.bytedance.sdk.component.utils.dkl.hnj(bArrOrl)) {
            hnj(qorVar, bArrOrl, true, hnjVar);
        } else {
            hnjVar.hnj(1001, "is not supprot image type", new Exception("not supprot image type"));
        }
        return false;
    }

    private void hnj(final com.bytedance.sdk.component.sk.hn.qor.qor qorVar, final byte[] bArr, final com.bytedance.sdk.component.sk.hn.qor.hnj hnjVar) {
        try {
            new com.bytedance.sdk.component.sk.hn.qor.hn.hnj().hnj(bArr, new com.bytedance.sdk.component.sk.hn.qor.hn.hnj.InterfaceC0194hnj() { // from class: com.bytedance.sdk.component.sk.hn.hn.gjv.1
                @Override // com.bytedance.sdk.component.sk.hn.qor.hn.hnj.InterfaceC0194hnj
                public void hnj(Drawable drawable) {
                    hnjVar.hnj(new com.bytedance.sdk.component.sk.hn.qor.gjv().hnj(qorVar, drawable, null, false));
                }

                @Override // com.bytedance.sdk.component.sk.hn.qor.hn.hnj.InterfaceC0194hnj
                public void hnj() {
                    hnjVar.hnj(1002, "decode webp animate fail", new Exception("decode webp animate fail"));
                }

                @Override // com.bytedance.sdk.component.sk.hn.qor.hn.hnj.InterfaceC0194hnj
                public void hnj(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.dkl.hnj(bArr)) {
                        gjv.this.hnj(qorVar, bArr, true, hnjVar);
                    } else {
                        hnjVar.hnj(1001, "result type is webp animated but data not image", new Exception("webp animated not image format"));
                    }
                }
            });
        } catch (Throwable th2) {
            hnjVar.hnj(2000, "decode webp animation error", th2);
        }
    }

    @Override // com.bytedance.sdk.component.sk.hn.hn.dkl
    public String hnj() {
        return "decode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.component.sk.hn.qor.qor qorVar, byte[] bArr, boolean z10, com.bytedance.sdk.component.sk.hn.qor.hnj hnjVar) {
        try {
            com.bytedance.sdk.component.sk.hn.qor.dkl dklVarJip = qorVar.jip();
            Bitmap bitmapHnj = dklVarJip.hnj(qorVar).hnj(bArr, dklVarJip);
            if (bitmapHnj != null) {
                qorVar.aq();
                qorVar.hnj();
                bitmapHnj.getWidth();
                bitmapHnj.getHeight();
                bitmapHnj.getByteCount();
                hnjVar.hnj(new com.bytedance.sdk.component.sk.hn.qor.gjv().hnj(qorVar, bitmapHnj, null, false));
                if (z10) {
                    hnj(qorVar.uua(), dklVarJip, qorVar.aq(), bitmapHnj);
                    return;
                }
                return;
            }
            qorVar.aq();
            qorVar.hnj();
            hnjVar.hnj(1002, "decode failed bitmap null", new Exception("decode failed bitmap null"));
        } catch (Throwable th2) {
            qorVar.aq();
            qorVar.hnj();
            hnjVar.hnj(1002, "decode failed:" + th2.getMessage(), th2);
        }
    }

    private void hnj(com.bytedance.sdk.component.sk.hn hnVar, com.bytedance.sdk.component.sk.hn.qor.dkl dklVar, String str, Bitmap bitmap) {
        if (hnVar == null || dklVar == null || !hnVar.sk()) {
            return;
        }
        dklVar.hnj(hnVar).hnj(str, bitmap);
    }
}
