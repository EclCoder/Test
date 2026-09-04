package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hecorat.screenrecorder.free.R;
import com.theartofdev.edmodo.cropper.CropOverlayView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class s3 extends androidx.databinding.p {
    public final CropOverlayView A;

    protected s3(Object obj, View view, int i10, CropOverlayView cropOverlayView) {
        super(obj, view, i10);
        this.A = cropOverlayView;
    }

    public static s3 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static s3 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (s3) androidx.databinding.p.E(layoutInflater, R.layout.fragment_crop_overlay, viewGroup, z10, obj);
    }
}
