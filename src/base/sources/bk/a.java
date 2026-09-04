package bk;

import android.view.MotionEvent;
import com.xiaopo.flying.sticker.StickerView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements i {
    @Override // bk.i
    public void b(StickerView stickerView, MotionEvent motionEvent) {
        stickerView.u(d());
    }

    protected abstract int d();

    @Override // bk.i
    public void a(StickerView stickerView, MotionEvent motionEvent) {
    }

    @Override // bk.i
    public void c(StickerView stickerView, MotionEvent motionEvent) {
    }
}
