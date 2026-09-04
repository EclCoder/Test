package w0;

import android.widget.CompoundButton;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static void a(CompoundButton compoundButton, boolean z10) {
        if (compoundButton.isChecked() != z10) {
            compoundButton.setChecked(z10);
        }
    }
}
