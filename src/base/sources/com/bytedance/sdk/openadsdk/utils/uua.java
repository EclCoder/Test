package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj();

        void hnj(com.bytedance.sdk.openadsdk.apu.hnj.hn hnVar);
    }

    public static void hnj(com.bytedance.sdk.openadsdk.apu.hnj hnjVar, int i10, int i11, hnj hnjVar2, String str) {
        hnj(hnjVar, i10, i11, hnjVar2, str, 0);
    }

    public static void hnj(com.bytedance.sdk.openadsdk.apu.hnj hnjVar, int i10, int i11, final hnj hnjVar2, String str, int i12) {
        Objects.toString(hnjVar);
        com.bytedance.sdk.openadsdk.apu.hn.hn().gjv().hnj(hnjVar, new com.bytedance.sdk.openadsdk.apu.hnj.hnj.InterfaceC0200hnj() { // from class: com.bytedance.sdk.openadsdk.utils.uua.1
            @Override // com.bytedance.sdk.openadsdk.apu.hnj.hnj.InterfaceC0200hnj
            public void hnj(String str2, com.bytedance.sdk.openadsdk.apu.hnj.hn hnVar) {
                hnj hnjVar3;
                if (hnVar.sk() && (hnjVar3 = hnjVar2) != null) {
                    hnjVar3.hnj(hnVar);
                    return;
                }
                hnj hnjVar4 = hnjVar2;
                if (hnjVar4 != null) {
                    hnjVar4.hnj();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.apu.hnj.hnj.InterfaceC0200hnj
            public void hnj(int i13, String str2, Throwable th2) {
                hnj hnjVar3 = hnjVar2;
                if (hnjVar3 != null) {
                    hnjVar3.hnj();
                }
            }
        }, i10, i11, ImageView.ScaleType.CENTER_INSIDE, str, i12, null);
    }

    public static Drawable hnj(byte[] bArr, int i10) {
        if (bArr != null && bArr.length > 0) {
            try {
                return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } catch (Throwable unused) {
                return new ColorDrawable(0);
            }
        }
        return new ColorDrawable(0);
    }
}
