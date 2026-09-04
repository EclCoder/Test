package j6;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b extends f {
    public b(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j6.f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void o(Bitmap bitmap) {
        ((ImageView) this.f42090a).setImageBitmap(bitmap);
    }
}
