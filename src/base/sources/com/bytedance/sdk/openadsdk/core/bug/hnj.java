package com.bytedance.sdk.openadsdk.core.bug;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import b6.a;
import b6.b;
import com.bytedance.sdk.component.sk.dnm;
import com.bytedance.sdk.component.sk.hn.qor.dkl;
import com.bytedance.sdk.component.sk.jip;
import com.bytedance.sdk.component.sk.ta;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.dse;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.ua;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements com.bytedance.adsdk.ugeno.hnj {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn implements jip {
        private final int gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final hnj f13676hn;
        private final WeakReference<ImageView> hnj;
        private final int qor;

        public hn(ImageView imageView, hnj hnjVar, int i10, int i11) {
            this.hnj = new WeakReference<>(imageView);
            this.f13676hn = hnjVar;
            this.qor = i10;
            this.gjv = i11;
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(dnm dnmVar) {
            try {
                final ImageView imageView = this.hnj.get();
                if (imageView == null) {
                    return;
                }
                final Object objHn = dnmVar.hn();
                if (objHn instanceof Drawable) {
                    ua.hnj((Runnable) new com.bytedance.sdk.component.aq.hn.qor("load_draw_img") { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.hn.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Object obj = objHn;
                                if (a.a(obj)) {
                                    b.a(obj).start();
                                }
                            }
                            imageView.setImageDrawable((Drawable) objHn);
                        }
                    });
                    return;
                }
                if (!(objHn instanceof byte[])) {
                    if (objHn instanceof Bitmap) {
                        ua.hnj((Runnable) new com.bytedance.sdk.component.aq.hn.qor("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.hn.3
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap((Bitmap) objHn);
                            }
                        });
                    }
                } else {
                    if (dnmVar.sk()) {
                        if (Build.VERSION.SDK_INT <= 30) {
                            this.f13676hn.hnj((byte[]) objHn, imageView);
                            return;
                        } else {
                            this.f13676hn.hnj(imageView, (byte[]) objHn, this.qor, this.gjv);
                            return;
                        }
                    }
                    if (this.f13676hn.hnj((byte[]) objHn)) {
                        this.f13676hn.hnj(imageView, (byte[]) objHn, this.qor, this.gjv);
                        return;
                    }
                    final Bitmap bitmapHnj = new com.bytedance.sdk.component.sk.hn.qor.hn.hn(this.qor, this.gjv, imageView.getScaleType(), Bitmap.Config.RGB_565, this.qor, this.gjv).hnj((byte[]) objHn, new dkl(oj.hnj(), new com.bytedance.sdk.component.sk.hn.qor.sk.hnj().hnj(com.bytedance.sdk.openadsdk.ta.gjv.hn()).hnj()));
                    if (bitmapHnj != null) {
                        ua.hnj((Runnable) new com.bytedance.sdk.component.aq.hn.qor("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.hn.2
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap(bitmapHnj);
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                apu.qor("ImageLoaderProvider", th2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bug.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0213hnj {
        void hnj(Drawable drawable);
    }

    private void hn(final ImageView imageView, byte[] bArr, int i10, int i11) {
        final Bitmap bitmapHnj = new com.bytedance.sdk.component.sk.hn.qor.hn.hn(i10, i11, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i10, i11).hnj(bArr, new dkl(oj.hnj(), new com.bytedance.sdk.component.sk.hn.qor.sk.hnj().hnj(com.bytedance.sdk.openadsdk.ta.gjv.hn()).hnj()));
        if (bitmapHnj != null) {
            ua.hnj((Runnable) new com.bytedance.sdk.component.aq.hn.qor("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.2
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(bitmapHnj);
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hnj
    public void hnj(com.bytedance.adsdk.ugeno.core.dnm dnmVar, String str, ImageView imageView, int i10, int i11, com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj interfaceC0170hnj) {
        String strHnj = gjv.hnj(str);
        ta taVarQor = com.bytedance.sdk.openadsdk.ta.gjv.hnj(strHnj).qor(1);
        hnj(dnmVar, taVarQor, strHnj);
        taVarQor.hnj(new hn(imageView, this, i10, i11), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable hn(byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            File fileHnj = dse.hnj(oj.hnj(), "UGEN_GIF_CACHE", "TT_UGEN_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileHnj);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT >= 28) {
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileHnj));
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    return drawableDecodeDrawable;
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(oj.hnj().getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                return bitmapDrawable;
            } catch (Throwable th2) {
                th = th2;
                try {
                    apu.hnj("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
                    return null;
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final ImageView imageView, byte[] bArr, int i10, int i11) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                final Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
                if (drawableDecodeDrawable != null) {
                    ua.hnj((Runnable) new com.bytedance.sdk.component.aq.hn.qor("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Drawable drawable = drawableDecodeDrawable;
                            if (a.a(drawable)) {
                                b.a(drawable).start();
                            }
                            imageView.setImageDrawable(drawableDecodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (IOException e10) {
                apu.qor("ImageLoaderProvider", e10.getMessage());
                return;
            }
        }
        hn(imageView, bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(byte[] bArr, final ImageView imageView) {
        try {
            hnj(bArr, new InterfaceC0213hnj() { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.3
                @Override // com.bytedance.sdk.openadsdk.core.bug.hnj.InterfaceC0213hnj
                public void hnj(final Drawable drawable) {
                    ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Drawable drawable2 = drawable;
                                if (a.a(drawable2)) {
                                    b.a(drawable2).start();
                                }
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        } catch (Exception e10) {
            apu.qor("ImageLoaderProvider", e10.getMessage());
        }
    }

    private void hnj(final byte[] bArr, final InterfaceC0213hnj interfaceC0213hnj) {
        ua.qor((Runnable) new com.bytedance.sdk.component.aq.hn.qor("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawableHn = hnj.this.hn(bArr);
                InterfaceC0213hnj interfaceC0213hnj2 = interfaceC0213hnj;
                if (interfaceC0213hnj2 != null) {
                    interfaceC0213hnj2.hnj(drawableHn);
                }
            }
        });
    }

    public void hn(com.bytedance.adsdk.ugeno.core.dnm dnmVar, String str, final com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj interfaceC0170hnj) {
        ta taVarQor = com.bytedance.sdk.openadsdk.ta.gjv.hnj(str).qor(2);
        hnj(dnmVar, taVarQor, str);
        taVarQor.hnj(new jip() { // from class: com.bytedance.sdk.openadsdk.core.bug.hnj.5
            @Override // com.bytedance.sdk.component.sk.jip
            public void hnj(dnm dnmVar2) {
                if (dnmVar2 == null) {
                    interfaceC0170hnj.hnj(null);
                    return;
                }
                if (interfaceC0170hnj != null) {
                    Object objHn = dnmVar2.hn();
                    if (objHn instanceof Bitmap) {
                        interfaceC0170hnj.hnj((Bitmap) objHn);
                        return;
                    }
                    if (dnmVar2.hn() instanceof byte[]) {
                        try {
                            interfaceC0170hnj.hnj(BitmapFactory.decodeByteArray((byte[]) dnmVar2.hn(), 0, ((byte[]) dnmVar2.hn()).length));
                            return;
                        } catch (Throwable unused) {
                        }
                    }
                    interfaceC0170hnj.hnj(null);
                }
            }

            @Override // com.bytedance.sdk.component.sk.jip
            public void hnj(int i10, String str2, Throwable th2) {
                com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj interfaceC0170hnj2 = interfaceC0170hnj;
                if (interfaceC0170hnj2 != null) {
                    interfaceC0170hnj2.hnj(null);
                }
            }
        }, 4);
    }

    public boolean hnj(byte[] bArr) {
        return com.bytedance.sdk.component.utils.dnm.hnj(bArr, 0);
    }

    @Override // com.bytedance.adsdk.ugeno.hnj
    public void hnj(com.bytedance.adsdk.ugeno.core.dnm dnmVar, String str, com.bytedance.adsdk.ugeno.hnj.InterfaceC0170hnj interfaceC0170hnj) {
        hn(dnmVar, gjv.hnj(str), interfaceC0170hnj);
    }

    private void hnj(com.bytedance.adsdk.ugeno.core.dnm dnmVar, ta taVar, String str) {
        Map<String, Object> mapHn;
        if (dnmVar == null || (mapHn = dnmVar.hn()) == null) {
            return;
        }
        Object obj = mapHn.get("image_info");
        if (obj instanceof Map) {
            taVar.hnj((String) ((Map) obj).get(str));
        }
        String str2 = (String) mapHn.get("cache_dir");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        taVar.hn(str2);
    }
}
