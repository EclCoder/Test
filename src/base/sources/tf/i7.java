package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hecorat.screenrecorder.free.R;
import com.xiaopo.flying.sticker.StickerView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i7 extends androidx.databinding.p {
    public final StickerView A;

    protected i7(Object obj, View view, int i10, StickerView stickerView) {
        super(obj, view, i10);
        this.A = stickerView;
    }

    public static i7 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static i7 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (i7) androidx.databinding.p.E(layoutInflater, R.layout.sticker_view_with_bound, viewGroup, z10, obj);
    }
}
