package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.view.WatermarkView;
import com.xiaopo.flying.sticker.StickerView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class u4 extends androidx.databinding.p {
    public final StickerView A;
    public final ConstraintLayout B;
    public final WatermarkView C;

    protected u4(Object obj, View view, int i10, StickerView stickerView, ConstraintLayout constraintLayout, WatermarkView watermarkView) {
        super(obj, view, i10);
        this.A = stickerView;
        this.B = constraintLayout;
        this.C = watermarkView;
    }

    public static u4 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static u4 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (u4) androidx.databinding.p.E(layoutInflater, R.layout.fragment_preview_overlay, viewGroup, z10, obj);
    }
}
