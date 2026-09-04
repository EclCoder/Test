package com.xiaopo.flying.sticker;

import android.view.MotionEvent;
import bk.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b implements i {
    @Override // bk.i
    public void b(StickerView stickerView, MotionEvent motionEvent) {
        if (stickerView.getOnStickerOperationListener() != null) {
            stickerView.getOnStickerOperationListener().b(stickerView.getCurrentSticker());
        }
    }

    @Override // bk.i
    public void c(StickerView stickerView, MotionEvent motionEvent) {
        stickerView.H(motionEvent);
    }

    @Override // bk.i
    public void a(StickerView stickerView, MotionEvent motionEvent) {
    }
}
