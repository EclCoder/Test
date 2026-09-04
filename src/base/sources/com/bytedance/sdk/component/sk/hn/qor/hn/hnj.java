package com.bytedance.sdk.component.sk.hn.qor.hn;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.sk.hn.qor.dkl;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.dse;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.sk.hn.qor.hn.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0194hnj {
        void hnj();

        void hnj(Drawable drawable);

        void hnj(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(byte[] bArr, dkl dklVar, InterfaceC0194hnj interfaceC0194hnj) {
        FileOutputStream fileOutputStream = null;
        try {
            File fileHnj = dse.hnj(dklVar.hnj(), "P_GIF_CACHE", "P_U_GIF_FILE");
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileHnj);
            try {
                fileOutputStream2.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT < 28) {
                    if (interfaceC0194hnj != null) {
                        interfaceC0194hnj.hnj(bArr);
                    }
                    try {
                        fileOutputStream2.close();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileHnj));
                if (interfaceC0194hnj != null) {
                    interfaceC0194hnj.hnj(drawableDecodeDrawable);
                }
                try {
                    fileOutputStream2.close();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                try {
                    apu.hnj("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (interfaceC0194hnj != null) {
                        interfaceC0194hnj.hnj();
                    }
                } catch (Throwable th3) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void hnj(byte[] bArr, dkl dklVar, InterfaceC0194hnj interfaceC0194hnj) {
        if (Build.VERSION.SDK_INT <= 30) {
            hnj(bArr, interfaceC0194hnj, dklVar);
        } else {
            hnj(bArr, interfaceC0194hnj);
        }
    }

    public void hnj(byte[] bArr, InterfaceC0194hnj interfaceC0194hnj) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (interfaceC0194hnj != null) {
                interfaceC0194hnj.hnj(bArr);
                return;
            }
            return;
        }
        try {
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
            if (interfaceC0194hnj != null) {
                interfaceC0194hnj.hnj(drawableDecodeDrawable);
            }
        } catch (Throwable th2) {
            apu.qor("PAGGifDefaultDecoder", th2.getMessage());
            if (interfaceC0194hnj != null) {
                interfaceC0194hnj.hnj();
            }
        }
    }

    private void hnj(final byte[] bArr, final InterfaceC0194hnj interfaceC0194hnj, final dkl dklVar) {
        try {
            dklVar.aq().submit(new Runnable() { // from class: com.bytedance.sdk.component.sk.hn.qor.hn.hnj.1
                @Override // java.lang.Runnable
                public void run() {
                    hnj.this.hn(bArr, dklVar, interfaceC0194hnj);
                }
            });
        } catch (Throwable th2) {
            apu.qor("PAGGifDefaultDecoder", th2.getMessage());
            if (interfaceC0194hnj != null) {
                interfaceC0194hnj.hnj();
            }
        }
    }
}
