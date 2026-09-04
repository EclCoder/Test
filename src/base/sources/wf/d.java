package wf;

import android.content.DialogInterface;
import android.view.WindowManager;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d extends androidx.fragment.app.m {
    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        getParentFragmentManager().q().n(this).h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getDialog().getWindow().getAttributes());
        layoutParams.width = (int) getResources().getDimension(R.dimen.setting_dialog_width);
        getDialog().getWindow().setAttributes(layoutParams);
    }
}
