package ig;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.image_editor.ImageCropActivity;
import tf.y4;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class z extends Fragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y4 f41437b;

    public static z a(int i10) {
        z zVar = new z();
        Bundle bundle = new Bundle();
        bundle.putInt("shape", i10);
        zVar.setArguments(bundle);
        return zVar;
    }

    private void b(boolean z10) {
        int i10 = this.f41436a;
        if (i10 == 1) {
            this.f41437b.C.setImageResource(z10 ? R.drawable.ic_shape_rectangle_orange : R.drawable.ic_shape_rectangle);
            return;
        }
        if (i10 == 2) {
            this.f41437b.D.setImageResource(z10 ? R.drawable.ic_shape_square_orange : R.drawable.ic_shape_square);
        } else if (i10 == 3) {
            this.f41437b.B.setImageResource(z10 ? R.drawable.ic_shape_oval_orange : R.drawable.ic_shape_oval);
        } else {
            if (i10 != 4) {
                return;
            }
            this.f41437b.A.setImageResource(z10 ? R.drawable.ic_shape_circle_orange : R.drawable.ic_shape_circle);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iIntValue = Integer.valueOf(view.getTag().toString()).intValue();
        if (iIntValue == this.f41436a) {
            return;
        }
        b(false);
        this.f41436a = iIntValue;
        b(true);
        ((ImageCropActivity) getActivity()).y0(this.f41436a);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f41436a = getArguments().getInt("shape");
        y4 y4Var = (y4) androidx.databinding.g.h(layoutInflater, R.layout.fragment_shape, viewGroup, false);
        this.f41437b = y4Var;
        y4Var.G.setTag(1);
        this.f41437b.H.setTag(2);
        this.f41437b.F.setTag(3);
        this.f41437b.E.setTag(4);
        this.f41437b.G.setOnClickListener(this);
        this.f41437b.H.setOnClickListener(this);
        this.f41437b.F.setOnClickListener(this);
        this.f41437b.E.setOnClickListener(this);
        b(true);
        return this.f41437b.B();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f41437b = null;
    }
}
